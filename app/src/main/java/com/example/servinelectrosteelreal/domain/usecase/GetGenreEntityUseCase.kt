package com.example.servinelectrosteelreal.domain.usecase

import com.example.servinelectrosteelreal.data.repository.GenreRepositoryImp
import com.example.servinelectrosteelreal.domain.entity.GenreEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetGenreEntityUseCase @Inject constructor(private val genreRepository: GenreRepositoryImp) {
        suspend fun getGenreEntity(): Flow<List<GenreEntity>> =
            genreRepository.getGenresEntity()
    }
