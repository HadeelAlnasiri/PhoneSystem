/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;
import java.util.Scanner;
public class PhoneBookTest {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
      
           int yourOption =0;
           String firstName, middleName, lastName;
           long phoneNumber;
          
          Contact c = new Contact();
          AddressBook manager = new AddressBook();
     
          
           while (yourOption != 8){
     System.out.print("Menu: \n 1- Add a new contact \n 2- Update a contact \n 3- Display a contact \n 4- Search for a constant \n 5- Favorite a contact \n 6- Display all the favourite contacts \n 7- Display All contacts \n 8- Quit the program \n");
     System.out.println("Please Enter the option: "); // asking the user to enter what he/she wants to do based on the menu.        
        yourOption = userIn.nextInt();
        
            switch (yourOption){
                case 1:
                Contact contact = new Contact();
          // Asking the user to enter the information of the contact he/she wants to add.
                System.out.println("please enter the first name:");
                firstName = userIn.next();
                contact.name.setFirstName(firstName);
                System.out.println("Please enter the middle name: ");
                middleName = userIn.next();
                contact.name.setMiddleName(middleName);
                System.out.println ("Please enter the last name: ");
                lastName = userIn.next();
                contact.name.setLastName(lastName);
                System.out.println("Please ente the phone number: ");
                phoneNumber = userIn.nextLong();
                contact.number.setPhoneNumber(phoneNumber);
                    manager.addContact(contact);
                     break;
           // Adding a new contact to the address book.  
               
                case 2:
            // Asking the user to enter the new information to the contact to be updated.  
                System.out.println("Please enter the Contact number you want to update : ");
                phoneNumber = userIn.nextLong();
                System.out.println("Enter the first name: ");
                firstName = userIn.next();
                manager.updated.name.setFirstName(firstName);
                System.out.println("Enter the second name: ");
                middleName = userIn.next();
                manager.updated.name.setMiddleName(middleName);
                System.out.println("Enter the last name: ");
                lastName = userIn.next();
                manager.updated.name.setLastName(lastName);
                System.out.println("Enter the phone number: ");
                phoneNumber = userIn.nextLong();
                manager.updated.number.setPhoneNumber(phoneNumber);
                c.number.setPhoneNumber(phoneNumber);  
                    manager.updateContact(c);    
                      break;
           // Updating an contact. The user allowed to updating the first, second, and/or last name, and/or the number.
                 
                case 3:
                System.out.println("Please enter the contact number you want to display: ");
                phoneNumber = userIn.nextLong();
                c.number.setPhoneNumber(phoneNumber);
                   manager.displayContact(c);
                      break;
                // displaying a contact information using the number of it.
               
                case 4:
                System.out.println("Please enter the number of the contact you want to search for: ");
                phoneNumber = userIn.nextLong();
                c.number.setPhoneNumber(phoneNumber);
                    manager.search(c);
                      break;
                // Searching for a contact by entring the phoneNumber. it return the index of the contact in the contacts list.
               
                case 5:
                System.out.println("Please enter the Contact number you want to favorite: ");
                phoneNumber = userIn.nextLong();
                c.number.setPhoneNumber(phoneNumber);
                    manager.favContact(c);
                      break;
                // Favoriting an contact. 
               
                case 6:
                    manager.displayFavs();
                    break;
                // Displaying all the favorite contacts. 
                          
                case 7:
                   manager.displayAllContacts();  
                    break;
                // Displaying all the contacts.          
           
               
      
    
}
}
}
}


