

public class PersonInfo {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumb;
    private String city;
    //all entered 
    public PersonInfo (String firstName, String lastName,String address, String phoneNumb,String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phoneNumb=phoneNumb;
        this.city=city;
    }
    public PersonInfo (){
        this(null,null,null,null,null);
    }
    public String getFirstName(String firstName) {
        return this.firstName=firstName;
    }
    public String getLastName(String lastName){
        return this.lastName=lastName;
    }
    public String getAddress(String address){
        return this.address=address;
    }
    public String getPhoneNumb(String phoneNumb){
        return this.phoneNumb=phoneNumb;
    }
    public String getCity(String city){
        return this.city=city;
    }
    public String  getData(){
        return firstName+" "+lastName+" "+address+" "+city+" "+phoneNumb;
    }

}
