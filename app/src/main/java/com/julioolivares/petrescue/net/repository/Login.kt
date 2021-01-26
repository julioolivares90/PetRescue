package com.julioolivares.petrescue.net.repository
import com.julioolivares.petrescue.net.models.LoginModel

interface Login {
    suspend fun LoginWithEmailAndPassword(loginModel : LoginModel)
}