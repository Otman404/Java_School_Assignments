class Main{

	public static void main(String[] args){

		Produit[] prod = new Produit[4];
		prod[0] = new Produit("Ordinateur",6500,6000,"Dell");
		prod[1] = new Produit("Clavier",200,150,"Acer");
		prod[2] = new Produit("Imprimante",2200,1800,"Hp");
		prod[3] = new Produit("Scanner",3000,2700,"Hp"); 

		Stock[] stock = new Stock[4];

		stock[0] = new Stock(prod[0],5);
		stock[1] = new Stock(prod[1],3);
		stock[2] = new Stock(prod[2],2);
		stock[3] = new Stock(prod[3],7);
		


		System.out.println("\nproduits du fournisseur HP : \n");
		for(Stock s : stock){
			if(s.getProd().getFournisseur().equals("Hp"))
			System.out.println(s);
		}

		System.out.println("\nProduits avec prix de vente entre 200 et 3000\n");
		for(Stock s : stock){
			if((s.getProd().getPrixVente()>=200)&&(s.getProd().getPrixVente()<=3000))
				System.out.println(s);
		}
		for (int i = 0;i<2 ;i++ ) {
			stock[0].vendreProduit();
		}
		System.out.println("\nLe benifice Total apres vendre 2 Ordinateurs est : "+stock[0].getProd().getBenefice()*2);
		System.out.println("\nStock actuel des Ordinateurs : \n");
		System.out.println(stock[0]+"\n");
	}



}