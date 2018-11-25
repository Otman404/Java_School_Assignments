class Point extends Forme{

	protected int x;
	protected int y;

	public Point(){
		this.x = 0;
		this.y = 0;
	}
	public Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	@Override
	public int cal_aire(){
		return 0;
	}
	@Override
	public int cal_vol(){
		return 0;
	}
	@Override
	public void afficher(){
		System.out.println("("+this.x+" , "+this.y+")");
	}
}