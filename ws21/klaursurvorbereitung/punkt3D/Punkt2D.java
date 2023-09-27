package punkt3D;

public class Punkt2D extends Punkt3D{

	public Punkt2D(int x, int y) {
		super(x, y, 0);
		// TODO Auto-generated constructor stub
	}

/////toString
@Override      
public String toString()
{return "(" + this.getx() + ", " + this.gety()+")";}


	
}
