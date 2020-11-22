package com.fratris.hrworker.repositories;

import com.fratris.hrworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * WorkerRepository
 */
public interface WorkerRepository extends JpaRepository<Worker, Long>{}