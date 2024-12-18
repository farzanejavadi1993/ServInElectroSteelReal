package com.example.servinelectrosteelreal.presentation.di

import android.content.Context
import androidx.room.Room
import com.example.servinelectrosteelreal.data.source.local.GenreDao
import com.example.servinelectrosteelreal.data.source.local.GenreDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext

import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object LocalModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): GenreDatabase =
        Room.databaseBuilder(
            context,
            GenreDatabase::class.java,
            "genre_db"
        ).build()


    @Provides
    fun provideGenreDao(genreDatabase: GenreDatabase): GenreDao {
        return genreDatabase.getGenreDao()
    }
}
