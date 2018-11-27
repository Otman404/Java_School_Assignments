import java.util.*;
import java.text.SimpleDateFormat;
class Ingenieur extends Employe{

	private char grade;
	private int heuresDeTravail;
	private double primesMens;
	public Ingenieur(){
		super();
		this.grade = ' ';
		this.heuresDeTravail = 0;
		this.primesMens = 0;
	}
	public Ingenieur(String nom , String prenom , int age , Date date_recrutement,char grade,int heuresDeTravail,double primesMens){
		super(nom ,prenom , age , date_recrutement);
		this.grade = grade;
		this.heuresDeTravail = heuresDeTravail;
		this.primesMens = primesMens;
	}

	public char getGrade(){
		return this.grade;
	}
	public void setGrade(char grade){
		this.grade = grade;
	}
	public int getHeuresDeTravail(){
		return this.heuresDeTravail;
	}
	public void setHeuresDeTravail(int heuresDeTravail){
		this.heuresDeTravail = heuresDeTravail;
	}
	public double getPrimesMens(){
		return this.primesMens;
	}
	public void setPrimesMens(double primesMens){
		this.primesMens = primesMens;
	}

	public double calculSalaire(){
		double salaire;
		switch(this.grade){
			case 'A':
			return (8000 + heuresDeTravail*200 +this.primesMens);
			case 'B':
			return (11000 + heuresDeTravail*200 +this.primesMens);
			case 'C':
			return (15000 + heuresDeTravail*200 +this.primesMens);
			default:
			return 0;
		}
	}

	public String toString(){
		return "Ingenieur "+super.toString()+" "+this.grade+" heures de travails: "+this.heuresDeTravail+"h Prime Mensuel: "+primesMens+"Dhs";
	}

}