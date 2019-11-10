package com.glima.github.repository.list

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class InfiniteScrollListener(
    private val layoutManager: RecyclerView.LayoutManager?,
    private val loadCallback: () -> Unit
) :
    RecyclerView.OnScrollListener() {

    private var isLoading = true
    private var visibleItemCount: Int = 0
    private var totalItemCount: Int = 0
    private var pastVisibleItems: Int = 0

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        layoutManager?.let {

            if (dy > 10) {
                visibleItemCount = it.childCount
                totalItemCount = it.itemCount
                pastVisibleItems = it.findLastVisibleItemPosition()

                if (isLoading) {
                    if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {

                        isLoading = false
                        loadCallback.invoke()
                    }
                }
            }
        }
        isLoading = true
    }
}

fun RecyclerView.LayoutManager.findLastVisibleItemPosition(): Int {
    return when (this) {
        is GridLayoutManager -> this.findLastVisibleItemPosition()
        is LinearLayoutManager -> this.findLastVisibleItemPosition()
        is StaggeredGridLayoutManager -> this.findLastVisibleItemPositions(null)[0]
        else -> 0
    }
}


