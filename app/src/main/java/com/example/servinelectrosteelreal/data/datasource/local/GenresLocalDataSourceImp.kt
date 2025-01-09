package com.example.servinelectrosteelreal.data.datasource.local

import com.example.servinelectrosteelreal.data.source.local.GenreDao
import com.example.servinelectrosteelreal.data.source.local.GenreLocal

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GenresLocalDataSourceImp @Inject constructor(
    private val genresDao: GenreDao
) : GenresLocalDataSource {


    override fun getGenresLocal(): Flow<List<GenreLocal>> = genresDao.getGenresLocal()

    override suspend fun insertGenreLocal(genresLocal: List<GenreLocal>) =
        genresDao.insertGenreLocal(genresLocal.first())

    override fun sizeGenresLocal(): Int = 3


}