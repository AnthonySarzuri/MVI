package com.example.mvi.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//creamos el cliemte que sera el objeto configurado de retrofit
object CharacterService {
    const val BASE_URL="https://rickandmortyapi.com/api"

    private fun getRetrofit()=Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
}