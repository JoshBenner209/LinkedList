import java.util.Scanner;

public class TestNodeMain{
    public static void main(String[] args) throws Exception{
            PersonInfo person= new PersonInfo();
            StringNode list = new StringNode();
            Scanner scan=new Scanner(System.in);
            boolean add=true;
            ManagePBook book = new ManagePBook( person, list, scan);
        while(add){
            
            book.getInfo();
            book.addToBook();
            
            System.out.println("add another? ");
            String yeah = scan.next();
            String subYeah= yeah.substring(0,1);
            subYeah=subYeah.toUpperCase();
            if(subYeah.equals("N")){
                add=false;
            }else if(subYeah.equals("Y")){
                continue;
            }else{
                System.out.println("didn't recognize input");
            }
        }
        book.delet();
    }
}