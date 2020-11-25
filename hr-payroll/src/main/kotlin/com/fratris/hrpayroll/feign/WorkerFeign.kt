package com.fratris.hrpayroll.feign

import com.fratris.hrpayroll.entities.Worker
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "hr-worker", path = "/workers", url = "localhost:8001")
interface WorkerFeign {
    @GetMapping(value = ["{id}"])
    fun findById(@PathVariable id: Long): ResponseEntity<Worker>
}