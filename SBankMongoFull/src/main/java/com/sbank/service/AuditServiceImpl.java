package com.sbank.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.sbank.exception.HandleException;
import com.sbank.model.Audit;
import com.sbank.model.User;
import com.sbank.repository.AuditRepository;
import com.sbank.wrapper.UpdateAudit;
import com.sbank.wrapper.UpdateUser;

@Service
public class AuditServiceImpl implements IAuditService {

	/**...........repo object............*/
	@Autowired
	AuditRepository auditServiceRepo;
	
	/**............environment object.............*/
	@Autowired
	Environment environment;
	
	/** creating auditing
	/* (non-Javadoc)
	 * @see com.sbank.service.IAuditService#createAudit(com.sbank.model.Audit)
	 */
	@Override
	public Audit createAudit(Audit object) throws HandleException{
		// TODO Auto-generated method stub
		if(object!=null)
		{
			Audit audit = auditServiceRepo.save(object);
			return audit;
		}
		else
		{
			throw new HandleException(environment.getProperty("111"));
		}
		
		
	}

	@Override
	public List<Audit> readAudit() throws HandleException {
	
	List<Audit> list = 	auditServiceRepo.findAll();
	
		if(list.size()==0)
		{
			throw new HandleException(environment.getProperty("101"));
		}
		else
		return list;
	}

	@Override
	public Audit Update(UpdateAudit object) {
		
		Audit audit2 = auditServiceRepo.findById(object.getAudit().getAuditId()).get();
		
		audit2.setAuditId(object.getAudit().getAuditId());
		audit2.setEventDate(object.getAudit().getEventDate());
		audit2.setEventId(object.getAudit().getEventId());
		audit2.setEventName(object.getAudit().getEventName());
		audit2.setEventType(object.getAudit().getEventType());
		audit2.setNewValue(object.getAudit().getNewValue());
		audit2.setOldValue(object.getAudit().getOldValue());
		audit2.setUserId(object.getAudit().getUserId());

		Audit updated = auditServiceRepo.save(audit2);
		
		
		return updated;
	}

	@Override
	public List<Audit> delete(String Id) {
	
		Audit entity = auditServiceRepo.findById(Id).get();
		auditServiceRepo.deleteById(entity.getAuditId());
		List<Audit> take = auditServiceRepo.findAll();
    	
		return take;
	}

}
