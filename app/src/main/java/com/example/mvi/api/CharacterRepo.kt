package com.example.mvi.api

class CharacterRepo(private val api:CharacterApi) {
    fun getCharacters()=api.getCharacters()
}