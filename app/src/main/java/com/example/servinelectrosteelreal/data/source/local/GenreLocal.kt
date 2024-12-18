package com.example.servinelectrosteelreal.data.source.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "genre_table")
data class GenreLocal(
    @PrimaryKey
    val id: String ,
    val name: String ?=null,
)