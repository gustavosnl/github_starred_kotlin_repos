package com.glima.github.data.remote.mapper

import com.glima.github.data.remote.response.RepositoriesSearchResultResponse
import com.glima.github.data.remote.response.RepositoryResponse
import com.glima.github.domain.business.model.Repository
import com.glima.github.domain.business.model.RepositorySearchResult


fun RepositoryResponse.mapFromResponse() = Repository(
    id = id,
    description = description,
    forks = forks,
    name = name,
    owner = owner.mapFromResponse(),
    stars = stars
)

fun RepositoriesSearchResultResponse.mapFromResponse() = RepositorySearchResult(
    totalResults = totalResults,
    repositories = repositories.map {
        it.mapFromResponse()
    }
)