package com.sbank.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.sbank.controller.CustomerController;
import com.sbank.dao.BankRepository;
import com.sbank.dao.CustomerRepository;
import com.sbank.exception.HandleException;
import com.sbank.model.Bank;
import com.sbank.model.Customer;
import com.sbank.wrappers.WrapperUpdateCustomer;



@Service
public class CustomerServiceImpl implements CustomerService {

  /**------------customerRepository object-----------------.*/
	@Autowired
	private CustomerRepository customerRepository;
	
	/**----------Log---------------.*/
  Logger Log = Logger.getLogger(CustomerServiceImpl.class.getName());
  
  /**------------environment-----------------.*/
  @Autowired
  private Environment environment;
  
	/**----------------bankServiceImpl--------------------------.*/ 
  @Autowired
	 private BankServiceImpl bankServiceImpl;
  
	/**/
	/* crating customer with id, pi, name and bankid
	 * @see com.sbank.service.CustomerService#createCustomer(com.sbank.model.Customer)
	 */
	@SuppressWarnings("unlikely-arg-type")
  @Override
	public Customer createCustomer(Customer customer) throws HandleException {
	  
	  Customer addNewCustomer =null;
	  Log.info("in customer service calling createCustomer");
	  
	  if(customer!=null && customer.getBank()!=null && customer.getCustomerId()!=null )
	  {
	    
	  if(( bankServiceImpl.getBank(customer.getBank().getBankId()).getBankId()
	      .equals(customer.getBank().getBankId()) )) //cheking valid bank in argument 
	    {
	        if( customer.getCustomerName().isEmpty()
	            && customer.getCustomerName().isEmpty())  //checking valid customer data
	          {
	              throw new HandleException(environment.getProperty("201"));
	          } else {
	                      addNewCustomer =  customerRepository.save(customer);
	                      return addNewCustomer;
	         }
	    } else {
	      throw new HandleException(environment.getProperty("202")); 
	    }
	  } else {
      throw new HandleException(environment.getProperty("7777")); 

	  }
	}



	/*
   * showing customers
   * 
	 * @see com.sbank.service.CustomerService#getCustomerdetails()
	 */
	@Override
	public List<Customer> getCustomerdetails() throws HandleException {
		
	  Log.info("in customer service calling getCustomerdetails");
		List<Customer> custlist;
		
		custlist=customerRepository.findAll();
		
		if(custlist.size()==0)
		{
		  throw new HandleException(environment.getProperty("200"));
		}
		else
		{
		  return custlist;
		}
	}


	/**/
  /* get customer by id
   * @see com.sbank.service.CustomerService#getCustomer(java.lang.Long)
   */
  @Override
  public Customer getCustomer(final Long customerId) throws HandleException {
    Log.info("in customer service calling getCustomer");
    Optional op;
    Customer customer=null;
    
    op= customerRepository.findById(customerId);
    if(op.isPresent())
    {
        customer = customerRepository.findById(customerId).get();
        return customer;
    }
    else
    {
      throw new HandleException(environment.getProperty("200"));
    }
    
   
  }



  @Override
  public Customer updateCustomer(final WrapperUpdateCustomer object) throws HandleException {
    
    if(object!=null && object.getCustomerBankId()!=null & object.getCustomerName()!=null)
    {
      
      final Customer customer = customerRepository.findById(object.getId()).get();
      customer.setBank(bankServiceImpl.getBank(object.getCustomerBankId()));
      customer.setCustomerName(object.getCustomerName());
      return customerRepository.save(customer);
    }
    else
    {
      throw new HandleException(environment.getProperty("7777"));
    }
  }
		

}
