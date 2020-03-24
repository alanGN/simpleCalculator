package com.modular.calculatorfeature.domain

import org.koin.ext.isInt

class CheckOperationsUseCase {

    private var numberOfDecimals: Int = 0
    fun checkOperations(oldtext: String, newText: String): String {
        checkNumberOfDecimals(oldtext, newText)

        if (numberOfDecimals > 1 && newText == ",") {
            return oldtext
        }

        return if (oldtext == "null") {
            newText
        } else {
            if (((!oldtext[oldtext.length - 1].isDigit()) && newText.isInt())
                || ((oldtext[oldtext.length - 1].isDigit()) && newText.isInt())
                || ((oldtext[oldtext.length - 1].isDigit()) && !newText.isInt())
            ) {
                oldtext + newText
            } else {
                oldtext.substring(0, oldtext.length - 1) + newText
            }
        }
    }

    private fun checkNumberOfDecimals(oldtext: String, newText: String) {
        if (newText == ",") {
            numberOfDecimals++
        } else if (numberOfDecimals >= 1) {
            if ((oldtext[oldtext.length - 1] == '+' || oldtext[oldtext.length - 1] == '-') && newText.isInt()) {
                numberOfDecimals = 0
            }
        }
    }
}