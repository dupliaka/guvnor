package guvnor.feature.webDT_wizard;

// $HASH(0345ddf792dd5111621cf848e8f48e89) (added manually)

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "guvnor.feature.webDT_wizard")
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

	public Syste() {
	}
	
	public String toString(){
		return name;
	}

}
