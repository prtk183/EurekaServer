/*package com.sbank.service;

import java.math.BigDecimal;

import com.sbank.dao.AtmDenominationRepository;
import com.sbank.exception.HandleException;
import com.sbank.model.ATM;
import com.sbank.model.Atm_Denomination;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbank.exception.HandleException;
import com.sbank.model.Bank;
import com.sbank.model.Bank_Denomination;
import com.sbank.wrappers.WrapperDenomination;

@Service
public class AtmDenominationServiceImpl extends BankDenominationServiceImpl {

  *//**-------bankServiceImpl object-----.*//*
  @Autowired 
 ATMServiceImpl AtmServiceImpl;
  
  @Autowired
  RefMoneyServiceImpl refMoneyServiceImpl;
  
  @Autowired
  AtmDenominationRepository atmDenominationRepository;
  
  *//** getting requestamount and bank id and returrning the denomination with its count.
   * @see com.sbank.service.DenominationService#
   * \t getDenominationPermission(com.sbank.wrappers.BankPermission)
   *//*
  @Override
  public WrapperDenomination getDenomination(BankPermission object) throws HandleException {
   
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
          throw new HandleException("ATM not found");
        }
      
    }
  
   




}
*/