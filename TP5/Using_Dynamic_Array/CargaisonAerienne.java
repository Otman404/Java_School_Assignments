class CargaisonAerienne extends Cargaison{

	public CargaisonAerienne(){
		super();
		n = 0; //Ce n nous aide a evitez d'avoir une case vite dans notre tableau de marchandise , voir Cargaison.java Ligne 32++
	}

	public CargaisonAerienne(double distance , Marchandise[] m){
		super(distance,m);
	}

	public CargaisonAerienne(CargaisonAerienne ca){
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
		if(getVolumeTotal() < 80000){
			return 10*this.getDistance()*this.getPoidsTotal();
		}else{
			return 12*this.getDistance()*this.getPoidsTotal();
		}
	}
}