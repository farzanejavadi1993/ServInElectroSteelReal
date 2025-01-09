package com.example.servinelectrosteelreal.presentation.di

import com.example.servinelectrosteelreal.data.source.remote.GenreRemoteInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {
    @Singleton
    @Provides

    fun provideApiService(): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.themoviedb.org/3/")
        .build()

    @Singleton
    @Provides

    fun provideBlogService(retrofit: Retrofit): GenreRemoteInterface {
        return retrofit.create(GenreRemoteInterface::class.java)
    }

}
