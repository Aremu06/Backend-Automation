package tests

import io.qameta.allure.Description
import io.qameta.allure.Feature
import org.hamcrest.MatcherAssert.*
import org.junit.Ignore
import org.junit.Test

@Feature("Distance Based Delivery Fee Test on Staging")
class StagingTest {

    @Ignore
    @Test
    @Description("Test Hersbrucker Straße 3")
    fun `Test Hersbrucker Straße 3, Nürnberg`() {
        testDeliveryTier(
            latitude = 49.454272,
            longitude = 11.135144,
            address = "Hersbrucker Straße 3;90480;Nürnberg",
            expectedDeliveryTierId = "turf_10",
            expectedShipmentMethodId = "332fb3f2-c588-4df3-a4da-734d91c9473f",
            expectedDeliveryFee = 350,
            productSku = "11012431"
        )
    }

    @Ignore
    @Test
    @Description("Test Dr.-Carlo-Schmid-Straße 93a")
    fun `Test Dr Carlo Schmid Strasse 93a, Nürnberg`() {
        testDeliveryTier(
            latitude = 49.4623998,
            longitude = 11.1097614,
            address = "Dr.-Carlo-Schmid-Straße 93a, Nürnberg",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "04c412f3-b53c-4aec-b5cd-db24c7b45be9",
            expectedDeliveryFee = 310,
            productSku = "11012431",
        )
    }

    @Ignore
    @Test
    @Description("Test Gleißhammerstraße 126-130")
    fun `Test Gleisshammerstrasse 126-130, Nürnberg`() {
        testDeliveryTier(
            latitude = 49.454183,
            longitude = 11.123388,
            address = "Gleißhammerstraße 126-130, Nürnberg",
            expectedDeliveryTierId = "turf_12",
            expectedShipmentMethodId = "4339e1b7-8302-4528-972f-bd8c01ceca20",
            expectedDeliveryFee = 260,
            productSku = "11012431",
        )
    }

    @Ignore
    @Test
    @Description("Test Stahlstraße 5, Nürnberg")
    fun `Test Stahlstrasse 5, Nürnberg`() {
        testDeliveryTier(
            latitude = 49.4760628,
            longitude = 11.1033115,
            address = "Stahlstraße 5, Nürnberg",
            expectedDeliveryTierId = "turf_15",
            expectedShipmentMethodId = "8fb7876a-4d17-49fb-ac6e-8f4971ccba4c",
            expectedDeliveryFee = 380,
            productSku = "11012431"
        )
    }

    @Ignore
    @Test
    @Description("Test Torstrasse 5 Berlin")
    fun `Test Torstrasse 5 Berlin`() {
        testDeliveryTier(
            latitude = 52.52776956714539,
            longitude = 13.415079116821289,
            address = "Torstrasse 5 Berlin",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "4339e1b7-8302-4528-972f-bd8c01ceca20",
            expectedDeliveryFee = 260,
            productSku = "11012431"
        )
    }

    @Ignore
    @Test
    @Description("Test InvalidenStrasse 27 Berlin")
    fun `Test InvalidenStrasse 27 Berlin`() {
        testDeliveryTier(
            latitude = 52.53167140000001,
            longitude = 13.3879777,
            address = "InvalidenStrasse 27 Berlin",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "04c412f3-b53c-4aec-b5cd-db24c7b45be9",
            expectedDeliveryFee = 310,
            productSku = "11012431"
        )
    }

    @Ignore
    @Test
    @Description("Test MarienPlatz 10, Munchen")
    fun `Test MarienPlatz 10, Munchen`() {
        testDeliveryTier(
            latitude = 48.13659528833871,
            longitude = 11.576887853443623,
            address = "MarienPlatz 10, Munchen",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "332fb3f2-c588-4df3-a4da-734d91c9473f",
            expectedDeliveryFee = 350,
            productSku = "11012431"
        )
    }

    @Ignore
    @Test
    @Description("Test WagnerStrasse 37 Hamburg")
    fun `Test WagnerStrasse 37 Hamburg`() {
        testDeliveryTier(
            latitude = 53.57317344713477,
            longitude = 10.038353987038136,
            address = "WagnerStrasse 37 Hamburg",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "332fb3f2-c588-4df3-a4da-734d91c9473f",
            expectedDeliveryFee = 350,
            productSku = "11012431"
        )
    }

    @Ignore
    @Test
    @Description("Test ArgonautenStraat 11 Netherlands")
    fun `Test ArgonautenStraat 11 Netherlands`() {
        testDeliveryTier(
            latitude = 52.343951,
            longitude = 4.8631383,
            address = "ArgonautenStraat 11 Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "04c412f3-b53c-4aec-b5cd-db24c7b45be9",
            expectedDeliveryFee = 180,
            productSku = "13048001",
            numberOfProducts = 3
        )
    }

    @Ignore
    @Test
    @Description("Test Hopakker 27 Netherlands")
    fun `Test Hopakker 27 Netherlands`() {
        testDeliveryTier(
            latitude = 52.097604012754005,
            longitude = 5.117489844560623,
            address = "Hopakker 27 Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "332fb3f2-c588-4df3-a4da-734d91c9473f",
            expectedDeliveryFee = 360,
            productSku = "13048001"
        )
    }

    @Ignore
    @Test
    @Description("Test 30 Rue de la lune, Paris")
    fun `Test 30 Rue de la lune, Paris`() {
        testDeliveryTier(
            latitude = 48.8699932,
            longitude = 2.3487412,
            address = "30 Rue de la lune, Paris",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = "8fb7876a-4d17-49fb-ac6e-8f4971ccba4c",
            expectedDeliveryFee = 380,
            productSku = "11010849"
        )
    }


//    companion object {
//        @BeforeClass
//        fun setBaseUri() {
//            RestAssured.baseURI = dataFactory.STAGING_BASE_PATH
//        }
//    }
}