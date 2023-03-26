package models

import com.fasterxml.jackson.annotation.JsonProperty

data class HubDetailDto(
    @JsonProperty("delivery_tier_id")
    val deliveryTierId: String,

    @JsonProperty("slug")
    val slug: String,

    @JsonProperty("country")
    val countryCode: String,

    @JsonProperty("city")
    val city: String,
)