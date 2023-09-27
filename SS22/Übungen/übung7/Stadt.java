package übung7;
import java.util.*;

public class Stadt {

	
	String name;
	List<Integer> bevoelkerung;
	float flaeche;
	
	public Stadt(String name, List<Integer> bevoelkerung, float flaeche) {
		this.name=name;
		this.bevoelkerung=bevoelkerung;
		this.flaeche=flaeche;
	}
	
	
	public void print() {
		
		String output = String.format(" %-16s  : %3.2f km", this.name, this.flaeche);
		System.out.print(output);

        Iterator<Integer> it = bevoelkerung.iterator();
        while(it.hasNext())
        {
            System.out.print("  "+it.next());
        }   }
		
        @Override
        public boolean equals(Object other)
        {
            if(other==null) return false;       
            if(this==other) return true;       
            if(this.getClass() != other.getClass()) return false;           

            Stadt otherV = (Stadt)other;
            return this.name.equals(otherV.name) &&  this.flaeche==otherV.flaeche;
	}
        
        @Override
        public int hashCode() {
        	return name.hashCode()+(int)flaeche;
        }
	public static void main(String[] args) {
		
	 List<Integer> b = new ArrayList <> ();
	 b.add(3382169);    
	 b.add(3460725);    
	 b.add(3574830);
	 
	 Stadt c = new Stadt("Koeln",b, 3534456f);
	 c.print();
	}

}
