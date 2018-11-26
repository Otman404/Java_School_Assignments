public class Cercle{

private Point centre;
private double rayon; 

public Cercle(){
	this.centre = new Point();
	this.rayon = 0;
}
public Cercle(Point centre,Point p){
	this.centre = centre;
	this.rayon = Math.sqrt(Math.pow((centre.getX() - p.getX()),2) + Math.pow((centre.getY() - p.getY()),2));
}
public Cercle(Point centre,int rayon){
	this.centre = centre;
	this.rayon = rayon;
}

public Point getCentre(){ return this.centre;}
public void setCentre(Point centre){ centre = centre ;}

public double getR(){ return this.rayon;}
public void setR(double rayon){ this.rayon = rayon;}

public double getPerimetre(){

	return 2*rayon*Math.PI;
}

public double getSurface(){
	return rayon*rayon*Math.PI;
}
public double distanceCentrePoint(Point p2){
	return Math.sqrt(Math.pow((centre.getX() - p2.getX()),2) + Math.pow((centre.getY() - p2.getY()),2));
}
public boolean appartient(Point p){
	if(distanceCentrePoint(p) > rayon)
		return false;
	return true;
}

public String toString(){
	return "CERCLE ( centre "+centre+" , "+ rayon + " )" ;
}


}