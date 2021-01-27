package com.julioolivares.petrescue.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.julioolivares.petrescue.models.modelRequest.AuthRequest
import com.julioolivares.petrescue.net.repository.LoginImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginViewModel : ViewModel() {
    private val repository = LoginImpl()

    private  val _isLoading : MutableLiveData<Boolean> = MutableLiveData()

    fun Isloading() : LiveData<Boolean> = _isLoading

  suspend  fun Login(authRequest: AuthRequest) = withContext(Dispatchers.IO){
        _isLoading.value = true
        val loginResponse = repository.LoginWithEmailAndPassword(authRequest = authRequest)
       _isLoading.value = false
      return@withContext loginResponse
    }
}