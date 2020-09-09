package guvnor.feature.gre.dsl;

import java.util.Date;
import javax.xml.bind.annotation.XmlType;

// $HASH(262660d4247ab11ac557e744a149f5db) (added manually)
@XmlType(namespace = "guvnor.feature.gre.dsl")
public class Person {

    private String sex;
    private Date birthDay;
    private boolean vip;
    private String ssn;
    private String city;
    private int riskLevel;
    private String firstName;
    private String lastName;

    public void print() {
      System.out.println("#########################");
      System.out.println(sex + ", " + birthDay.toString() + ", " + vip + ", " + ssn + ", " + city + ", " + riskLevel + ", " + firstName + ", " + lastName);
      System.out.println("#########################");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(int riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
