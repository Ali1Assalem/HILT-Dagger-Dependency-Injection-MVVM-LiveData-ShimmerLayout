package com.example.mvvm_livedata_fragment_noteapp.data.retrofit

import com.example.mvvm_livedata_fragment_noteapp.data.model.CharactersResponse
import com.example.mvvm_livedata_fragment_noteapp.data.model.Character
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("character")
    fun getAllCharacters(): Call<CharactersResponse>

    @GET("character/{id}")
    fun getOneCharacter(@Path("id") id: String): Call<Character>

}