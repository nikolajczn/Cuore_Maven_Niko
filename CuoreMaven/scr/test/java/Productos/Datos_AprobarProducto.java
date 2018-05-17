package Productos;

import utility.ExcelUtils;

public class Datos_AprobarProducto {
	public String setDatos_AprobarProducto(String bienID,String claseID, String claseName, String claseDescription, String subClaseID,
			String subClaseName, String subClaseDescription, String marcaID, String marcaName, String marcaDescription, 
			String modeloID, String modeloName, String modeloDescription, String version, String productoID, String seguroID,
			String productoVRKPOItemID)
					throws Exception{

		String productoName = ExcelUtils.getCellData(1,12);

		
		AprobarProducto objAprobarProducto = new AprobarProducto();
		objAprobarProducto.setAprobarProducto(bienID, claseID, claseName, claseDescription, subClaseID, subClaseName,
				subClaseDescription, marcaID, marcaName, marcaDescription, modeloID, modeloName, modeloDescription, version,
				productoID, seguroID,productoName, productoVRKPOItemID);
		String variable_json = objAprobarProducto.getAprobarProducto();


		return variable_json;
	}
}