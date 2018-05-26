package com.sbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbank.model.ATM;

public interface ATMRepository extends JpaRepository<ATM, Long>{

}
