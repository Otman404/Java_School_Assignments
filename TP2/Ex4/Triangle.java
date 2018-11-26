public class Triangle{

	private Point a;
	private Point b;
	private Point c;

	public Triangle(){
		this.a = new Point();
		this.b = new Point();
		this.c = new Point();
	}	

	public Triangle(Point a,Point b , Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getAB(){
		double ab;
		ab = Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
		return ab;		
	}	
	public double getAC(){
		double ac;
		ac = Math.sqrt(Math.pow(a.getX()-c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
		return ac;		
	}	
	public double getBC(){
		double bc;
		bc = Math.sqrt(Math.pow(b.getX()-c.getX(),2)+Math.pow(b.getY()-c.getY(),2));
		return bc;		
	}



	public double getPerimetre(){
		return getAB() + getAC() + getBC(); 
	}

	public double getSurface(){
		double p = getPerimetre()/2;
		return Math.sqrt(p*(p-getAB())*(p-getAC())*(p-getBC()));
	}

	public boolean isIsocele(){
		double ab = getAB(); 
		double ac = getAC(); 
		double bc = getBC(); 

		if((ab==ac && ac!=bc) || ab==bc && ab!=ac || bc==ac && bc!=ab)
			return true;
		return false;
	}

	public String toString(){
		return "Triangle : "+a+" , "+b+" , "+c;
	}


}