package models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateCartRequestDto (
    @JsonProperty("delivery_tier_id")
    val deliveryTierId: String?,

    @JsonProperty("shipping_method_id")
    val shippingMethodId: String?,

    @JsonProperty("shipping_address")
    val shippingAddress: CartAddressDto?,

    @JsonProperty("billing_address")
    val billingAddress: CartAddressDto?,

    @JsonProperty("delivery_coordinates")
    val deliveryCoordinates: CartCoordinateDto,

    @JsonProperty("email")
    val email: String?,

    @JsonProperty("lines")
    val lines: List<ProductWrapper>?,

    @JsonProperty("promised_delivery_time")
    val pdt: Int,
)

/*
{
	"delivery_tier_id": "core",
	"shipping_method_id": "0f74ea62-c5fb-4d1e-a049-4d72c0629b13",
	"shipping_address": {
		"address_id": "Rue des Tanneries 19;75013;Paris",
		"tag": "home",
		"city": "Paris",
		"company_name": "",
		"country": "FR",
		"first_name": "",
		"last_name": "",
		"phone": "",
		"postal_code": "75013",
		"street_address_1": "Rue des Tanneries 19",
		"street_address_2": "",
		"house_number": "19",
		"floor_number": "",
		"name_on_doorbell": "",
		"building_type": "",
		"building_location": ""
	},
	"billing_address": {
		"address_id": "Rue des Tanneries 19;75013;Paris",
		"tag": "home",
		"city": "Paris",
		"company_name": "",
		"country": "FR",
		"first_name": "",
		"last_name": "",
		"phone": "",
		"postal_code": "75013",
		"street_address_1": "Rue des Tanneries 19",
		"street_address_2": "",
		"house_number": "19",
		"floor_number": "",
		"name_on_doorbell": "",
		"building_type": "",
		"building_location": ""
	},
	"delivery_coordinates": {
		"latitude": 48.83318448156968,
		"longitude": 2.3462847992777824
	},
	"email": "",
	"lines": [{
		"product_sku": "14006820",
		"quantity": 2
	}],
	"promised_delivery_time": 17
}
 */