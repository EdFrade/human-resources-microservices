package com.fratris.hrworker.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import com.fratris.hrworker.entities.Worker;
import com.fratris.hrworker.repositories.WorkerRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/workers")
public class WorkerResource {
  
  private WorkerRepository repository;

  public WorkerResource(WorkerRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public ResponseEntity<List<Worker>> findAll() {
    return ResponseEntity.ok(repository.findAll());
  }

  @GetMapping(value = "{id}")
  public ResponseEntity<Worker> findById(@PathVariable Long id) {
    return ResponseEntity.ok(repository.findById(id).get());
  }

}
