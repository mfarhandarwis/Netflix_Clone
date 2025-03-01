package com.farhan.netflixclone.data.dto

data class CreatedByDTO(
    @SerealizedName("id") val id: Int = 0,
    @SerealizedName("credit_id") val creditId: String = "",
    @SerealizedName("name") val name: String = "",
    @SerealizedName("gender") val gender: Int = 0,
    @SerealizedName("profile_path") val profilePath: String = ""
)
