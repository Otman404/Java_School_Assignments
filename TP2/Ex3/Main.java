public class Main{

public static void main(String[] args) {
	
	Rectangle R = new Rectangle(20,20);
	Rectangle R2 = new Rectangle(20,30);
	System.out.println("Rectangle 1 : ");
	System.out.println(R);
	System.out.println("Perimetre : "+R.getPerimetre());
	System.out.println("Carre ?  "+R.isCarre());

	System.out.println("Rectangle 2 : ");
	System.out.println(R2);
	System.out.println("Perimetre : "+R2.getPerimetre());
	System.out.println("Carre ?  "+R2.isCarre());


}

}