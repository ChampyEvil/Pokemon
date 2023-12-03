package com.champyevil.pokemon.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.champyevil.pokemon.PokemonCollectionActivity
import com.champyevil.pokemon.PokemonDetailActivity
import com.champyevil.pokemon.R
import com.champyevil.pokemon.databinding.FragmentHomeBinding
import com.champyevil.pokemon.viewModel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    val viewModel: HomeViewModel by viewModels()
//    val viewModel: HomeViewModel by activityViewModels() // ผูกกับ activity, fragment ตาย ตัวนี้ไม่ตาย
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            viewModel.uiState.collect {
                Log.d(HomeFragment::class.java.simpleName, "$it")
            }
        }


        binding.pokeball.setOnClickListener {
            viewModel.getPokemonList()
//            val actionHomeToDetail =
//                R.id.action_homeFragment_to_pokemonDetailFragment
//            findNavController().navigate(actionHomeToDetail)
        }

        binding.backpack.setOnClickListener {
            val actionHomeToCollection =
                R.id.action_homeFragment_to_pokemonCollectionFragment
            findNavController().navigate(actionHomeToCollection)
        }
    }
}