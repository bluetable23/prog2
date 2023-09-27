package punkt3D;

public class Strecke {
private Punkt2D start;
private Punkt2D ende;

public Strecke(Punkt2D start, Punkt2D ende) {
	this.start=start;
	this.ende=ende;
}


public Strecke(int x1, int y1, int x2, int y2) {
	this.start= new Punkt2D(x1,y1);
	this.ende=new Punkt2D(x2,y2);
	
}



 public double laenge() {
 int xDiff=(ende.getx()-start.getx())*(ende.getx()-start.getx());
 int yDiff=(ende.gety()-start.gety())*(ende.gety()-start.gety());
 double laenge = xDiff+yDiff;
 laenge= Math.sqrt(laenge);
 return laenge;
}

/////toString
      

@Override

public String toString()
{
    String s = String.format("Strecke [start=%s, ende=%s, Laenge=%7.4fcm]", start.toString(), ende.toString(), this.laenge());
    return s;
}

///print
public void print()
{System.out.println(this.toString());}

 
 
 
}