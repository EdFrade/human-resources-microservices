package com.fratris.hrpayroll.entities

import java.io.Serializable
import java.math.BigDecimal

data class Worker(val id: Long, val name: String, val dailyIncome: BigDecimal) : Serializable {}