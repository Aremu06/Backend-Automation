package models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeliveryTiersDto(
    @JsonProperty("shippingMethodId")
    val shippingMethodId: String,

    @JsonProperty("deliveryTierId")
    val deliveryTierId: String,

    @JsonProperty("deliveryTiers")
    val deliveryTiers: List<DeliveryTier>
)