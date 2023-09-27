package annaLabchirKlasur;
import java.util.Random;
public class Buch {

	private String titel;
	private int seiten;
	private int jahr;
	
	public Buch (String titel,int seiten,int jahr) {
		this.titel=titel;
		this.seiten=seiten;
		this.jahr=jahr;
	}
	public Buch () {
		Random r = new Random();
		int bound = (2021- 1999) + 1;  
		int randomNumber = r.nextInt(bound) + 1999;
	this.jahr=randomNumber;
	
	int bound2 = (180-20) + 1; 
	int randomNumber2 = r.nextInt(bound2) + 20;
	
	this.seiten=randomNumber2;
	int bound3 = (91-65) + 1; 
	int randomNumber3 = r.nextInt(bound3) + 65;
	 
	char character = (char) randomNumber3;
	
	this.titel= "Titel "+ character;}
	
/////Getter
public int getJahr()
{return this.jahr;}

///Vergleich mit anderem objekt
public boolean istDicker (Buch b)
{return (this.seiten > b.seiten);}

@Override
public String toString() {
String output = String.format("%10s :  %3d Seiten , von  %4d ",this.titel, this.seiten,this.jahr);

return output;}

public void print() {
System.out.println(toString());}

///////Equals
@Override
public boolean equals(Object o)  
{if(o==null) return false;  
if(this==o) return true;                                                                                                      
if(this.getClass() != o.getClass()) return false;
Buch otherV = (Buch)o;
return this.titel.equals(otherV.titel);}     


}
