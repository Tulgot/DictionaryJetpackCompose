package com.tulgot.dictionary_app.presentation

import androidx.lifecycle.ViewModel
import com.tulgot.dictionary_app.domain.repository.DictionaryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dictionaryRepository: DictionaryRepository
): ViewModel(){
}