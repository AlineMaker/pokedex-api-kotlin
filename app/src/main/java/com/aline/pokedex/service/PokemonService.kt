package com.aline.pokedex.service

import com.aline.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    @GET("pokemon/{name}")
    fun getPokemon(
        @Path("name") name: String
    ): Call<Pokemon>
}