package com.champyevil.pokemon.adapter

import androidx.recyclerview.widget.RecyclerView
import com.champyevil.pokemon.databinding.PokemonCardItemBinding
import com.champyevil.pokemon.model.Pokemon

class PokemonViewHolder(
    private val binding: PokemonCardItemBinding
):RecyclerView.ViewHolder(binding.root) {

    fun bind(pokemon: Pokemon) {
        binding.pokemonNameTextView.text = pokemon.name.english
        binding.pokemonTypeTextView.text = pokemon.types.joinToString(", ")
    }

}