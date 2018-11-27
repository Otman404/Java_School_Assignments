class Main{

	public static void main(String[] args){
		
		Stock [] s = new Stock []{
			new Stock(new Produit("Ordinateur",6500,6000,"DELL"),5),
			new Stock(new Produit("Clavier",200,150,"Acer"),3),
			new Stock(new Produit("Imprimante",2200,1800,"HP"),2),
			new Stock(new Produit("Scanner",3000,2700,"HP"),7)
		};

		System.out.println("Les produit du fournisseur HP : ");
		for(Stock ss : s){
			if(ss.getProduit().getFournisseur().equals("HP"))
				System.out.println(ss.getProduit());
		}
		System.out.println("Les produits avec un prix de vente entre 200 et 3000");
		for(Stock ss : s ){
			if(ss.getProduit().getPrixVente()>=200 && ss.getProduit().getPrixVente()<=3000)
				System.out.println(ss.getProduit());
		}
		System.out.println("On vend 2 ordinateurs");
		for (int i = 0;i < 2 ;i++ ) {
			s[0].vendreProd();
		}
		System.out.println("Le benefice total est : ");
		double totalBenefice= 0;
		for(Stock ss : s){
			if(ss.getProduit().getNom().equals("Ordinateur"))
				totalBenefice +=ss.getProduit().getBenefice(); 
		}
		System.out.println(totalBenefice*2);
		System.out.println("Stock Actuel des ordinateurs : ");
		for (Stock ss : s ) {
			if(ss.getProduit().getNom().equals("Ordinateur")){
				System.out.println(ss.getQteStock());
				break;
			}
		}

	} 
}