package com.aline.pokedex.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    private val BASE_URL = "https://pokeapi.co/api/v2/"

    private val retrofitFactory = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getPokemonService() : PokemonService {
        return retrofitFactory.create(PokemonService::class.java)
    }
}