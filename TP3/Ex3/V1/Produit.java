class Produit{

	private int currendID;
	private String nom;
	private double prixVente;
	private double prixAchat;
	private String fournisseur;
	private static int id;

	public Produit(){
		this.currendID = ++id;
	}
	public Produit(String nom,double prixVente,double prixAchat,String fournisseur){
		this.nom = nom ;
		this.prixVente = prixVente;
		this.prixAchat = prixAchat;
		this.fournisseur = fournisseur ;
		this.currendID = ++id;
	}

	public int getID(){return this.currendID;}

	public String getNom(){return this.nom;}
	public void setNom(String nom){this.nom = nom;}

	public double getPrixVente(){return this.prixVente;}
	public void setPrixVente(double prixVente){this.prixVente = prixVente;}

	public double getPrixAchat(){return this.prixAchat;}
	public void setPrixAchat(double prixVente){this.prixAchat = prixAchat;}

	public String getFournisseur(){return this.fournisseur;}
	public void setFournisseur(String fournisseur){this.fournisseur = fournisseur;}

	public double getBenefice(){
		return (this.getPrixVente() - this.getPrixAchat());
	}

	public String toString(){
		//return this.currendID+"    "+this.nom+"    "+this.prixAchat+"    "+this.prixVente+"    "+this.fournisseur;
		return String.format("%d       %10s	%5.2f		%5.2f	%10s",this.currendID,this.nom,this.prixAchat,this.prixVente,this.fournisseur);
	}

}