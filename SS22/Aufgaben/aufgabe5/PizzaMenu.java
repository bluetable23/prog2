package aufgabe5;
import java.util.*;
public class PizzaMenu {

	
	
	public static boolean existingPizza(Map<String,Double> menu, String pizza) {
		

	
		      if(menu.containsKey(pizza)==true) {
		    	  return true;
		      }
		      return false;}

	public static void printPrice(Map<String,Double> menu, String pizza) {
		if (existingPizza(menu,pizza)==false) {
			System.out.println(pizza+": Diese Pizza gibt es nicht");
		}
		else {
			System.out.println(pizza+" : "+menu.get(pizza));	
		}
	}

	public static void printMenu(Map<String,Double> menu) {
		System.out.println("Das Menu enthält "+menu.size()+ " Pizzen"); 
		for(Map.Entry<String, Double> eintrag : menu.entrySet())
		{
			String output = String.format(" Pizza %-13s  : %3.2f Euro", eintrag.getKey(), eintrag.getValue());
			System.out.println(output);
		   
		}
	}
	
	
	public static void affordablePizza(Map<String,Double> menu, double maxPrice) {
		 System.out.println("Eingegebener Betrag: "+maxPrice);
	
		 
		 
for(Map.Entry<String, Double> eintrag : menu.entrySet())
{
	
	
	if( eintrag.getValue()<maxPrice) {
		 System.out.println( eintrag.getKey()  );}
	
}
	}
    
	public static void main(String[] args) {
		long a = 1000;
		Integer b = 1000;       
		Integer c = 1000;       
		System.out.println(a == b);
		System.out.println(a == c); /// nur im vergleich mit long true
		
		 Map<String,Double> pa = new HashMap<>();
		    pa.put("Margherita", 7.00);     
		    pa.put("Veggie", 7.50);  
		    pa.put("Salami", 8.50); 
		    pa.put("Schinken", 8.50);   
		    pa.put("Schinken", 8.20); 
		    
		    pa.clear();
		    pa.put("Verde",7.00); 
		    pa.put("Hawaii", 8.20);   
		    pa.put("Tradizionale", 8.50); 
		    
		    Map<String,Double> pacopy = new HashMap<>();
		    
		  System.out.println(  existingPizza(pa,"ggggSalami"));
	      printMenu(pa);
		  
	      affordablePizza(pa,8.00);
	    
	  	pacopy.putAll(pa);
	  	
	  	pacopy.remove("Hawaii");
	  	printMenu(pacopy);		  
		    

			

			  
				  
				  
				  
				  
 
			  
}

}