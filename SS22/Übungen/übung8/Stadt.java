package übung8;

import java.util.*;


public class Stadt implements Comparable<Stadt>
{
    String name;
    List<Integer> bevoelkerung;
    float flaeche;

    public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
    {
        super();
        this.name = name;
        this.bevoelkerung = bevoelkerung;
        this.flaeche = flaeche;
    }

    void print()
    {
        System.out.printf("%-15s %9.2f km2 ", name, flaeche);
        for(Integer i : bevoelkerung)
        {
            System.out.printf("%,12d", i);
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o)
    {
        if(o==null) return false;
        if(o==this) return true;
        if(this.getClass()!=o.getClass()) return false;

        Stadt other = (Stadt)o;
        return (this.name.equals(other.name));
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }




     
  

	/*@Override
	public int compareTo(Stadt o) {
		return (this.name.compareTo( o.name));  //normal
	}  */ 
	/*@Override
	public int compareTo(Stadt o) {
		return (o.name.compareTo( this.name)); //absgteigend
	}   */

	
	@Override
	public int compareTo(Stadt o) {
		
	  
	      int value = Float.compare(this.flaeche, o.flaeche);
	    return value;
	}
 
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

