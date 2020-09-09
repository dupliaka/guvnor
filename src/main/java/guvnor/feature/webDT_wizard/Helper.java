package guvnor.feature.webDT_wizard;

import javax.xml.bind.annotation.XmlType;

// $HASH(0c22c6a7159420a00bc458bf80e28373) (added manually)
@XmlType(namespace = "guvnor.feature.webDT_wizard")
public class Helper {
	
	public static String echo2(String name, String text){
		return "RuleName: "+name+"; param name is: "+text;
	}

}
