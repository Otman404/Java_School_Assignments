class CargaisonRoutiere extends Cargaison{

	public CargaisonRoutiere(){
		super();
		n = 0; //Ce n nous aide a evitez d'avoir une case vide dans notre tableau de marchandise , voir Cargaison.java Ligne 32++
	}

	public CargaisonRoutiere(double distance , Marchandise[] m){
		super(distance,m);
	}

	public CargaisonRoutiere(CargaisonRoutiere ca){
		super(ca);
	}

	public double getPoidsTotal(){
		double poids = 0;
		for (int i = 0 ;i<getMarchandise().length ;i++ ) {
			poids += getMarchandiseParIndice(i).getPoids();
		}
		return poids;
	}
	public double getVolumeTotal(){
		double volume = 0 ;
		for (int i = 0;i<getMarchandise().length ;i++ ) {
			volume += getMarchandiseParIndice(i).getVolume();
		}
		return volume;
	}

	public double cout(){
		if(getVolumeTotal() < 380000){
			return 4*this.getDistance()*this.getPoidsTotal();
		}else{
			return 6*this.getDistance()*this.getPoidsTotal();
		}
	}




}