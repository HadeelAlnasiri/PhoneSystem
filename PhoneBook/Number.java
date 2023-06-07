/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

public class Number {
 
 long phoneNumber;
 int numberKey;
 
 public void setPhoneNumber(long phoneNumber){
     this.phoneNumber = phoneNumber;
 }
 public long getPhoneNumber(){
     return phoneNumber;
 }
 
 public void setNumberKey(int numberKey){
     this.numberKey = numberKey;
 }
 public int getNumberKey(){
     return numberKey;
 }
 
 @Override
 public String toString(){
  return ("Number: " + phoneNumber);   
 }
}
