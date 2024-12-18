package com.example.servinelectrosteelreal.domain.repository

import com.example.servinelectrosteelreal.domain.entity.GenreEntity
import kotlinx.coroutines.flow.Flow

interface GenreRepositoryInterface {
        suspend fun getGenresEntity () : Flow<List<GenreEntity>>
}