package com.glima.github.domain.business.usecase

import com.glima.github.domain.business.model.RepositorySearchResult

interface SearchKotlinRepositoriesUseCase : UseCase.WithParameter<Int, RepositorySearchResult>