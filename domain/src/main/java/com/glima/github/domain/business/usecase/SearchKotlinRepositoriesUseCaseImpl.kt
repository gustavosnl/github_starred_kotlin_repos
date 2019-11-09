package com.glima.github.domain.business.usecase

import com.glima.github.domain.business.model.RepositorySearchResult
import com.glima.github.domain.business.usecase.SearchConstants.QUERY
import com.glima.github.domain.business.usecase.SearchConstants.SORT
import com.glima.github.domain.repository.GithubRepositoryRepository
import io.reactivex.Observable

class SeachKotlinRepositoriesUseCaseImpl(private val repository: GithubRepositoryRepository) :
    SearchRepositoriesUseCase {
    override fun execute(params: Int): Observable<RepositorySearchResult> {
        return repository.fetchRepositories(QUERY, SORT, params)
    }
}

private object SearchConstants {
    const val QUERY = "language:kotlin"
    const val SORT = "stars"
}