package com.example.mvvm_livedata_fragment_noteapp.di

import com.example.mvvm_livedata_fragment_noteapp.data.repository.CharactersRepository
import com.example.mvvm_livedata_fragment_noteapp.data.retrofit.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun provideApiIterface(retrofit: Retrofit):ApiInterface =
        retrofit.create(ApiInterface::class.java)

    @Singleton
    @Provides
    fun provideCharactersRepository(apiInterface: ApiInterface) : CharactersRepository =
        CharactersRepository(apiInterface)
}