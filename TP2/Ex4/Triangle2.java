public class Triangle2{

	private Point a;
	private Point b;
	private Point c;

	public Triangle2(){
		this.a = new Point();
		this.b = new Point();
		this.c = new Point();
	}	

	public Triangle2(Point a,Point b , Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getAB(Point a , Point b){
		double ab;
		ab = Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
		return ab;		
	}	
	public double getAC(Point a , Point c){
		double ac;
		ac = Math.sqrt(Math.pow(a.getX()-c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
		return ac;		
	}	
	public double getBC(Point b , Point c){
		double bc;
		bc = Math.sqrt(Math.pow(b.getX()-c.getX(),2)+Math.pow(b.getY()-c.getY(),2));
		return bc;		
	}



	public double getPerimetre(){
		return getAB(a,b) + getAC(a,c) + getBC(b,c); 
	}

	public double getSurface(){
		double p = getPerimetre()/2;
		return Math.sqrt(p*(p-getAB(a,b))*(p-getAC(a,c))*(p-getBC(b,c)));
	}

	public boolean isIsocele(){
		double ab = getAB(a,b); 
		double ac = getAC(a,c); 
		double bc = getBC(b,c); 

		if((ab==ac && ac!=bc) || ab==bc && ab!=ac || bc==ac && bc!=ab)
			return true;
		return false;
	}

	public String toString(){
		return "Triangle2 : "+a+" , "+b+" , "+c;
	}


}