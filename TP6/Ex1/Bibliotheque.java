class Bibliotheque{

	private int capacite;
	private Document[] docs;

	public Bibliotheque(){
		this.capacite = 0;
		this.docs = new Document[1];
		this.docs[0] = new Document();
	}
	public Bibliotheque(int capacite , Document[] docs){
		this.capacite = capacite;
		this.docs = new Document[docs.length];
		for (int i = 0;i<this.docs.length ;i++ ) {
			if(docs[i] instanceof Livre)
			this.docs[i] = new Livre((Livre)docs[i]);
			else if(docs[i] instanceof Dictionnaire)
			this.docs[i] = new Dictionnaire((Dictionnaire)docs[i]);
			else
			this.docs[i] = new Document(docs[i]);
		}
	}
	public Bibliotheque(Bibliotheque b){
		this.setCapacite(b.getCapacite());
		this.docs = new Document[b.getLength()];
		for(int i = 0;i<this.docs.length; i++){
			if(b.getDocumentParIndice(i) instanceof Livre)
				this.docs[i] = new Livre((Livre)b.getDocumentParIndice(i));
			else if(b.getDocumentParIndice(i) instanceof Dictionnaire)
				this.docs[i] = new Dictionnaire((Dictionnaire)b.getDocumentParIndice(i));
			else
			this.docs[i] = new Document(b.getDocumentParIndice(i));
		}
	}


	public int getCapacite(){ return this.capacite; }
	public void setCapacite(int capacite){ this.capacite = capacite; }
	public int getLength(){ return this.docs.length; }
	public Document getDocumentParIndice(int i ){ return this.docs[i]; }

	public void ListerDocuments(){
		System.out.println("Dans la Bibliotheque, il existe :");
		for(Document d : docs){
			if(d instanceof Livre)
				System.out.println(((Livre)d).toString());
			else if(d instanceof Dictionnaire)
				System.out.println(((Dictionnaire)d).toString());
			else
				System.out.println(d);
		}	
	}

	public boolean ajouter(Document doc){
		Document[] docs2 = new Document[this.getLength()+1];
		for (int i =0;i<this.getLength() ;i++ ) {
			if(this.getDocumentParIndice(i) instanceof Livre)
			docs2[i] = new Livre((Livre)this.getDocumentParIndice(i));
		else if(this.getDocumentParIndice(i) instanceof Dictionnaire)
			docs2[i] = new Dictionnaire((Dictionnaire)this.getDocumentParIndice(i));
			else
			docs2[i] = new Document(this.getDocumentParIndice(i));
		}
		if(doc instanceof Livre)
		docs2[this.getLength()] = new Livre((Livre)doc);
		else if(doc instanceof Dictionnaire)
		docs2[this.getLength()] = new Dictionnaire((Dictionnaire)doc);
		else
		docs2[this.getLength()] = new Document(doc);
		docs = docs2;
		if(this.getDocumentParIndice(this.getLength() - 1).equals(docs))
		//if(this.getDocumentParIndice(this.getLength() - 1).getNum() == doc.getNum())
		return true;
		return false;
	}

	public boolean supprimer(Document doc){
		boolean n=false;
		int j = 0;
		Document[] docs2 = new Document[this.getLength()-1];
		for (int i=0;i<this.getLength()  ;i++ ) {
			/*if(this.getDocumentParIndice(i).equals(doc)){
				continue;
			}*/
			if(this.getDocumentParIndice(i).getNum() == doc.getNum())
				continue;
			else{
				if(this.getDocumentParIndice(i) instanceof Livre)
				docs2[j] = new Livre((Livre)this.getDocumentParIndice(i));
				else if(this.getDocumentParIndice(i) instanceof Dictionnaire)
				docs2[j] = new Dictionnaire((Dictionnaire)this.getDocumentParIndice(i));
				else
				docs2[j] = new Document(this.getDocumentParIndice(i));
				j++;
				n = true;
			}
		}
		this.docs = docs2;
		if(n)
			return true;
		return false;
	}

	public void afficherAuteur(){
		System.out.println("Les auteurs :");
		for (Document d : docs) {
			if(d instanceof Livre)
				System.out.println(((Livre)d).getAuteur());
		}
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Bibliotheque de capacite : "+this.getCapacite()+" Contenant les documents : \n");
		for(Document d : docs){
			if(d instanceof Livre)
				sb.append("\n"+((Livre)d).toString());
			else if(d instanceof Dictionnaire)
				sb.append("\n"+((Dictionnaire)d).toString());
			else
				sb.append("\n"+d.toString());
		}	
		String s = new String(sb.toString());
		return s;
	}
}