package com.champyevil.pokemon.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.champyevil.pokemon.api.PokemonApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val pokemonApi: PokemonApi
): ViewModel() {

    fun getPokemonList() {
        // TODO: get pokemon list from api
        viewModelScope.launch {
            val response = pokemonApi.getPokemonList()
            if (response.isSuccessful) {
                Log.d(HomeViewModel::class.java.simpleName, "${response.body()}")
            } else {
                Log.e(HomeViewModel::class.java.simpleName, "Error")
            }
        }
    }
}