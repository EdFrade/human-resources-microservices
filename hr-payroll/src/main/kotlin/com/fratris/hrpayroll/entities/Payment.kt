package com.fratris.hrpayroll.entities

import java.math.BigDecimal

data class Payment (val name: String, val dailyIncome: Double, val days: Int) {
    fun getTotal(): Double {
        return days * dailyIncome;
    }
}