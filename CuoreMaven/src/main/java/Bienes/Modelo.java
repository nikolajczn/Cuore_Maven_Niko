package Bienes;

public class Modelo {


	private String altaModelo;
	
	public void setModelo(String name, String description, String bodyAsocMarca) {
	
		this.altaModelo = ("{" + 
			"\"name\": \"" + name + "\"," + 
			"\"description\": \"" + description + "\"," + 
			"\"parent\": " + bodyAsocMarca + "," + 
			"\"elements\": []," + 
			"\"status\": \"Alta\"" + 
			"}");
		}
	
	public String getModelo() {
		return altaModelo;
	}
}