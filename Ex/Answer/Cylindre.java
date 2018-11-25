class Cylindre 	extends Cercle{
	protected int hauteur;

	public Cylindre(){
		super();
		this.hauteur = 0;
	}
	public Cylindre(int hauteur , double rayon , int x , int y ){
		super(rayon,x,y);
		this.hauteur = hauteur;
	}
	public Cylindre(Cylindre cy){
		super(cy);
		this.hauteur = hauteur;
	}
	@Override
	public void afficher(){
		super.afficher();
		System.out.println("Hauteur : "+this.hauteur);
	}
	@Override
	public int cal_aire(){
		return (int)(2*Math.PI*this.rayon*this.hauteur);
	}
	@Override
	public int cal_vol(){
		return (int)(Math.PI*Math.pow(this.rayon,2)*this.hauteur);
	}
}