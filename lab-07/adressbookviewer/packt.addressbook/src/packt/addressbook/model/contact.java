package packt.addressbook.model;

public class contact {
    public String id;
    public String firstName;
    public String lastName;
    public String homePhone;
    public String workPhone;
    public String email;
    public contact(String id,String firstName,String lastName, String homePhone, String workPhone, String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.homePhone=homePhone;
        this.workPhone=workPhone;
        this.email=email;
    }
}
