package com.glima.github.repository.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glima.github.R
import com.glima.github.domain.business.model.Repository
import com.glima.github.repository.list.GithubRepositoriesAdapter.GithubRepositoryViewHolder

class GithubRepositoriesAdapter : RecyclerView.Adapter<GithubRepositoryViewHolder>() {

    private val repositories = mutableListOf<Repository>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubRepositoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_repository, parent, false)
        return GithubRepositoryViewHolder(view)
    }

    override fun getItemCount() = repositories.size

    override fun onBindViewHolder(holder: GithubRepositoryViewHolder, position: Int) {
        holder.bind(repositories[position])
    }

    fun addRepositories(list: List<Repository>) {
        repositories.addAll(list)
        notifyDataSetChanged()
    }

    inner class GithubRepositoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(repository: Repository) {

        }

    }
}