package com.modular.calculatorfeature.di

import com.modular.calculatorfeature.CalculatorViewModel
import com.modular.calculatorfeature.domain.CalculateOperationsUseCase
import com.modular.calculatorfeature.domain.CheckOperationsUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureCalculatorModule = module {
    factory { CheckOperationsUseCase() }
    factory {CalculateOperationsUseCase()}
    viewModel{CalculatorViewModel(get(),get())}
}