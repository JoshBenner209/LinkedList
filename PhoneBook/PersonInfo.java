/*Josh Benner
 * CS 145
 * Assignment 2
 * Personal Info Class
 * Jan 30,2023
 * 
 * This class gathers all the information about the person going 
 * into the phonebook.
 */


package PhoneBook;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumb;
    private String city;
    //all entered 
    //constructor with parameters
    public PersonInfo (String firstName, String lastName,String address, String phoneNumb,String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phoneNumb=phoneNumb;
        this.city=city;
    }
    //empty constructor 
    public PersonInfo (){
        this(null,null,null,null,null);
    }
    public String getFirstName(String firstName) {//get firstname
        return this.firstName=firstName;
    }
    public String getLastName(String lastName){//get LastName
        return this.lastName=lastName;
    }
    public String getAddress(String address){//get address
        return this.address=address;
    }
    public String getPhoneNumb(String phoneNumb){//get phone number
        return this.phoneNumb=phoneNumb;
    }
    public String getCity(String city){//get city
        return this.city=city;
    }
    public String  getData(){//combine all the data
        return firstName+" "+lastName+", "+address+" "+city+" "+phoneNumb;
    }

}
