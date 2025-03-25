package com.example.comp3025_assignment_02.model

import com.google.gson.annotations.SerializedName

// SearchResponse data class is used to represent the response from the OMDB API when searching for movies
data class SearchResponse(
    @SerializedName("Search")
    val search: List<MovieSearchResult>?,

    @SerializedName("totalResults")
    val totalResults: String?,

    @SerializedName("Response")
    val response: String?,

    @SerializedName("Error")
    val error: String?
)
