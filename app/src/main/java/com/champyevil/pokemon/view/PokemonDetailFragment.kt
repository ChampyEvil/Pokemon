package com.champyevil.pokemon.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.champyevil.pokemon.R
import com.champyevil.pokemon.databinding.FragmentPokemonDetailBinding

class PokemonDetailFragment : Fragment() {

    private lateinit var binding: FragmentPokemonDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentPokemonDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nameTextView.text = "ChampyEvil"
    }
}