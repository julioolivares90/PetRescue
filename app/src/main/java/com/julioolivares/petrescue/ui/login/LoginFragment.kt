package com.julioolivares.petrescue.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.julioolivares.petrescue.R
import com.julioolivares.petrescue.databinding.LoginFragmentBinding
import com.julioolivares.petrescue.models.modelRequest.AuthRequest

class LoginFragment : Fragment() {

    lateinit var binding: LoginFragmentBinding

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LoginFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val authRequest = AuthRequest(binding.txtEmail.text.toString(),binding.txtPassword.text.toString())

            viewModel.Login(authRequest = authRequest)
        }

        binding.btnRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }

        viewModel.Isloading().observe(viewLifecycleOwner, Observer {
            if (it){
                showProgressBar()
            }else {
                hideProgressBar()
            }
        })
    }

    private  fun hideProgressBar(){
        binding.pbLogin.visibility =View.GONE
    }

    private  fun showProgressBar(){
        binding.pbLogin.visibility = View.VISIBLE
    }
}