package models

import com.fasterxml.jackson.annotation.JsonProperty

data class CartCoordinateDto(
    @JsonProperty("latitude")
    val latitude: Double,

    @JsonProperty("longitude")
    val longitude: Double
)