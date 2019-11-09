package com.glima.github.data.remote.response

import com.google.gson.annotations.SerializedName

data class RepositoriesSearchResultResponse(
    @SerializedName("total_count") val totalResults: Int,
    @SerializedName("items") val repositories: List<RepositoryResponse>
)