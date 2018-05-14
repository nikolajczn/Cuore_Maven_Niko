package Bienes;

import java.util.List;

public class Marca {
	
	private String altaMarca;
	 
	

	public void setAltaMarca(String name, String description) {
		
		this.altaMarca = ("{" + 
				"\"description\":\""+ description + "\"," + 
				"\"name\":\"" + name +"\"" + 
				"}");
	}
	 public String getAltaMarca() {
			return altaMarca;
		}

}