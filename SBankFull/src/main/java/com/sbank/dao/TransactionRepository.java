package com.sbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbank.model.Customer;
import com.sbank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
