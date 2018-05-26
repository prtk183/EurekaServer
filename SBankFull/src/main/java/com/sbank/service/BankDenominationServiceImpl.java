/*package com.sbank.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbank.dao.AtmDenominationRepository;
import com.sbank.dao.BankDenominationRepository;
import com.sbank.exception.HandleException;
import com.sbank.model.Atm_Denomination;
import com.sbank.model.Bank;
import com.sbank.model.Bank_Denomination;
import com.sbank.wrappers.WrapperDenomination;
import com.sbank.wrappers.WrapperRequestObject;

@Service
public class BankDenominationServiceImpl implements DenominationService{

  *//**-------bankServiceImpl object-----.*//*
  @Autowired 
  BankServiceImpl bankServiceImpl;
  
  @Autowired
  BankDenominationRepository bankDenominationRepository;
  
  @Autowired
  AtmDenominationRepository atmDenominationRepository;
  
  @Autowired
  RefMoneyServiceImpl refMoneyServiceImpl;
  
  *//** getting requestamount and bank id and returrning the denomination with its count.
   * @see com.sbank.service.DenominationService#
   * \t getDenominationPermission(com.sbank.wrappers.BankPermission)
   *//*
  @Override
  public WrapperDenomination getDenomination(WrapperRequestObject object) throws HandleException {
   
    *//**-------result -------.*//*
    WrapperDenomination result=null;
    
    *//**--------denomination table--------.*//*
    Map<Integer, Integer> denomtable = new HashMap<Integer, Integer>(6);
    
    List<Integer> availableDenomination = new ArrayList<Integer>(6);
    
    //this from db
    List<Integer> denomination = new ArrayList<Integer>(3);
    denomination.add(2000);
    denomination.add(500);
    denomination.add(200);
    
    if(object.getRequestamount()!=null && object.getId()!=null)
    {
      
    
          
            Integer amount = object.getRequestamount().intValue();
          
            Collections.copy(availableDenomination, denomination);
            
            
            Random random = new Random();
            
           
            
            if(availableDenomination.isEmpty()==false)
            {
                while(amount.intValue()!=0 )
                {
                  int count=0;
                  Integer index = availableDenomination.get(random.nextInt(availableDenomination.size()));
                    if(amount>=index)
                    {
                      count = amount/index;
                      amount = amount%index;
                   
                      availableDenomination.remove(index);
                      denomtable.put(index, count);
                      
                    }
                }
            
                result.setDenominationTable(denomtable);
                result.setPermission(true);
                result.setDenominations(denomination);
                Bank_Denomination obj = new Bank_Denomination(denomination, denomtable );
               
                return result;
            }
            else
            {
              throw new HandleException("invalid amount");
            }
        }
        else
        {
          throw new HandleException("Bank not found");
        }
      
    
   
    
  }

  *//**
   * 
   *
   * (non-Javadoc)
   * @see com.sbank.service.DenominationService#upadateDenominations(com.sbank.wrappers.WrapperDenomination)
   *//*
  @Override
  public void upadateDenominations(Bank_Denomination object) throws HandleException {
    
    bankDenominationRepository.save(object);
  }

  @Override
  public void upadateDenominations(Atm_Denomination object) throws HandleException {
    
    atmDenominationRepository.save(object);
    
    
  }



}
*/