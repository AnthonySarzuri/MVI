package com.example.mvi.View

sealed class MainState {
    object Idel : MainState()
    object Loading : MainState()
    data class Characters(
        val characters: List<Character>
    ):MainState()

}