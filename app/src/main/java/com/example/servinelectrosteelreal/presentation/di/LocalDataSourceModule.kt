package com.example.servinelectrosteelreal.presentation.di

import com.example.servinelectrosteelreal.data.datasource.local.GenresLocalDataSource
import com.example.servinelectrosteelreal.data.datasource.local.GenresLocalDataSourceImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object LocalDataSourceModule {
    @Singleton
    @Provides
    fun provideGenreLocalDataSource(
        genresLocalDataSourceImp: GenresLocalDataSourceImp
    ): GenresLocalDataSource = genresLocalDataSourceImp
}
