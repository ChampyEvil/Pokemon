package com.champyevil.pokemon.di

import com.champyevil.pokemon.api.PokemonApi
import com.champyevil.pokemon.repository.PokemonRepository
import com.champyevil.pokemon.repository.PokemonRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun providePokemonRepository(pokemonApi: PokemonApi): PokemonRepository = PokemonRepositoryImp(pokemonApi)
}