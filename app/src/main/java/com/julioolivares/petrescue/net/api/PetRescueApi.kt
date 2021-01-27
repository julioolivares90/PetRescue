package com.julioolivares.petrescue.net.api

import com.julioolivares.petrescue.models.modelRequest.AuthRequest
import com.julioolivares.petrescue.models.modelResponse.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PetRescueApi {
    @POST("Login")
    suspend fun Login(@Body authRequest: AuthRequest): Response
}