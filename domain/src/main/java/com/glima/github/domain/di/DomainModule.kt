package com.glima.github.domain.di

import com.glima.github.domain.business.usecase.SeachKotlinRepositoriesUseCaseImpl
import com.glima.github.domain.business.usecase.SearchRepositoriesUseCase
import org.koin.dsl.module

object DomainModule {

    val module = module {

        single<SearchRepositoriesUseCase> {
            SeachKotlinRepositoriesUseCaseImpl(repository = get())
        }
    }
}
