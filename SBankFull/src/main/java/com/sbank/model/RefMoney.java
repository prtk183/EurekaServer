/*package com.sbank.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class RefMoney {
  @Id
  private Long refId;
  
  @ElementCollection
  private List<Integer> currency;
  
  private Integer bankId;
  
  private Integer atmId;
   
  public List<Integer> getCurrency() {
    return currency;
  }

  public void setCurrency(List<Integer> currency) {
    this.currency = currency;
  }

  public Integer getBankId() {
    return bankId;
  }

  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }

  public Integer getAtmId() {
    return atmId;
  }

  public void setAtmId(Integer atmId) {
    this.atmId = atmId;
  }


  public Long getRefId() {
    return refId;
  }

  public void setRefId(Long refId) {
    this.refId = refId;
  }

}*/