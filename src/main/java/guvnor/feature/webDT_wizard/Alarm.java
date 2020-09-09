package guvnor.feature.webDT_wizard;

import javax.xml.bind.annotation.XmlType;

// $HASH(cf69598b85513cb01d8bad87f65a6651) (added manually)
@XmlType(namespace = "guvnor.feature.webDT_wizard")
public class Alarm {

	private String name;

	private String status;

	private Syste system;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Syste getSystem() {
		return system;
	}

	public void setSystem(Syste system) {
		this.system = system;
	}

	public Alarm(String name, String status, Syste system) {

		this.name = name;
		this.status = status;
		this.system = system;
	}

	public Alarm() {}

	public String toString() {
		return name;
	}

}
