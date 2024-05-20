package com.tulgot.dictionary_app.data.repository

import android.app.Application
import com.tulgot.dictionary_app.R
import com.tulgot.dictionary_app.data.api.DictionaryApi
import com.tulgot.dictionary_app.domain.model.WordItem
import com.tulgot.dictionary_app.domain.repository.DictionaryRepository
import com.tulgot.dictionary_app.util.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class DictionaryRepositoryImpl @Inject constructor(
    private val dictionaryApi: DictionaryApi,
    private val application: Application
): DictionaryRepository{
    override suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>> {
        return flow {
            emit(Result.Loading(true))

            val remoteWordResultDto = try{
                dictionaryApi.getWordResult(word)
            }catch (e: HttpException){
                e.printStackTrace()
                emit(Result.Error(application.getString((R.string.can_t_get_result))))
            }

            emit(Result.Loading(false))
        }
    }
}