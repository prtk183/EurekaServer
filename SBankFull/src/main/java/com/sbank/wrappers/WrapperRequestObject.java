package com.sbank.wrappers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

//import com.sbank.model.RefMoney;

public class WrapperRequestObject {
  /**------------*/
  private Long Id;
  /**------------*/
  private BigDecimal requestamount;
  
  /**-------------*/
  /**
   * 
   */
  public WrapperRequestObject()
  {
    
  }

 



  /**
   * @return
   */
  public BigDecimal getRequestamount() {
    return requestamount;
  }

  
  /**
   * @param requestamount
   */
  public void setRequestamount(BigDecimal requestamount) {
    this.requestamount = requestamount;
  }
 

  /**
   * @return
   */
  public Long getId() {
    return Id;
  }


  /**
   * @param id
   */
  public void setId(Long id) {
    Id = id;
  }

}
