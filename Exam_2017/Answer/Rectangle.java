class Rectangle extends Figure{

	protected double largeur;
	protected double hauteur;
	protected Point p;

	public Rectangle(Point p, double largeur, double hauteur){
		this.p = new Point(p.getX(),p.getY());
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public void changeTaille(double largeur , double hauteur){
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public void affiche(){
		System.out.println("Rectangle de largeur : "+this.largeur+" et de hauteur :"+ this.hauteur);
		this.p.affiche();
	}
	public void deplace(double dx){
		this.p.deplace(dx,0);
	}

}