package com.julioolivares.petrescue.net.repository

import com.julioolivares.petrescue.models.modelRequest.AuthRequest
import com.julioolivares.petrescue.net.api.PetRescueApi
import com.julioolivares.petrescue.net.api.RetrofitClient
import com.julioolivares.petrescue.models.modelResponse.LoginModel
import com.julioolivares.petrescue.models.modelResponse.ResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginImpl : Login {
    val api = RetrofitClient.buildService(PetRescueApi::class.java)
    override suspend fun LoginWithEmailAndPassword(authRequest: AuthRequest) = withContext(Dispatchers.IO){
        val response = api.Login(authRequest)

        if (response.StatusCode == 200){
            val loginResponse = response.Data
            return@withContext ResponseModel.Success(loginResponse)
        }else {
            return@withContext  ResponseModel.Error(Exception())
        }
    }
}