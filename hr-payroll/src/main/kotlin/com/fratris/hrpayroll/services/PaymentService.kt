package com.fratris.hrpayroll.services

import com.fratris.hrpayroll.entities.Payment
import org.springframework.stereotype.Service

@Service
class PaymentService {
    fun getPayment(workerId: Long, days: Int): Payment {
        return Payment("Eduardo",200.0, days)
    }
}