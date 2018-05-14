package Bienes;

import junit.framework.TestCase;
import utility.ExcelUtils;
import Bienes.Clase;

public class Datos_Marca {
	public String setdatos_Marca() throws Exception{


		String name = ExcelUtils.getCellData(1,7);
		String description = ExcelUtils.getCellData(1,8);
					
		Marca marca = new Marca();

		marca.setAltaMarca(name, description);
		String variable_json = marca.getAltaMarca();


		return variable_json;
	}	
}
