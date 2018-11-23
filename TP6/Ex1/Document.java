class Document{

	private int num;
	private String titre;

	public Document(){
		this.num = 0;
		this.titre = new String();
	}
	public Document(int num , String titre){
		this.num = num;
		this.titre = new String(titre);
	}
	public Document(Document d){
		this.setNum(d.getNum());
		this.setTitre(d.getTitre());
	}

	public int getNum(){ return this.num; }
	public void setNum(int num){ this.num = num;}
	public String getTitre(){ return this.titre; }
	public void setTitre(String titre){ this.titre = new String(titre); }

	public boolean equals(Object o){
		if(!(o instanceof Document ))
			return false;
		Document someDoc = (Document)o;
		return (this.getNum() == someDoc.getNum())&&(this.getTitre() == someDoc.getTitre());
	}


	public String toString(){
		return "*Document No."+this.getNum()+" Titre : "+this.getTitre();
	}
}