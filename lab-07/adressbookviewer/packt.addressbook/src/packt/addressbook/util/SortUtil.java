package packt.addressbook.util;
import packt.addressbook.model.contact;
import java.util.ArrayList;
import java.util.Comparator;

public class SortUtil implements Comparator<contact> {

    @Override
    public int compare(contact contact1, contact contact2) {
        // Implement your comparison logic here, e.g., based on the id field
        return Integer.compare(Integer.parseInt(contact1.id), Integer.parseInt(contact2.id));
    }
}
