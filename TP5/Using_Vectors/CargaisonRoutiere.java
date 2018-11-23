import java.util.*;

class CargaisonRoutiere extends Cargaison{


	public CargaisonRoutiere(){
		super();
	}
	public CargaisonRoutiere(double distanceParcours , Vector<Marchandise> v){
		super(distanceParcours , v);
	}

	public double getPoidsTotal(){
		double pt = 0;
		for(int i = 0;i<this.v.size();i++){
			pt = this.getMarchandise(i).getPoids();
		}
		return pt;
	}
	public double getVolumeTotal(){
		double vt = 0;
		for(int i = 0;i<this.v.size();i++){
			vt = this.getMarchandise(i).getVolume();
		}
		return vt;
	}
	
	public double cout(){
		if(this.getVolumeTotal()<38000){
			return (4*this.getDistance()*this.getPoidsTotal());
		}else{
			return (6*this.getDistance()*this.getPoidsTotal());
		}
	}

}