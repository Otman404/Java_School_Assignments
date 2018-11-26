public class Main {
		
	public static void main(String[] args){

		Age age = new Age(Integer.parseInt(args[0]));
		
		System.out.println("Categorie pour "+age.getAge()+" ans : "+age.getCategorie());
	}	
}