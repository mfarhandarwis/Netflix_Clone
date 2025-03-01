package com.farhan.netflixclone.data.dto

data class ProductionCompanyDTO(
    @SerealizedName("id") val id: Int = 0,
    @SerealizedName("logo_path") val logoPath: String = "",
    @SerealizedName("name") val name: String = "",
    @SerealizedName("origin_country") val originCountry: String = ""
)
