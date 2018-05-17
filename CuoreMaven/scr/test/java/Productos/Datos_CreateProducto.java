package Productos;

import utility.ExcelUtils;

public class Datos_CreateProducto {
	public String setDatos_CreateProductos(String productoID) throws Exception{

		CreateProducto objCreateProducto = new CreateProducto();
		objCreateProducto.setCreateProducto(productoID);
		String variable_json = objCreateProducto.getCreateProducto();


		return variable_json;
	}
}
