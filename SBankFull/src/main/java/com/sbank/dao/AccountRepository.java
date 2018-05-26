package com.sbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sbank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
