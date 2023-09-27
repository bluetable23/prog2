package dg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Uebung6 {

	
	
	public static List<String> createArrayList(String[] words){

List<String> l = new ArrayList<String>();


for(int i=0;i<words.length;i++) {
	l.add(words[i]);
}

return l;

	}
	
	public static void printList(List<String> list) {
		 int anz=0;
		Iterator<String> it =list.iterator();   
	        while(it.hasNext())
	        {  anz++;
	            System.out.println(it.next());
	        }
	        
	
System.out.println("insgesamt "+anz+" Elemente");
	}
	
	
	
    
 public static int last (List<String> list, String n) {
	int letzesmal=0;
	 for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(n)) {
				letzesmal=i;
			}
		}
		 return letzesmal;
 }
 
	public static void main(String[] args) {
		String[] words = {"Linux", "Apple", "Facebook", "Amazon", "IBM", "Lenovo", "Google", "IBM", "Microsoft", "Apple", "Google", "Twitter", "Skype", "Chrome", "Linux", "Firefox"};
		List<String> g = createArrayList(words);
		
		System.out.println(last(g,"Apple"));
		System.out.println(g.get(g.size()-1));
		
		
	}

}
