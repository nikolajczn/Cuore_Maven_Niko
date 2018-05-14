package Bienes;

import junit.framework.TestCase;
import utility.ExcelUtils;
import Bienes.Clase;


public class Datos_SubClase 
extends TestCase
{

	public String setdatos_subClase(String body) throws Exception{
		
		
		
		
		String name = ExcelUtils.getCellData(1,4);
		String description = ExcelUtils.getCellData(1,5);
				
		
		SubClase subClase = new SubClase();
		subClase.setaltaSubClase(name, description, body);
		String variable_json = subClase.getAltaSubClase();

		return variable_json;
	}	
}