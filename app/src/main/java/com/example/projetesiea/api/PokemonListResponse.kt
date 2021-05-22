package com.example.projetesiea.api

import com.example.projetesiea.presentation.list.Pokemon

data class PokemonListResponse(
    val count : String,
    val next : String,
    val results : List<Pokemon>

)

