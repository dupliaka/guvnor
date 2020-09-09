package guvnor.feature.webDT_wizard;

import javax.xml.bind.annotation.XmlType;

// $HASH(01de72a2dfada2f7274ddb569424ac35) (added manually)
@XmlType(namespace = "guvnor.feature.webDT_wizard")
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

