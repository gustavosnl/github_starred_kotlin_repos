package com.glima.github.di

import com.glima.github.repository.list.GithubRepositoriesPresenter
import com.glima.github.repository.list.RepositoryListContract
import org.koin.dsl.module

object PresentationModule {

    val module = module {
        single<RepositoryListContract.Presenter> { (view: RepositoryListContract.View) ->
            GithubRepositoriesPresenter(
                view = view,
                useCase = get()
            )
        }
    }
}