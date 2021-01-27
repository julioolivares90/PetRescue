package com.julioolivares.petrescue.models.modelResponse

import java.lang.Exception

sealed class ResponseModel<out R> {
    data class Success<out T>(val data : T) : ResponseModel<T>()
    data class Error(val exception: Exception) : ResponseModel<Nothing>()
}