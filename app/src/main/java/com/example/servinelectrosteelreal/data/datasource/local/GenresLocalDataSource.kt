package com.example.servinelectrosteelreal.data.datasource.local

import com.example.servinelectrosteelreal.data.source.local.GenreLocal
import kotlinx.coroutines.flow.Flow

interface GenresLocalDataSource {

    fun getGenresLocal(): Flow<List<GenreLocal>>

    suspend fun insertGenreLocal(genresLocal: List<GenreLocal>)

    fun sizeGenresLocal(): Int
}