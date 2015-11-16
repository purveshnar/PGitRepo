package com.kapx.spring.batch.writer;  

 import java.util.List;  
 import org.slf4j.Logger;  
 import org.slf4j.LoggerFactory;  
 import org.springframework.batch.item.ItemWriter;  
 import org.springframework.beans.factory.annotation.Autowired;  
 import org.springframework.beans.factory.annotation.Qualifier;  
 import org.springframework.stereotype.Component;  
 import com.kapx.spring.batch.entity.Contact;  
 import com.kapx.spring.batch.service.ContactService;  

 @Component("contactWriter")  
 public class ContactWriter implements ItemWriter<Contact> {  

     private static final Logger logger = LoggerFactory.getLogger(ContactWriter.class);  

     @Autowired  
     @Qualifier("contactService")  
     private ContactService<Contact, Long> contactService;
  
     @Override  
     public void write(final List<? extends Contact> contacts) throws Exception {  
         for (Contact contact : contacts) {  
             logger.debug("Writing contact information FirstName: {}, LastName: {}, Email: {}", contact.getFirstName(), contact.getLastName(), contact.getEmail());  
             contactService.save(contact);  
         }  
     }  
 } 