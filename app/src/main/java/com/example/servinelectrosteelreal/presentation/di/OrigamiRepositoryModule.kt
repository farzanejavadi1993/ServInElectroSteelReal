package com.example.servinelectrosteelreal.presentation.di

import com.example.servinelectrosteelreal.data.repository.GenreRepositoryImp
import com.example.servinelectrosteelreal.domain.repository.GenreRepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object OrigamiRepositoryModule {
    @Singleton
    @Provides
    fun provideGenreRepository(
        genreRepositoryImp: GenreRepositoryImp
    ): GenreRepositoryInterface = genreRepositoryImp
}