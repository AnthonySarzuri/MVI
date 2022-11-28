package com.example.mvi.View

sealed class MainIntent {
    //El nombtre main es haciendo referencia al activity, no que existen intents principales o secundarios
    //DAto quer olvide, cuando llamas en parentesis normalmente suele ser o un constructor o una funcion, el camel case lo decidira, por eje,mplo este es unconstructor
    object FetchCharacters: MainIntent()
}