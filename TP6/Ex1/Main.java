class Main{

	public static void main(String[] args) {
		Document[] d = new Document[]{
			new Document(1,"Titre1"),
			new Document(2,"Titre2"),
			new Document(3,"Titre3"),
			new Document(4,"Titre4"),
			new Document(5,"Titre5"),
			new Livre("Auteur1",120,6,"TitreLivre1"),
			new Dictionnaire("English",2,7,"TitreDictionnaire1")
		};

		Bibliotheque b = new Bibliotheque(50,d);
		b.ListerDocuments();
		b.ajouter(new Livre("Auteur2",300,7,"TitreLivre2"));
		b.ajouter(new Dictionnaire("Frensh",1,8,"TitreDictionnaire2"));
		b.afficherAuteur();
		b.supprimer(d[2]);
		System.out.println("\n\nLister Documents apres supprimer le Troisieme Document :\n\n");
		b.ListerDocuments();
	}
}