package com.sbank.wrappers;

import java.util.List;
import java.util.Map;

public class WrapperDenomination {

 /**-------DenominationTable--------.*/ 
 Map<Integer, Integer> DenominationTable;
  
 /**-------Permisssion--------.*/
  Boolean permission;
  
  
List<Integer> denominations;

  public List<Integer> getDenominations() {
  return denominations;
}


public void setDenominations(List<Integer> denominations) {
  this.denominations = denominations;
}


  /**
   * @return
   */
  public Map<Integer, Integer> getDenominationTable() {
    return DenominationTable;
  }


  /**
   * @param denominationTable
   */
  public void setDenominationTable(Map<Integer, Integer> denominationTable) {
    DenominationTable = denominationTable;
  }


  /**
   * @return
   */
  public Boolean getPermission() {
    return permission;
  }

  
  /**
   * @param permission
   */
  public void setPermission(Boolean permission) {
    this.permission = permission;
  }

 
  
}
