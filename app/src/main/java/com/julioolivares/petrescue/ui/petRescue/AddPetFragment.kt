package com.julioolivares.petrescue.ui.petRescue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.julioolivares.petrescue.R

class AddPetFragment : Fragment() {

    companion object {
        fun newInstance() = AddPetFragment()
    }

    private lateinit var viewModel: AddPetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_pet_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddPetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}