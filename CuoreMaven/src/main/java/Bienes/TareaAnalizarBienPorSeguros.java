package Bienes;

public class TareaAnalizarBienPorSeguros {
private String varAnalizarBienXSeguros;
	
	public String setTareaAnalizarBienPorSeguros(String bienID,String claseID, String claseName, String claseDescription, String subClaseID, String subClaseName, 
			String subClaseDescription, String marcaID, String marcaName, String marcaDescription, String modeloID, 
			String modeloName, String modeloDescription, String version) {
	
		return this.varAnalizarBienXSeguros = ("{" + 
				"  \"activeAnalysisObservations\": \"ninguna observacion del analisis por activos\"," + 
				"  \"analysisStatus\": {" + 
				"    \"entityType\": \"BIEN\"," + 
				"    \"statusDate\": \"2018-04-26T20:30:11.152Z\"," + 
				"    \"observation\": \"ninguna observacion de seguros\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 18" + 
				"    }" + 
				"  }," + 
				"  \"attachedPath\": null," + 
				"  \"carrier\": {" + 
				"    \"address\": null," + 
				"    \"contactEmail\": null," + 
				"    \"contactName\": null," + 
				"    \"country\": null," + 
				"    \"cuit\": null," + 
				"    \"description\": \"La Segunda Coop Ltda De Seguros\"," + 
				"    \"id\": 1," + 
				"    \"postalCode\": null," + 
				"    \"province\": null," + 
				"    \"website\": null" + 
				"  }," + 
				"  \"coverage\": {" + 
				"    \"description\": \"Terceros Completos\"," + 
				"    \"id\": 1," + 
				"    \"type\": null" + 
				"  }," + 
				"  \"depreciations\": [" + 
				"    {" + 
				"      \"referencedValue\": 1," + 
				"      \"referencedValueDate\": \"2018-04-26T03:00:00.0Z\"," + 
				"      \"fmv\": 2," + 
				"      \"differenceReferenceValueFMV\": -1," + 
				"      \"usefulLife\": 3," + 
				"      \"firstYear\": 4," + 
				"      \"secondYear\": 5," + 
				"      \"thirdYear\": 6," + 
				"      \"fourthYear\": 7," + 
				"      \"fifthYear\": 8," + 
				"      \"sixthPlusYear\": 9" + 
				"    }" + 
				"  ]," + 
				"  \"good\": {" + 
				"    \"associatedGood\": []," + 
				"    \"brandDescription\":\"" + marcaDescription + "\","+ 
				"    \"brandId\":" + marcaID + ","+ 
				"    \"brandName\":\"" + subClaseName + "-"+ marcaName + "\","+ 
				"    \"classDescription\":\"" + claseDescription + "\","+ 
				"    \"classId\":" + claseID + ","+ 
				"    \"className\":\"" + claseName + "\","+ 
				"    \"creationDate\": 1524749100771," + 
				"    \"id\":" + bienID + ","+ 
				"    \"modelDescription\":\"" + modeloDescription + "\","+ 
				"    \"modelId\":" + modeloID + ","+ 
				"    \"modelName\":\"" + modeloName + "\","+ 
				"    \"params\": null," + 
				"    \"status\": \"En Análisis\"," + 
				"    \"subclassDescription\":\"" + subClaseDescription + "\","+ 
				"    \"subclassId\":" + subClaseID + ","+ 
				"    \"subclassName\":\"" + subClaseName + "\","+ 
				"    \"type\": 0," + 
				"    \"typification\": 0," + 
				"    \"usefulLife\": 0," + 
				"    \"version\":\"" + version + "\"" + 
				"  }," + 
				"  \"hasInsurance\": true," + 
				"  \"hoursYear\": 19," + 
				"  \"id\": 2278," + 
				"  \"imagePath\": null," + 
				"  \"insuranceAnalysisObservations\": \"ninguna observacion de seguros\"," + 
				"  \"isActiveRestrictionRecommended\": false," + 
				"  \"kilometersYear\": 18," + 
				"  \"observations\": \"\"," + 
				"  \"policy\": {" + 
				"    \"currencyID\": null," + 
				"    \"description\": \"La Segunda Autos\"," + 
				"    \"endDate\": null," + 
				"    \"exchangeRate\": null," + 
				"    \"id\": 1," + 
				"    \"insuranceCarrierId\": null," + 
				"    \"insuranceTypeID\": null," + 
				"    \"renewed\": null," + 
				"    \"startDate\": null," + 
				"    \"status\": null" + 
				"  }," + 
				"  \"restrictions\": []," + 
				"  \"secondaryMarket\": \"merc sec del proveedor\"," + 
				"  \"supplier\": null," + 
				"  \"surplusValue\": 20," + 
				"  \"terms\": [" + 
				"    {" + 
				"      \"analisisTerm\": null," + 
				"      \"ccrterm\": 10," + 
				"      \"crrCollateralRisk\": 11," + 
				"      \"crrKPO\": null," + 
				"      \"crrResidualValue\": 12," + 
				"      \"id\": 2280," + 
				"      \"isCRRVR\": true," + 
				"      \"isVRKPO\": null," + 
				"      \"vrkpoCollateralRisk\": null," + 
				"      \"vrkpoQuoteProductValue\": null," + 
				"      \"vrkpoResidualValue\": null," + 
				"      \"vrkpoTerm\": null," + 
				"      \"vrkpoValue\": null" + 
				"    }," + 
				"    {" + 
				"      \"analisisTerm\": null," + 
				"      \"ccrterm\": null," + 
				"      \"crrCollateralRisk\": null," + 
				"      \"crrKPO\": null," + 
				"      \"crrResidualValue\": null," + 
				"      \"id\": 2281," + 
				"      \"isCRRVR\": null," + 
				"      \"isVRKPO\": true," + 
				"      \"vrkpoCollateralRisk\": 16," + 
				"      \"vrkpoQuoteProductValue\": 17," + 
				"      \"vrkpoResidualValue\": 15," + 
				"      \"vrkpoTerm\": 13," + 
				"      \"vrkpoValue\": 14" + 
				"    }" + 
				"  ]," + 
				"  \"validFrom\": \"2018-04-26T03:00:00.0Z\"," + 
				"  \"validUntil\": \"2018-05-26T03:00:00.0Z\"" + 
				"}");
		}
	
//	public String getTareaAnalizarBienPorActivos() {
//		return analizarBienXActivos;
//	}
}
