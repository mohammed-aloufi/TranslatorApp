package com.reem.translatorapp.data.retrofitservice

import com.reem.translatorapp.domain.models.SupportLangResponse
import com.reem.translatorapp.domain.models.TranslationResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface TranslationApi {

    @GET("languages")
    fun getSupportedLang(): Response<SupportLangResponse>

    @POST("translate")
    fun translate(): Response<TranslationResponse>
}