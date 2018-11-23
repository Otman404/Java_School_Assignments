public class Age {
	
	private int age;

	public Age(){
	}
	public Age(int age){
		this.age = age;
	}

	public int getAge(){return this.age;}	
	public void setAge(int age){this.age = age;}
 	
 	public String getCategorie(){
 		if(age >=6 && age <=7)
 		return "Poussin";
 		if(age >=8 && age <=9)
 		return "Pupille";
 		if(age >=10 && age <=11)
 		return "Minime";
 		if(age >=12)
 		return "Cadet";
 	else
 		return "Pas de categorie pour l'age saisis";
 	}
	
}