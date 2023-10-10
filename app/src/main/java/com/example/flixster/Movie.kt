package com.example.flixster

import com.google.gson.annotations.SerializedName


class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var posterURL: String? = null

    @SerializedName("overview")
    var description: String? = null

    //@SerializedName("movie_image")
    //    var movieImageUrl: String? = null

}