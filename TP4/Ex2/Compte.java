abstract class Compte{

	private int code;
	private double solde;
	private static int compteCree = 0;

	public Compte(){
		this.solde = 0;
		this.code = ++compteCree;
	}

	public Compte(double solde){
		this.solde = solde;
		this.code = ++compteCree;
	}

	public int getCode(){
		return this.code;
	}
	public double getSolde(){
		return this.solde;
	}
	public void setSolde(double solde){
		this.solde = solde;
	}

	abstract void versement(double montant);
	abstract void retrait(double montant);



	public String toString(){
		return "Compte No."+this.code+" Solde : "+this.solde+" Dhs";
	}
}