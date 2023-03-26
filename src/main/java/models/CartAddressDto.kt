package models

import com.fasterxml.jackson.annotation.JsonProperty

data class CartAddressDto(

    @JsonProperty("address_id")
    val id: String?,

    @JsonProperty("tag")
    val tag: String,

    @JsonProperty("city")
    val city: String,

    @JsonProperty("country")
    val country: String,

    @JsonProperty("first_name")
    val firstName: String,

    @JsonProperty("last_name")
    val lastName: String,

    @JsonProperty("phone")
    val phone: String,

    @JsonProperty("postal_code")
    val postalCode: String,

    @JsonProperty("street_address_1")
    val streetAddress: String,

    @JsonProperty("house_number")
    val houseNumber: String?,
)