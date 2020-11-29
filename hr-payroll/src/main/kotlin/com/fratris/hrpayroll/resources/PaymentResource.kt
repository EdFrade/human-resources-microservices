package com.fratris.hrpayroll.resources

import com.fratris.hrpayroll.entities.Payment
import com.fratris.hrpayroll.services.PaymentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentResource(@Autowired val paymentService: PaymentService) {
    @GetMapping("/{workerId}/days/{days}")
    fun getPayment(@PathVariable workerId: Long, @PathVariable days: Int): ResponseEntity<Payment> {
        return ResponseEntity.ok(paymentService.getPayment(workerId, days))
    }
}