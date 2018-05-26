package com.sbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbank.exception.HandleException;
import com.sbank.model.Audit;
import com.sbank.service.AuditServiceImpl;
import com.sbank.wrapper.UpdateAudit;

@Controller
public class AuditController {

	@Autowired
	AuditServiceImpl auditServiceImpl;
	

    @PostMapping("/createAudit")
    public ResponseEntity<Audit> create(@RequestBody Audit object) throws HandleException {
        Audit Audits = auditServiceImpl.createAudit(object);
        return new ResponseEntity<Audit>(Audits, HttpStatus.OK);
    }

    @GetMapping(value = "/readallAudit") 
    public ResponseEntity<List<Audit>> readAll() throws HandleException {
        List<Audit> Audits = auditServiceImpl.readAudit();
        return new ResponseEntity<List<Audit>>(Audits, HttpStatus.OK);
    }
    
   /* @GetMapping(value = "/readAudit/{id}") 
    public ResponseEntity<Audit> read(@PathVariable String id) {
        Audit Audit2 = auditServiceImpl.
        return new ResponseEntity<Audit>(Audit2, HttpStatus.OK);

    }*/
    
    @PostMapping("/updateAudit")
    public ResponseEntity<Audit> update(@RequestBody UpdateAudit Audit) {
    	Audit Audit3 = auditServiceImpl.Update(Audit);
 	        return new ResponseEntity<Audit>(Audit3, HttpStatus.OK);

    }

    @DeleteMapping("/deleteAudit") 
    public ResponseEntity<List<Audit>> delete(@RequestParam("id") String Id) {
        System.out.println("inside Deleted");
    	List<Audit> list = auditServiceImpl.delete(Id);
        return new ResponseEntity<List<Audit>>(list, HttpStatus.OK);
    }

	
	
}
