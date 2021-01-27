package com.julioolivares.petrescue.models.modelResponse

import com.julioolivares.petrescue.models.modelResponse.LoginResponse

data class Response (
        val StatusCode : Int = 0,
        val Data  : LoginResponse
        ){
}