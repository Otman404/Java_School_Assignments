public class Point{
	private int x;
	private int y;

	public Point(){
		this.x = 0;
		this.y = 0;
	}

	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){return this.x;}
	public void setX(int x){this.x = x;}
	public int getY(){return this.y;}
	public void setY(int y){this.y = y;}

	public String toString(){
		return "( "+x+" , "+y+" )";
	}
}