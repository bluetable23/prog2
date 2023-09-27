package punkt3D;

import java.util.Random;

public class PunkteArray {
private Punkt2D []punkte;
	
	public PunkteArray(int anzahl) {
		this.punkte = new Punkt2D [anzahl];
	}
	
	public boolean contains(Punkt2D p) {
		for(int index=0;index<punkte.length;index++) {
			if(this.punkte[index] != null&&punkte[index].equals(p)==true) {
				return true;
			}
		}
		return false;
	}
	
	public void fillArray() {
		
		Random r = new Random();
		for(int index=0;index<punkte.length;index++) {
		
		int bound = (9 - 0) + 0;  // +0
		int x= r.nextInt(bound) + 0;
		int y= r.nextInt(bound) + 0;
		
		Punkt2D m= new Punkt2D(x,y);
	    if (contains(m)==false) {
	    	punkte[index]= punkte[index]= new Punkt2D(x,y);;
	    }
	    else {
	    	index--;
	    }
		
		}}
	

/////////////////////////String Array Print
@Override
public String toString()
{
String s = "[ ";
for(int i=0; i<this.punkte.length; i++)
{
if(i<this.punkte.length-1)
{
s += this.punkte[i].toString()+", ";
}
else
{
s += this.punkte[i].toString();
}
}
s += " ]";
return s;
}

public void print()
{System.out.println(this.toString());}

public Strecke [] createPolygon() {
	Strecke[] s= new Strecke [punkte.length];
	
	for(int index=1;index<s.length-1;index++) {
		s[index]=new Strecke(punkte[index],punkte[index+1]);
	}
	s[0]=new Strecke(punkte[0],punkte[punkte.length-1]);
	s[s.length-1]=new Strecke(punkte[0],punkte[punkte.length-1]);
	return s;
}

public double gesamtLaenge() {
	Strecke [] b = createPolygon();
double s=0;
	for(int index=0;index<b.length;index++) {
		s=s+b[index].laenge();
	}
	return s;
}


public Punkt2D amWeitestenLinks()
{
    int indexLinks = 0;
    for(int index=0; index < this.punkte.length-1; index++)
    {
        if(this.punkte[index].xIsSmaller(this.punkte[indexLinks]))
        {
            indexLinks = index;
        }
    }
    return this.punkte[indexLinks];
}

public Punkt2D amWeitestenOben() {
	Punkt2D oben = new Punkt2D(1,1);
	for(int index=0;index<punkte.length;index++) {
		for(int b=0;b<punkte.length;b++) {
		if(punkte[index].yIsSmaller(punkte[b])){
			oben = punkte[index];	
		}
}}
	return oben;
}

public Strecke laengsteStrecke() {
	Strecke [] b = createPolygon();
	Strecke grlaenge= new Strecke (1,1,1,1);
	for(int index=0;index<b.length-1;index++) {
		if(b[index].laenge()<b[index+1].laenge()) {
			grlaenge=b[index+1];
		}
	
}
	return grlaenge;
}	

public void printStrecken() {
	Strecke [] b=createPolygon();
	 for(int index=0;index<b.length;index++) {
		 b[index].print();
	 }
	 System.out.println("Gesamtlaenge der Strecken : "+gesamtLaenge());
	 System.out.println("am weitesten links        : "+amWeitestenLinks());
	 System.out.println("am weitesten oben       : "+amWeitestenOben());
	 System.out.println("laengste       : ");
	 laengsteStrecke().print();
}}
