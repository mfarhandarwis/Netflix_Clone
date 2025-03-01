package com.farhan.netflixclone.data.dto

data class ProductionCountryDTO(
    @SerealizedName("iso_3166_1") val iso31661: String = "",
    @SerealizedName("name") val name: String = ""
)
