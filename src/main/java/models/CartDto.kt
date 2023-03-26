package models

import com.fasterxml.jackson.annotation.JsonProperty

data class CartDto(

    @JsonProperty("id")
    val cartId: String,

    @JsonProperty("shippingMethodID")
    val shippingMethodID: String?,

    @JsonProperty("deliveryTierID")
    val deliveryTierID: String?,

    @JsonProperty("fees")
    val fees: List<DeliveryFeeDto>,

    @JsonProperty("subTotalPrice")
    val subTotalPrice: PriceDto,
)