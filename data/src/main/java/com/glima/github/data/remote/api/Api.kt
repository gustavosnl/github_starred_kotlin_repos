package com.glima.github.data.remote.api

import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("search/repositories?q=language:{searchTerm}&sort={sortType}&page={pageNumber}")
    fun repositorySearch(
        @Query("searchTerm") searchTerm: String,
        @Query("sortType") sortType: String,
        @Query("pageNumber") pageNumber: String
    )
}