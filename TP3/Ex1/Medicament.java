import java.text.SimpleDateFormat;
import java.util.Date;

public class Medicament{

	private String libelle;
	private Date dateExpiration;
	private double prixUnitaire;
	private int currentID;
	private static int id;

	public Medicament(){
		this.currentID = ++id;
	}
	public Medicament(String libelle , Date dateExpiration , double prixUnitaire){
		this.libelle = libelle;
		this.dateExpiration = dateExpiration;
		this.prixUnitaire = prixUnitaire;
		this.currentID = ++id;
	}

	public String getLibelle(){return this.libelle;}
	public void setLibelle(String libelle){ this.libelle = libelle;}

	public Date getDateExpiration(){return this.dateExpiration;}
	public void setDateExpiration(Date dateExpiration){this.dateExpiration = dateExpiration;}

	public double getPrixUnitaire(){return this.prixUnitaire;}
	public void setPrixUnitaire(double prixUnitaire){this.prixUnitaire = prixUnitaire;}

	public boolean isExpired(){
		Date d = new Date();
		if(d.before(this.dateExpiration))
			return false;
		return true;
	}

	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return this.currentID+"\t"+this.libelle+"\t"+sdf.format(this.dateExpiration)+"\t"+this.prixUnitaire;
	}

}