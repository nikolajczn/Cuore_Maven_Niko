package Ejecutor;

import org.junit.Test;
import org.junit.runner.RunWith;

import Bienes.Clase;
import Bienes.CompleteAnalizarBienPorActivos;
import Bienes.CompleteAnalizarBienPorSeguros;
import Bienes.Datos_AsociarMarca;
import Bienes.Datos_Bien;
import Bienes.Datos_Clase;
import Bienes.Datos_Marca;
import Bienes.Datos_SubClase;
import Bienes.Modelo;
import Bienes.ObtenerIDTareaBienes;
import Bienes.TareaAnalizarBienPorActivos;
import Bienes.TareaAnalizarBienPorSeguros;
import io.restassured.response.Response;
import utility.Constant;
import utility.ExcelUtils;
import Bienes.Datos_Modelo;
import Bienes.TareaAnalizarViabilidadDelBien;
import Productos.CompleteAprobarProductos;
import Productos.Datos_AprobarProducto;
import Productos.Datos_CreateProducto;
import Productos.Datos_Producto;
import Bienes.CompleteAnalizarViabilidadDelBien;

import static io.restassured.RestAssured.given;


import org.junit.runners.MethodSorters;

import com.google.gson.Gson;

import org.junit.FixMethodOrder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.apache.tools.ant.taskdefs.Sleep;
import org.fenrir.kraft.test.util.OrderedTest;
import org.fenrir.kraft.test.util.TestRunner;

@RunWith(TestRunner.class)
public class Ejecutor_Api
{
	public static String bodyClase;
	public static String bodySubClase;
	public static String bodyMarca;
	public static String bodyAsociarMarca;
	public static String bodyModelo;
	public static String idModelo;
	public static String claseID;
	public static String claseName;
	public static String claseDescription;
	public static String subClaseID;
	public static String subClaseName;
	public static String subClaseDescription;
	public static String marcaID;
	public static String marcaName;
	public static String marcaDescription;
	public static String modeloID;
	public static String modeloName;
	public static String modeloDescription;
	public static String asociacionMarcaID;
	public static String bodyBien;
	public static String bienID;
	public static String procesoID_Bien;
	public static String procesoAnalizarXActivosID;
	public static String procesoAnalizarXSegurosID;
	public static String procesoAnalizarViabilidadID;
	public static String version;
	public static String bodyProducto;
	public static String productoID;
	public static String procesoID_Producto;
	public static String aprobarProductoID;
	public static String seguroID;
	public static String productoVRKPOItemID;
	
	private static final String Defoult_URL = "http://34.234.32.246:8082/api/";


	@OrderedTest(order=1)
	@Test
	public void clase() throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		Datos_Clase datos_clase = new Datos_Clase();
		Clase clase_post = datos_clase.setdatos_clase();
		this.bodyClase = 

				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(clase_post)
				.when().post(Defoult_URL+"products/good/class").getBody().asString();

		//Para obtener variables para setear en el alta de Bienes
		claseID = ((bodyClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0];

		claseName = ((bodyClase.split("name\":\""))[1]).split("\",\"description")[0];

		claseDescription = ((bodyClase.split("description\":\""))[1]).split("\",\"elements")[0];


	}


	@OrderedTest(order=2)
	@Test
	public void subClase() throws Exception {


		Datos_SubClase datos_subClase = new Datos_SubClase();
		String subClase_post = datos_subClase.setdatos_subClase(bodyClase);

		this.bodySubClase =	
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(subClase_post)
				.when().post(Defoult_URL+"products/good/subclass").getBody().asString();



		//Para obtener variables para setear en el alta de Bienes
		subClaseID = ((bodySubClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0];

		subClaseName = ((bodySubClase.split("name\":\""))[1]).split("\",\"description")[0];

		subClaseDescription = ((bodySubClase.split("description\":\""))[1]).split("\",\"elements")[0];


	}



	@OrderedTest(order=3)
	@Test
	public void Marca() throws Exception {


		Datos_Marca datos_marca = new Datos_Marca();
		String marca_post = datos_marca.setdatos_Marca();

		bodyMarca=
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(marca_post)
				.when().post(Defoult_URL+"products/good/brandMaster").getBody().asString();

		//Para obtener variables para setear en el alta de Bienes
		marcaID = ((bodyMarca.split("id\":"))[1]).split(",\"name\"")[0];

		marcaName = ((bodyMarca.split("name\":\""))[1]).split("\"}")[0];

		marcaDescription = ((bodyMarca.split("description\":\""))[1]).split("\",\"id")[0];

		//		  final Gson gson = new Gson();
		//		  final String representacionJSON = gson.toJson(marca_post);
		//		  assertEquals("{\"id\":46,}", representacionJSON);

	}



	@OrderedTest(order=4)
	@Test
	public void asociarMarca() throws Exception {


		Datos_AsociarMarca datos_marca = new Datos_AsociarMarca();
		String asociarMarca_post = datos_marca.setDatos_AsociarMarca(bodySubClase,bodyMarca);
		bodyAsociarMarca =
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(asociarMarca_post)
				.when().post(Defoult_URL+"products/good/brand").getBody().asString();	

		asociacionMarcaID = ((bodyAsociarMarca.split("id\":"))[1]).split(",\"name\"")[0];		

	}



	@OrderedTest(order=5)
	@Test
	public void modelo() {

		Datos_Modelo altaModelo = new Datos_Modelo();
		String altaModelo_post = altaModelo.setAltaModelo(bodyAsociarMarca);
		this.bodyModelo =
				given()
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(altaModelo_post)
				.when()
				.post(Defoult_URL+"products/good/model").getBody().asString();				

		//Para obtener variables para setear en el alta de Bienes
		//			idModelo = ((bodyModelo.split("{\"id\":"))[1]).split(",\"name")[0];
		

		modeloName = ((bodyModelo.split("name\":\""))[1]).split("\",\"description")[0];		
		modeloDescription = ((bodyModelo.split("description\":\""))[1]).split("\",\"elements")[0];

	}



	//para obtener el ID del Modelo

	@OrderedTest(order=6)
	@Test
	public void extraerModeloID() {



		String getModelo = "http://34.234.32.246:8082/api/products/good/model/search?page=1&size=15&modelName=&classId=" + claseID + "&subclassId=" + subClaseID + "&brandId=" + asociacionMarcaID;


		Response responseBbody=
				given()
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.when().get(getModelo);
		String body = responseBbody.getBody().asString();


		//Para obtener variables para setear en el alta de Bienes
		modeloID = ((body.split("content\":\\[\\{\"id\":"))[1]).split(",\"name")[0];

	}

	//Da de alta el Bien
	@OrderedTest(order=7)
	@Test
	public void Bien() throws Exception {

		Datos_Bien datos_bien = new Datos_Bien();
		String bien_post = datos_bien.setdatos_Bien(claseID, claseName, claseDescription, subClaseID, subClaseName, subClaseDescription, marcaID, marcaName, marcaDescription, modeloID, modeloName, modeloDescription);		

		bodyBien=
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(bien_post)
				.when().post(Defoult_URL+"products/good").getBody().asString();	

		bienID = ((bodyBien.split("id\":"))[1]).split(",\"classId")[0];


		version = ((bodyBien.split("version\":\""))[1]).split("\",\"creationDate")[0];


	}

	//Para obtener el numero procesID
	@OrderedTest(order=8)
	@Test
	public void obtenerNumeroProceso_Bien() throws Exception {


		procesoID_Bien =
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.when().post(Defoult_URL+"products/good/analize/" + bienID).getBody().asString();



	}


	//Para obtener los ID de las tareas analizar bienes por activos y analizar bienes por seguros
	@OrderedTest(order=9)
	@Test
	public void obtenerIDActivosYSeguros() throws Exception {


		procesoAnalizarXActivosID =
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Analizar Bien por Activos")
				.when().get("http://34.234.32.246:8082/api/bpm/cuore.admin.QA").getBody().asString();


		procesoAnalizarXActivosID = ((procesoAnalizarXActivosID.split("id\":"))[1]).split(",\"name")[0];



		procesoAnalizarXSegurosID =
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Analizar Bien por Seguros")
				.when().get("http://34.234.32.246:8082/api/bpm/cuore.admin.QA").getBody().asString();


		procesoAnalizarXSegurosID = ((procesoAnalizarXSegurosID.split("id\":"))[1]).split(",\"name")[0];



	}

	//Completa los campos de la tarea analizar bienes por activos
	@OrderedTest(order=10)
	@Test
	public void TareaAnalisisBienPorActivos() throws Exception {

		TareaAnalizarBienPorActivos analizarBienXActivos = new TareaAnalizarBienPorActivos();

		String post_AnalisisActivos= analizarBienXActivos.setTareaAnalizarBienPorActivos(bienID, claseID, claseName, 
				claseDescription, subClaseID, subClaseName, subClaseDescription, marcaID, marcaName, marcaDescription, 
				modeloID, modeloName, modeloDescription, version);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_AnalisisActivos)
		.when().post(Defoult_URL+"products/good/analysis");								
	}	

	//Par completar la tarea jbpm de analizar bienes por activos 
	@OrderedTest(order=11)
	@Test
	public void CompleteAnalisisBienPorActivos() throws Exception {

		CompleteAnalizarBienPorActivos objCompleteAnalizarBienXActivos = new CompleteAnalizarBienPorActivos();

		String post_CompleteActivos= objCompleteAnalizarBienXActivos.mtdCompleteanalizarBienXActivos(bienID, procesoID_Bien, 
				procesoAnalizarXActivosID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_CompleteActivos)
		.when().post(Defoult_URL+"bpm/complete");								
	}	

	//Completa los campos de la tarea analizar bienes por seguros
	@OrderedTest(order=12)
	@Test
	public void TareaAnalisisBienPorSeguros() throws Exception {

		TareaAnalizarBienPorSeguros varAnalizarBienXSeguros = new TareaAnalizarBienPorSeguros();

		String post_AnalisisSeguros= varAnalizarBienXSeguros.setTareaAnalizarBienPorSeguros(bienID,claseID,claseName,
				claseDescription,subClaseID,subClaseName,subClaseDescription,marcaID,marcaName,marcaDescription,modeloID,
				modeloName,modeloDescription,version);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_AnalisisSeguros)
		.when().post(Defoult_URL+"products/good/analysis");								
	}	

	//Par completar la tarea jbpm de analizar bienes por SEGUROS 
	@OrderedTest(order=13)
	@Test
	public void CompleteAnalisisBienPorSeguros() throws Exception {

		CompleteAnalizarBienPorSeguros objCompleteAnalizarBienXSeguros = new CompleteAnalizarBienPorSeguros();

		String post_CompleteSeguros= objCompleteAnalizarBienXSeguros.mtdCompleteanalizarBienXActivos(bienID, procesoID_Bien,
				procesoAnalizarXSegurosID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_CompleteSeguros)
		.when().post(Defoult_URL+"bpm/complete");								
	}


	@OrderedTest(order=14)
	@Test
	public void obtenerIDViabiliadBien() throws Exception {


		procesoAnalizarViabilidadID =
				given() 
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Analizar Vialidad del Bien")
				.when().get("http://34.234.32.246:8082/api/bpm/cuore.admin.QA").getBody().asString();


		procesoAnalizarViabilidadID = ((procesoAnalizarViabilidadID.split("id\":"))[1]).split(",\"name")[0];


	}


	@OrderedTest(order=15)
	@Test
	public void TareaAnalizarViabilidad() throws Exception {

		TareaAnalizarViabilidadDelBien varAnalizarViabilidadDelBien = new TareaAnalizarViabilidadDelBien();

		String post_AnalisisViabilidad= varAnalizarViabilidadDelBien.setAnalizarViabilidad (bienID,claseID,claseName,
				claseDescription,subClaseID,subClaseName,subClaseDescription,marcaID,marcaName,marcaDescription,modeloID,
				modeloName,modeloDescription,version);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_AnalisisViabilidad)
		.when().post(Defoult_URL+"products/good/analysis");								
	}	

	//Para completar la tarea jbpm de analizar bienes por SEGUROS 
	@OrderedTest(order=16)
	@Test


	public void CompleteAnalizarViabilidad() throws InterruptedException {
		Thread.sleep(10000);

		CompleteAnalizarViabilidadDelBien objCompeteViabilidad = new CompleteAnalizarViabilidadDelBien();

		String post_CompleteViabilidad= objCompeteViabilidad.mtdCompleteAnalizarViabilidad(bienID, procesoID_Bien, 
				procesoAnalizarViabilidadID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_CompleteViabilidad)
		.when().post(Defoult_URL+"bpm/complete");								
	}


	//Da de alta un Producto
	@OrderedTest(order=17)
	@Test
	public void Producto() throws Exception {

		Datos_Producto objDatos_Producto = new Datos_Producto();
		String altaProducto_post = objDatos_Producto.setDatos_Productos(bienID, claseID, claseName, claseDescription, 
				subClaseID, subClaseName, subClaseDescription, marcaID, marcaName, marcaDescription, modeloID, modeloName, 
				modeloDescription, version);
		
		System.out.println("ESTE ES EL BODY DEL PRODUCTO EN EL EJECUTOR:" + " " + altaProducto_post);
		bodyProducto =
				given()
				.contentType("application/json")
				.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
				.body(altaProducto_post)
				.when()
				.post(Defoult_URL+"products/product").getBody().asString();				


		productoID = ((bodyProducto.split("],\"id\":"))[1]).split(",\"initialCanonCEVisible")[0];
		seguroID = ((bodyProducto.split("hasMarkUpPercentageEnabled\":false,\"id\":"))[1]).split(",\"markUpCurrency")[0];
		productoVRKPOItemID = ((bodyProducto.split("},\"id\":"))[1]).split(",\"requestValidationObservation")[0];



	}

//CREA LA TAREA APROBAR PRODUCTO
	@OrderedTest(order=18)
	@Test
	public void createProducto() throws Exception {

		Datos_CreateProducto objDatosCreateProductos = new Datos_CreateProducto();
		String CreateProducto_post = objDatosCreateProductos.setDatos_CreateProductos(productoID);
         
		procesoID_Producto=
		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(CreateProducto_post)
		.when()
		.post(Defoult_URL+"bpm/create").getBody().asString();		

		

		//OBTENER EL ID DE LA TAREA APROBAR PRODUCTO
		aprobarProductoID =
		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.queryParam("page", 1)
		.queryParam("size", 10)
		.queryParam("name", "Aprobar Producto")
		.when().get("http://34.234.32.246:8082/api/bpm/cuore.admin.QA").getBody().asString();


		aprobarProductoID = ((aprobarProductoID.split(",\"id\":"))[1]).split(",\"name")[0];

		
	}

	//COMPLETA LA TAREA Y LA ELIMINA DE LA BANDEJA
	
	@OrderedTest(order=19)
	@Test
	public void CompleteAprobarProducto() throws Exception {

		
		
		Thread.sleep(20000);
		CompleteAprobarProductos objCompleteAprobarProductos = new CompleteAprobarProductos();

		String post_CompleteAprobarProducto= objCompleteAprobarProductos.setCompletAprobarProducto(productoID, 
				procesoID_Producto, aprobarProductoID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_CompleteAprobarProducto)
		.when().post(Defoult_URL+"bpm/complete");								
	}
	
	
	
	//SE APRUEBA EL PRODUCTO
	
	@OrderedTest(order=20)
	@Test
	public void aprobarProducto() throws Exception {

		Datos_AprobarProducto objDatos_AprobarProducto = new Datos_AprobarProducto();

		String post_AprobarProducto= objDatos_AprobarProducto.setDatos_AprobarProducto(bienID, claseID, claseName, 
				claseDescription, subClaseID, subClaseName, subClaseDescription, marcaID, marcaName, marcaDescription, 
				modeloID, modeloName, modeloDescription, version,productoID,seguroID,productoVRKPOItemID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
		.body(post_AprobarProducto)
		.when().post(Defoult_URL+"products/product");								
	}


}
