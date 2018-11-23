import java.text.SimpleDateFormat;
import java.util.Date;

class Main{

	public static void main(String[] args) throws Exception{

	    Medicament[] m = new Medicament[4];
	    m[0] = new Medicament("Dolipran",new SimpleDateFormat("dd/MM/yyyy").parse("15/12/2018"),18);
	    m[1] = new Medicament("Aspirine",new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2018"),18);
	    m[2] = new Medicament("Spasfone",new SimpleDateFormat("dd/MM/yyyy").parse("02/03/2020"),18);
	    m[3] = new Medicament("Zucam   ",new SimpleDateFormat("dd/MM/yyyy").parse("09/07/2021"),18);
	    Commande c = new Commande(m,new Date());
	    c.afficherFacture(0);

	    System.out.println("Les Medicaments expires : ");
	     for(Medicament med : m){
	     	if(med.isExpired())
	     		System.out.println(med);
	     }
	     System.out.println("\n\n=========================================");
	   	Medicament[] m2 = new Medicament[3];
	   	m2[0] = m[0];
	   	m2[1] = m[2];
	   	m2[2] = m[3];
	   	Commande client = new Commande(m2,new Date());
	   	System.out.println("\n\nCommande du client :");
	   	System.out.println("Prix Total HT : "+client.getTotalHT());
	   	System.out.println("Prix TTC : "+client.getTotalTTC());
	   	client.afficherFacture(5);
	}
}