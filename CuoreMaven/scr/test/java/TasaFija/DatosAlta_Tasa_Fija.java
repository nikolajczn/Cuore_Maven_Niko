package TasaFija;


public class DatosAlta_Tasa_Fija {
	
	
	public Alta_Tasa_Fija setdatos_TF(){
	Alta_Tasa_Fija tasa_fija = new Alta_Tasa_Fija();
	
	tasa_fija.setrateID("506");
	tasa_fija.setrateIsMultiplier(false);
	tasa_fija.setrateIsTop(false);
	tasa_fija.setrateSubTypeRate("TasaApi39");
	tasa_fija.setrateTypeMoney("Peso");
	
	return tasa_fija;
	
}

}
