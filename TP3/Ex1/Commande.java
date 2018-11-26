import java.util.*;
import java.text.*;
class Commande{

	private static int id = 0;
	private int currentId ;
	private Medicament[] m ;
	private Date dateCommande;

	public Commande(){
		this.currentId = ++id;
		this.m = new Medicament[1];
		this.dateCommande = new Date();
	}
	public Commande(Medicament[] m , Date dateCommande ){
		this.currentId = ++id;
		this.m = new Medicament[m.length];
		for (int i = 0; i<m.length ;i++ ) {
			this.m[i] = new Medicament(m[i]);
		}
		this.dateCommande = dateCommande;
	}
	public Commande(Commande c){
		this.currentId = ++id;
		setDateCommande(c.getDateCommande());
		setMedicament(c.getMedicament());
	}

	public int getID(){ return this.currentId; }

	public Medicament[] getMedicament(){
		return this.m;
	}
	public void setMedicament(Medicament[] m){
		this.m = new Medicament[m.length];
		for (int i = 0; i<m.length ;i++ ) {
			this.m[i] = new Medicament(m[i]);
		}
	}
	public Date getDateCommande(){ return this.dateCommande; }
	public void setDateCommande(Date dateCommande){ this.dateCommande = dateCommande; }

	public void afficherCommande(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Commande : "+this.currentId+" Date de la commande : "+sdf.format(this.dateCommande));
		for (Medicament mm : this.m) {
			System.out.println(mm);
		}
	}
	public double getTotalHT(){
		double totalHT = 0;
		for(Medicament mm : this.m ){
			totalHT += mm.getPrixUnitaire();
		}
		return totalHT;
	}
	public double getTotalTTC(){
		return (this.getTotalHT() + this.getTotalHT()*0.2);
	}
	public double getRemise(double remise){
		return (this.getTotalTTC() - this.getTotalTTC()*(remise/100));
	}
	public void afficherFacture(double remise){
		this.afficherCommande();
		System.out.println("Prix Total : "+this.getTotalTTC()+" Dhs");
		if(remise != 0)
			System.out.println("Prix total apres remise est : "+this.getRemise(remise)+" Dhs");
	}

}	