package com.example.servinelectrosteelreal.data.source.remote

import com.google.gson.annotations.SerializedName


data class GenresRemote(
    @SerializedName("genres")
    var genres: List<GenreEntityRemote> = arrayListOf()
)

data class GenreEntityRemote(
    @SerializedName("id")
    val id: String ,
    @SerializedName("name")
    val name: String ?=null,
)
