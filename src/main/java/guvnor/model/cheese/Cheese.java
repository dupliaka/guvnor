package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

import java.util.Date;

// $HASH(df2d69fa4facfe4919021254465e2b8f) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
public class Cheese {
	
	private String type;
	
	private String age;
	
	private int price;
	
	private boolean smelly;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private Date bestBefore;


	public Date getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(Date bestBefore) {
		this.bestBefore = bestBefore;
	}

	public Cheese(String t, String a, int p){
		type=t;
		age=a;
		price=p;
	}
	
	public Cheese(boolean s){
		smelly=s;
	}
	
	public Cheese(){}

	public boolean isSmelly() {
		return smelly;
	}

	public void setSmelly(boolean smelly) {
		this.smelly = smelly;
	}
	
	

}

