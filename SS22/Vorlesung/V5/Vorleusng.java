package V5;

import java.util.*;


public class Vorleusng {

	
	public static void main (String [] args) {
		List l1 = new ArrayList();
		
		List l2 = new LinkedList();
		
		Set set1 = new HashSet();
		Set set2 = new TreeSet();
		
		
		String str1 = "erster";
	    String str2="zweiter";
	    String str3 = "dritter";
	    String str4 = "zweiter";
	    System.out.println( set1.isEmpty());
	    System.out.println( set1.add(str1));   ////gitb true aus weil string hinzugefügt wird
	 
	    set1.add(str2);
	    set1.add(str3);
	    set1.add(str4);
	    System.out.println( set1.add(str4)); // gibt falsch aus weil strinf bereits enthalten ist
	    System.out.println(set1.contains("erster"));
	    
	    
	    System.out.println("Laenge von set1 : " + set1.size());
	 //   set1.add(new Random());
	    
	    set2.add(3);
	    set1.add(Integer.toString(1));
	    
	    for(String element : set1) {
	    	System.out.println(element);
	    }

	    Iterator<String> it = set1.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	}
	
	
}
