package models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateCartRequestDto(
    @JsonProperty("delivery_tier_id")
    val deliveryTierId: String?,

    @JsonProperty("shipping_method_id")
    val shippingMethodId: String?,

    @JsonProperty("shipping_address")
    val shippingAddress: CartAddressDto,

    @JsonProperty("billing_address")
    val billingAddress: CartAddressDto,

    @JsonProperty("delivery_coordinates")
    val deliveryCoordinates: CartCoordinateDto,

    @JsonProperty("delivery_eta")
    val deliveryETA: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("lines")
    val lines: List<ProductWrapper>,

    @JsonProperty("notes")
    val notes: String?,
)