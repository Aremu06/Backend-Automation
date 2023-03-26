package utils

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.qameta.allure.Step
import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType
import io.restassured.response.Response
import models.*

object FlinkApi : BaseApi() {
    private val requestSpec = RequestSpecBuilder()
        .setContentType(ContentType.JSON).setAccept(ContentType.JSON)
        .setBaseUri(DataFactory.INSTANCE.STAGING_BASE_PATH)
        .addHeader("User-Agent", "Flink/2.39.0 (Android)")
        .addHeader("Authorization", "Bearer " + DataFactory.INSTANCE.STAGING_ACCESS_TOKEN)
        .addHeader("Optimizely-Id", "61dcfdfc-f264-429a-a5dd-b09792ac9e30")
        .addHeader("Anonymous-Id", "44addeba-b172-4c71-9223-0b00f7d53acb")
        .log(LogDetail.ALL).addFilter(AllureRestAssured()).build()

    @JvmStatic
    @Step("Get hub details for lat:{latitude} long:{longitude}")
    fun getHubDetails(latitude: Double, longitude: Double): Response {
        return RestAssured.given().spec(requestSpec)
            .queryParam("lat", latitude)
            .queryParam("long", longitude)["v1/locations/hub"]
    }

    @Step("Get delivery tiers for lat:{latitude} long:{longitude} country: {countryCode} hub:{hubSlug}")
    fun getDeliveryTiers(
        countryCode: String,
        latitude: Double,
        longitude: Double,
        hubSlug: String?
    ): Response {
        return RestAssured.given().spec(requestSpec)
            .header("hub-slug", hubSlug)
            .queryParam("latitude", latitude)
            .queryParam("longitude", longitude)
            .get("v3/cart/delivery-tiers/$countryCode")
    }

    @Step("Create cart")
    fun createCart(
        hubSlug: String,
        deliveryTierId: String?,
        shippingMethodId: String?,
        address: String,
        city: String,
        countryCode: String,
        latitude: Double,
        longitude: Double,
        productSku: String = "11012431", // available in DE
        numberOfProducts: Int = 1
    ): Response {
        val addressDto = CartAddressDto(
            id = address,
            tag = "home",
            city = city,
            firstName = "Erdem",
            lastName = "Topak",
            country = countryCode,
            phone = "",
            postalCode = "30480",
            streetAddress = address,
            houseNumber = "3",
        )

        val request = CreateCartRequestDto(
            deliveryTierId = deliveryTierId,
            shippingMethodId = shippingMethodId,
            shippingAddress = addressDto,
            billingAddress = addressDto,
            deliveryCoordinates = CartCoordinateDto(latitude = latitude, longitude = longitude),
            deliveryETA = "12",
            email = "erdematobtest@gmail.com",
            lines = listOf(
                ProductWrapper(productSKU = productSku, quantity = numberOfProducts.toLong())
            ),
            notes = "",
        )

        val mapper = jacksonObjectMapper()

        val json = mapper.writeValueAsString(request)

        return RestAssured.given().spec(requestSpec)
            .body(json)
            .header("hub-slug", hubSlug)
            .post("/v3/cart")
    }

    @Step("Get cart for {cartId}")
    fun getCart(
        cartId: String,
        hubSlug: String,
        countryCode: String,
    ): Response {
        return RestAssured.given().spec(requestSpec)
            .header("hub-slug", hubSlug)
            .header("locale", "en-$countryCode")
            .get("v3/cart/$cartId")
    }

    @Step("Update cart")
    fun updateCart(
        cartId: String,
        hubSlug: String,
        deliveryTierId: String?,
        shippingMethodId: String?,
        address: String,
        city: String,
        countryCode: String,
        latitude: Double,
        longitude: Double,
        productSku: String = "11012431", // available in DE
        numberOfProducts: Int = 1
    ): Response {
        val addressDto = CartAddressDto(
            id = address,
            tag = "home",
            city = city,
            firstName = "Erdem",
            lastName = "Topak",
            country = countryCode,
            phone = "",
            postalCode = "30480",
            streetAddress = address,
            houseNumber = "3",
        )

        val request = UpdateCartRequestDto(
            deliveryTierId = deliveryTierId,
            shippingMethodId = shippingMethodId,
            shippingAddress = addressDto,
            billingAddress = addressDto,
            deliveryCoordinates = CartCoordinateDto(latitude = latitude, longitude = longitude),
            pdt = 15,
            email = "erdematobtest2@gmail.com",
            lines = listOf(
                ProductWrapper(productSKU = productSku, quantity = numberOfProducts.toLong())
            ),
        )

        val mapper = jacksonObjectMapper()

        val json = mapper.writeValueAsString(request)

        return RestAssured.given().spec(requestSpec)
            .body(json)
            .header("hub-slug", hubSlug)
            .put("/v3/cart/$cartId")
    }
}