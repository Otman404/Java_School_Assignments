class Dictionnaire extends Document{

	private String langue;
	private int nbrTome;

	public Dictionnaire(){
		super();
		this.langue = new String();
		this.nbrTome = 0;
	}
	public Dictionnaire(String langue , int nbrTome , int num , String titre){
		super(num,titre);
		this.langue = new String(langue);
		this.nbrTome = nbrTome;
	}
	public Dictionnaire(Dictionnaire d){
		super(d);
		setlangue(d.getlangue());
		setNbrTome(d.getNbrTome());
	}

	public String getlangue(){ return this.langue; }
	public void setlangue(String langue){ this.langue = new String(langue); }
	public int getNbrTome(){ return  this.nbrTome; }
	public void setNbrTome(int nbrTome){ this.nbrTome = nbrTome; }


	public String toString(){
		return "*Dictionnaire de langue "+this.getlangue()+" et "+this.getNbrTome()+" Nombres de Tomes appartient a : "+super.toString();
	}
}