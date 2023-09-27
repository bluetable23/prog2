package land;
import java.util.Random;
public class Land {
	 
	private String name;
	private int groesse;
	private int einwohner;
	
	public String getName()
	{return name;}
	public int getGroesse()
	{return groesse;}
	public int getEinwohner()
	{return einwohner;}
 
	public String erzeugeName() {
	 Random r = new Random();
	 int bound = (90- 65) + 1;  // +1 wegen toInclusive soll auch
	 int randomBuchstabe= r.nextInt(bound) + 65;
	char x;
	 x=(char)randomBuchstabe;

	bound = (9- 0) + 1; 
	int randomZahl=r.nextInt(bound)+0;
	
	String b=x+String.valueOf(randomZahl);
	 
	 
return b;

 }
 
 public Land () {
	 this.name=erzeugeName();
	 Random r = new Random();
	 int bound = (100- 0) + 1;  // +1 wegen toInclusive soll auch
	 int randomZ1= r.nextInt(bound) + 0;
	 this.groesse=randomZ1;
	 int bound2 = (1000- 0) + 1;  // +1 wegen toInclusive soll auch
	 int randomZ2= r.nextInt(bound2) + 0;
	 this.einwohner=randomZ2;
 }
 
 public double ewDichte() {
	double b=(double)einwohner;
	double c=(double)groesse;
	 double  dichte=b/c;
	 return dichte;
 }
 @Override
 public String toString() {
String output = String.format("%2s :  %3d km2 : %3d ew : %f",name, groesse, einwohner,ewDichte());
return output;
}
 public void print()
 {System.out.println(this.toString());}


///Vergleich mit anderem objekt
public boolean istGroesse (Land land)
{return (this.groesse > land.groesse);}
public boolean hatMehrEinwohner (Land land)
{return (this.einwohner > land.einwohner);}
public boolean nameIstGroesser (Land land)
{return (this.name.compareTo(land.name)>1);} 

@Override
public boolean equals(Object o)             
{if(o==null) return false;          
if(this==o) return true;                                                                                                                         
if(this.getClass() != o.getClass()) return false;
Land otherV = (Land)o;
return this.name.equals(otherV.name);}


}
