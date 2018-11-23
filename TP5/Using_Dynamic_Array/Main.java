class Main{

	public static void main(String[] args) {
		CargaisonRoutiere cr = new CargaisonRoutiere();
		cr.setDistance(30000);
		cr.ajouterMarchandise(new Marchandise(1,200,300));
		cr.ajouterMarchandise(new Marchandise(2,500,470));
		cr.ajouterMarchandise(new Marchandise(3,600,530));
		cr.afficherMarchandises();
		System.out.println("Cout (Routiere): "+cr.cout());
		CargaisonAerienne ca = new CargaisonAerienne();
		ca.setDistance(200000);
		ca.ajouterMarchandise(new Marchandise(1,800,340));
		ca.ajouterMarchandise(new Marchandise(2,670,540));
		ca.afficherMarchandises();
		System.out.println("Cout (Aerienne): "+ca.cout());
	}
}