package com.tulgot.dictionary_app.data.mapper

import com.tulgot.dictionary_app.data.dto.DefinitionDto
import com.tulgot.dictionary_app.data.dto.MeaningDto
import com.tulgot.dictionary_app.data.dto.WordItemDto
import com.tulgot.dictionary_app.domain.model.Definition
import com.tulgot.dictionary_app.domain.model.Meaning
import com.tulgot.dictionary_app.domain.model.WordItem


fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map{
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = (definitionDtotoDefinition(definitions?.get(0))),
    partOfSpeech = partOfSpeech ?: ""
)

fun definitionDtotoDefinition(definitionDto: DefinitionDto?) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)


