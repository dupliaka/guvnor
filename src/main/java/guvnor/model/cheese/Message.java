package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

// $HASH(0a99f03ec1d33afe61474956985f9b97) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
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
