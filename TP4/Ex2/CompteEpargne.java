class CompteEpargne extends Compte{

	private double tauxInteret; //pourcentage

	public CompteEpargne(){
		super();
		this.tauxInteret = 0;
	}
	public CompteEpargne(double solde,double tauxInteret){
		super(solde);
		this.tauxInteret = tauxInteret;
	}
	public double getTauxInteret(){
		return this.tauxInteret;
	}
	public void setTauxInteret(double tauxInteret){
		this.tauxInteret = tauxInteret;
	}
	public void calculInteret(){
		this.setSolde(this.getSolde() + this.getSolde()*(tauxInteret/100));
	}

	public void versement(double montant){
		this.setSolde(this.getSolde() + montant);
		System.out.println(montant + "Dhs ajoute au compte, nouveau solde : "+this.getSolde()+"Dhs");
	}
	public void retrait(double montant){
		if(this.getSolde() < montant){
		this.setSolde(this.getSolde()-montant);
		System.out.println(montant + "Dhs retire du compte, nouveau solde : "+this.getSolde()+"Dhs");
		}else{
			System.out.println("Operation Impossible");
		}
	}

	public String toString(){
		return "\nCompte Epargne :\n"+super.toString()+" , Taux Interet : "+this.tauxInteret+"%";
	}
}