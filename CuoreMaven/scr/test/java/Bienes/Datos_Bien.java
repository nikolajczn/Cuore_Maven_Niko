package Bienes;

import utility.ExcelUtils;

public class Datos_Bien {

	public String setdatos_Bien(String claseID, String claseName, String claseDescription, String subClaseID, String subClaseName, 
			String subClaseDescription, String marcaID, String marcaName, String marcaDescription, String modeloID, 
			String modeloName, String modeloDescription) throws Exception{




		Bien nuevoBien = new Bien();
		
		nuevoBien.setBien(claseID, claseName, claseDescription, subClaseID, subClaseName, 
			 subClaseDescription, marcaID, marcaName, marcaDescription, modeloID, 
			 modeloName, modeloDescription);
		
		String variable_json = nuevoBien.getBien();

		return variable_json;
	}	
}
