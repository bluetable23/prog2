package Computer;

public class Computer {
	public String hersteller;
	public int ram;
	public int platte;
	
	public Computer(String hersteller, int ram, int platte) {
		this.hersteller=hersteller;
		this.ram=ram;
		this.platte=platte;
	}

	public boolean gleicherHersteller(Computer c) {
		return (this.hersteller ==c.hersteller);
	}
	
	public boolean gleicherHersteller(String hersteller) {
		return this.hersteller==hersteller;}
	
	@Override                                                    
	public String toString()
	{return String.format("%s mit %d RAM und %d SSD", this.hersteller, this.ram,this.platte);}

	///print
	public void print()
	{System.out.println(this.toString());}

	
	
	}
