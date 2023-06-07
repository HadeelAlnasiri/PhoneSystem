/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

public class Job {
    private String company;
    private long workNumber;
    String JobTitle;
    


    @Override
 public String toString(){
  return (company + " " + workNumber + " " + JobTitle);   
 }
}
