import java.util.*;

class Main{

	public static void main(String[] args){

		//Cargason Routiere
		Marchandise m1 = new Marchandise(300,500);
		Marchandise m2 = new Marchandise(600,460);
		Marchandise m3 = new Marchandise(1300,800);
		Vector <Marchandise> v = new Vector<Marchandise>();
		CargaisonRoutiere cr = new CargaisonRoutiere(250,v);
		cr.ajouterMarchandise(m1);
		cr.ajouterMarchandise(m2);
		cr.ajouterMarchandise(m3);
		cr.afficherMarchandises();
		System.out.println("Le cout de cette Cargaison Routiere : "+cr.cout()+"Dhs");
		// Cargaison Aerienne
		System.out.println();
		Vector <Marchandise> v2 = new Vector<Marchandise>();
		CargaisonAerienne ca = new CargaisonAerienne(300,v2);
		ca.ajouterMarchandise(new Marchandise(100,170)); 
		ca.ajouterMarchandise(new Marchandise(430,230));
		ca.afficherMarchandises();
		System.out.println("Le cout de cette Cargaison Aerienne : "+ca.cout()+"Dhs");
	}

}