package com.glima.github.domain.business.model

data class RepositorySearchResult(
    val totalResults: Int,
    val repositories: List<Repository>
)