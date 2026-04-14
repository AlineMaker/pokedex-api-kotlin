package com.aline.pokedex.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aline.pokedex.model.Pokemon
import com.aline.pokedex.service.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel : ViewModel() {

    val pokemon = MutableLiveData<Pokemon>()

    fun buscarPokemon(nameOrId: String) {

        val call = RetrofitFactory()
            .getPokemonService()
            .getPokemon(nameOrId)

        call.enqueue(object : Callback<Pokemon> {

            override fun onResponse(
                call: Call<Pokemon>,
                response: Response<Pokemon>
            ) {
                if (response.isSuccessful) {
                    pokemon.value = response.body()
                }
            }

            override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                println("Erro: ${t.message}")
            }
        })
    }
}