package guvnor.feature.webDT_wizard;

import javax.xml.bind.annotation.XmlType;

// $HASH(9ac2072f04eba9df307108ef670c21f8) (added manually)
@XmlType(namespace = "guvnor.feature.webDT_wizard")
public class Message {

	public static final int HELLO = 0;
	public static final int GOODBYE = 1;

	private String message;

	private int status;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
