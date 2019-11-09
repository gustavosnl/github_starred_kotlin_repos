package com.glima.github.domain.repository

import com.glima.github.domain.business.model.RepositorySearchResult
import io.reactivex.Observable


interface GithubRepositoryRepository {
    fun fetchRepositories(searchTerm: String, sortType: String, page: Int)
            : Observable<RepositorySearchResult>
}