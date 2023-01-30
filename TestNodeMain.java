/* Josh Benner
 * Cs 145
 * Assignment 2
 * Jan 30, 2023
 * This class is the main class. I used a switch case to dispaly all the 
 * methods that the ManagePBook is capable of doing. 
 */

import java.util.Scanner;
import PhoneBook.ManagePBook;
import PhoneBook.PersonInfo;
import PhoneBook.StringNode;

public class TestNodeMain{
    public static void main(String[] args) throws Exception{
            PersonInfo person= new PersonInfo();// class to colect personal info
            StringNode list = new StringNode();// does all the node manipulation
            Scanner scan=new Scanner(System.in);
            boolean add=true;// keep adding people?
          
        while(add){
            ManagePBook book = new ManagePBook( person, list, scan);// create phonebook obJ
            System.out.println(" 1 to add\n 2 to delet\n 3 to search by index\n 4 to search"+ 
            " by name\n 5 to print phone book\n 6 to edit info\n 0 to exit\n");
            int choice =scan.nextInt();
            // if no one is in the list make user add to list
            if(list.getsize()==0 && choice!=1){
                System.out.println("must add someone to book first");
                choice=1;
            }
            switch(choice){
                
                case 1://add person to book
                    book.getInfo();
                    System.out.println("enter 1 to add to end or 0 to enter anywhere in list:");
                    int addChoice= scan.nextInt();
                    if(addChoice==1){
                        book.add();// add to end of list
                        book.print();//print book out
                    }else{ // else add to anywhere in list 
                        book.addToBook();
                        book.print();
                    }
                break;
                case 2://delet someone from phonebook
                    book.delet();
                    book.print();
                break;
                case 3://search for who is filling a posistion
                    book.searchByIndex();
                break;
                case 4:// search where person is located in phonebook
                    book.searchByData();
                break;
                case 5://print out the phonebook
                    book.print();
                break;
                case 6://change how someone appears in the phone book
                    book.changeInfo();
                break;
                case 0://exit phone book
                    add=false;
                break;
                default://no key recongized 
                System.out.println("please select different option");
                break;
            }
        }
    }
}