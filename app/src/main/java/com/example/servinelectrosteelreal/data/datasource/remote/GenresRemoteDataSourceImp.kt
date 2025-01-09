package com.example.servinelectrosteelreal.data.datasource.remote

import com.example.servinelectrosteelreal.data.source.remote.GenreRemoteInterface
import com.example.servinelectrosteelreal.data.source.remote.GenresRemote
import javax.inject.Inject


class GenresRemoteDataSourceImp @Inject constructor(
    private val remoteService: GenreRemoteInterface
) : GenresRemoteDataSource {

    override suspend fun genresList(apiKey: String): GenresRemote =
        remoteService.genresList(apiKey)

}