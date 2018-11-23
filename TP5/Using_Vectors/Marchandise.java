class Marchandise{

	private int numero;
	private double poids;
	private double volume;
	private static int num = 0;
	public Marchandise(){
		this.numero = ++num;
		this.poids = 0;
		this.volume = 0;
	}
	public Marchandise(double poids , double volume){
		this.numero = ++num;
		this.poids = poids;
		this.volume = volume;
	}

	public int getNumero(){ return this.numero; }

	public double getPoids(){ return this.poids; }
	public void setPoids(double poids){ this.poids = poids; }

	public double getVolume(){ return this.volume; }
	public void setVolume(double volume){ this.volume = volume; }


	public String toString(){
		return "Marchandise No."+this.numero+" Poids : "+this.poids+" Kg"+", Volume : "+this.volume+" m^3";
	}
}