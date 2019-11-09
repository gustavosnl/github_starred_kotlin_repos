package com.glima.github.repository.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glima.github.databinding.ItemRepositoryBinding
import com.glima.github.repository.list.GithubRepositoriesAdapter.GithubRepositoryViewHolder

class GithubRepositoriesAdapter : RecyclerView.Adapter<GithubRepositoryViewHolder>() {

    private val repositories = mutableListOf<RepositoryVO>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubRepositoryViewHolder {
        val viewBinding =
            ItemRepositoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GithubRepositoryViewHolder(viewBinding)
    }

    override fun getItemCount() = repositories.size

    override fun onBindViewHolder(holder: GithubRepositoryViewHolder, position: Int) {
        holder.bind(repositories[position])
    }

    fun addRepositories(list: List<RepositoryVO>) {
        repositories.addAll(list)
        notifyDataSetChanged()
    }

    inner class GithubRepositoryViewHolder(val binding: ItemRepositoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(repository: RepositoryVO) {
            binding?.apply {
                setRepository(repository)
                binding.executePendingBindings()
            }
        }
    }
}