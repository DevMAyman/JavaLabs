package packt.addressbook;
import packt.addressbook.model.contact;
import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        contact c1 = new contact("4", "Mohamed", "Ayman",
                "01124720642", "01156962254", "MohamedAyman@gmail.com");
        contact c2 = new contact("1", "Ahmed", "Khaled",
                "01124820642", "01156964254", "AhmedKhaled@gmail.com");
        contact c3 = new contact("3", "Mostafa", "Mohamed",
                "01144720642", "01156222254", "MostafaMohamed@gmail.com");
        contact c4 = new contact("5", "Noor", "Tarek",
                "01112720642", "01156962684", "NourTarek@gmail.com");
        contact c5 = new contact("2", "Salma", "Mohamed",
                "01124720642", "01156582254", "SalmaMohamed@gmail.com");
        ContactUtil contactUtil = new ContactUtil();
        contactUtil.addContact(c1,c2,c3,c4,c5);
        contactUtil.displayContacts();
        Collections.sort(contactUtil.getContact(),new SortUtil());
        System.out.println("_________________________________________After sorting_________________________________________");
        contactUtil.displayContacts();

    }
}
