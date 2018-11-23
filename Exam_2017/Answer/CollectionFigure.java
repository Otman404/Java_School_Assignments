class CollectionFigure{

	protected Figure[] f;
	public CollectionFigure(){
		this.f = new Figure[10];
	}
	public CollectionFigure(Figure[] f){
		this.f = new Figure[f.length];
		for (int i = 0;i<this.f.length ;i++ ) {
			if(f[i] instanceof Cercle)
				this.f[i] = new Cercle(((Cercle)f[i]).p.getX(),((Cercle)f[i]).p.getY(),((Cercle)f[i]).rayon);
			else if(f[i] instanceof Rectangle)
				this.f[i] = new Rectangle(((Rectangle)f[i]).p,((Rectangle)f[i]).largeur,((Rectangle)f[i]).hauteur);
		}
	}
	public CollectionFigure(CollectionFigure cf){
		this.f = new Figure[cf.f.length];
		for (int i = 0;i<this.f.length ;i++ ) {
			if(f[i] instanceof Cercle)
				this.f[i] = new Cercle(((Cercle)cf.f[i]).p.getX(),((Cercle)cf.f[i]).p.getY(),((Cercle)cf.f[i]).rayon);
			else if(f[i] instanceof Rectangle)
				this.f[i] = new Rectangle(((Rectangle)cf.f[i]).p,((Rectangle)cf.f[i]).largeur,((Rectangle)cf.f[i]).hauteur);
		}
	}

	public void listerFigures(){
		for(Figure ff : f){
			ff.affiche();
		}
	}


}