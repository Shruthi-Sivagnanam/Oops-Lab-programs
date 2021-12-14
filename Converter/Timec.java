package Converter;
public class Timec
{
	public float hr_to_min(float hr){
		float min;
		min=(float)(hr*60);
		return(min);
	}
	public float min_to_hr (float min){
		float hr;
		hr=(float)(min/60);
		return(hr);
	}
	public float hr_to_sec (float hr){
		float sec;
		sec=(float)(hr*3600);
		return(sec);
	}
	public float sec_to_hr(float sec){
		float hr;
		hr=(float)(sec/3600);
		return(hr);
	}
	public float min_to_sec(float min)
	{
		float sec;
		sec=min*60;
		return(sec);
	}
	public float sec_to_min(float sec)
	{
		float min;
		min=sec/60;
		return(min);
	}
}