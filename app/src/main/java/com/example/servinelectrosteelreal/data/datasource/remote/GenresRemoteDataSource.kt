package  com.example.servinelectrosteelreal.data.datasource.remote

import com.example.servinelectrosteelreal.data.source.remote.GenresRemote


interface GenresRemoteDataSource {
    suspend fun genresList(apiKey: String): GenresRemote

}