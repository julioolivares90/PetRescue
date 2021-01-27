package com.julioolivares.petrescue.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.julioolivares.petrescue.models.modelRequest.AuthRequest
import com.julioolivares.petrescue.net.repository.LoginImpl

class LoginViewModel : ViewModel() {
    private val repository = LoginImpl()

    private  val _isLoading : MutableLiveData<Boolean> = MutableLiveData()

    fun Isloading() : LiveData<Boolean> = _isLoading

    fun Login(authRequest: AuthRequest){

    }
}