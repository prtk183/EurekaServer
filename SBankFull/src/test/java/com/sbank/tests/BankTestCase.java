package com.sbank.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import com.sbank.SBankApplication;
import com.sbank.controller.BankController;
import com.sbank.dao.BankRepository;
import com.sbank.exception.HandleException;
import com.sbank.model.Bank;
import com.sbank.service.BankServiceImpl;
import com.sbank.wrappers.WrapperCreateBank;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("application.properties")
public class BankTestCase {

  /**-------bankRepository to  mock-------------.*/
  @Mock
  private BankRepository bankRepository;
  
  /**---------environment---------.*/
  @Autowired
  private Environment environment;
  
  /**----------bankserviceimpl to use -----------------.*/
  @InjectMocks
  BankServiceImpl bankserviceimpl;
  
  @Test
  public void testCreateBankSuccess() throws HandleException
  {
    final WrapperCreateBank object = new WrapperCreateBank();
    object.setAmount(new BigDecimal(1000));
    
    final Bank bank=new Bank(new BigDecimal(1000));
    
    when(bankRepository.save(Mockito.<Bank>any())).thenReturn(bank);
    assertEquals(bankserviceimpl.createBank(object).getAmount(),new BigDecimal(1000));
  }
  
  
  @Test(expected=Exception.class)
  public void testBankException() throws HandleException {
    final WrapperCreateBank object = new WrapperCreateBank();
    object.setAmount(null);
    when(bankserviceimpl.createBank(object)).thenThrow(new Exception("java.lang.NullPointerException "));
    
  }

  @Test(expected=HandleException.class)
  public void testBankHandleException() throws HandleException {
    final WrapperCreateBank object = new WrapperCreateBank();
    object.setAmount(null);
    when(bankserviceimpl.createBank(object)).thenThrow(new HandleException(environment.getProperty("101")));
    
  }
  
}




