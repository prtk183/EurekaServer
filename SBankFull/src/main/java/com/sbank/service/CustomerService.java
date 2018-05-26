/**
 * 
 */
package com.sbank.service;

import java.util.List;

import com.sbank.exception.HandleException;
import com.sbank.model.Customer;
import com.sbank.wrappers.WrapperUpdateCustomer;

/**
 * @author trainee
 *
 */
public interface CustomerService {


  /**
   * @param customer
   * @return customer
   * @throws HandleException
   */
  Customer createCustomer(Customer customer) throws HandleException;
	
  
	/**
	 * @return list of customer
	 * @throws HandleException
	 */
	List<Customer> getCustomerdetails() throws HandleException;
	
	
	/**
	 * @param customerId
	 * @return customer
	 * @throws HandleException
	 */
	Customer getCustomer(Long customerId) throws HandleException;
	
	
	/**
	 * @param object
	 * @return
	 * @throws HandleException
	 */
	Customer updateCustomer(WrapperUpdateCustomer object) throws HandleException;
}
