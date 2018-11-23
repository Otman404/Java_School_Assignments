import java.util.*;

class Service{

	private int currentId;
	private String intitule; 
	private double chiffreAffaire;
	public static int id;

	public Service(){
		this.intitule = new String();
		this.chiffreAffaire = 0;
		this.currentId = ++id;
	}
	public Service(String intitule , double chiffreAffaire){
		this.intitule = intitule;
		this.chiffreAffaire = chiffreAffaire;
		this.currentId = ++id;
	}

	public int getId(){
		return this.currentId;
	}
	public String getIntitule(){
		return this.intitule;
	}
	public void setIntitule(String intitule){
		this.intitule = intitule;
	}
	public double getChiffreAffaire(){
		return this.chiffreAffaire;
	}
	public void setChiffreAffaire(double chiffreAffaire){
		this.chiffreAffaire = chiffreAffaire;
	}
	public String toString(){
		return " "+this.currentId +" "+ this.intitule + " Chiffre d affaire : "+this.chiffreAffaire+"Dhs";
	}

}