package com.personallabs.dogs.views

import android.os.Bundle
import android.support.annotation.NonNull
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.personallabs.dogs.databinding.BreedsFragmentBinding
import com.personallabs.dogs.viewModels.BreedsViewModel

class BreedsFragment  : Fragment() {

    lateinit var viewModel: BreedsViewModel


    companion object {
        fun newInstance(viewModel: BreedsViewModel): BreedsFragment {
            val fragment = BreedsFragment()
            fragment.viewModel = viewModel
            return fragment
        }
    }

    override fun onCreateView(@NonNull inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : com.personallabs.dogs.databinding.BreedsFragmentBinding = BreedsFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.recyclerView.adapter = BreedsAdapter(emptyList())
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        return binding.root
    }