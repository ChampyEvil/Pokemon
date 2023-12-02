package com.champyevil.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.champyevil.pokemon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pokeball.setOnClickListener {
//            Example for on click
//            Log.d(
//                MainActivity::class.java.simpleName, "on click"
//            )
            val pokemonDetailIntent = Intent(this, PokemonDetailActivity::class.java)
            pokemonDetailIntent.putExtra("Name", "ChampyEvil")
            startActivity(pokemonDetailIntent)
        }

        binding.backpack.setOnClickListener {
            val pokemonCollectionIntent = Intent(this, PokemonCollectionActivity::class.java)
            startActivity(pokemonCollectionIntent)
        }
    }
}