class Stock{

	private Produit p;
	private int qteStock;

	public Stock(){
		this.p = new Produit();
		this.qteStock = 0;
	}
	public Stock(Produit p , int qteStock){
		this.p = new Produit(p);
		this.qteStock = qteStock;
	}
	public Stock(Stock s){
		setQteStock(s.getQteStock());
		this.p = new Produit(s.getProduit());
	}

	public int getQteStock(){ return this.qteStock; }
	public void setQteStock(int qteStock){ this.qteStock = qteStock; }

	public Produit getProduit(){ return this.p; }

	public void acheterProd(){
		this.qteStock++;
	}
	public void vendreProd(){
		this.qteStock--;
	}
	public boolean verifierProd(){
		if(this.qteStock == 0)
			return false;
		return true;
	}

}