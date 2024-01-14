package packt.addressbook.util;
import packt.addressbook.model.contact;
import java.util.ArrayList;
import java.util.List;

public class ContactUtil {
    private ArrayList<contact> myContacts;
    public ContactUtil()
    {
        this.myContacts =new ArrayList<contact>();
    }
    public ArrayList<contact> getContact()
    {
        return myContacts;

    }
    public void addContact(contact ... contacts)
    {
        for(int i=0;i<contacts.length;i++){
            myContacts.add(contacts[i]);
        }
    }

    public void displayContacts()
    {
        myContacts.forEach(contact -> System.out.println("Id: "+contact.id+" ,Name: "+contact.firstName+
                " "+contact.lastName+ " ,workPhone: "+contact.workPhone+" ,homePhone: "+contact.homePhone+" ,Email: "+contact.email));
    }
}
