package aufgabe4;
import java.util.*;
public class SetOperationsa {

    Set<Integer> numbers1 = new TreeSet<>(); 
    Set<Integer> numbers2 = new TreeSet<>(); 
    Set<Integer> both = new TreeSet<>(); 
    
    
 
    public static Set<Integer> fill (){
        Set<Integer> set = new TreeSet<>(); 
        for (int i = 0; i < 100; i++) 
        { 
         	Random r = new Random();
            int wurf = r.nextInt(99) + 0; 
            set.add(Integer.valueOf(wurf)); 
        }
	return set;
    }
    public static Set<Integer> fillBothUnion(){
    	 Set<Integer> number1 = fill();
    	 Set<Integer> number2 = fill();
    	 
    	 number1.addAll(number2);
    	 
    	Set<Integer> both = number1;
    	return both;
    	 
    }
    
    public static Set<Integer> fillBothIntersection(){
   	 Set<Integer> number1 = fill();
   	 Set<Integer> number2 = fill();
   	Set<Integer> both = new TreeSet<>(); 
 	for(Integer element : number1)
    {
       if(number2.contains(element)) {
    	   both.add(element);
       }
    }
   
return both;
   	 
   	 
   }
    public static Set<Integer> fillBothDifference(){
      	 Set<Integer> number1 = fill();
      	 Set<Integer> number2 = fill();
      	Set<Integer> both = new TreeSet<>(); 
    	for(Integer element : number1)
       {
          if(!number2.contains(element)) {
       	   both.add(element);
          }
       }
      
   return both;
      	 
      	 
      }
    
    public static void printList(Set<Integer> list1) {
		for(Integer element : list1)
	        {
	            System.out.println(element + " ");
	        }
	        System.out.println();
	        System.out.println("End of list");
	}
    
    public static void printsquare(Set<Integer> list1) {
    	   int i =0;
    	
        while(i<100) {
        	 if(i%10 ==0 && i!=0) {
             	System.out.println();
             }
        	 
            if(list1.contains(Integer.valueOf(i))) {
            	System.out.print("o ");
            }
            else {
            	System.out.print("  ");
            }
           
            i++;}
        System.out.println();
    	    

	}
    

    
    public static void main(String[] args) {
    	
    	
    Set<Integer> test = fillBothIntersection();
    printList(test);
    printsquare(test);
 	
    Set<Integer> test1 = fillBothDifference();
    printList(test1);
    printsquare(test1);
    
    Set<Integer> g=fill();
    printsquare(g);
    
    	}
    }

