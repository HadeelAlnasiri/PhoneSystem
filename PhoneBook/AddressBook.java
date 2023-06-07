/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

public class AddressBook {
    
  int count;
  Contact[] contacts;
  int ContactIndex;
   
   AddressBook(){
       contacts = new Contact[50000];  // 50000 possible contact to be stored.
       count=0;
   }
   
   public void addContact(Contact contact){ // Method 1 : adding the contacts.
       contacts[count] = contact;
       System.out.println(contact.name.getFirstName() + " has been added to the AdressBook");
       count++;
    }
   
     public Contact updated = new Contact(); // a new contact to be stored instead of the old one.(updating it using a new object)
   public void updateContact(Contact contact){ //Method 2 : updating an contact. 
       int index = search(contact);
        contacts[index] = updated;
     
        System.out.println(updated.number.getPhoneNumber() + " has been update.");
       
   }
   
   public int search (Contact contact){  //Method 3: searching for an contact and returning the index of it in the list. 
       int i;
       for(i=0; i<count; i++){
          if (contacts[i].equals(contact)){
               ContactIndex = i;
           }
       }
       return ContactIndex;
   }
   
   public void displayContact(Contact contact){ //Method 4: Displaying an contact.
       int contactNumber = search(contact);
      System.out.println("Contact: " +contacts[contactNumber].toString());
   }
   
   public void displayAllContacts(){ //Method 5 : displaying all the contasts. (For loop to achieving that).
       for (int i=0; i<count; i++ ){
         
           System.out.println("Contact : " + contacts[i].toString());  
           
       }
   }
       
   public void favContact(Contact contact){ //Method 6: Favoriting an contact by stored it as an object of the Favorites class in the contacts list.
        int FavIndex = search(contact);
        Favorites favContact = new Favorites(contacts[FavIndex].name, contacts[FavIndex].number);
        contacts[FavIndex] = favContact;
       }
       
   public void displayFavs(){ //Method 7: displaying the favorite contacts by using the instanceof operator.
        for (int i=0; i<count; i++){
           if(contacts[i] instanceof Favorites){ // if the contact stored as an object of Favorite class, display it.
               System.out.println("Favorite contacts: " + contacts[i].toString());
               }
           }
       }
       }
       
       
    
   
   
   

