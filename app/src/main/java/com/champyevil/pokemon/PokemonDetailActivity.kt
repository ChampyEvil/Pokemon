package com.champyevil.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.champyevil.pokemon.databinding.ActivityMainBinding
import com.champyevil.pokemon.databinding.ActivityPokemonDetailBinding

class PokemonDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityPokemonDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("Name")

        binding.nameTextView.text = name
    }
}