package com.glima.github.data.di

import com.glima.github.data.repository.GithubRepositoryRepositoryImpl
import com.glima.github.domain.repository.GithubRepositoryRepository
import org.koin.dsl.module

object DataModule {

    val module = module {
        single<GithubRepositoryRepository> {
            GithubRepositoryRepositoryImpl(api = get())
        }
    }
}