package Bienes;

import junit.framework.TestCase;
import utility.ExcelUtils;
import Bienes.Clase;
import Bienes.AsociarMarca;

public class Datos_AsociarMarca {
	public String setDatos_AsociarMarca(String bodySubClase, String bodyMarca) throws Exception{


		String name = ExcelUtils.getCellData(1,7);
		String description = ExcelUtils.getCellData(1,8);
		String nameSubClase = ExcelUtils.getCellData(1, 4);
		String nameMarca = ExcelUtils.getCellData(1, 7);
		
		AsociarMarca asociarMarca = new AsociarMarca();

		asociarMarca.setAsociarMarca (nameSubClase, nameMarca, name, description, bodySubClase, bodyMarca);
		String variable_json = asociarMarca.getAsociarMarca();


		return variable_json;
	}
}
