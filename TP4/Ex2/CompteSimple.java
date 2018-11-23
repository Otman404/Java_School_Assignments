class CompteSimple extends Compte{

	private double plafond;

	public CompteSimple(){
		super();
		this.plafond = 0;
	}

	public CompteSimple(double solde,double plafond){
		super(solde);
		this.plafond = plafond;
	}

	public double getPlafond(){
		return this.plafond;
	}
	public void setPlafond(double plafond){
		this.plafond = plafond;
	}
	public void retrait(double montant){
		if(montant < this.getSolde()){
			if(montant <= this.plafond){
				this.setSolde(this.getSolde()-montant);
				System.out.println(montant + "Dhs retire du compte, nouveau solde : "+this.getSolde()+"Dhs");
			}else{
				System.out.println("Plafond depassee , Operation Impossible.");
			}
		}else{
			System.out.println("Operation Impossible");
		}
	}
	public void versement(double montant){
		this.setSolde(this.getSolde() + montant);
		System.out.println(montant + "Dhs ajoute au compte, nouveau solde : "+this.getSolde()+"Dhs");
	}

	public String toString(){
		return "\nCompte Simple :\n"+super.toString() + " , Plafond : "+this.plafond+" Dhs";
	}


}