package übung6;
import java.util.*;
public class Übung6 {
	
	public static List<String> createArrayList(String[] words){
		List<String> list1 = new ArrayList<>();
		 for (int i = 0; i < words.length; i++) 
	        { 
	            list1.add(words[i]); 
	        }
		return list1;
	}

	public static void printList(List<String> list1) {
		for(String element : list1)
	        {
	            System.out.println(element + " ");
	        }
	        System.out.println();
	        System.out.println("End of list");
	}
	
	
	public static Set<String> createHashSet(String[] words){
		Set <String> set = new HashSet<>();
		for (int i = 0; i < words.length; i++) 
        { 
            set.add(words[i]); 
        }
	return set;
}
	public static void printSet(Set<String> set) {
		for(String element : set)
        {
            System.out.println(element + " ");
        }
        System.out.println();
        System.out.println("End of list");
}
	
	public static Set<String> createTreeSet(String[] words){
		Set <String> Treese = new TreeSet<>();
		for (int i = 0; i < words.length; i++) 
        { 
            Treese.add(words[i]); 
        }
	return Treese;
	}
	
	public static void main(String[] args) {
		
		String[] words = {"Linux", "Apple", "Facebook", "Amazon", "IBM", "Lenovo", "Google", "IBM", "Microsoft", "Apple", "Google", "Twitter", "Skype", "Chrome", "Linux", "Firefox"};

		 List<String> list1 = new ArrayList<>();
	       list1= createArrayList(words);
	        printList(list1);
	        
	System.out.println( list1.indexOf("Apple"));
	System.out.println( list1.lastIndexOf("Apple"));  	
	System.out.println( list1.get(0));  
	System.out.println( list1.get(list1.size()-1));
	System.out.println( list1.remove("Facebook"));
    printList(list1);
    
    Set <String> set  = new HashSet<>();
    set =createHashSet(words);
    printSet(set);
    
    Set <String> Treese  = new TreeSet<>();
   Treese= createTreeSet(words);
   printSet(Treese);
	}
	
}
