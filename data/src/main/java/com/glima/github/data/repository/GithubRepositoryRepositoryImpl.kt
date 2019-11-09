package com.glima.github.data.repository

import com.glima.github.data.remote.api.Api
import com.glima.github.data.remote.mapper.mapFromResponse
import com.glima.github.domain.business.model.RepositorySearchResult
import com.glima.github.domain.repository.GithubRepositoryRepository
import io.reactivex.Observable

class GithubRepositoryRepositoryImpl(val api: Api) : GithubRepositoryRepository {
    override fun fetchRepositories(
        searchTerm: String,
        sortType: String,
        page: Int
    ): Observable<RepositorySearchResult> {
        return api.repositorySearch(searchTerm, sortType, page).map {
            it.mapFromResponse()
        }
    }
}