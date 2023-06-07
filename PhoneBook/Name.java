/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

public class Name {
    private String firstName, middleName, lastName;
    

public void setFirstName(String firstName){
    this.firstName = firstName;
}
public String getFirstName(){
return firstName;
}

public void setMiddleName(String middleName){
    this.middleName = middleName; 
}
public String getMiddleName(){
    return middleName;
}

public void setLastName(String lastName){
    this.lastName = lastName;
}
public String getLastName(){
    return lastName;
}

    @Override
    public String toString(){
        return (firstName + " " + middleName+ " " + lastName);
    
}
}
