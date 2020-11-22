package com.fratris.hrworker.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Worker
 */
@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private BigDecimal dailyIncome;

  public Worker(){}

  public Worker(Long id, String name, BigDecimal dailyIncome) {
    this.id = id;
    this.name = name;
    this.dailyIncome = dailyIncome;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getDailyIncome() {
    return dailyIncome;
  }

  public void setDailyIncome(BigDecimal dailyIncome) {
    this.dailyIncome = dailyIncome;
  }
  
  
}
