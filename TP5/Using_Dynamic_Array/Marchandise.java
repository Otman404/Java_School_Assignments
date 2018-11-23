class Marchandise{

	private int numero;
	private double poids;
	private double volume;

	public Marchandise(){
		this.numero = 0;
		this.poids = 0;
		this.volume = 0;
	}
	public Marchandise(int numero , double poids , double volume){
		this.numero = numero;
		this.poids = poids;
		this.volume = volume;
	}
	public Marchandise(Marchandise m){
		setNum(m.getNum());
		setPoids(m.getPoids());
		setVolume(m.getVolume());
	}

	public int getNum(){ return this.numero; }
	public void setNum(int numero){ this.numero = numero; }

	public double getPoids(){ return this.poids; }
	public void setPoids(double poids){ this.poids = poids; }

	public double getVolume(){ return this.volume; }
	public void setVolume(double volume){ this.volume = volume; }

	public String toString(){
		return "Marchandise No."+this.getNum()+" Poids : "+this.getPoids()+" Kg"+" Volume : "+this.getVolume()+" m^3" ;
	}
}