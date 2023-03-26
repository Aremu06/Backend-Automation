package tests

import io.qameta.allure.Description
import io.qameta.allure.Feature
import org.junit.Test

@Feature("Distance Based Delivery Fee Test on Prod for FR")
class ProdFRTest {

    @Test
    @Description("Rue Marjolin 40, 92300 FR, Delivery Fee 1,90 below 45 Euro")
    fun `Rue Marjolin 40, 92300 FR, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 48.896533774506935,
            longitude = 2.291564717888832,
            address = "Rue Marjolin 40, 92300 FR",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008137"
        )
    }

    @Test
    @Description("Rue Marjolin 40, 92300 FR, Delivery Fee free above 45 Euro")
    fun `Rue Marjolin 40, 92300 FR, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 48.896533774506935,
            longitude = 2.291564717888832,
            address = "Rue Marjolin 40, 92300 FR",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008137"
        )
    }

    @Test
    @Description("19 Port Debilly, 75116 Paris, France, Delivery Fee 1,90 below 45 Euro")
    fun `19 Port Debilly, 75116 Paris, France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 48.860202387352835,
            longitude = 2.2911714389920235,
            address = "19 Port Debilly, 75116 Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14003315"
        )
    }

    @Test
    @Description("19 Port Debilly, 75116 Paris, France, Delivery Fee free above 45 Euro")
    fun `19 Port Debilly, 75116 Paris, France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 48.860202387352835,
            longitude = 2.2911714389920235,
            address = "19 Port Debilly, 75116 Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008137"
        )
    }

    @Test
    @Description("Boulevard de Courcelles 112 Paris France, Delivery Fee 1,90 below 45 Euro")
    fun `Boulevard de Courcelles 112 Paris France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 48.878691,
            longitude = 2.300491,
            address = "Boulevard de Courcelles 112 Paris France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008778"
        )
    }

    @Test
    @Description("Boulevard de Courcelles 112 Paris France, Delivery Fee free above 45 Euro")
    fun `Boulevard de Courcelles 112 Paris France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 48.878691,
            longitude = 2.300491,
            address = "Boulevard de Courcelles 112 Paris France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 2,
            productSku = "14008778"
        )
    }

    @Test
    @Description("Rue Sauteyron 42, Bordeaux, France, Delivery Fee 1,90 below 45 Euro")
    fun `Rue Sauteyron 42, Bordeaux, France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 44.830725,
            longitude = -0.574143,
            address = "Rue Sauteyron 42, Bordeaux, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Rue Sauteyron 42, Bordeaux, France, Delivery Fee free above 45 Euro")
    fun `Rue Sauteyron 42, Bordeaux, France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 44.830725,
            longitude = -0.574143,
            address = "Rue Sauteyron 42, Bordeaux, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Rue de l'Arc 10, Lille, France, Delivery Fee 1,90 below 45 Euro")
    fun `Rue de l'Arc 10, Lille, France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 50.636113,
            longitude = 3.058421,
            address = "Rue de l'Arc 10, Lille, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Rue de l'Arc 10, Lille, France, Delivery Fee free above 45 Euro")
    fun `Rue de l'Arc 10, Lille, France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 50.636113,
            longitude = 3.058421,
            address = "Rue de l'Arc 10, Lille, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Boulevard Soult 67, Paris, France, Delivery Fee 1,90 below 45 Euro")
    fun `Boulevard Soult 67, Paris, France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 48.840198,
            longitude = 2.408705,
            address = "Boulevard Soult 67, Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Boulevard Soult 67, Paris, France, Delivery Fee free above 45 Euro")
    fun `Boulevard Soult 67, Paris, France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 48.840198,
            longitude = 2.408705,
            address = "Boulevard Soult 67, Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008138"
        )
    }

    @Test
    @Description("19 Rue des Tanneries, Paris, France, Delivery Fee 1,90 below 45 Euro")
    fun `19 Rue des Tanneries, Paris, France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 48.833222,
            longitude = 2.345949,
            address = "19 Rue des Tanneries, Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008138"
        )
    }

    @Test
    @Description("19 Rue des Tanneries, Paris, France, Delivery Fee free above 45 Euro")
    fun `19 Rue des Tanneries, Paris, France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 48.833222,
            longitude = 2.345949,
            address = "19 Rue des Tanneries, Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Rue Jouffroy d'Abbans 67, Paris, France, Delivery Fee 1,90 below 45 Euro")
    fun `Rue Jouffroy d'Abbans 67, Paris, France, Delivery Fee 1,90 below 45 Euro`() {
        testDeliveryTier(
            latitude = 48.884039,
            longitude = 2.305601,
            address = "Rue Jouffroy d'Abbans 67, Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 190,
            numberOfProducts = 1,
            productSku = "14008138"
        )
    }

    @Test
    @Description("Rue Jouffroy d'Abbans 67, Paris, France, Delivery Fee free above 45 Euro")
    fun `Rue Jouffroy d'Abbans 67, Paris, France, Delivery Fee free above 45 Euro`() {
        testDeliveryTier(
            latitude = 48.884039,
            longitude = 2.305601,
            address = "Rue Jouffroy d'Abbans 67, Paris, France",
            expectedDeliveryTierId = "core",
            expectedShipmentMethodId = null,
            expectedDeliveryFee = 0,
            numberOfProducts = 3,
            productSku = "14008138"
        )
    }
}