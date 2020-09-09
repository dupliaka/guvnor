package guvnor.bugs.gre_subfields;

import javax.xml.bind.annotation.XmlType;

// $HASH(39547fced49b61d152efcdd32c8fca76) (added manually)
@XmlType(namespace = "guvnor.bugs.gre_subfields")
public class Contact {

    private String city;
    private Integer tel1;
    private Integer tel2;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getTel1() {
        return tel1;
    }

    public void setTel1(Integer tel1) {
        this.tel1 = tel1;
    }

    public Integer getTel2() {
        return tel2;
    }

    public void setTel2(Integer tel2) {
        this.tel2 = tel2;
    }
}
