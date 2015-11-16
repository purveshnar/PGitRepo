 package com.kapx.spring.batch.service.impl; 
 
 import org.springframework.beans.factory.annotation.Autowired;  
 import org.springframework.beans.factory.annotation.Qualifier;  
 import org.springframework.stereotype.Service;  
 import org.springframework.transaction.annotation.Propagation;  
 import org.springframework.transaction.annotation.Transactional;  
 import com.kapx.spring.batch.dao.ContactDao;  
 import com.kapx.spring.batch.entity.Contact;  
 import com.kapx.spring.batch.service.ContactService; 
 
 @Service("contactService")  
 public class ContactServiceImpl implements ContactService<Contact, Long> {  

     @Autowired  
     @Qualifier("contactDao")  
     private ContactDao contactDao;  

     @Override  
     @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)  
     public Contact save(Contact entity) {  
         return contactDao.save(entity);  
     }  
 }  