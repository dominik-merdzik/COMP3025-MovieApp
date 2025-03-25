package com.example.comp3025_assignment_02.network

import com.example.comp3025_assignment_02.model.MovieDetail
import com.example.comp3025_assignment_02.model.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OmdbApiService {

    // defining the searchMovies function that will be used to make API requests
    @GET("/")
    suspend fun searchMovies(
        @Query("apikey") apiKey: String,
        @Query("s") movieName: String
    ): Response<SearchResponse>

    // defining the getMovieDetails function to get the details of a movie using its imdbID
    @GET("/")
    suspend fun getMovieDetails(
        @Query("apikey") apiKey: String,
        @Query("i") imdbID: String
    ): Response<MovieDetail>
}