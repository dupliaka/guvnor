package guvnor.bugs.gre_subfields;

import javax.xml.bind.annotation.XmlType;

// $HASH(796b0662692c88625afabfa16cb396b7) (added manually)
@XmlType(namespace = "guvnor.bugs.gre_subfields")
public class Person {

    private String name;
    private Contact contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
