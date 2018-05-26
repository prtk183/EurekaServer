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

@Entity(name="Atm_Denomination")
public class Atm_Denomination {

  *//**------------*//*
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long atmDenominationId;
  
  *//**------------*//*
  @ElementCollection
  private List<Integer> denomination;
  *//**------------*//*
  @ElementCollection
  private Map<Integer,Integer> noofdenomination;
  
  public Atm_Denomination(List<Integer> denomination, Map<Integer,Integer> noofdenomination)
  {
    Collections.copy(this.denomination, denomination);
    this.noofdenomination.putAll(noofdenomination);
  }
  
  public List<Integer> getDenomination() {
    return denomination;
  }
  public void setDenomination(List<Integer> denomination) {
    this.denomination = denomination;
  }
  public Map<Integer, Integer> getNoofdenomination() {
    return noofdenomination;
  }
  public void setNoofdenomination(Map<Integer, Integer> noofdenomination) {
    this.noofdenomination = noofdenomination;
  }
  

  
  
}
*/