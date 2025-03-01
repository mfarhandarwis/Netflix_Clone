package com.farhan.netflixclone.data.dto

data class SpokenLanguageDTO(
    @SerealizedName("english_name") val englishName: String = "",
    @SerealizedName("iso_639_1") val iso6391: String = "",
    @SerealizedName("name") val name: String = ""
)
