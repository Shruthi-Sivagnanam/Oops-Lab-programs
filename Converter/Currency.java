package Converter;
public class Currency
{
	public float dol_to_rup (float dol){ 
		float rup;
		rup=(float)(dol*68.74);
		return(rup);
	}
	public float rup_to_dol (float rup) {
		float dol;
		dol=(float)(rup/68.74);
		return(dol);
	}
	public float eur_to_rup (float eur){
		float rup;
		rup=(float)(eur*80.64);
		return(rup);
	}
	public float rup_to_eur (float rup){
		float eur;
		eur=(float)(rup/80.64);
		return(eur);
	}
	public float yen_to_rup (float yen){
		float rup;
		rup=(float)(yen*0.62);
		return(rup);
	}
	public float rup_to_yen (float rup){
		float yen;
		yen=(float)(rup/0.62);
		return(yen);
	}
		
		
}