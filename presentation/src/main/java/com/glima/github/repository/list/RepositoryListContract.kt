package com.glima.github.repository.list

import com.glima.github.domain.business.model.Repository

object RepositoryListContract {

    interface View {
        fun displayRepositories(repositories: List<Repository>)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun fetchRepositories()
    }
}