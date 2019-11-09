package com.glima.github.repository.list

import com.glima.github.domain.business.usecase.SearchRepositoriesUseCase
import io.reactivex.rxkotlin.subscribeBy

class GithubRepositoriesPresenter(
    private val useCase: SearchRepositoriesUseCase
) : RepositoryListContract.Presenter {

    private var currentPage = 1

    override fun fetchRepositories() {
        useCase.execute(currentPage)
            .subscribeBy(
                onNext = {

                },
                onError = {

                }
            )


    }
}