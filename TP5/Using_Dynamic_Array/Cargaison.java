abstract class Cargaison{

	private double distance;
	private Marchandise[] m ;

	public Cargaison(){
		this.distance = 0;
		m = new Marchandise[1];
		m[0] = new Marchandise();
	}
	public Cargaison(double distance , Marchandise[] m){
		this.distance = distance;
		this.m = new Marchandise[m.length];
		for(int i = 0 ; i<m.length ; i++)
			this.m[i] = new Marchandise(m[i]);
	}
	public Cargaison(Cargaison c){
		setDistance(c.getDistance());
		setMarchandise(c.getMarchandise());
	}

	public double getDistance(){ return this.distance; }
	public void setDistance(double distance){ this.distance = distance; }

	public Marchandise[] getMarchandise(){
		return this.m;
	}
	public Marchandise getMarchandiseParIndice(int i){ return this.m[i];}
	public void setMarchandise(Marchandise[] m){
		for (int i = 0;i<this.m.length ;i++ ) {
			this.m[i] = new Marchandise(m[i]);
		}
	}
    static int n = 0;
	public void ajouterMarchandise(Marchandise m){
		if(n == 0){
			this.m[0] = new Marchandise(m);
			n++;
		}
		else{
		Marchandise [] m2 = new Marchandise[this.m.length+1];

		for (int i = 0 ;i<this.m.length ;i++ ) {
		 	m2[i] = this.m[i];
		 }
		 m2[this.m.length] = new Marchandise(m);
		 this.m = m2;
		}
	}

	public void afficherMarchandises(){
		for(Marchandise mm : this.m)
			System.out.println(mm);
	}

	public Marchandise getMarchandiseParNumero(int num){
		for(Marchandise mm : this.m){
			if(mm.getNum() == num)
				return mm;
		}
		return null;
	}

	abstract public double cout();

}