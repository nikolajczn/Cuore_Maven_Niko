package Cotizaciones;

public class Cotizacion {
private String bodyCotizacion;
	
	public String setAltaCotizacion() {
	
		return this.bodyCotizacion = ("{" + 
				"  \"idPricingOperation\": null," + 
				"  \"idBusinessManager\": \"1\"," + 
				"  \"idBusinessManagerSupport\": \"1\"," + 
				"  \"idChannel\": \"1\"," + 
				"  \"contact\": \"\"," + 
				"  \"idIntermediary\": \"\"," + 
				"  \"quotes\": [" + 
				"    {" + 
				"      \"idPricing\": null," + 
				"      \"productId\": \"2\"," + 
				"      \"lessor\": \"2\"," + 
				"      \"currency\": \"1000\"," + 
				"      \"contractType\": \"1\"," + 
				"      \"linePotfolio\": 1," + 
				"      \"contractTermOption\": 36," + 
				"      \"periodicity\": \"Mensual\"," + 
				"      \"amortization\": \"1\"," + 
				"      \"provinceId\": \"2\"," + 
				"      \"address\": \"Corrientes 880\"," + 
				"      \"idEquipmentClassification\": null," + 
				"      \"taxBenefitId\": null," + 
				"      \"totalCost\": 1000000," + 
				"      \"canonExpirationDate\": \"2018-07-01\"," + 
				"      \"hiddenDiscount\": null," + 
				"      \"gracePeriod\": null," + 
				"      \"feeLessor\": 1," + 
				"      \"administrativeFee\": 4," + 
				"      \"amountFee\": 40000," + 
				"      \"importFeeLessor\": 2," + 
				"      \"importFee\": 3," + 
				"      \"amountImportFee\": 30000," + 
				"      \"preleaseRate\": 10," + 
				"      \"amountToFinance\": null," + 
				"      \"rateType\": \"1\"," + 
				"      \"rateSubTypeId\": 92," + 
				"      \"lifeExpectance\": null," + 
				"      \"subRatePercentage\": null," + 
				"      \"spreadCOF\": null," + 
				"      \"adder\": null," + 
				"      \"spreadTIR\": null," + 
				"      \"completeTIR\": null," + 
				"      \"spreadTNA\": null," + 
				"      \"initialCanon\": null," + 
				"      \"idStatus\": 168," + 
				"      \"applyDecree\": true," + 
				"      \"ivaAdvance\": false," + 
				"      \"amountIvaAdvance\": null," + 
				"      \"canonApplication\": null," + 
				"      \"quoteItemBOs\": [" + 
				"        {" + 
				"          \"order\": 1," + 
				"          \"idEntity\": 1," + 
				"          \"quoteEntityInstanceID\": 3," + 
				"          \"good\": {" + 
				"            \"id\": 3," + 
				"            \"classId\": 1," + 
				"            \"className\": \"Automotriz\"," + 
				"            \"classDescription\": \"Bienes de clase automotriz\"," + 
				"            \"subclassId\": 1063," + 
				"            \"subclassName\": \"Utilitario Deportivo SUV\"," + 
				"            \"subclassDescription\": \"Bienes de subclase utilitario deportivo suv\"," + 
				"            \"brandId\": 110212," + 
				"            \"brandName\": \"Audi\"," + 
				"            \"brandDescription\": \"Bienes de marca Audi\"," + 
				"            \"modelId\": 215158," + 
				"            \"modelName\": \"Q5\"," + 
				"            \"modelDescription\": \"Bienes modelo Q5\"," + 
				"            \"version\": \"Infoauto: Ford Fiesta KD Titanium 5 puertas\"," + 
				"            \"creationDate\": 1524167078651," + 
				"            \"status\": \"En Análisis\"," + 
				"            \"usefulLife\": 0," + 
				"            \"type\": 0," + 
				"            \"typification\": 0," + 
				"            \"attributes\": [" + 
				"              {" + 
				"                \"id\": 13," + 
				"                \"attribute\": {" + 
				"                  \"id\": 1," + 
				"                  \"name\": \"Tipificación\"," + 
				"                  \"description\": \"Tipificación\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 4," + 
				"                    \"description\": \"Tabla\"," + 
				"                    \"code\": \"TABLA\"" + 
				"                  }," + 
				"                  \"attributeFormat\": null," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": true," + 
				"                  \"level\": 2," + 
				"                  \"entity\": {" + 
				"                    \"idEntity\": 1," + 
				"                    \"name\": \"Tipificación\"," + 
				"                    \"entityTableName\": \"t_com_equipmentClassification\"," + 
				"                    \"entityCode\": \"description\"," + 
				"                    \"entityId\": \"idEquipmentClassification\"" + 
				"                  }," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 1," + 
				"                \"active\": false," + 
				"                \"textValue\": \"\"," + 
				"                \"booleanValue\": false," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": 23," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": false," + 
				"                \"versionOrder\": 0" + 
				"              }," + 
				"              {" + 
				"                \"id\": 14," + 
				"                \"attribute\": {" + 
				"                  \"id\": 2," + 
				"                  \"name\": \"Patentable\"," + 
				"                  \"description\": \"SI /NO\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 3," + 
				"                    \"description\": \"Si/No\"," + 
				"                    \"code\": \"BOOLEAN\"" + 
				"                  }," + 
				"                  \"attributeFormat\": null," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": true," + 
				"                  \"level\": 2," + 
				"                  \"entity\": null," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 2," + 
				"                \"active\": false," + 
				"                \"textValue\": \"\"," + 
				"                \"booleanValue\": true," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": null," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": false," + 
				"                \"versionOrder\": 0" + 
				"              }," + 
				"              {" + 
				"                \"id\": 15," + 
				"                \"attribute\": {" + 
				"                  \"id\": 3," + 
				"                  \"name\": \"Semaforo\"," + 
				"                  \"description\": \"SI/NO (Rojo/Verde) cuando está en SI implica que al cotizar este bien debe pasar por la supervisión de activos\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 3," + 
				"                    \"description\": \"Si/No\"," + 
				"                    \"code\": \"BOOLEAN\"" + 
				"                  }," + 
				"                  \"attributeFormat\": null," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": true," + 
				"                  \"level\": 2," + 
				"                  \"entity\": null," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 3," + 
				"                \"active\": false," + 
				"                \"textValue\": \"\"," + 
				"                \"booleanValue\": false," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": null," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": false," + 
				"                \"versionOrder\": 0" + 
				"              }," + 
				"              {" + 
				"                \"id\": 16," + 
				"                \"attribute\": {" + 
				"                  \"id\": 4," + 
				"                  \"name\": \"IVA %\"," + 
				"                  \"description\": \"Porcentaje IVA %\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 1," + 
				"                    \"description\": \"Texto\"," + 
				"                    \"code\": \"TEXTO\"" + 
				"                  }," + 
				"                  \"attributeFormat\": {" + 
				"                    \"id\": 4," + 
				"                    \"description\": \"Decimal\"," + 
				"                    \"code\": \"DECIMAL\"" + 
				"                  }," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": true," + 
				"                  \"level\": 2," + 
				"                  \"entity\": null," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 4," + 
				"                \"active\": false," + 
				"                \"textValue\": \"21\"," + 
				"                \"booleanValue\": false," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": null," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": false," + 
				"                \"versionOrder\": 0" + 
				"              }," + 
				"              {" + 
				"                \"id\": 17," + 
				"                \"attribute\": {" + 
				"                  \"id\": 301," + 
				"                  \"name\": \"Tipo de Seguro\"," + 
				"                  \"description\": \"Describe los tipos de seguros\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 4," + 
				"                    \"description\": \"Tabla\"," + 
				"                    \"code\": \"TABLA\"" + 
				"                  }," + 
				"                  \"attributeFormat\": null," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": false," + 
				"                  \"level\": 0," + 
				"                  \"entity\": {" + 
				"                    \"idEntity\": 3," + 
				"                    \"name\": \"InsuranceType\"," + 
				"                    \"entityTableName\": \"t_fin_InsuranceType\"," + 
				"                    \"entityCode\": \"InsuranceType_Name\"," + 
				"                    \"entityId\": \"InsuranceType_ID\"" + 
				"                  }," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 301," + 
				"                \"active\": false," + 
				"                \"textValue\": \"\"," + 
				"                \"booleanValue\": false," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": 1," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": false," + 
				"                \"versionOrder\": 0" + 
				"              }," + 
				"              {" + 
				"                \"id\": 18," + 
				"                \"attribute\": {" + 
				"                  \"id\": 302," + 
				"                  \"name\": \"Clase de Seguro\"," + 
				"                  \"description\": \"Describe las clases de seguros\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 4," + 
				"                    \"description\": \"Tabla\"," + 
				"                    \"code\": \"TABLA\"" + 
				"                  }," + 
				"                  \"attributeFormat\": null," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": false," + 
				"                  \"level\": 0," + 
				"                  \"entity\": {" + 
				"                    \"idEntity\": 4," + 
				"                    \"name\": \"InsuranceClass\"," + 
				"                    \"entityTableName\": \"t_fin_InsuranceClass\"," + 
				"                    \"entityCode\": \"InsuranceClass_Name\"," + 
				"                    \"entityId\": \"InsuranceClass_ID\"" + 
				"                  }," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 302," + 
				"                \"active\": false," + 
				"                \"textValue\": \"\"," + 
				"                \"booleanValue\": false," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": 3," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": false," + 
				"                \"versionOrder\": 0" + 
				"              }," + 
				"              {" + 
				"                \"id\": 19," + 
				"                \"attribute\": {" + 
				"                  \"id\": 300," + 
				"                  \"name\": \"Infoauto\"," + 
				"                  \"description\": \"Describe modelos de autos\"," + 
				"                  \"attributeValueType\": {" + 
				"                    \"id\": 1," + 
				"                    \"description\": \"Texto\"," + 
				"                    \"code\": \"TEXTO\"" + 
				"                  }," + 
				"                  \"attributeFormat\": {" + 
				"                    \"id\": 2," + 
				"                    \"description\": \"Alfanumérico\"," + 
				"                    \"code\": \"ALFANUMERICO\"" + 
				"                  }," + 
				"                  \"status\": true," + 
				"                  \"options\": []," + 
				"                  \"applyAsset\": false," + 
				"                  \"systemAttribute\": false," + 
				"                  \"level\": 0," + 
				"                  \"entity\": {" + 
				"                    \"idEntity\": 1," + 
				"                    \"name\": \"Tipificación\"," + 
				"                    \"entityTableName\": \"t_com_equipmentClassification\"," + 
				"                    \"entityCode\": \"description\"," + 
				"                    \"entityId\": \"idEquipmentClassification\"" + 
				"                  }," + 
				"                  \"key\": null" + 
				"                }," + 
				"                \"idAttribute\": 300," + 
				"                \"active\": false," + 
				"                \"textValue\": \"Ford Fiesta KD Titanium 5 puertas\"," + 
				"                \"booleanValue\": false," + 
				"                \"modificable\": false," + 
				"                \"idTableValue\": null," + 
				"                \"optionValueId\": null," + 
				"                \"optionValue\": null," + 
				"                \"defineVersion\": true," + 
				"                \"versionOrder\": 1" + 
				"              }" + 
				"            ]" + 
				"          }," + 
				"          \"opType\": 0," + 
				"          \"quantity\": \"1\"," + 
				"          \"unitAmount\": \"1000000\"," + 
				"          \"amountWithoutTaxes\": 1000000," + 
				"          \"taxesAmount\": \"21\"," + 
				"          \"totalAmount\": 1210000," + 
				"          \"itemProvider\": {" + 
				"            \"supplierId\": 939," + 
				"            \"quotes\": \"36\"," + 
				"            \"month\": \"1\"," + 
				"            \"paymentForm\": \"Contra entrega\"," + 
				"            \"prelease\": false," + 
				"            \"importation\": false" + 
				"          }" + 
				"        }," + 
				"        {" + 
				"          \"order\": 1," + 
				"          \"idEntity\": 2," + 
				"          \"quoteEntityInstanceID\": 3890," + 
				"          \"good\": {" + 
				"            \"dateFrom\": 1523934000000," + 
				"            \"dateUntil\": 1546225200000," + 
				"            \"donor\": \"TCC\"," + 
				"            \"id\": 3890," + 
				"            \"invoicedBy\": \"TCC\"," + 
				"            \"name\": \"NR135\"," + 
				"            \"statusDTO\": {" + 
				"              \"idStatus\": 166," + 
				"              \"masterStatus\": {" + 
				"                \"id\": 4," + 
				"                \"description\": \"Habilitado\"," + 
				"                \"statusCode\": \"103\"," + 
				"                \"entityType\": \"SERVICIO\"" + 
				"              }," + 
				"              \"statusDate\": 1525272026000," + 
				"              \"observation\": \"Aprobado Manual\"" + 
				"            }" + 
				"          }" + 
				"        }" + 
				"      ]," + 
				"      \"quoteDate\": \"2018-05-02T16:11:15.108Z\"" + 
				"    }" + 
				"  ]" + 
				"}");
		}
	
//	public String getTareaAnalizarBienPorActivos() {
//		return analizarBienXActivos;
//	}
}
