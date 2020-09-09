package guvnor.model.cheese;

import javax.xml.bind.annotation.XmlType;

// $HASH(07d9eabd46ddcc8df19758e3ecc3fbf0) (added manually)
@XmlType(namespace = "guvnor.model.cheese")
public class Helper {
	
	public static String echo2(String name, String text){
		return "RuleName: "+name+"; param name is: "+text;
	}

}