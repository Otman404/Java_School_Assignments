public class Main {
	
	

	public static void main(String[] args){
		Point a = new Point(20,50);
		Point b = new Point(30,50);
		Point c = new Point(60,40);
		//Triangle t = new Triangle(a,b,c);
		Triangle2 t = new Triangle2(a,b,c);
		System.out.println(t);
		System.out.format("Perimetre : %.2f \n" , t.getPerimetre());
		System.out.format("Surface : %.2f \n" , t.getSurface());
		System.out.println("Isocele ? : "+t.isIsocele());
	}
}