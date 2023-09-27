package dg;

import java.util.HashMap;
import java.util.Map;

public class PizzaMenu {
	

	
	public static boolean existingPizza(Map<String,Double> menu, String pizza) {
		
		if(menu.containsKey(pizza)) {
			return true;
		}
	return false;
	}
	
	public static void printPrice(Map<String,Double> menu, String pizza) {
		if(menu.containsKey(pizza)) {
		
		for(Map.Entry<String, Double> eintrag :menu.entrySet())
		{
			String b =eintrag.getKey();
			if(b.equals(pizza))
		    System.out.println( eintrag.getKey() + "  :  " + eintrag.getValue());
		}}
		
		if(!menu.containsKey(pizza))
		System.out.println("Oizza ncht da ");
		
	}

	public static void printMenu(Map<String,Double> menu) {
	
		if(menu.isEmpty()) {
			System.out.println("keine pizzen da");
		}
		
		else {
			System.out.print("Menu enthät "+ menu.size()+" Pizzen");
			for(Map.Entry<String, Double> eintrag : menu.entrySet())
			{
			    System.out.println( eintrag.getKey() + "             :  " + eintrag.getValue()+" Euro");
			}
		}
	}

	
	
	 public static void affordablePizza(Map<String,Double> menu, double maxPrice) {
		 for(Map.Entry<String, Double> eintrag : menu.entrySet())
			{
			 
			 double g =eintrag.getValue();
			 if(g<=maxPrice) {
				 System.out.println( eintrag.getKey() + "             :  " + eintrag.getValue()+" Euro");
			 }
			    
			}
	 }
	 
	 
	 
	public static void main(String[] args) {
		Map<String,Double> m = new HashMap<>();
		m.put("Margarita", 7.00);
		m.put("Veggie", 7.50);
		m.put("Salami", 8.50);
		m.put("Schinken", 8.50);
		
		m.put("Schinken", 8.20);
		
		
		printPrice(m,"Veggie");
		printPrice(m,"Vf");
		printMenu(m);
		affordablePizza(m,7.50);
		m.clear();
		m.put("Verde", 7.00);
		m.put("Hawaii", 8.20);
		m.put("Tradiz", 8.50);
		
		
		Map<String,Double> mcopy = new HashMap<>();
		mcopy.putAll(m);
		printMenu(mcopy);
		mcopy.remove("Hawaii");
		System.out.println("_______________________________________");
		printMenu(mcopy);
	}

}
