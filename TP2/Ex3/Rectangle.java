public class Rectangle{

	private double largeur;
	private double longueur;

	public Rectangle(){
		this.largeur = 0;
		this.longueur = 0;
	}
	public Rectangle(double largeur , double longueur){
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public double getLargeur(){return this.largeur;}
	public void setLargeur(double largeur){ this.largeur = largeur;}
	public double getLongeur(){return this.longueur;}
	public void setLongeur(double longeur){this.longueur = longueur;}

	public double getPerimetre(){
		return this.largeur *2 + this.longueur*2;
	}

	public double getSurface(){
		return this.longueur * this.largeur;
	}

	public boolean isCarre(){
		if(this.largeur != this.longueur)
			return false;
		return true;
	}

	public String toString(){
		
		return "Largeur : "+this.largeur + "\nLongeur : " + this.longueur;
	}


}