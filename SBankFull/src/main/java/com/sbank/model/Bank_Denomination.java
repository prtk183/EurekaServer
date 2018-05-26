/*package com.sbank.model;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Bank_Denomination {
  *//**------------*//*
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long bankdenominationref;
  
  @ElementCollection
  private List<Integer> denomination;
  
  @ElementCollection
  private Map<Integer, Integer> bankDenominations;
  
  public Bank_Denomination(List<Integer> denomination, Map<Integer, Integer> bankDenominations )
  {
    Collections.copy(this.denomination, denomination);
    this.bankDenominations.putAll(bankDenominations);
  }
 
  
  public Map<Integer, Integer> getBankDenominations() {
    return bankDenominations;
  }

  public void setBankDenominations(Map<Integer, Integer> bankDenominations) {
    this.bankDenominations = bankDenominations;
  }

  public List<Integer> getDenomination() {
    return denomination;
  }

  public void setDenomination(List<Integer> denomination) {
    this.denomination = denomination;
  }

 
}
*/