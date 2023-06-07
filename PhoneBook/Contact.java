/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

public class Contact {
protected String email;

 Name name = new Name();
 Number number = new Number();
 Job job = new Job();
 Address adress = new Address();
 DateOfBirth DOB = new DateOfBirth();
 
 
 Contact(){
     
 }
 
 Contact(Name name, Number number){
     this.name = name;
     this.number = number;
     
 }
 Contact (Number number, Name name, String email){
     this(name, number);
     this.email = email;
 }
 Contact (Number number, Name name, String email, Job job){
     this (number,name,email);
     this.job = job;
 }
 
@Override
 public boolean equals(Object o){ //override
     Contact contact = (Contact) o;
    return (this.number.phoneNumber == contact.number.phoneNumber);
     
 }
 
@Override
 public String toString(){
    return (name.toString()+" Phone Number: "+ number.toString() + ", Email: " + email+ ", birthday " + DOB.toString() + ", work Information: " + job.toString());
 }
 

 
 
 

    
    
}
