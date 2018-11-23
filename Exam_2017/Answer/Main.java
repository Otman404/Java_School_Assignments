class Main{

	public static void main(String[] args){

		Point p = new Point(3,6);
		Figure[] f = new Figure[]{
			new Cercle(2,3,4),
			new Rectangle(p,100,111)
		};

		/*for (int i = 0 ;i<f.length ;i++ ) {
			f[i].affiche();
		}*/

		for(Figure ff : f)
			ff.affiche();
		System.out.println("*******");
		CollectionFigure cf = new CollectionFigure(f);
		cf.listerFigures();
	}



}