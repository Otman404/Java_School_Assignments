class Main{

	public static void main(String[] main){
		//Compte Simple
		CompteSimple cs = new CompteSimple(5000,2000); // solde : 5000 , plafond :2000
		System.out.println(cs);
		cs.retrait(3000);
		cs.retrait(500);
		System.out.println(cs);
		cs.versement(3000);
		System.out.println(cs);
		//Compte Epargne
		CompteEpargne ce = new CompteEpargne(5000,4); //solde : 5000 , 4% taux interet
		System.out.println(ce);
		ce.calculInteret();
		System.out.println(ce);
		//Compte Golde
		CompteGold cg = new CompteGold(5000);//solde : 5000
		System.out.println(cg);
		cg.versement(1000);
		System.out.println(cg);
	}
}