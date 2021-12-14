package Converter;
public class Distance
{
	public float met_to_km (float met){
		float km;
		km=(float)(met/1000);
		return(km);
	}
	public float km_to_met (float km){
		float met;
		met=(float)(km*1000);
		return(met);
	}
	public float mil_to_km (float mil){
		float km;
		km=(float)(mil*1.609);
		return(km);
	}
	public float km_to_mil (float km){
		float mil;
		mil=(float)(km/1.609);
		return(mil);
	}
}