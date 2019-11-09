package com.glima.github.repository.list

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.glima.github.R
import com.squareup.picasso.Picasso


data class RepositoryVO(
    val name: String,
    val forks: String,
    val stars: String,
    val description: String,
    val ownerName: String,
    val ownerAvatar: String
) {
    companion object {
        @JvmStatic
        @BindingAdapter("bind:imageUrl")
        fun loadImage(view: ImageView, imageUrl: String) {
            Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.ic_placeholder)
                .into(view)
        }
    }
}