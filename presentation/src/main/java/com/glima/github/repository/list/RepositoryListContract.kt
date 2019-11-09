package com.glima.github.repository.list

object RepositoryListContract {

    interface View {
        fun displayRepositories(repositories: List<RepositoryVO>)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun fetchRepositories()
    }
}