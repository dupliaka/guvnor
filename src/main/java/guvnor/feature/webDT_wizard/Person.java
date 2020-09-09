package guvnor.feature.webDT_wizard;

import javax.xml.bind.annotation.XmlType;

// $HASH(74d83d56b54ba0e410cdec2213b6cd21) (added manually)
@XmlType(namespace = "guvnor.feature.webDT_wizard")
public class Person {
	
	private int age;
	
	private String sex;
	
	private String name;
	
	public Person(String n, String s, int a){
		age=a;
		name=n;
		sex=s;
	}
	
	public Person(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "I'm "+name+" and I'm "+sex+" and I'm "+age+" years old.";
	}

}
