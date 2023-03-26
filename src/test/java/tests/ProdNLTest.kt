package tests

import io.qameta.allure.Description
import io.qameta.allure.Feature
import org.junit.Test

@Feature("Distance Based Delivery Fee Test on Prod for NL")
class ProdNLTest {

    @Test
    @Description("Rubensstraat 44I, 1077 MT Amsterdam, Netherlands, Delivery Fee 2,99 below 20 Euro")
    fun `Rubensstraat 44I, 1077 MT Amsterdam, Netherlands, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 52.34817559376967,
            longitude = 4.8734500631690025,
            address = "Rubensstraat 44I, 1077 MT Amsterdam, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 1,
            productSku = "13132484"
        )
    }

    @Test
    @Description("Rubensstraat 44I, 1077 MT Amsterdam, Netherlands, Delivery Fee 1,99 above 20 Euro")
    fun `Rubensstraat 44I, 1077 MT Amsterdam, Netherlands, Delivery Fee 1,99 above 20 Euro`() {
        testDeliveryTier(
            latitude = 52.34817559376967,
            longitude = 4.8734500631690025,
            address = "Rubensstraat 44I, 1077 MT Amsterdam, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 3,
            productSku = "13132484"
        )
    }

    @Test
    @Description("Rubensstraat 44I, 1077 MT Amsterdam, Netherlands, Delivery Fee free above 39 Euro")
    fun `Rubensstraat 44I, 1077 MT Amsterdam, Netherlands, Delivery Fee free above 39 Euro`() {
        testDeliveryTier(
            latitude = 52.34817559376967,
            longitude = 4.8734500631690025,
            address = "Rubensstraat 44I, 1077 MT Amsterdam, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 6,
            productSku = "13132484"
        )
    }

    @Test
    @Description("Troelstralaan 70, 3515 VB Utrecht, Netherlands, Delivery Fee 2,99 below 20 Euro")
    fun `Troelstralaan 70, 3515 VB Utrecht, Netherlands, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 52.103436183033054,
            longitude = 5.115649178624153,
            address = "Troelstralaan 70, 3515 VB Utrecht, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 2,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Troelstralaan 70, 3515 VB Utrecht, Netherlands, Delivery Fee 1,99 above 20 Euro")
    fun `Troelstralaan 70, 3515 VB Utrecht, Netherlands, Delivery Fee 1,99 above 20 Euro`() {
        testDeliveryTier(
            latitude = 52.103436183033054,
            longitude = 5.115649178624153,
            address = "Troelstralaan 70, 3515 VB Utrecht, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 4,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Troelstralaan 70, 3515 VB Utrecht, Netherlands, Delivery Fee free above 39 Euro")
    fun `Troelstralaan 70, 3515 VB Utrecht, Netherlands, Delivery Fee free above 39 Euro`() {
        testDeliveryTier(
            latitude = 52.103436183033054,
            longitude = 5.115649178624153,
            address = "Troelstralaan 70, 3515 VB Utrecht, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 7,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands, Delivery Fee 4,99 below 20 Euro")
    fun `Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands, Delivery Fee 4,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 52.09291638710541,
            longitude = 4.283782504498959,
            address = "Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 499,
            numberOfProducts = 2,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands, Delivery Fee 1,99 above 20 Euro")
    fun `Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands, Delivery Fee 1,99 above 20 Euro`() {
        testDeliveryTier(
            latitude = 52.09291638710541,
            longitude = 4.283782504498959,
            address = "Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 4,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands, Delivery Fee free above 39 Euro")
    fun `Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands, Delivery Fee free above 39 Euro`() {
        testDeliveryTier(
            latitude = 52.09291638710541,
            longitude = 4.283782504498959,
            address = "Johan de Wittlaan 44, 2517 JR Den Haag, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 7,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Groest 54, 1211 EC Hilversum, Netherlands, Delivery Fee 2,99 below 20 Euro")
    fun `Groest 54, 1211 EC Hilversum, Netherlands, Delivery Fee 2,99 below 20 Euro`() {
        testDeliveryTier(
            latitude = 52.2257646,
            longitude = 5.1772917,
            address = "Groest 54, 1211 EC Hilversum, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 299,
            numberOfProducts = 2,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Groest 54, 1211 EC Hilversum, Netherlands, Delivery Fee 1,99 above 20 Euro")
    fun `Groest 54, 1211 EC Hilversum, Netherlands, Delivery Fee 1,99 above 20 Euro`() {
        testDeliveryTier(
            latitude = 52.2257646,
            longitude = 5.1772917,
            address = "Groest 54, 1211 EC Hilversum, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 199,
            numberOfProducts = 4,
            productSku = "13134821"
        )
    }

    @Test
    @Description("Groest 54, 1211 EC Hilversum, Netherlands, Delivery Fee free above 39 Euro")
    fun `Groest 54, 1211 EC Hilversum, Netherlands, Delivery Fee free above 39 Euro`() {
        testDeliveryTier(
            latitude = 52.2257646,
            longitude = 5.1772917,
            address = "Groest 54, 1211 EC Hilversum, Netherlands",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 7,
            productSku = "13134821"
        )
    }
}