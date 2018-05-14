package Bienes;

public class TareaAnalizarViabilidadDelBien {
private String varAnalizarViabilidad;
	
	public String setAnalizarViabilidad(String bienID,String claseID, String claseName, String claseDescription, String subClaseID, String subClaseName, 
			String subClaseDescription, String marcaID, String marcaName, String marcaDescription, String modeloID, 
			String modeloName, String modeloDescription, String version) {
	
		return this.varAnalizarViabilidad = ("POST http://34.234.32.246:8082/api/products/good/analysis HTTP/1.1" + 
				"Host: 34.234.32.246:8082" + 
				"Connection: keep-alive" + 
				"Content-Length: 12182" + 
				"Accept: application/json, text/plain, */*" + 
				"x-auth-token: eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6Ijk5YzMxNGRiLTQ3ZTItMTFlOC04NTRhLTE1YTMyMTc0MmUzOSIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjQ1ODk5MjAsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyNDU5MzUyMCwiaWF0IjoxNTI0NTg5OTIwLCJqdGkiOiJlMGQzZTE0NS0xYzZlLTRmOWYtYTA2OS02OWJkN2ZlYmY5ODYiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.bMdGiwZVnatL4f6QHiB2l6tB-A2crSdmzhdSPw4iSlj6kqMpr8AOijQSY1fWI8QR_aLB58zkMlYUiQi_QyR83-eqru06zfZEr422mUlLExRz7axEsDkJL_XDsBmoK3rsbIetrjJblcmT-j2ccKc3s4lKVuZ5nw6WdmXEIYX_0UwSOwd17h6W4_m7V2-M_0uwTfiAQrV3FYXyY3I0gYjBOf4OoVPupuL-Ubw3pu3W1EN-MjmZhF1B_70hgWIANFQ6RCTU0XEP_fRf3NBzE-g5wNGSJIE7Unhv-pa2uvTrfcTgymCzhBNZuTjTl2djKjzEfwG11F1vUuxrjNCEi0UM7w" + 
				"User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.117 Safari/537.36" + 
				"Origin: http://34.234.32.246:8081" + 
				"Content-Type: application/json" + 
				"Referer: http://34.234.32.246:8081/analisisBien" + 
				"Accept-Encoding: gzip, deflate" + 
				"Accept-Language: es-AR,es;q=0.9,en-US;q=0.8,en;q=0.7" + 
				"" + 
				"{" + 
				"  \"good\": {" + 
				"    \"id\":" + bienID + "," + 
				"    \"classId\":" + claseID + "," + 
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
				"      \"referencedValueDate\": \"2018-04-27T03:00:00.0Z\"," + 
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
				"  \"secondaryMarket\": \"Merc sec del prov\"," + 
				"  \"activeAnalysisObservations\": \"ninguna observacion del analisis por activos\"," + 
				"  \"insuranceAnalysisObservations\": \"ninguna observacion de seguros\"," + 
				"  \"observations\": \"observaciones de analizar viabilidad del bien\"," + 
				"  \"kilometersYear\": \"18\"," + 
				"  \"hoursYear\": \"19\"," + 
				"  \"surplusValue\": \"20\"," + 
				"  \"validFrom\": \"2018-04-27T03:00:00.0Z\"," + 
				"  \"validUntil\": \"2018-05-27T03:00:00.0Z\"," + 
				"  \"hasInsurance\": true," + 
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
				"  \"analysisStatus\": {" + 
				"    \"entityType\": \"BIEN\"," + 
				"    \"statusDate\": \"2018-04-27T18:50:05.010Z\"," + 
				"    \"observation\": \"observaciones de analizar viabilidad del bien\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 19" + 
				"    }" + 
				"  }" + 
				"}");
		}


}
