public class Main{

	public static void main(String[] args) {
		Point centre = new Point(50,50);
		Point centre2 = new Point(40,80);
		Point point = new Point(100,100);
		Cercle c = new Cercle(centre,point);
		Cercle c2 = new Cercle(centre2,20);
		System.out.println("Perimetre du 1er cercle : " + c.getPerimetre() + " Rayon : "+c.getR());
		System.out.println(c);

		Point p2 = new Point(20,40);
		if(c.appartient(p2) && c2.appartient(p2))
			System.out.println("Le point " +p2+" appartient a l'intersection des deux cercles .");
		else
			System.out.println("Le point " +p2+" n'appartient pas à l'intersection des deux cercles .");

	}
}