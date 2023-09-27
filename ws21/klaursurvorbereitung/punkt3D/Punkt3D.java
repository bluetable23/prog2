package punkt3D;

public class Punkt3D {

	private int x;
	private int y;
	private int z;
	
	public Punkt3D(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public int getx()
	{return x;}
	public int gety()
	{return y;}
	public int getz()
	{return z;}
	
	@Override            
	public String toString()
	{return "(" + this.getx() + ", " + this.gety()+", "+this.getz()+")";}
	///print
	public void print()
	{System.out.println(this.toString());}

	public boolean equals(Object o)    
	{if(o==null) return false;             
	if(this==o) return true;                                                
	if(this.getClass() != o.getClass()) return false;
	Punkt3D otherP = (Punkt3D)o;
	return this.x==otherP.x && this.y==otherP.y && this.z==otherP.z;}
	
	public boolean xIsSmaller (Punkt3D p)
	{return (this.x < p.x);}

	public boolean yIsSmaller(Punkt3D p)
	{return (this.y <p.y);}

	public boolean zIsSmaller (Punkt3D p)
	{return (this.z < p.z);}
	



}
