import java.util.*;
import java.text.*;

class Main {

	public static void main(String[] args) throws Exception{

	Medicament[] med = new Medicament[]{
		new Medicament("Dolipran",new SimpleDateFormat("dd/MM/yyyy").parse("15/12/2018"),18),
		new Medicament("Aspirine",new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2018"),25.30),
		new Medicament("Spasfone",new SimpleDateFormat("dd/MM/yyyy").parse("02/03/2020"),40.25),
		new Medicament("Zucam"	 ,new SimpleDateFormat("dd/MM/yyyy").parse("09/07/2021"),45.60)
	};
	System.out.println("Medicament expire :");
	for(Medicament m : med){
		if(m.isExpired())
			System.out.println(m);
	}
	Medicament[] med2 = new Medicament[]{
		med[0],
		med[2],
		med[3]
	};
	Commande c = new Commande(med2,new Date());
	System.out.println("Prix total HT de cette commande est : "+c.getTotalHT()+" Dhs");
	System.out.println("Prix total TTC de cette commande est : "+c.getTotalTTC()+" Dhs");
	System.out.println("Facture de cette commande apres une remise de 5% est :");
	c.afficherFacture(5);

}


}