package com.example.servinelectrosteelreal.presentation.di

import com.example.servinelectrosteelreal.data.datasource.remote.GenresRemoteDataSource
import com.example.servinelectrosteelreal.data.datasource.remote.GenresRemoteDataSourceImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataSourceModule {
    @Singleton
    @Provides
    fun provideGenreRemoteDataSource(
        genresRemoteDataSourceImp: GenresRemoteDataSourceImp
    ): GenresRemoteDataSource = genresRemoteDataSourceImp
}
