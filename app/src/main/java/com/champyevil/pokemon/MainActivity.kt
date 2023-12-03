package com.champyevil.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.champyevil.pokemon.api.PokemonApi
import com.champyevil.pokemon.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject lateinit var commonLog: CommonLog

    @Inject lateinit var pokemonApi: PokemonApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        commonLog.logCommon()
        lifecycleScope.launch {
            val list = pokemonApi.getPokemonList()
            list
        }
    }
}