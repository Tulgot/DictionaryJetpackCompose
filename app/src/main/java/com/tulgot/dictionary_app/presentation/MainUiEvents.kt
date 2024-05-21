package com.tulgot.dictionary_app.presentation

sealed class MainUiEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUiEvents()

    object OnSearchClick : MainUiEvents()
}