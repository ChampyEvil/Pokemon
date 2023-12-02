package com.champyevil.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            val intent = Intent(this, PokemonDetailActivity::class.java)
            startActivity(intent)
        }
    }
}