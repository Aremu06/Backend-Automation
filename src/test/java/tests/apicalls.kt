package tests

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import models.CartDto
import models.DeliveryTiersDto
import models.HubDetailDto
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import utils.FlinkApi

private val mapper = jacksonObjectMapper()
    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)

fun testDeliveryTier(
    latitude: Double,
    longitude: Double,
    address: String,
    productSku: String,
    numberOfProducts: Int = 1,
    expectedDeliveryTierId: String?,
    expectedShipmentMethodId: String?,
    expectedDeliveryFee: Int,
) {
    //HubDetails
    val hubDetailsResponse = FlinkApi.getHubDetails(latitude, longitude)
//        hubDetailsResponse.then().log().all()

    val hubDetail = mapper.readValue(hubDetailsResponse.asString(), HubDetailDto::class.java)

//    assertThat(hubDetail.deliveryTierId, equalTo(expectedDeliveryTierId))

    //Delivery-Tiers
    val deliveryTiersResponse = FlinkApi.getDeliveryTiers(
        countryCode = hubDetail.countryCode,
        latitude = latitude,
        longitude = longitude,
        hubSlug = hubDetail.slug
    )
    deliveryTiersResponse.then().log().all()

    val deliveryTiers = mapper.readValue(deliveryTiersResponse.asString(), DeliveryTiersDto::class.java)

    val createCartResponse = FlinkApi.createCart(
        hubSlug = hubDetail.slug,
        deliveryTierId = deliveryTiers.deliveryTierId,
        shippingMethodId = deliveryTiers.shippingMethodId,
        address = address,
        city = hubDetail.city,
        countryCode = hubDetail.countryCode,
        latitude = latitude,
        longitude = longitude,
        productSku = productSku,
        numberOfProducts = numberOfProducts
    )
    createCartResponse.then().log().all()

    val createCartModel = mapper.readValue(createCartResponse.asString(), CartDto::class.java)

    assertThat(createCartModel.deliveryTierID, equalTo(deliveryTiers.deliveryTierId))
    assertThat(createCartModel.shippingMethodID, equalTo(deliveryTiers.shippingMethodId))

    val dynamicDeliveryFee = findDeliveryFee(deliveryTiers, createCartModel)
    val deliveryFee = createCartModel.fees.find { it.type == "delivery_fee" }?.price?.amount
    assertThat(deliveryFee, equalTo(dynamicDeliveryFee))

    testUpdateCart(
        cartId = createCartModel.cartId,
        hubDetail = hubDetail,
        deliveryTiers = deliveryTiers,
        latitude = latitude,
        longitude = longitude,
        address = address,
        productSku = productSku,
        numberOfProducts = numberOfProducts,
        dynamicDeliveryFee = dynamicDeliveryFee
    )

    testGetCart(
        cartId = createCartModel.cartId,
        hubDetail = hubDetail,
        deliveryTiers = deliveryTiers,
        dynamicDeliveryFee = dynamicDeliveryFee
    )
}

private fun testUpdateCart(
    cartId: String,
    hubDetail: HubDetailDto,
    deliveryTiers: DeliveryTiersDto,
    latitude: Double,
    longitude: Double,
    address: String,
    productSku: String,
    numberOfProducts: Int,
    dynamicDeliveryFee: Int
) {
    val response = FlinkApi.updateCart(
        cartId = cartId,
        hubSlug = hubDetail.slug,
        deliveryTierId = deliveryTiers.deliveryTierId,
        shippingMethodId = deliveryTiers.shippingMethodId,
        address = address,
        city = hubDetail.city,
        countryCode = hubDetail.countryCode,
        latitude = latitude,
        longitude = longitude,
        productSku = productSku,
        numberOfProducts = numberOfProducts
    )
//    response.then().log().all()

    val cartModel = mapper.readValue(response.asString(), CartDto::class.java)

    assertThat(cartModel.deliveryTierID, equalTo(deliveryTiers.deliveryTierId))
    assertThat(cartModel.shippingMethodID, equalTo(deliveryTiers.shippingMethodId))

    val updateCartDeliveryFee = cartModel.fees.find { it.type == "delivery_fee" }?.price?.amount
    assertThat(updateCartDeliveryFee, equalTo(dynamicDeliveryFee))
}

private fun testGetCart(
    cartId: String,
    hubDetail: HubDetailDto,
    deliveryTiers: DeliveryTiersDto,
    dynamicDeliveryFee: Int
) {
    val response = FlinkApi.getCart(
        cartId = cartId,
        hubDetail.slug,
        hubDetail.countryCode
    )
    response.then().log().all()

    val cartModel = mapper.readValue(response.asString(), CartDto::class.java)

    assertThat(cartModel.deliveryTierID, equalTo(deliveryTiers.deliveryTierId))
    assertThat(cartModel.shippingMethodID, equalTo(deliveryTiers.shippingMethodId))

    val getCartDeliveryFee = cartModel.fees.find { it.type == "delivery_fee" }?.price?.amount
    assertThat(getCartDeliveryFee, equalTo(dynamicDeliveryFee))
}

private fun findDeliveryFee(deliveryTiersDto: DeliveryTiersDto, cartDto: CartDto): Int {
    val subTotalPrice = cartDto.subTotalPrice.amount

    val tier = deliveryTiersDto.deliveryTiers
        .lastOrNull { subTotalPrice >= it.minimumOrderValue.amount }
        ?: deliveryTiersDto.deliveryTiers.first()

    return tier.deliveryPrice.amount
}