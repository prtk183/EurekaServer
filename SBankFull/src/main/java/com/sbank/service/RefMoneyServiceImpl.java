/*package com.sbank.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.sbank.dao.RefMoneyRepository;
import com.sbank.exception.HandleException;
import com.sbank.model.RefMoney;

@Service
public class RefMoneyServiceImpl implements RefMoneyService{

  @Autowired
  RefMoneyRepository refMoneyRepository;
  
  Logger log = Logger.getLogger(RefMoneyServiceImpl.class.getName());

  @Override
  public  List<Integer> update(RefMoney refMoney) throws HandleException{
    
    List<Integer> take = (List<Integer>) refMoneyRepository.findAll().get(0);
    
    take.add(currency);
    
    
    log.info("in ref update ");
    return  (List<Integer>) refMoneyRepository.findAll().get(0);
  }
  
  *//** getting available table
   * @see com.sbank.service.RefMoneyService#getRefTable()
   *//*
  @Override
  public List<Integer> getRefTable() throws HandleException {

    
    log.info("in ref get ref update ");
    return (List<Integer>) refMoneyRepository.findAll().get(0);
  }

}
*/