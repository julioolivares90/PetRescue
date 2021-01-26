package com.julioolivares.petrescue.net.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import com.julioolivares.petrescue.utilities.Utilities.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private val okHttpClient = OkHttpClient.Builder().build()
    var build = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = build
        .build()

    fun<T> buildService(serviceType : Class<T>): T = retrofit.create(serviceType)
}