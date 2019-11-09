package com.glima.github.domain.business.usecase

import com.glima.github.domain.business.model.RepositorySearchResult
import com.glima.github.domain.repository.GithubRepositoryRepository
import io.reactivex.Observable

class SearchKotlinRepositoriesUseCaseImpl(private val repository: GithubRepositoryRepository) :
    SearchRepositoriesUseCase {

    override fun execute(params: Int): Observable<RepositorySearchResult> {
        return repository.fetchRepositories(QUERY, SORT, params)
    }

    private companion object {
        const val QUERY = "language:kotlin"
        const val SORT = "stars"
    }
}
