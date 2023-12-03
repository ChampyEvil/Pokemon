package com.champyevil.pokemon.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.champyevil.pokemon.R
import com.champyevil.pokemon.adapter.PokemonAdapter
import com.champyevil.pokemon.databinding.FragmentPokemonCollectionBinding
import com.champyevil.pokemon.model.mockPokemonList

class PokemonCollectionFragment : Fragment() {

    private lateinit var binding: FragmentPokemonCollectionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPokemonCollectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = PokemonAdapter(mockPokemonList())
        binding.pokemonRecycleView.adapter = adapter
    }
}