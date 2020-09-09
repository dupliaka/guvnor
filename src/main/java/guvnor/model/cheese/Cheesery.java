package guvnor.model.cheese;

import java.util.ArrayList;
import java.util.List;


// $HASH(ad9fbc43a80cd93236794d210eed8a29) (added manually)
public class Cheesery{
	
	private String name;
	
	private List<Cheese> list;
	
	private int totalAmount;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Cheese> getList() {
		return list;
	}

	public void setList(List<Cheese> list) {
		this.list = list;
	}
	
	public Cheesery(){
		list = new ArrayList<Cheese>();
		totalAmount = 0;
	}
	
	public void addCheese(Cheese c){
		list.add(c);
		totalAmount+=c.getPrice();
	}
	public void removeCheese(Cheese c){
		list.remove(c);
		totalAmount-=c.getPrice();
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
}
