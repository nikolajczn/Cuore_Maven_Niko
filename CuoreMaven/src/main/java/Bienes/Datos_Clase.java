package Bienes;

import junit.framework.TestCase;
import utility.Constant;
import utility.ExcelUtils;

public class Datos_Clase
extends TestCase
{

	public Clase setdatos_clase() throws Exception{
		

		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		
		
		Clase Clase = new Clase();

	    Clase.setname(ExcelUtils.getCellData(1,1));
		Clase.setdesciption(ExcelUtils.getCellData(1,2));	
		
		return Clase;
		
	}
	
}
