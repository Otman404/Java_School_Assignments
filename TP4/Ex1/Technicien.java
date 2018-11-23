import java.util.*;
import java.text.SimpleDateFormat;
class Technicien extends Employe{

	private int heuresDeTravail;
	private int heuresSUpp;

	public Technicien(){
		super();
		this.heuresDeTravail = 0;
		this.heuresSUpp = 0;
	}

	public Technicien(String nom , String prenom , int age , Date date_recrutement,int heuresDeTravail , int heuresSUpp){
		super(nom ,prenom , age ,  date_recrutement);
		this.heuresDeTravail = heuresDeTravail;
		this.heuresSUpp = heuresSUpp;
	}

	public int getHeuresDeTravail(){
		return this.heuresDeTravail;
	}
	public void setHeuresDeTravail(int heuresDeTravail){
		this.heuresDeTravail = heuresDeTravail;
	}
	public int getHeuresSUpp(){
		return this.heuresSUpp;
	}
	public void setHeuresSUpp(int heuresSUpp){
		this.heuresSUpp = heuresSUpp;
	}

	public double calculSalaire(){
		return ((heuresDeTravail*100) +(heuresSUpp*200));
	}
	public String toString(){
		return "Technicien "+ super.toString() + "Heures de travails : "+this.heuresDeTravail +"h Heures Supplementaires : "+this.heuresSUpp+"h" ;
	}
}