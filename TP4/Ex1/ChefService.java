import java.text.SimpleDateFormat;
import java.util.*;
class ChefService extends Employe{

	private Service s;

	public ChefService(){
		super();
		this.s = new Service();
	}

	public ChefService(String nom , String prenom , int age , Date date_recrutement,Service s){
		super(nom ,prenom , age ,  date_recrutement);
		this.s = s;
	}

	public double calculSalaire(){
		return (this.s.getChiffreAffaire()*0.1 + 20000);
	}
	public String toString(){

		return "Chef de Service "+super.toString() + "Service Occupe "+s;
	}
}