package com.tulgot.dictionary_app.presentation

import com.tulgot.dictionary_app.domain.model.WordItem

data class MainState (
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem? = null
)