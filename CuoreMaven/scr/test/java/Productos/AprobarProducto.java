package Productos;

public class AprobarProducto {
	private String bodyAprobarProducto;

	public void setAprobarProducto(String bienID,String claseID,String claseName,String claseDescription,String subClaseID,
			String subClaseName,String subClaseDescription,String marcaID,String marcaName,String marcaDescription,
			String modeloID,String modeloName,String modeloDescription,String version, String productoID, String seguroID,
			String productoName, String productoVRKPOItemID){


		bodyAprobarProducto=("{" + 
				"  \"activities\": []," + 
				"  \"admFeeLessor\": {" + 
				"    \"applyImpBenefit\": true," + 
				"    \"lessorId\": 1," + 
				"    \"lessorName\": \"TCC\"" + 
				"  }," + 
				"  \"admFeeLessorEditable\": false," + 
				"  \"admFeeLessorPercentageValue\": 4," + 
				"  \"admFeeLessorPercentageValueEditable\": false," + 
				"  \"admFeeLessorPercentageValueVisible\": true," + 
				"  \"admFeeLessorVisible\": true," + 
				"  \"amortizations\": [" + 
				"    {" + 
				"      \"description\": \"Sistema Francés\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Sistema Alemán\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Irregular\"," + 
				"      \"id\": 3" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Sistema Francés\"," + 
				"      \"id\": 1" + 
				"    }" + 
				"  ]," + 
				"  \"amountToFinanceEditable\": true," + 
				"  \"amountToFinanceVisible\": true," + 
				"  \"appliedtaxBenefitVisible\": true," + 
				"  \"appliesForComafiClients\": false," + 
				"  \"appliesForLegalPerson\": true," + 
				"  \"appliesForOtherClients\": false," + 
				"  \"appliesForPhysicalPerson\": false," + 
				"  \"bankings\": []," + 
				"  \"brokers\": []," + 
				"  \"campaign\": false," + 
				"  \"ceValue\": 0," + 
				"  \"ceValueEditable\": false," + 
				"  \"ceValueVisible\": false," + 
				"  \"channels\": [" + 
				"    {" + 
				"      \"description\": \"EDN\"," + 
				"      \"id\": 1," + 
				"      \"parentChannel\": null" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Comafi\"," + 
				"      \"id\": 2," + 
				"      \"parentChannel\": null" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Corporativa\"," + 
				"      \"id\": 9," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"MEGRAS\"," + 
				"      \"id\": 10," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"PYMES\"," + 
				"      \"id\": 11," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"BANCA PRIVADA\"," + 
				"      \"id\": 12," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"MICRO\"," + 
				"      \"id\": 13," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"NYP (Negocios y Profesionales)\"," + 
				"      \"id\": 14," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Individuos\"," + 
				"      \"id\": 15," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"e-commerce\"," + 
				"      \"id\": 4," + 
				"      \"parentChannel\": null" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Web\"," + 
				"      \"id\": 16," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"e-commerce\"," + 
				"        \"id\": 4," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Mobile\"," + 
				"      \"id\": 17," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"e-commerce\"," + 
				"        \"id\": 4," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Vinculadas\"," + 
				"      \"id\": 6," + 
				"      \"parentChannel\": null" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"NUBI\"," + 
				"      \"id\": 18," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Provencred\"," + 
				"      \"id\": 19," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Cuota YA\"," + 
				"      \"id\": 20," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Crediclick\"," + 
				"      \"id\": 21," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"End User\"," + 
				"      \"id\": 7," + 
				"      \"parentChannel\": null" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Sucursal\"," + 
				"      \"id\": 8," + 
				"      \"parentChannel\": null" + 
				"    }" + 
				"  ]," + 
				"  \"cities\": []," + 
				"  \"contractCurrency\": {" + 
				"    \"description\": \"Pesos ($)\"," + 
				"    \"id\": 1000" + 
				"  }," + 
				"  \"contractCurrencyEditable\": false," + 
				"  \"contractCurrencyVisible\": true," + 
				"  \"contractMaxTerm\": 36," + 
				"  \"contractMinTerm\": 12," + 
				"  \"contractTermOptions\": []," + 
				"  \"contractTypes\": [" + 
				"    {" + 
				"      \"description\": \"Financiero\"," + 
				"      \"id\": 1," + 
				"      \"ocKnown\": false" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"KPO\"," + 
				"      \"id\": 2," + 
				"      \"ocKnown\": false" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"True\"," + 
				"      \"id\": 3," + 
				"      \"ocKnown\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Software\"," + 
				"      \"id\": 4," + 
				"      \"ocKnown\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Inmuebles\"," + 
				"      \"id\": 5," + 
				"      \"ocKnown\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Financiero\"," + 
				"      \"id\": 1," + 
				"      \"ocKnown\": false" + 
				"    }" + 
				"  ]," + 
				"  \"destinations\": [" + 
				"    {" + 
				"      \"description\": \"Comercial\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Particular\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Comercial\"," + 
				"      \"id\": 1" + 
				"    }" + 
				"  ]," + 
				"  \"equipmentCostEditable\": false," + 
				"  \"equipmentCostVisible\": false," + 
				"  \"feeBonification\": null," + 
				"  \"feeBonificationEditable\": false," + 
				"  \"feeBonificationVisible\": false," + 
				"  \"feeLessor\": {" + 
				"    \"applyImpBenefit\": false," + 
				"    \"lessorId\": 2," + 
				"    \"lessorName\": \"COMAFI\"" + 
				"  }," + 
				"  \"feeLessorEditable\": false," + 
				"  \"feeLessorVisible\": true," + 
				"  \"feePeriodicities\": [" + 
				"    {" + 
				"      \"description\": \"Mensual\"," + 
				"      \"id\": 1" + 
				"    }" + 
				"  ]," + 
				"  \"fundsCostVisible\": false," + 
				"  \"goods\": [" + 
				"    {" + 
				"      \"associatedGood\": []," + 
				"      \"brandDescription\":\""+ marcaDescription + "\"," + 
				"      \"brandId\":" + marcaID + ","+ 
				"      \"brandName\":\""+ marcaName + "\"," +
				"      \"classDescription\":\""+ claseDescription + "\"," + 
				"      \"classId\":" + claseID + ","+
				"      \"className\":\""+ claseName + "\"," +
				"      \"creationDate\": 1525289180000," + 
				"      \"id\":" + bienID + ","+
				"      \"modelDescription\":\""+ modeloDescription + "\"," + 
				"      \"modelId\":" + modeloID + ","+ 
				"      \"modelName\":\""+ modeloName + "\"," +
				"      \"params\": null," + 
				"      \"status\": \"En Análisis\"," + 
				"      \"subclassDescription\":\""+ subClaseDescription + "\"," + 
				"      \"subclassId\":" + subClaseID + ","+
				"      \"subclassName\":\""+ subClaseName + "\"," +
				"      \"type\": 0," + 
				"      \"typification\": 0," + 
				"      \"usefulLife\": 0," + 
				"      \"version\":\""+ version + "\"" + 
				"    }" + 
				"  ]," + 
				"  \"gracePeriod\": null," + 
				"  \"gracePeriodEditable\": false," + 
				"  \"gracePeriodVisible\": false," + 
				"  \"hasInitialCanonCePercentageValueEnabled\": false," + 
				"  \"hasInitialCanonCeValueEnabled\": false," + 
				"  \"hasInitialCanonFirstFeeEnabled\": false," + 
				"  \"hasTermOptionsEnabled\": false," + 
				"  \"hiddenDiscountEditable\": false," + 
				"  \"hiddenDiscountVisible\": false," + 
				"  \"holders\": [" + 
				"    {" + 
				"      \"description\": \"TCC\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Comafi\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Terceros\"," + 
				"      \"id\": 3" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Comafi\"," + 
				"      \"id\": 2" + 
				"    }" + 
				"  ]," + 
				"  \"id\":" + productoID + ","+
				"  \"initialCanonCEVisible\": true," + 
				"  \"initialCanonCeEditable\": false," + 
				"  \"initialCanonFirstFeeEditable\": false," + 
				"  \"initialCanonFirstFeeVisible\": true," + 
				"  \"insurances\": [" + 
				"    {" + 
				"      \"carriers\": [" + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"La Segunda Coop Ltda De Seguros\"," + 
				"          \"id\": 1," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"HSBC Seguros Sa.\"," + 
				"          \"id\": 2," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"Generali Corporate S.A.\"," + 
				"          \"id\": 3," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"ACE Seguros Sa.\"," + 
				"          \"id\": 4," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"CHUBB Argentina De Seguros S.A.\"," + 
				"          \"id\": 5," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"SANCOR Cooperativa De Seguros Limitada\"," + 
				"          \"id\": 6," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"ZURICH Argentina S.A.\"," + 
				"          \"id\": 7," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }" + 
				"      ]," + 
				"      \"coverages\": [" + 
				"        {" + 
				"          \"description\": \"Terceros Completos\"," + 
				"          \"id\": 1," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Terceros Completos - Cargas Peligrosas\"," + 
				"          \"id\": 2," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia\"," + 
				"          \"id\": 3," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia - Carga Peligrosa\"," + 
				"          \"id\": 4," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Responsabillidad Civil\"," + 
				"          \"id\": 5," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Operativo\"," + 
				"          \"id\": 6," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia Del 4% Valor Asegurado\"," + 
				"          \"id\": 7," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia $ 900,- Empleado\"," + 
				"          \"id\": 8," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Terceros Completos Empleados\"," + 
				"          \"id\": 9," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo En Tierra, Vuelo Y/O Carreteo\"," + 
				"          \"id\": 10," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia $ 1100 Nacional\"," + 
				"          \"id\": 11," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia Empleado $ 1100\"," + 
				"          \"id\": 13," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"True Todo Riesgo Con Franquicia Del 4%\"," + 
				"          \"id\": 15," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia $ 2200\"," + 
				"          \"id\": 12," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia Empleado $ 2200\"," + 
				"          \"id\": 14," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Fcia $ 2.000.00\"," + 
				"          \"id\": 16," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Fcia $ 3.000,00\"," + 
				"          \"id\": 17," + 
				"          \"type\": null" + 
				"        }" + 
				"      ]," + 
				"      \"goods\": [" + 
				"        {" + 
				"          \"associatedGood\": []," + 
	  			"          \"brandDescription\":\""+ marcaDescription + "\"," + 
				"          \"brandId\":" + marcaID + ","+ 
				"          \"brandName\":\""+ marcaName + "\"," +
				"          \"classDescription\":\""+ claseDescription + "\"," + 
				"          \"classId\":" + claseID + ","+
				"          \"className\":\""+ claseName + "\"," +
				"          \"creationDate\": 1525289180000," + 
				"          \"id\":" + bienID + ","+
				"          \"modelDescription\":\""+ modeloDescription + "\"," + 
				"          \"modelId\":" + modeloID + ","+ 
				"          \"modelName\":\""+ modeloName + "\"," +
				"          \"params\": null," + 
				"          \"status\": \"En Análisis\"," + 
				"          \"subclassDescription\":\""+ subClaseDescription + "\"," + 
				"          \"subclassId\":" + subClaseID + ","+
				"          \"subclassName\":\""+ subClaseName + "\"," +
				"          \"type\": 0," + 
				"          \"typification\": 0," + 
				"          \"usefulLife\": 0," + 
				"          \"version\":\""+ version + "\"" + 
				"        }" + 
				"      ]," + 
				"      \"hasMarkUpCurrencyEnabled\": false," + 
				"      \"hasMarkUpPercentageEnabled\": false," + 
				"      \"id\":" + seguroID + ","+
				"      \"markUpCurrency\": null," + 
				"      \"markUpCurrencyValue\": null," + 
				"      \"markUpPercentageValue\": 0," + 
				"      \"node\": null," + 
				"      \"nodeInsurances\": []," + 
				"      \"policies\": [" + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 1," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 2," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Hsbc Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 3," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ACE Ingenieria\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 4," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ACE Ingenieria\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 5," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Generali Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 6," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"CHUBB Argentina - Bc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 7," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos - Bc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 8," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos - Tcc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 9," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"GENERALI\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 10," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"CHUBB Argentina - Tcc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 11," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"HSBC\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 12," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"PIPER Lv-Mcy\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 13," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ZURICH Argentina S.A.\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 14," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"HSBC\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 17," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ACE Seguros\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 16," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"HSBC La Buenos Aires\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 18," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ZURICH - 2012-13\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 19," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Poliza Aeronautica\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 20," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Poliza Auto E Ingenieria\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 21," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Automotor Hsbc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 22," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Terceros Completos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 23," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Terceros Completos Hsbc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 24," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }" + 
				"      ]," + 
				"      \"responsibles\": [" + 
				"        {" + 
				"          \"description\": \"TCC\"," + 
				"          \"id\": 2" + 
				"        }" + 
				"      ]" + 
				"    }" + 
				"  ]," + 
				"  \"ipFrontIvaVisible\": false," + 
				"  \"leasingFactorEditable\": false," + 
				"  \"leasingFactorVisible\": false," + 
				"  \"lessors\": [" + 
				"    {" + 
				"      \"applyImpBenefit\": true," + 
				"      \"lessorId\": 1," + 
				"      \"lessorName\": \"TCC\"" + 
				"    }," + 
				"    {" + 
				"      \"applyImpBenefit\": false," + 
				"      \"lessorId\": 2," + 
				"      \"lessorName\": \"COMAFI\"" + 
				"    }," + 
				"    {" + 
				"      \"applyImpBenefit\": false," + 
				"      \"lessorId\": 2," + 
				"      \"lessorName\": \"COMAFI\"" + 
				"    }" + 
				"  ]," + 
				"  \"maximumMargin\": 99999," + 
				"  \"minimumMargin\": 0," + 
				"  \"mipyme\": false," + 
				"  \"mixedRateType\": false," + 
				"  \"name\":\""+ productoName + "\"," + 
				"  \"observations\": \"Observaciones de Productos\"," + 
				"  \"origins\": [" + 
				"    {" + 
				"      \"description\": \"Importado\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Nacional\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Nacional\"," + 
				"      \"id\": 2" + 
				"    }" + 
				"  ]," + 
				"  \"other\": false," + 
				"  \"percentualFeeToPayValue\": 3," + 
				"  \"percentualFeeToPayValueEditable\": false," + 
				"  \"percentualFeeToPayValueVisible\": true," + 
				"  \"portfolioLine\": null," + 
				"  \"portfolioLineEditable\": false," + 
				"  \"portfolioLineVisible\": true," + 
				"  \"productStatus\": {" + 
				"    \"name\": \"Habilitado\"," + 
				"    \"entityType\": \"PRODUCTO\"," + 
				"    \"observation\": \"aprobao\"," + 
				"    \"statusDate\": \"2018-05-07T16:24:56.273Z\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 9" + 
				"    }" + 
				"  }," + 
				"  \"productVrKpoItems\": [" + 
				"    {" + 
				"      \"associatedGood\": {" + 
				"        \"associatedGood\": []," + 
	  			"        \"brandDescription\":\""+ marcaDescription + "\"," + 
				"        \"brandId\":" + marcaID + ","+ 
				"        \"brandName\":\""+ marcaName + "\"," +
				"        \"classDescription\":\""+ claseDescription + "\"," + 
				"        \"classId\":" + claseID + ","+
				"        \"className\":\""+ claseName + "\"," +
				"        \"creationDate\": 1525289180000," + 
				"        \"id\":" + bienID + ","+
				"        \"modelDescription\":\""+ modeloDescription + "\"," + 
				"        \"modelId\":" + modeloID + ","+ 
				"        \"modelName\":\""+ modeloName + "\"," +
				"        \"params\": null," + 
				"        \"status\": \"En Análisis\"," + 
				"        \"subclassDescription\":\""+ subClaseDescription + "\"," + 
				"        \"subclassId\":" + subClaseID + ","+
				"        \"subclassName\":\""+ subClaseName + "\"," +
				"        \"type\": 0," + 
				"        \"typification\": 0," + 
				"        \"usefulLife\": 0," + 
				"        \"version\":\""+ version + "\"" + 
				"      }," + 
				"      \"id\":" + productoVRKPOItemID + ","+
				"      \"requestValidationObservation\": null," + 
				"      \"termOption\": []," + 
				"      \"vrKpo\": []," + 
				"      \"vrValue\": []" + 
				"    }" + 
				"  ]," + 
				"  \"provinces\": []," + 
				"  \"rateSubtype\": {" + 
				"    \"parentRateId\": null," + 
				"    \"rateDate\": null," + 
				"    \"rateID\": 724," + 
				"    \"rateInterest\": 0," + 
				"    \"rateIsMultiplier\": false," + 
				"    \"rateIsTop\": false," + 
				"    \"rateState\": \"Alta\"," + 
				"    \"rateSub\": []," + 
				"    \"rateSubTypeRate\": \"SubTipo Tasa Fija 1\"," + 
				"    \"rateTypeMoney\": \"Peso\"," + 
				"    \"rateTypeRate\": {" + 
				"      \"description\": \"Fija\"," + 
				"      \"id\": 1" + 
				"    }" + 
				"  }," + 
				"  \"rateSubtypeEditable\": false," + 
				"  \"rateSubtypeVisible\": true," + 
				"  \"rateType\": null," + 
				"  \"rateTypeEditable\": false," + 
				"  \"rateTypeVisible\": true," + 
				"  \"segments\": []," + 
				"  \"services\": []," + 
				"  \"states\": [" + 
				"    {" + 
				"      \"description\": \"Nuevo\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Usado\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"De Stock\"," + 
				"      \"id\": 3" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Nuevo\"," + 
				"      \"id\": 1" + 
				"    }" + 
				"  ]," + 
				"  \"subBankings\": []," + 
				"  \"taxBenefit\": null," + 
				"  \"taxBenefitVisible\": true," + 
				"  \"tnaPercentageValue\": 5," + 
				"  \"tnaPercentageValueEditable\": false," + 
				"  \"tnaPercentageValueVisible\": true," + 
				"  \"upFrontIVA\": {" + 
				"    \"description\": \"Financiado\"," + 
				"    \"id\": 1" + 
				"  }," + 
				"  \"upFrontIvaEditable\": false," + 
				"  \"validFrom\": 1525662000000," + 
				"  \"validUntil\": 1546225200000," + 
				"  \"vendors\": []" + 
				"}");
	}

	public String getAprobarProducto(){
		System.out.println("Y ESTE ES EL BODY QUE DEVUELVE APROBAR PRODUCTOS" + " " + bodyAprobarProducto);
		return bodyAprobarProducto;
	}
}
