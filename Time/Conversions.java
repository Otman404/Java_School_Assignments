public class Conversions extends Heure{


	 public Conversions(){}
	public Conversions(Heure h){
		super(h.hours,h.minutes,h.seconds);
	}
	public int HoursToSeconds(Heure h){
		int s = 0;
		s = (h.hours)*3600 + (h.minutes)*60 + (h.seconds);
		return s;
	}
	public Heure SecondsToHours(int s){
		Heure h = new Heure();
		int seconds = s%60;
		h.seconds = seconds;
		s-=seconds;
		int min;
		min = s/60;
		h.minutes = min%60;
		int hrs;
		hrs = min/60;
		h.hours = hrs;		
		return h;
	}

	public Heure add(Heure h1 , Heure h2){
		Conversions c = new Conversions();
		int s1 = c.HoursToSeconds(h1);
		int s2 = c.HoursToSeconds(h2);
		int sum = s1 + s2;
		return c.SecondsToHours(sum);
	}
}