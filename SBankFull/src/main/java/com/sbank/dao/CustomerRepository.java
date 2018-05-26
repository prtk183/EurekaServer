/**
 * 
 */
package com.sbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbank.model.Customer;

/**
 * @author trainee
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
