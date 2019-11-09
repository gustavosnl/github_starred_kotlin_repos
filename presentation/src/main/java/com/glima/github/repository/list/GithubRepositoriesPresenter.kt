package com.glima.github.repository.list

import com.glima.github.domain.business.usecase.SearchRepositoriesUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class GithubRepositoriesPresenter(
    private val view: RepositoryListContract.View,
    private val useCase: SearchRepositoriesUseCase
) : RepositoryListContract.Presenter {

    private var currentPage = 1

    override fun fetchRepositories() {
        useCase.execute(currentPage)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    view.displayRepositories(it.repositories.map())
                },
                onError = {
                },
                onComplete = {
                    view.hideLoading()
                }
            )


    }
}