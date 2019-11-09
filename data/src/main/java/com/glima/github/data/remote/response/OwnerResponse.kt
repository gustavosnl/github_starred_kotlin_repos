package com.glima.github.data.remote.response

import com.google.gson.annotations.SerializedName

data class OwnerResponse(
    @SerializedName("login") val name: String,
    @SerializedName("avatar_url") val avatarUrl: String
)