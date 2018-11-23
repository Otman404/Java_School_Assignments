class Stock{


	private Produit prod;
	private int QteStockProd;

	public Stock(Produit prod,int QteStockProd){
		this.prod = prod;
		this.QteStockProd = QteStockProd;
	}

	public Produit getProd(){return this.prod;}
	public void setProd(Produit prod){this.prod = prod;}

	public int getQteStockProd(){return this.QteStockProd;}
	public void setQteStockProd(int QteStockProd){
		if(QteStockProd < 0) 
			this.QteStockProd = 0;
		else
			this.QteStockProd = QteStockProd;
	}

	public void acheterProduit(){
		this.QteStockProd++;
	}

	public void vendreProduit(){
		this.QteStockProd--;
	}

	public boolean verfierProd(){
		if(this.QteStockProd == 0)
			return false;
		return true;
	}

	public String toString(){
		return this.prod + "    "+this.QteStockProd;
	}



 

}