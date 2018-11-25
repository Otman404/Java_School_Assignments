class Main{

	public static void main(String[] main){
		Forme[] f = new Forme[]{
			new Point(3,5),
			new Cercle(8.5,10,15),
			new Cylindre(20,12.5,30,30)
		};
		System.out.println("Coordonnee de Point : ");
		f[0].afficher();
		System.out.println("Aire de point : ");
		System.out.println(f[0].cal_aire());
		System.out.println("Vol de point : ");
		System.out.println(f[0].cal_vol());

		System.out.println("Coordonnee de Cercle : ");
		f[1].afficher();
		System.out.println("Aire de point : ");
		System.out.println(f[1].cal_aire());

		System.out.println("Coordonnee de Cylindre : ");
		f[2].afficher();
		System.out.println("Aire de point : ");
		System.out.println(f[2].cal_aire());
		System.out.println("Vol de point : ");
		System.out.println(f[2].cal_vol());
	}


}