package com.example.lolcalculator

import java.math.BigDecimal

class CalculatorModel(
    var currentInput: StringBuilder = StringBuilder(),
    var currentOperator: Operator = Operator.NONE,
    var operand1: BigDecimal? = null
)