package com.fratris.hrpayroll.services

import com.fratris.hrpayroll.entities.Payment
import com.fratris.hrpayroll.entities.Worker
import com.fratris.hrpayroll.feign.WorkerFeign
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PaymentService(val workerService : WorkerFeign){
    fun getPayment(workerId: Long, days: Int): Payment {
        val worker: Worker? = workerService.findById(workerId).body
        if (worker != null) {
            return Payment(worker.name,worker.dailyIncome, days)
        }
        throw ResponseStatusException(HttpStatus.NOT_FOUND, "Erro inesperado")
    }
}