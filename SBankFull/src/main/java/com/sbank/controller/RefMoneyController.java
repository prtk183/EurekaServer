/*package com.sbank.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbank.exception.HandleException;
import com.sbank.model.Bank;
import com.sbank.service.RefMoneyServiceImpl;

@Controller
public class RefMoneyController {
  
  
  @Autowired
  RefMoneyServiceImpl refimpl;
  
  @Autowired
  Environment environment;

  Logger log = Logger.getLogger(RefMoneyController.class.getName());
  
  @GetMapping("/getrefMoney")
  public ResponseEntity<?> getReftable() throws HandleException
  {
    
    log.info("calling getBankDetails");
    List<Integer> refTable = new ArrayList<Integer>(); 
    refTable = refimpl.getRefTable();
    
    if(refTable!=null)
    {return new ResponseEntity<List<Integer>>(refTable, HttpStatus.OK);}
    else
    {return new ResponseEntity<String>(environment.getProperty("999"), HttpStatus.BAD_REQUEST);}
    
  }
  
  @PostMapping("/addnewcurrency")
  public ResponseEntity<?> updatecurrerncy(@RequestParam RefMoney object) throws HandleException
  {
    log.info("calling upadtecurrency ");
    List<Integer> refTable = new ArrayList<Integer>(); 

    refTable = refimpl.update(object);
    
    if(refTable!=null)
    {return new ResponseEntity<List<Integer>>(refTable, HttpStatus.OK);}
    else
    {return new ResponseEntity<String>(environment.getProperty("999"), HttpStatus.BAD_REQUEST);}
    
    
  }
  
  
}
*/