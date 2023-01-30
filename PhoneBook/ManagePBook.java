/*Josh Benner
 * CS 145
 * Assignment 2
 * PhoneBook Manager Class
 * Jan 30,2023
 * 
 * The ManagePBook Class is the display that combines stringNode Class
 * and personinfo class to allow the client to easily build a phonebook
 * 
 */


package PhoneBook;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagePBook {
        private PersonInfo person;// person object
        private StringNode list;//list objcet
        private Scanner scan;//scanner object
        
    public ManagePBook(PersonInfo person, StringNode list, Scanner scan){
        this.person=person;
        this.list=list;
        this.scan=scan;
    }

    public void getInfo( ){// get info about the person being added to book
        System.out.println("Enter first name: ");
        String firstName= scan.next();
        scan.nextLine();
        System.out.println("Enter last name: ");
        String lastName= scan.next();
        scan.nextLine();
        System.out.println("Enter address: ");
        String address= scan.nextLine();
        System.out.println("Enter phone Number(xxx)xxx-xxxx: ");
        String phoneNumber= scan.next();
        scan.nextLine();
        System.out.println("Enter City: ");
        String city=scan.next();
        scan.nextLine();
        //pass info to person Obj
        person.getFirstName(firstName);
        person.getLastName(lastName);
        person.getAddress(address);
        person.getCity(city);
        person.getPhoneNumb(phoneNumber);
    }
    // change data in node
    public void changeInfo(){
        int index=searchByData();
        System.out.println("enter new information:");
        getInfo();
        list.addAnyWhere(index,person.getData());
        list.removeNode(index+1);
        print();
    }
    //no entries build book
    public void addToBook() throws Exception{
       int size=list.getsize();
        boolean error=false;
        int index=0;
            while (error=!error){
                try{ System.out.println("please enter a number for the position in book you like to store this person: ");
                    index=scan.nextInt()-1;
                    if(index<0){index=0;}
                }catch(InputMismatchException e){
                    System.out.println("Input not recognized. Try a number like 1 2 3 etc.");
                    scan.nextLine();
                }
            }
            if (size<index){
                System.out.println("Erorr Value is larger than list");
            }else{
            list.addAnyWhere(index, person.getData());
            System.out.println("updated book: \n"+list.toString());
            }
    }
    //add to  back of list
    public void add(){
        list.add(person.getData());
    }
        // delet someone from list
    public void delet(){
        list.getsize();
        System.out.println(list.toString()+"\n"+"please enter numerical value for the posistion in list you'd like to delet: ");
        int index = scan.nextInt()-1;
        if(index<0){index=0;}
        scan.nextLine();
        if(list.getsize()< index){
            System.out.println("Error: number exceeds size of list");
        }else{
        list.removeNode(index);
        }
    }
    //print the person that is in this position
    public void searchByIndex(){
        System.out.println("to get info on a posistion enter posistion in list: ");
        int index=scan.nextInt()-1;
        if (index<0){index=0;}
        String data= list.getData(index);
        System.out.println("at position "+index+" is: "+data);
    }
    //find this person and return position in list
    public int searchByData(){
        System.out.println("Please enter first name to find position in phone book: ");
        String firstName= scan.next();
        scan.nextLine();
        System.out.println("Please Enter Last of person to find postion in phone book: ");
        String lastName=scan.next();
        scan.nextLine();
        String search =firstName+" "+lastName; 
        if(list.getIndex(search)==-1){
            System.out.println("No Match Found");
        }else{
            System.out.println(search+" is at index: "+(list.getIndex(search)+1));
        }
        return list.getIndex(search);
    }
    //print out the list
    public void print(){
        System.out.println(list.toString());
    }

}

