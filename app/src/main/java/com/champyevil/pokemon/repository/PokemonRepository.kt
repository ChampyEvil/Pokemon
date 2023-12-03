package com.champyevil.pokemon.repository

import com.champyevil.pokemon.api.PokemonApi
import com.champyevil.pokemon.model.Pokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface PokemonRepository {
    suspend fun getPokemon(): Flow<Pokemon>
}

class PokemonRepositoryImp @Inject constructor(
    private val pokemonApi: PokemonApi
): PokemonRepository {
    override suspend fun getPokemon(): Flow<Pokemon> {
        val response = pokemonApi.getPokemonList()
        return if (response.isSuccessful) {
//            Log.d(HomeViewModel::class.java.simpleName, "${response.body()}")
            val pokemon = response.body()?.random()
            if (pokemon == null) {
                flow { throw Exception() }
            } else {
                flow { emit(pokemon) }
            }
        } else {
//            Log.e(HomeViewModel::class.java.simpleName, "Error")
            flow { throw Exception() }
        }
    }

}