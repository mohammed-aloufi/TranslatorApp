package com.reem.translatorapp.domain.repository

import com.reem.translatorapp.domain.models.SupportLangResponse
import retrofit2.Response

interface Repository {
    suspend fun getSupportedLang():Response<SupportLangResponse>
}