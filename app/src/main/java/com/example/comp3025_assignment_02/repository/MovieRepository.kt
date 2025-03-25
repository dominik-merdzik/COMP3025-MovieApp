package com.example.comp3025_assignment_02.repository

import com.example.comp3025_assignment_02.BuildConfig
import com.example.comp3025_assignment_02.model.MovieDetail
import com.example.comp3025_assignment_02.model.SearchResponse
import com.example.comp3025_assignment_02.network.OmdbApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRepository {

    //private val apiKey = ""

    private val apiKey = BuildConfig.OMDB_API_KEY

    // create a retrofit instance to make API calls
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://www.omdbapi.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(OmdbApiService::class.java)

    // function to search for movies by query
    suspend fun searchMovies(query: String): SearchResponse? {
        val response = apiService.searchMovies(apiKey, query)
        return if (response.isSuccessful) response.body() else null
    }

    // function to get movie details by imdbID
    suspend fun getMovieDetails(imdbID: String): MovieDetail? {
        val response = apiService.getMovieDetails(apiKey, imdbID)
        return if (response.isSuccessful) response.body() else null
    }
}