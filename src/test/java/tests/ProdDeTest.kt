package tests

import io.qameta.allure.Description
import io.qameta.allure.Feature
import org.junit.Test

@Feature("Distance Based Delivery Fee Test on Prod for DE")
class ProdDeTest {

    @Test
    @Description("InvalidenStrasse 27 Berlin, Germany, Delivery Fee 2,99 below 20 Euro")
    fun `InvalidenStrasse 27 Berlin, Germany, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 52.53167142086187,
            longitude = 13.387977741658686,
            address = "InvalidenStrasse 27 Berlin, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11017345"
        )
    }

    @Test
    @Description("InvalidenStrasse 27 Berlin, Germany, Delivery Fee 1,99 below 50 Euro")
    fun `InvalidenStrasse 27 Berlin, Germany, Delivery Fee 1,99 below 50 Euro`() {
        testDeliveryTier(
            latitude = 52.53167142086187,
            longitude = 13.387977741658686,
            address = "InvalidenStrasse 27 Berlin, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 1,
            productSku = "11010022"
        )
    }

    @Test
    @Description("InvalidenStrasse 27 Berlin, Germany, Delivery Fee free above 50 Euro")
    fun `InvalidenStrasse 27 Berlin, Germany, Delivery Fee free above 50 Euro`() {
        testDeliveryTier(
            latitude = 52.53167142086187,
            longitude = 13.387977741658686,
            address = "InvalidenStrasse 27 Berlin, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 2,
            productSku = "11010022"
        )
    }

    @Test
    @Description("Königstraße 92-94, 47798 Krefeld, Delivery Fee 2,99 below 20 Euro")
    fun `Königstraße 92-94, 47798 Krefeld, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 51.3316176,
            longitude = 6.5640727,
            address = "Königstraße 92-94, 47798 Krefeld",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11012514"
        )
    }

    @Test
    @Description("Königstraße 92-94, 47798 Krefeld, Delivery Fee 1,99 above 20 Euro")
    fun `Königstraße 92-94, 47798 Krefeld, Delivery Fee 1,99 above 20 Euro`() {
        testDeliveryTier(
            latitude = 51.3316176,
            longitude = 6.5640727,
            address = "Königstraße 92-94, 47798 Krefeld",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11012514"
        )
    }

    @Test
    @Description("Gabelsbergerstraße 32, 80333 München, Delivery Fee 2,99 below 20 Euro")
    fun `Gabelsbergerstraße 32, 80333 München, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 48.14894496451904,
            longitude = 11.563929431140425,
            address = "Gabelsbergerstraße 32, 80333 München",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Gabelsbergerstraße 32, 80333 München, Delivery Fee 1,99 below 50 Euro")
    fun `Gabelsbergerstraße 32, 80333 München, Delivery Fee 1,99 below 50 Euro`() {
        testDeliveryTier(
            latitude = 48.14894496451904,
            longitude = 11.563929431140425,
            address = "Gabelsbergerstraße 32, 80333 München",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Gabelsbergerstraße 32, 80333 München, Delivery Fee free above 50 Euro")
    fun `Gabelsbergerstraße 32, 80333 München, Delivery Fee free above 50 Euro`() {
        testDeliveryTier(
            latitude = 48.14894496451904,
            longitude = 11.563929431140425,
            address = "Gabelsbergerstraße 32, 80333 München",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Dr Carlo-Schmid-Straße 93a, Nürnberg Germany, Delivery Fee 2,99 below 20 Euro")
    fun `Dr Carlo-Schmid-Straße 93a, Nürnberg Germany, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.4623998,
            longitude = 11.1097614,
            address = "Dr.-Carlo-Schmid-Straße 93a, Nürnberg Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Dr Carlo-Schmid-Straße 93a, Nürnberg Germany, Delivery Fee 1,99 below 20 Euro")
    fun `Dr Carlo-Schmid-Straße 93a, Nürnberg Germany, Delivery Fee 1,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.4623998,
            longitude = 11.1097614,
            address = "Dr.-Carlo-Schmid-Straße 93a, Nürnberg Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Hersbrucker Str 3, Nürnberg, Delivery Fee 2,99 below 20 Euro")
    fun `Hersbrucker Str 3, Nürnberg, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.454272,
            longitude = 11.135144,
            address = " Hersbrucker Str. 3, Nürnberg Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Hersbrucker Str 3, Nürnberg, Delivery Fee 1,99 below 20 Euro")
    fun `Hersbrucker Str 3, Nürnberg, Delivery Fee 1,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.454272,
            longitude = 11.135144,
            address = " Hersbrucker Str. 3, Nürnberg Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Gleißhammerstraße 126-130, Nürnberg, Delivery Fee 2,99 below 20 Euro")
    fun `Gleißhammerstraße 126-130, Nürnberg, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.454183,
            longitude = 11.123388,
            address = " Gleißhammerstraße 126-130, Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Gleißhammerstraße 126-130, Nürnberg, Delivery Fee 1,99 below 20 Euro")
    fun `Gleißhammerstraße 126-130, Nürnberg, Delivery Fee 1,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.454183,
            longitude = 11.123388,
            address = " Gleißhammerstraße 126-130, Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Stahlstraße 5, Nürnberg, Delivery Fee 2,99 below 20 Euro")
    fun `Stahlstraße 5, Nürnberg, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.4760628,
            longitude = 11.1033115,
            address = " Stahlstraße 5, Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Stahlstraße 5, Nürnberg, Delivery Fee 1,99 below 20 Euro")
    fun `Stahlstraße 5, Nürnberg, Delivery Fee 1,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.4760628,
            longitude = 11.1033115,
            address = " Stahlstraße 5, Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Kirschgartenstraße 40, 90419 Nürnberg, Delivery Fee 2,99 below 20 Euro")
    fun `Kirschgartenstraße 40, 90419 Nürnberg, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.46049200775169,
            longitude = 11.054529994726181,
            address = " Kirschgartenstraße 40, 90419 Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11017798"
        )
    }

    @Test
    @Description("Kirschgartenstraße 40, 90419 Nürnberg, Delivery Fee 1,99 above 20 Euro")
    fun `Kirschgartenstraße 40, 90419 Nürnberg, Delivery Fee 1,99 above 20 Euro`() {
        testDeliveryTier(
            latitude = 49.46049200775169,
            longitude = 11.054529994726181,
            address = " Kirschgartenstraße 40, 90419 Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 2,
            productSku = "11017798"
        )
    }

    @Test
    @Description("Widhalmstraße 22, 90459 Nürnberg, Germany, Delivery Fee 2,99 below 20 Euro")
    fun `Widhalmstraße 22, 90459 Nürnberg, Germany, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 49.4424451,
            longitude = 11.0852435,
            address = "Widhalmstraße 22, 90459 Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Widhalmstraße 22, 90459 Nürnberg, Germany, Delivery Fee 1,99 below 50 Euro")
    fun `Widhalmstraße 22, 90459 Nürnberg, Germany, Delivery Fee 1,99 below 50 Euro`() {
        testDeliveryTier(
            latitude = 49.4424451,
            longitude = 11.0852435,
            address = "Widhalmstraße 22, 90459 Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 2,
            productSku = "11015490"
        )
    }

    @Test
    @Description("Widhalmstraße 22, 90459 Nürnberg, Germany, Delivery Fee free above 50 Euro")
    fun `Widhalmstraße 22, 90459 Nürnberg, Germany, Delivery Fee free above 50 Euro`() {
        testDeliveryTier(
            latitude = 49.4424451,
            longitude = 11.0852435,
            address = "Widhalmstraße 22, 90459 Nürnberg, Germany",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "11015490"
        )
    }
}