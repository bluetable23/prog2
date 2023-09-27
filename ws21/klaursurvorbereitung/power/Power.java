package power;

public class Power {
private int exp;
private int base;


public int getexp()
{return exp;}

public int getbase()
{return base;}

public Power(int base, int exp) {
	this.base=base;
	this.exp=exp;}

public double getValue() {
	 double ergebniss1=(double)base;
	 
	 
		double start=1;
	if(this.exp==0) {
	return 1;}
	
	if(this.exp>0)
	{
	for(int i =1;i<=exp;i++) {
		start=start*base;
		}
	return start;
	}
	
	if(this.exp<0) {
		this.exp=-1*exp;
		for(int i =1;i<=exp;i++) {
			start=start*base;}
		this.exp=-1*exp;
		return 1/start;
		}
	
	
	
	return start*-1;}

@Override                                                                           
public String toString()
{return "(" + this.base + "," + this.exp+")";}
///print
public void print()
{System.out.println(this.toString());
System.out.println(this.toString()+" = "+this.getValue()+"0");}




}
 
	

