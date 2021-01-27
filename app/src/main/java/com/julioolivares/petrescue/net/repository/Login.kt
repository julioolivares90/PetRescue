package com.julioolivares.petrescue.net.repository
import com.julioolivares.petrescue.models.modelRequest.AuthRequest
import com.julioolivares.petrescue.models.modelResponse.LoginResponse
import com.julioolivares.petrescue.models.modelResponse.LoginModel
import com.julioolivares.petrescue.models.modelResponse.ResponseModel


interface Login {
    suspend fun LoginWithEmailAndPassword(authRequest: AuthRequest) : ResponseModel<LoginResponse>
}