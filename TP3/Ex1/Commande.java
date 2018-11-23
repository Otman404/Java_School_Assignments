import java.util.*;
public class Commande{

	private int currentID;
	private Medicament[] med;
	private Date dateCommand;
	private static int id = 0;
	public Commande(){
		this.currentID = ++id;
	}

	public Commande(Medicament[] med , Date dateCommand){
		this.med = med;
		this.dateCommand = dateCommand;
	}

	public Medicament[] getMedicament(){return this.med;}
	public void setMedicament(Medicament[] med){
		this.med = med;
	}

	public Date getDateCommand(){return this.dateCommand;}
	public void setDateCommand(Date d){this.dateCommand = d;}

	public double getTotalHT(){
		double TotalHT = 0;
		for(int i = 0 ; i<this.med.length ; i++){
			TotalHT += this.med[i].getPrixUnitaire();
		}
		return TotalHT;
	}

	public double getTotalTTC(){
		double ttc;
		ttc = this.getTotalHT() + this.getTotalHT()*0.2;
		return ttc;
	}

	public double getRemise(double remise){
		double rms = this.getTotalTTC() - this.getTotalTTC()*(remise/100);
		return rms;
	}

	public void afficherFacture(int rem){
		System.out.println("\nid      Libelle         DateExperation  prixUnitaire\n");
		for(int i = 0 ; i<this.med.length ; i++){
			System.out.println(this.med[i]);
		}
		System.out.println("\nPrix total de la commande : "+this.getTotalTTC()+"\n");
		if(rem != 0)
		System.out.format("Prix apres la remise : %.2f\n\n",this.getRemise(rem));
	}

}

