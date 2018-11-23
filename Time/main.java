import java.util.*;

class main{
	public static void main(String[] args) {
		Heure h = new Heure(2,30,45);
		Conversions c = new Conversions(h);
		System.out.println(h);
		System.out.println("Conversion en secondes :  ");
		System.out.println(c.HoursToSeconds(h) + " s");
		int nbrSec = 43759;
		System.out.println(c.SecondsToHours(nbrSec));
		Heure h1 = new Heure(3,42,12);
		Heure h2 = new Heure(0,54,30);
		System.out.println(h1 + " + " + h2 + " = " + c.add(h1,h2));
	}
}