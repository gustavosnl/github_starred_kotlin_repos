package com.glima.github.domain.business.usecase

import com.glima.github.domain.business.model.RepositorySearchResult

interface SearchRepositoriesUseCase : UseCase.WithParameter<Int, RepositorySearchResult>