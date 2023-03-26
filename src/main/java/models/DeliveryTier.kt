package models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeliveryTier(
    @JsonProperty("minimumOrderValue")
    val minimumOrderValue: PriceDto,

    @JsonProperty("deliveryPrice")
    val deliveryPrice: PriceDto,
)