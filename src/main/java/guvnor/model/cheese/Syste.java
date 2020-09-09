package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

// $HASH(63033ac7fca57ce72fbc1f00961f5df9) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
public class Syste {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Syste(String name) {

		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
