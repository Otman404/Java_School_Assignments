class CompteGold extends Compte{


	public CompteGold(){
		super();
	}
	public CompteGold(double solde){
		super(solde);
	}

	public void versement(double montant){
		this.setSolde(this.getSolde() + montant - (montant*0.03));
		System.out.println(montant-(montant*0.03) + "Dhs ajoute au compte, nouveau solde avec : "+this.getSolde()+"Dhs");
	}
	public void retrait(double montant){
		if(montant<this.getSolde()){
		this.setSolde(this.getSolde() - montant - (montant*0.03));
		System.out.println(montant + "Dhs retire du compte, nouveau solde : "+this.getSolde()+"Dhs");
		}else{
			System.out.println("Operation Impossible");
		}
	}

	public String toString(){
		return "\nCompte Golde :\n"+super.toString() + " , Tarif : "+3+"%";
	}

}