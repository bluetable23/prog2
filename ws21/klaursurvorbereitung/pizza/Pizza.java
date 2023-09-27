package pizza;

public class Pizza {
private String name;
private float preis;

public Pizza (String name, float preis) {
	
	this.name=name;
	this.preis=preis;
}

public String getName()
{return this.name;}
public float getPreis()
{return this.preis;}

@Override                                                                                                                                                                 
public String toString()
{return "Die Pizza "+this.name+" kostet "+this.preis+"0 Euro. ";}

public void print()
{System.out.println(this.toString());}



@Override
public boolean equals(Object o)                                                                                                            
{if(o==null) return false;                                                                                                                 
if(this==o) return true;                                                                                                                             
if(this.getClass() != o.getClass()) return false;
Pizza otherV = (Pizza)o;
return this.name==otherV.name ;}






}
