package com.glima.github.data.remote.api

import com.glima.github.data.remote.response.RepositoriesSearchResultResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("search/repositories?q={searchTerm}&sort={sortType}&page={pageNumber}")
    fun repositorySearch(
        @Query("searchTerm") searchTerm: String,
        @Query("sortType") sortType: String,
        @Query("pageNumber") pageNumber: Int
    ): Observable<RepositoriesSearchResultResponse>
}