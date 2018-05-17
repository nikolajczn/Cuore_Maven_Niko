package Bienes;

import java.util.List;

public class AsociarMarca {

	private String altaAsociarMarca;



	public void setAsociarMarca(String nameSubClase, String nameMarca, String name, String description, String bodySubClase, 
			String bodyMarca) {
		this.altaAsociarMarca=("{"+
				"\"name\":\"" + nameSubClase + "-" + name + "\","+
				"\"description\":\"" + description + "\","+
				"\"parent\":" + bodySubClase + ","+
				"\"elements\":[],"+
				"\"status\":\"Alta\","+
				"\"brand\":" + bodyMarca +
				"}");
	}
	public String getAsociarMarca() {
		return altaAsociarMarca;
	}


}






