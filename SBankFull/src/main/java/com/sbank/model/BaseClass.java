package com.sbank.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseClass {

  /**-------baseId for whole app------.*/
  public String baseId;

  public String getBaseId() {
    return baseId;
  }

  public void setBaseId(final String baseId) {
    this.baseId = baseId;
  }
  
  
}
