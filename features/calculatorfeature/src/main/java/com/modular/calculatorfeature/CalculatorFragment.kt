package com.modular.calculatorfeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.modular.calculatorfeature.databinding.FragmentCalculatorBinding
import com.modular.common.base.BaseFragment
import com.modular.common.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class CalculatorFragment:BaseFragment() {

    private val viewModel: CalculatorViewModel by viewModel()
    private lateinit var binding: FragmentCalculatorBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun getViewModel(): BaseViewModel = viewModel

    override fun implementViewClicks() {
    }
}