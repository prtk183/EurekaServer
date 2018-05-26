package com.sbank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbank.model.Audit;
import com.sbank.model.User;

public interface AuditRepository extends  MongoRepository<Audit, Object>{

}
