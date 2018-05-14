package Bienes;

public class CompleteAnalizarBienPorSeguros {
private String varCompleteanalizarBienXSeguros;
	
	public String mtdCompleteanalizarBienXActivos(String bienID,String processId, String id) {
		return this.varCompleteanalizarBienXSeguros = ("{" + 
				"  \"action\": \"Finalizar análisis\"," + 
				"  \"creationDate\": 1524749102000," + 
				"  \"entityDescription\": \"BIEN\"," + 
				"  \"entityId\":" + bienID + ","+ 
				"  \"expirationDate\": null," + 
				"  \"id\":" + id + ","+ 
				"  \"name\": \"Analizar Bien por Seguros\"," + 
				"  \"observation\": \"ninguna observacion de seguros\"," + 
				"  \"params\": null," + 
				"  \"paramsNames\": null," + 
				"  \"paramsValues\": null," + 
				"  \"priority\": 0," + 
				"  \"processDescription\": \"com.tcc.cuore.process.GestionDeBienes\"," + 
				"  \"processId\":" + processId + ","+ 
				"  \"status\": \"Borrador\"," + 
				"  \"userOwner\": null," + 
				"  \"variables\": {" + 
				"    \"toAsset\": \"true\"," + 
				"    \"idBien\":" + bienID + ","+ 
				"    \"initiator\": \"manager\"," + 
				"    \"toInsurance\": \"true\"" + 
				"  }" + 
				"}");
		}
	
//	public String getTareaAnalizarBienPorActivos() {
//		return analizarBienXActivos;
//	}
}
