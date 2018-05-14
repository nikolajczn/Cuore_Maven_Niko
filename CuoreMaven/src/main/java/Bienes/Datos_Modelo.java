package Bienes;

import utility.ExcelUtils;
import Bienes.Clase;

public class Datos_Modelo {

	private String name = ExcelUtils.getCellData(1,9);
	private String description = ExcelUtils.getCellData(1,10);
	
	public String setAltaModelo(String bodyAsociarMarca) {

		Modelo altaModelo = new Modelo();
		altaModelo.setModelo(name, description, bodyAsociarMarca);
		String post = altaModelo.getModelo();
		
		return post;
	}
	
}
