import java.text.SimpleDateFormat;
import java.util.Date;

class Main{

	public static void main(String[] args) {
		try{
		Technicien tech1 = new Technicien("Khalid","Nouri",48,new SimpleDateFormat("yyyy/MM/dd").parse("1998/01/12"),100,10);
		System.out.println("\n--"+tech1+"\n");
		Technicien tech2 = new Technicien("Amira","Chihab",30,new SimpleDateFormat("yyyy/MM/dd").parse("2008/11/01"),120,2);
		System.out.println("--"+tech2+"\n");
		Ingenieur ing1 = new Ingenieur("Karima","Alaoui",32,new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/30"),'c',4,1500);
		System.out.println("--"+ing1+"\n");
		Ingenieur ing2 = new Ingenieur("Fatima","Alami",25,new SimpleDateFormat("yyyy/MM/dd").parse("2017/01/01"),'A',0,500);
		System.out.println("--"+ing2+"\n");
		Ingenieur ing3 = new Ingenieur("Ilyas","Fahim",50,new SimpleDateFormat("yyyy/MM/dd").parse("1990/06/15"),'B',0,0);
		System.out.println("--"+ing3+"\n");
		ChefService chefSer = new ChefService("Mohammed","Fikri",50,new SimpleDateFormat("yyyy/MM/dd").parse("1991/08/15"),new Service("Service Commercial",2000000));
		System.out.println("--"+chefSer+"\n");
		}catch(Exception e){}


	}



}
