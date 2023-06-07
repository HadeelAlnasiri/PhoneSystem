
package PhoneBook;

public class Address {
    private String country;
    private String city;
    private String District;
    private String street;
    private int postCode;
    
    
    public void setCountery(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    
    public void setDistrict(String District){
        this.District = District;
    }
    public String getDistrict(){
        return District;
    }
    
    public void setStreet (String street){
        this.street = street;
    }
    public String getStreet(){
        return street;
    }
    
    public void setPostCode(int postCode){
        this.postCode = postCode;
    }
    public int getPostCode(){
        return postCode;
    }
    
    public String toString(){
     return ("Address:  " + country + " " + city + " " + District + " " + street + ", post code:" + postCode );   
    }
}
