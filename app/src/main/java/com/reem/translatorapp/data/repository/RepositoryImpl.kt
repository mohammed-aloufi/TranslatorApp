package com.reem.translatorapp.data.repository

import com.reem.translatorapp.data.retrofitservice.TranslationApi
import com.reem.translatorapp.domain.models.SupportLangResponse
import com.reem.translatorapp.domain.repository.Repository
import retrofit2.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val translateApi: TranslationApi
): Repository {
    override suspend fun getSupportedLang(): Response<SupportLangResponse> = translateApi.getSupportedLang()

}