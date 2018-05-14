package Bienes;

public class TareaAnalizarBienPorActivos {

private String analizarBienXActivos;
	
	public String setTareaAnalizarBienPorActivos(String bienID,String claseID, String claseName, String claseDescription, String subClaseID, String subClaseName, 
			String subClaseDescription, String marcaID, String marcaName, String marcaDescription, String modeloID, 
			String modeloName, String modeloDescription, String version) {
	
		return this.analizarBienXActivos = ("{" + 
				"  \"good\": {" + 
				"    \"id\":" + bienID + ","+
				"    \"classId\":" + claseID + ","+ 
				"    \"className\":\"" + claseName + "\"," + 
				"    \"classDescription\":\"" + claseDescription + "\"," + 
				"    \"subclassId\":" + subClaseID + ","+ 
				"    \"subclassName\":\"" + subClaseName + "\"," + 
				"    \"subclassDescription\":\"" + subClaseDescription + "\"," + 
				"    \"brandId\":" + marcaID + ","+ 
				"    \"brandName\":\"" + marcaName + "\"," + 
				"    \"brandDescription\":\"" + marcaDescription + "\"," + 
				"    \"modelId\":" + modeloID + ","+ 
				"    \"modelName\":\"" + modeloName + "\"," + 
				"    \"modelDescription\":\"" + modeloDescription + "\"," + 
				"    \"version\":\"" + version + "\"," + 
				"    \"creationDate\": 1524749100771," + 
				"    \"status\": \"En Análisis\"," + 
				"    \"usefulLife\": 180," + 
				"    \"type\": 1," + 
				"    \"typification\": 4," + 
				"    \"attributes\": [" + 
				"      {" + 
				"        \"id\": 459," + 
				"        \"attribute\": {" + 
				"          \"id\": 1," + 
				"          \"name\": \"Tipificación\"," + 
				"          \"description\": \"Tipificación\"," + 
				"          \"attributeValueType\": {" + 
				"            \"id\": 4," + 
				"            \"description\": \"Tabla\"," + 
				"            \"code\": \"TABLA\"" + 
				"          }," + 
				"          \"attributeFormat\": null," + 
				"          \"status\": true," + 
				"          \"options\": [" + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Aerodinos en general (aviones, hidroaviones, helicópteros)\"," + 
				"              \"uid\": 1," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Aguadas y bebederos\"," + 
				"              \"uid\": 2," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Alambradas y tranqueras\"," + 
				"              \"uid\": 3," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Barcos\"," + 
				"              \"uid\": 4," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Contenedores (incluídos contenedores cisternas y contenedores depósitos para cualquier medio de transporte)\"," + 
				"              \"uid\": 5," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Contenedores, excepto silos (toneles, tambores)\"," + 
				"              \"uid\": 6," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Cosechadoras (granos, oleaginosas y forrajes)\"," + 
				"              \"uid\": 7," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Edificios\"," + 
				"              \"uid\": 8," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Embarcaciones de recreo\"," + 
				"              \"uid\": 9," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Equipos de computación y accesorios de informática\"," + 
				"              \"uid\": 10," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Equipos y maquinarias de arrastre (sembradoras, discos, arados de reja, arados de cinceles, escardadores, etc)\"," + 
				"              \"uid\": 11," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Equipos, aparatos e instrumental de precisión de uso técnico y profesional\"," + 
				"              \"uid\": 12," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Equipos, aparatos e instrumental de uso técnico y profesional\"," + 
				"              \"uid\": 13," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Ferrocarriles (locomotoras y vagones)\"," + 
				"              \"uid\": 14," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Galpones\"," + 
				"              \"uid\": 15," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Hacienda reproductora\"," + 
				"              \"uid\": 16," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Herramientas\"," + 
				"              \"uid\": 17," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Instalaciones\"," + 
				"              \"uid\": 18," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Maquinarias y equipos\"," + 
				"              \"uid\": 19," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Molinos\"," + 
				"              \"uid\": 20," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Muebles y utiles\"," + 
				"              \"uid\": 21," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Pulverizadoras motopropulsadas\"," + 
				"              \"uid\": 22," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Rodados (automóviles, camiones, acoplados, autoelevadores, grúas, máquinas viales y motocicletas)\"," + 
				"              \"uid\": 23," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Rotoenfardadoras\"," + 
				"              \"uid\": 24," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Silos\"," + 
				"              \"uid\": 25," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Tarros tambo\"," + 
				"              \"uid\": 26," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Tractores\"," + 
				"              \"uid\": 27," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }," + 
				"            {" + 
				"              \"id\": null," + 
				"              \"name\": \"Software\"," + 
				"              \"uid\": 28," + 
				"              \"description\": null," + 
				"              \"attributeDTO\": null" + 
				"            }" + 
				"          ]," + 
				"          \"applyAsset\": false," + 
				"          \"systemAttribute\": true," + 
				"          \"level\": 2," + 
				"          \"entity\": {" + 
				"            \"idEntity\": 1," + 
				"            \"name\": \"Tipificación\"," + 
				"            \"entityTableName\": \"t_com_equipmentClassification\"," + 
				"            \"entityCode\": \"description\"," + 
				"            \"entityId\": \"idEquipmentClassification\"" + 
				"          }," + 
				"          \"key\": null" + 
				"        }," + 
				"        \"idAttribute\": 1," + 
				"        \"active\": false," + 
				"        \"textValue\": \"\"," + 
				"        \"booleanValue\": false," + 
				"        \"idTableValue\": 4," + 
				"        \"optionValueId\": null," + 
				"        \"optionValue\": null," + 
				"        \"modificable\": false," + 
				"        \"defineVersion\": false," + 
				"        \"versionOrder\": 0" + 
				"      }," + 
				"      {" + 
				"        \"id\": 460," + 
				"        \"attribute\": {" + 
				"          \"id\": 2," + 
				"          \"name\": \"Patentable\"," + 
				"          \"description\": \"SI /NO\"," + 
				"          \"attributeValueType\": {" + 
				"            \"id\": 3," + 
				"            \"description\": \"Si/No\"," + 
				"            \"code\": \"BOOLEAN\"" + 
				"          }," + 
				"          \"attributeFormat\": null," + 
				"          \"status\": true," + 
				"          \"options\": []," + 
				"          \"applyAsset\": false," + 
				"          \"systemAttribute\": true," + 
				"          \"level\": 2," + 
				"          \"entity\": null," + 
				"          \"key\": null" + 
				"        }," + 
				"        \"idAttribute\": 2," + 
				"        \"active\": false," + 
				"        \"textValue\": \"\"," + 
				"        \"booleanValue\": false," + 
				"        \"idTableValue\": null," + 
				"        \"optionValueId\": null," + 
				"        \"optionValue\": null," + 
				"        \"modificable\": false," + 
				"        \"defineVersion\": false," + 
				"        \"versionOrder\": 0" + 
				"      }," + 
				"      {" + 
				"        \"id\": 461," + 
				"        \"attribute\": {" + 
				"          \"id\": 3," + 
				"          \"name\": \"Semaforo\"," + 
				"          \"description\": \"SI/NO (Rojo/Verde) cuando está en SI implica que al cotizar este bien debe pasar por la supervisión de activos\"," + 
				"          \"attributeValueType\": {" + 
				"            \"id\": 3," + 
				"            \"description\": \"Si/No\"," + 
				"            \"code\": \"BOOLEAN\"" + 
				"          }," + 
				"          \"attributeFormat\": null," + 
				"          \"status\": true," + 
				"          \"options\": []," + 
				"          \"applyAsset\": false," + 
				"          \"systemAttribute\": true," + 
				"          \"level\": 2," + 
				"          \"entity\": null," + 
				"          \"key\": null" + 
				"        }," + 
				"        \"idAttribute\": 3," + 
				"        \"active\": false," + 
				"        \"textValue\": \"\"," + 
				"        \"booleanValue\": false," + 
				"        \"idTableValue\": null," + 
				"        \"optionValueId\": null," + 
				"        \"optionValue\": null," + 
				"        \"modificable\": false," + 
				"        \"defineVersion\": false," + 
				"        \"versionOrder\": 0" + 
				"      }," + 
				"      {" + 
				"        \"id\": 462," + 
				"        \"attribute\": {" + 
				"          \"id\": 4," + 
				"          \"name\": \"IVA %\"," + 
				"          \"description\": \"Porcentaje IVA %\"," + 
				"          \"attributeValueType\": {" + 
				"            \"id\": 1," + 
				"            \"description\": \"Texto\"," + 
				"            \"code\": \"TEXTO\"" + 
				"          }," + 
				"          \"attributeFormat\": {" + 
				"            \"id\": 4," + 
				"            \"description\": \"Decimal\"," + 
				"            \"code\": \"DECIMAL\"" + 
				"          }," + 
				"          \"status\": true," + 
				"          \"options\": []," + 
				"          \"applyAsset\": false," + 
				"          \"systemAttribute\": true," + 
				"          \"level\": 2," + 
				"          \"entity\": null," + 
				"          \"key\": null" + 
				"        }," + 
				"        \"idAttribute\": 4," + 
				"        \"active\": false," + 
				"        \"textValue\": \"21\"," + 
				"        \"booleanValue\": false," + 
				"        \"idTableValue\": null," + 
				"        \"optionValueId\": null," + 
				"        \"optionValue\": null," + 
				"        \"modificable\": false," + 
				"        \"defineVersion\": false," + 
				"        \"versionOrder\": 0" + 
				"      }" + 
				"    ]" + 
				"  }," + 
				"  \"depreciations\": [" + 
				"    {" + 
				"      \"referencedValue\": \"1\"," + 
				"      \"referencedValueDate\": \"2018-04-26T03:00:00.0Z\"," + 
				"      \"fmv\": \"2\"," + 
				"      \"differenceReferenceValueFMV\": -1," + 
				"      \"usefulLife\": \"3\"," + 
				"      \"firstYear\": \"4\"," + 
				"      \"secondYear\": \"5\"," + 
				"      \"thirdYear\": \"6\"," + 
				"      \"fourthYear\": \"7\"," + 
				"      \"fifthYear\": \"8\"," + 
				"      \"sixthPlusYear\": \"9\"" + 
				"    }" + 
				"  ]," + 
				"  \"restrictions\": []," + 
				"  \"isActiveRestrictionRecommended\": false," + 
				"  \"terms\": [" + 
				"    {" + 
				"      \"isCRRVR\": true," + 
				"      \"ccrterm\": 10," + 
				"      \"crrCollateralRisk\": 11," + 
				"      \"crrResidualValue\": 12" + 
				"    }," + 
				"    {" + 
				"      \"isVRKPO\": true," + 
				"      \"vrkpoTerm\": 13," + 
				"      \"vrkpoValue\": 14," + 
				"      \"vrkpoResidualValue\": 15," + 
				"      \"vrkpoCollateralRisk\": 16," + 
				"      \"vrkpoQuoteProductValue\": 17" + 
				"    }" + 
				"  ]," + 
				"  \"secondaryMarket\": \"merc sec del proveedor\"," + 
				"  \"activeAnalysisObservations\": \"ninguna observacion del analisis por activos\"," + 
				"  \"insuranceAnalysisObservations\": \"\"," + 
				"  \"observations\": \"\"," + 
				"  \"kilometersYear\": \"18\"," + 
				"  \"hoursYear\": \"19\"," + 
				"  \"surplusValue\": \"20\"," + 
				"  \"validFrom\": \"2018-04-26T03:00:00.0Z\"," + 
				"  \"validUntil\": \"2018-05-26T03:00:00.0Z\"," + 
				"  \"hasInsurance\": \"\"," + 
				"  \"carrier\": null," + 
				"  \"coverage\": null," + 
				"  \"policy\": null," + 
				"  \"analysisStatus\": {" + 
				"    \"entityType\": \"BIEN\"," + 
				"    \"statusDate\": \"2018-04-26T13:51:02.105Z\"," + 
				"    \"observation\": \"ninguna observacion del analisis por activos\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 18" + 
				"    }" + 
				"  }" + 
				"}");
		}
	
//	public String getTareaAnalizarBienPorActivos() {
//		return analizarBienXActivos;
//	}
}
