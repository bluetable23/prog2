package Computer;

public class Notebook extends Computer{
	public int monitor;

	public Notebook(String hersteller, int ram, int platte,int monitor) {
		super(hersteller, ram, platte);
		this.monitor=monitor;
		// TODO Auto-generated constructor stub
	}
	
	@Override          
	public String toString()
	{return "("+hersteller+", " +ram+ ", "+platte+", "+monitor+")";}
	
	


}
