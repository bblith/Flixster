package com.example.flixster

import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("movie_image")
    var posterURL: String? = null

    @SerializedName("description")
    var description: String? = null

}