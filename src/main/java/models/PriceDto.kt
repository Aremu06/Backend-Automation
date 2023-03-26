package models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceDto(
    @JsonProperty("currency")
    val currency: String,

    @JsonProperty("centAmount")
    val amount: Int,
)