package guvnor.bugs.bz724629;

import javax.xml.bind.annotation.XmlType;

// $HASH(6cbb8db2a6c8ad750479d0ee7a73a191) (added manually)
@XmlType(namespace = "guvnor.bugs.bz724629")
public class Person {

    public enum Sex {

        MALE, FEMALE
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Sex sex;
    private String name;
}
