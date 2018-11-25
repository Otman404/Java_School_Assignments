class Cercle extends Point{

	protected double rayon;

	public Cercle(){
		super();
		this.rayon = 0;
	}
	public Cercle(double rayon , int x , int y){
		super(x,y);
		this.rayon = rayon;
	}
	public Cercle(Cercle c){
		super(c);
		this.rayon = c.rayon;
	}
	@Override
	public int cal_aire(){ //aire = pi * r²
		return (int)(Math.pow(this.rayon,2)*Math.PI);
	}
	@Override
	public void afficher(){
		super.afficher();
		System.out.println("Rayon : "+this.rayon);
	}


}