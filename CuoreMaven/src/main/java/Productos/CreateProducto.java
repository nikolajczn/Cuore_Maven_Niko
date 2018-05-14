package Productos;

public class CreateProducto {
	private String bodyCreateProducto;

	public void setCreateProducto(String idProducto){


		bodyCreateProducto=("{" + 
				"  \"processDescription\": \"com.tcc.cuore.process.EvaluacionDeProducto\"," + 
				"  \"entityId\":" + idProducto +","+ 
				"  \"status\": \"En Analisis\"," + 
				"  \"entityDescription\": \"PRODUCTO\"," + 
				"  \"paramsNames\": [" + 
				"    \"iWay\"," + 
				"    \"idProduct\"" + 
				"  ]," + 
				"  \"paramsValues\": [" + 
				"    \"analizarProducto\"," + 
				    idProducto + 
				"  ]" + 
				"}");
	}

	public String getCreateProducto(){
		return bodyCreateProducto;
	}
}
