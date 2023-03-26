package models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductWrapper(
    @JsonProperty("product_sku")
    val productSKU: String,

    @JsonProperty("quantity")
    val quantity: Long
)