package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

// $HASH(04cf46544f3b0b53d03873163e3fa3ab) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
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