/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

public class DateOfBirth {
   private int month;
    private int day, year;
   
    
    public void setMont(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    
    public void setday(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    
    public void setYear(int yaer){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    
   @Override
    public String toString(){
      return (day + "/" + month + "/" + year);  
    }
}
