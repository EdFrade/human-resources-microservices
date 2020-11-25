package com.fratris.hrpayroll.entities

import java.math.BigDecimal

data class Payment(val name: String, val dailyIncome: BigDecimal, val days: Int) {
    fun getTotal(): BigDecimal {
        return dailyIncome.multiply(BigDecimal(days))
    }
}