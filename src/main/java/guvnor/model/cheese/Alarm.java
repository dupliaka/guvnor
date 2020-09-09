package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

// $HASH(c6ed8507313435c4067851cdb9ae4efc) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
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
