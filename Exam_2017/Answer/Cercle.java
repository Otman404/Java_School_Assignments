class Cercle extends Figure{

	protected Point p;
	protected double rayon;
	public Cercle(double x , double y , double rayon){
		this.p = new Point(x,y);
		this.rayon = rayon;
	}

	public void changeRayon(double rayon){
		this.rayon = rayon;
	}
	public Point getCentre(){
		return (new Point(this.p.getX(),this.p.getY()));
	}
	public void affiche(){
		System.out.println("Cercle de rayon : "+this.rayon+" et de centre : ");
		this.p.affiche();
	}
	public void deplace(double dx){
		this.p.deplace(dx,0);
	}
}