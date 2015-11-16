package com.kapx.spring.batch.dao.impl;  

 import org.slf4j.Logger;  
 import org.slf4j.LoggerFactory;  
 import org.springframework.stereotype.Repository;  
 import com.kapx.spring.batch.dao.AbstractJpaDAO;  
 import com.kapx.spring.batch.dao.ContactDao;  
 import com.kapx.spring.batch.entity.Contact; 
 
 @Repository("contactDao")  
 public class ContactDAOImpl extends AbstractJpaDAO<Contact, Long> implements ContactDao {  

     private static final Logger logger = LoggerFactory.getLogger(ContactDAOImpl.class); 
 
     public ContactDAOImpl() {  
         super(Contact.class);  
     }  

     @Override  
     public Contact save(final Contact entity) {  
         super.persist(entity);  
         logger.debug("Persist a Contact entity in persistence store with ID {}", entity.getId());  
         return entity;  
     }  
 }