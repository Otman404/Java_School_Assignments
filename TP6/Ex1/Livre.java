class Livre extends Document{

	private String auteur;
	private int nbrPage;

	public Livre(){
		super();
		this.auteur = new String();
		this.nbrPage = 0;
	}
	public Livre(String auteur , int nbrPage, int num , String titre){
		super(num,titre);
		this.auteur = new String(auteur);
		this.nbrPage = nbrPage;
	}
	public Livre(Livre d){
		super(d);
		setAuteur(d.getAuteur());
		setNbrPage(d.getNbrPage());
	}

	public String getAuteur(){ return this.auteur; }
	public void setAuteur(String auteur){ this.auteur = new String(auteur); }
	public int getNbrPage(){ return  this.nbrPage; }
	public void setNbrPage(int nbrPage){ this.nbrPage = nbrPage; }

	public String toString(){
		return "*Livre D auteur "+this.getAuteur()+" Avec "+this.getNbrPage()+" Nombres de pages appartient a : "+super.toString();
	}
}