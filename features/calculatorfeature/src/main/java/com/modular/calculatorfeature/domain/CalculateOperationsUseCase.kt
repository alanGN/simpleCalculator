package com.modular.calculatorfeature.domain

import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.ArithmeticException

class CalculateOperationsUseCase(){

    fun doOperation(operations: String): String{

        val expression = ExpressionBuilder(preppareOperations(operations)).build()
        return try{
            expression.evaluate().toString()
        }catch (ex:ArithmeticException){
            "-1"
        }
    }

    //check the last digit and replace , for . (library needs dots)
    private fun preppareOperations(operations: String): String? {
        var textToOperate = operations.replace(",",".")
        if(!textToOperate[textToOperate.length - 1].isDigit()){
            textToOperate = textToOperate.substring(0, textToOperate.length - 1)
        }
        return textToOperate
    }
}