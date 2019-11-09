package com.glima.github.repository.list

import android.content.res.Configuration
import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.content.res.Configuration.ORIENTATION_PORTRAIT
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.glima.github.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), RepositoryListContract.View {

    private val repositoriesAdapter = GithubRepositoriesAdapter()
    private val presenter by inject<RepositoryListContract.Presenter> { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        presenter.fetchRepositories()
    }

    private fun setupViews() {
        repositoriesRecyclerView.apply {
            adapter = repositoriesAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, VERTICAL, false)
        }
    }

    override fun displayRepositories(repositories: List<RepositoryVO>) {
        repositoriesAdapter.addRepositories(repositories)
    }

    override fun showLoading() {
        loading.visibility = VISIBLE
    }

    override fun hideLoading() {
        loading.visibility = GONE
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        when (newConfig.orientation) {
            ORIENTATION_LANDSCAPE -> {
                repositoriesRecyclerView.layoutManager = GridLayoutManager(this, 2, VERTICAL, false)
            }
            ORIENTATION_PORTRAIT -> {
                repositoriesRecyclerView.layoutManager = LinearLayoutManager(this, VERTICAL, false)

            }
        }
    }
}
