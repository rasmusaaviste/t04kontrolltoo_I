public class Autod{
	double s, v, sek, min, h;
 
	public Autod(double kaugus, double kiirus, double sekundid, double minutid, double tunnid){
		s = kaugus;
		v = kiirus;
		sek = sekundid;
		min = minutid;
		h = tunnid;
	}
	
	public double sekundid(){
		return s+(v*sek);
	}
 
	public double minutid(){
		return s+(v*min);
	}
 
	public double tunnid(){
		return s+(v*h);
	}
  
	public String toString(){
		return "Auto on maanteest "+s+" km kaugusel ja kiirus on "+v+" km/h. 3 sekundit hiljem on auto "+sekundid()+" km, 5 minutit hiljem "+minutid()+" km, ja 2 tundi hiljem "+tunnid()+" km kaugusel.";
	}
	
}