class Point{

	private double x;
	private double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void deplace(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}

	public void affiche(){
		System.out.println("Point de coordonnees (" + this.x + " , " + y+ " )");
	}
	public double getX(){ return this.x; }
	public double getY(){ return this.y; }
}