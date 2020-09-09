package guvnor.feature.gre.dsl;

import java.util.List;

// $HASH(a5f213a3d4d089fa0156a96341a7130e) (added manually)
public class User {

    private List<Person> contacts;
    private String name;

    public List<Person> getContacts() {
        return contacts;
    }

    public void setContacts(List<Person> contacts) {
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
