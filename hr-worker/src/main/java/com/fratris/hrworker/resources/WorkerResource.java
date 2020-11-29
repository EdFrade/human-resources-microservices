package com.fratris.hrworker.resources;

import java.util.List;


import com.fratris.hrworker.entities.Worker;
import com.fratris.hrworker.repositories.WorkerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/workers")
public class WorkerResource {

  private final Logger logger = LoggerFactory.getLogger(Worker.class);

  private Environment env;

  private final WorkerRepository repository;

  public WorkerResource(Environment env, WorkerRepository repository) {
    this.env = env;
    this.repository = repository;
  }

  @GetMapping
  public ResponseEntity<List<Worker>> findAll() {
    return ResponseEntity.ok(repository.findAll());
  }

  @GetMapping(value = "{id}")
  public ResponseEntity<Worker> findById(@PathVariable Long id) {
    logger.info(env.getProperty("local.server.port"));
    return ResponseEntity.ok(repository.findById(id).get());
  }

}
