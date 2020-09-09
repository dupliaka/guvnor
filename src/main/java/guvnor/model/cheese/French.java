package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

// $HASH(333fa344a5a45ff567a17172dab3a5c6) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
public class French {
	
	private String fname;
	
	private String likes;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public French(String fname, String likes) {
		this.fname = fname;
		this.likes = likes;
	}
	
	public French() {}
	
}

