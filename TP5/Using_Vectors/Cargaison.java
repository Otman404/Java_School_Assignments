import java.util.*;
abstract class Cargaison{

	private double distanceParcours;
	protected Vector<Marchandise> v = new Vector<Marchandise>();

	public Cargaison(){
		this.distanceParcours = 0;
		this.v = new Vector<Marchandise>();
	}

	public Cargaison(double distanceParcours , Vector<Marchandise> v){
		this.distanceParcours = distanceParcours;
		this.v = v;
	}

	public double getDistance(){ return this.distanceParcours; }
	public void setDistance(double distanceParcours){ this.distanceParcours = distanceParcours;}

	public void ajouterMarchandise(Marchandise m){
		v.add(m);
	}

	public void afficherMarchandises(){
		for(int i = 0;i<v.size();i++)
			System.out.println(v.get(i));
	}

	abstract public double cout();

	public Marchandise getMarchandise(int i){
		return v.get(i);
	}
}