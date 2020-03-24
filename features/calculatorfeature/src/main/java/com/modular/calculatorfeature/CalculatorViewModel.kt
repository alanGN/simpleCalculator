package com.modular.calculatorfeature

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.modular.calculatorfeature.domain.CalculateOperationsUseCase
import com.modular.calculatorfeature.domain.CheckOperationsUseCase
import com.modular.common.base.BaseViewModel
import kotlinx.coroutines.delay

class CalculatorViewModel(
    private val doOperations: CalculateOperationsUseCase,
    private val checkOperations: CheckOperationsUseCase
) : BaseViewModel() {

    private val _operationText = MutableLiveData<String>()
    val operationText: LiveData<String> get() = _operationText

    fun addOperationOrNumber(tv: View) {
        val str = tv as TextView
        _operationText.value =
            checkOperations.checkOperations(_operationText.value.toString(), str.text.toString())
    }

    fun calculateOperation() {
        _operationText.value =
            doOperations.doOperation(_operationText.value.toString()).replace(".", ",")
    }
}