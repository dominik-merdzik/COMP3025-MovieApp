package com.example.comp3025_assignment_02.model

import com.google.gson.annotations.SerializedName

// MovieSearchResult data class is used to represent a movie search result
data class MovieSearchResult(
    @SerializedName("Title") val title: String,
    @SerializedName("Year") val year: String,
    @SerializedName("imdbID") val imdbID: String,
    @SerializedName("Type") val type: String,
    @SerializedName("Poster") val posterUrl: String
)


