package models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeliveryFeeDto(
    @JsonProperty("type")
    val type: String,

    @JsonProperty("price")
    val price: PriceDto,
)