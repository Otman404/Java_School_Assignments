import java.util.*;
import java.text.*;
class Medicament{

	private static int id = 0;
	private  int currentId;
	private String libelle;
	private Date dateExp;
	private double prixUnitaire;

	public Medicament(){
		this.currentId = ++id;
		this.libelle = new String();
		this.dateExp = new Date();
		this.prixUnitaire = 0;
	}
	public Medicament(String libelle , Date dateExp , double prixUnitaire){
		this.currentId = ++id;
		this.libelle = new String(libelle);
		this.dateExp = dateExp;
		this.prixUnitaire = prixUnitaire;
	}
	public Medicament(Medicament m){
		setLibelle(m.getLibelle());
		setDateExp(m.getDateExp());
		setPrixUnitaire(m.getPrixUnitaire());
		this.currentId = ++id;
	}

	public int getID(){ return this.currentId; }

	public String getLibelle(){ return this.libelle; }
	public void setLibelle(String libelle){ this.libelle = new String(libelle); }

	public Date getDateExp(){ return this.dateExp; }
	public void setDateExp(Date dateExp){ this.dateExp = dateExp; }

	public double getPrixUnitaire(){ return this.prixUnitaire; }
	public void setPrixUnitaire(double prixUnitaire){ this.prixUnitaire = prixUnitaire; }

	public boolean isExpired(){
		if(this.dateExp.before(new Date()))
			return true;
		return false;
	}

	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return this.currentId+", Libelle : "+this.libelle+", Date d expiration : "+sdf.format(this.dateExp)+", Prix Unitaire : "+this.prixUnitaire+" Dhs";
	}
}