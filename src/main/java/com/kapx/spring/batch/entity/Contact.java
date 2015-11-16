package com.kapx.spring.batch.entity;  
 import javax.persistence.Column;  
 import javax.persistence.Entity;  
 import javax.persistence.GeneratedValue;  
 import javax.persistence.GenerationType;  
 import javax.persistence.Id;  
 import javax.persistence.Table;  

 @Entity  
 @Table(name = "CONTACTS")  
 public class Contact {  
     @Id  
     @GeneratedValue(strategy = GenerationType.IDENTITY)  
     @Column(name = "ID")  
     private Long id;  

     @Column(name = "FIRST_NAME")  
     private String firstName;  

     @Column(name = "LAST_NAME")  
     private String lastName; 
 
     @Column(name = "EMAIL")  
     private String email;  

     public String getFirstName() {  
         return firstName;  
     }  
     public Long getId() {  
         return id;  
     }  
     public void setId(Long id) {  
         this.id = id;  
     }  
     public void setFirstName(String firstName) {  
         this.firstName = firstName;  
     }  
     public String getLastName() {  
         return lastName;  
     }  
     public void setLastName(String lastName) {  
         this.lastName = lastName;  
     }  
     public String getEmail() {  
         return email;  
     }  
     public void setEmail(String email) {  
         this.email = email;  
     }  
 } 