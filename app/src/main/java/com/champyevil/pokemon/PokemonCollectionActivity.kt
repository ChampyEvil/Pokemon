package com.champyevil.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.champyevil.pokemon.adapter.PokemonAdapter
import com.champyevil.pokemon.databinding.ActivityPokemonCollectionBinding
import com.champyevil.pokemon.model.Pokemon
import com.champyevil.pokemon.model.mockPokemonList

class PokemonCollectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPokemonCollectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonCollectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PokemonAdapter(mockPokemonList())
        binding.pokemonRecycleView.adapter = adapter
    }
}