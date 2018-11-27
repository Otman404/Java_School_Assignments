class Produit{

 	private static int id = 0;
 	private int currentID;
 	private String nom;
 	private double prixVente;
 	private double prixAchat;
 	private String fournisseur;

 	public Produit(){
 		this.currentID = ++id;
 		this.nom = new String();
 		this.prixVente = 0;
 		this.prixAchat = 0;
 		this.fournisseur = new String();
 	}
 	public Produit(String nom , double prixVente , double prixAchat , String fournisseur){
 		this.nom = new String(nom);
 		this.prixVente = prixVente;
 		this.prixAchat = prixAchat;
 		this.fournisseur = fournisseur;
 		this.currentID = ++id;
 	}
 	
 	public Produit(Produit p){
 		setNom(p.getNom());
 		setPrixVente(p.getPrixVente());
 		setPrixAchat(p.getPrixAchat());
 		setFournisseur(p.getFournisseur());
 		this.currentID = ++id;

 	}

 	public int getID(){ return this.currentID; }

 	public String getNom(){ return this.nom; }
 	public void setNom(String nom){ this.nom = new String(nom); }

 	public double getPrixVente(){ return this.prixVente; }
 	public void setPrixVente(double prixVente){ this.prixVente = prixVente; }

 	public double getPrixAchat(){ return this.prixAchat; }
 	public void setPrixAchat(double prixAchat){ this.prixAchat = prixAchat; } 

 	public String getFournisseur(){ return this.fournisseur; }
 	public void setFournisseur(String fournisseur){ this.fournisseur = new String(fournisseur); }

 	public double getBenefice(){
 		return (this.getPrixVente() - this.getPrixAchat());
 	}

 	public String toString(){
		//return this.currentID+"    "+this.nom+"    "+this.prixAchat+"    "+this.prixVente+"    "+this.fournisseur;
		return String.format("%d       %10s	%5.2f		%5.2f	%10s",this.currentID,this.nom,this.prixAchat,this.prixVente,this.fournisseur);
	}




}