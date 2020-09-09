package guvnor.model.cheese;

import java.util.ArrayList;
import java.util.List;

// $HASH(5b314ce7b92150748462e26f25728175) (added manually)
public class CheeseCounter {
	
	private String name;
	
	private List<Cheese> list;

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
	
	public CheeseCounter(){
		list = new ArrayList<Cheese>();
	}
	

}
