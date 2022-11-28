package com.example.mvi.api

import retrofit2.http.GET

interface CharacterApi {
    @GET("character")
    suspend fun getCharacters(): List<Character>
    //de moemtno string pot que no tenemos una clase string
    @GET("location")
    suspend fun getLocations(): List<String>
}