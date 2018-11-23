import java.text.SimpleDateFormat;
import java.util.*;

abstract class Employe{

	protected int currentId;
	protected String nom;
	protected String prenom;
	protected int age;
	protected Date date_recrutement;
	public static int id;

	public Employe(String nom , String prenom , int age , Date date_recrutement){
		this.nom = new String(nom);
		this.prenom = new String(prenom);
		this.age = age;
		this.date_recrutement =date_recrutement;
		this.currentId = ++id; 
	}

	public Employe(){
		this.nom = new String();
		this.prenom = new String();
		this.age = 0;
		this.date_recrutement =new Date();
		this.currentId = ++id;
	}

	public int getId(){
		return this.currentId;
	}

	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}

	public String getPrenom(){
		return this.prenom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	abstract public double calculSalaire();
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return this.nom+" "+this.prenom+" "+this.age+" ans "+sdf.format(this.date_recrutement)+" ";
		//return this.getClass() +" "+ this.nom+" "+this.prenom+" "+this.age+" ans "+sdf.format(this.date_recrutement);
	}

}