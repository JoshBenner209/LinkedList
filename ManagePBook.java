import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagePBook {
        private PersonInfo person;
        private StringNode list;
        private Scanner scan;
        
    public ManagePBook(PersonInfo person, StringNode list, Scanner scan){
        this.person=person;
        this.list=list;
        this.scan=scan;
    }

    public void getInfo( ){
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
        person.getFirstName(firstName);
        person.getLastName(lastName);
        person.getAddress(address);
        person.getCity(city);
        person.getPhoneNumb(phoneNumber);
    }
    //no entries build book
    public void addToBook() throws Exception{
       int size=list.getsize();
        boolean error=false;
        int index=0;
            while (error=!error){
                try{ System.out.println("please enter a number for the position in book you like to store this person: ");
                    index=scan.nextInt();
                    
                }catch(InputMismatchException e){
                    System.out.println("Input not recognized. Try a number like 1 2 3 etc.");
                    scan.nextLine();
                }
            }
            if (size<index){
                System.out.println("Erorr Value is larger than list");
            }else{
            list.add(index, person.getData());
            System.out.println("updated book: \n"+list.toString());
            }
    }
    //add to front or back
    public void add(){
        list.add(person.getData());
    }
        
    public void delet(){
        list.getsize();
        System.out.println(list.toString()+"\n"+"please enter numerical value for the posistion in list you'd like to delet: ");
        int index = scan.nextInt();
        scan.nextLine();
        if(list.getsize()< index){
            System.out.println("Error: number exceeds size of list");
        }else{
        list.removeNode(index);
        }
    }

}

