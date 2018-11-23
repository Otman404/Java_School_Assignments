public class Heure{

	protected int hours;
	protected int minutes;
	protected int seconds;
	public Heure(){}
	public Heure(int h , int m , int s){
		hours = h;
		minutes = m;
		seconds = s;
	}

	public int getH(){ return this.hours;}
	public void setH(int h){  this.hours = h;}

	public int getM(){ return this.minutes;}
	public void setM(int m){  this.minutes = m;}

	public int getS(){ return this.seconds;}
	public void setS(int s){  this.seconds = s;}

	public String toString(){
		return hours + "h / " + minutes + "min / " + seconds + "sec";
	}
}