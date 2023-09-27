package aufgabe10;
import java.util.Random;

public class Aufgabe10 {
	
	public int[] createAndFillArray(int length, int fromInclusive, int toInclusive) {
		int[] a = new int[length];
	    Random r = new Random();                    
	    for(int i=0; i<a.length; i++)
	    {
	        int bound = (toInclusive - fromInclusive) + 1; 
	        int ra = r.nextInt(bound) + fromInclusive;
	    
	    		a[i]=ra;
	    }
	    return a;

}
	public void printTable(int[] a)
	 {
        System.out.print("| Index :    |");
        for(int index=0; index<a.length; index++)
        {
            System.out.printf("%5d|",index);
            }
        System.out.println();
        System.out.print("|------------|");
        for(int index=0; index<a.length; index++) {
        	System.out.print("-----|");
        }
        System.out.println();
        System.out.print("| Wert :     |");
        for(int index=0; index<a.length; index++)
        {
            System.out.printf("%5d|",a[index]);}
    }
	
	public void printHorizontal(int[] a) {
		
	
	
		   for(int index=0; index<a.length; index++) {
		
	
			   System.out.printf("%3s|"," ");
			   System.out.println();
			   System.out.printf("%3d|",index);
			   
				
			   for(int i=0;i<a[index];i++){
				  System.out.print("*");
			   }
			   System.out.println();
		   }
	}
	
	
	
	
	 public void printArray(int[] a)
	    {
	        System.out.print("[ ");
	        for(int index=0; index<a.length; index++)
	        {
	            System.out.print(a[index] + ", ");
	        }
	        System.out.println(" ]");
	    }


public int grE(int [] a) {

		  int max = 0;
	        for(int i = 0; i < a.length; i++) {
	            if(a[i] > max) 
	            	max = a[i];	
		 }
	        return max;
}

	 public void printUpsideDown(int[] a) {
	
		 int m =grE(a);
	     int e=0;
		  
		 ///oberer Rahmen
		 System.out.print("    |");
		 for(int index =0;index<a.length;index++) {
			 System.out.printf("%4d",index);
		 }
		 
         ///oberer Rahmen
		 System.out.println();
		 System.out.print("----+-");
		 for(int bndex =0;bndex<a.length;bndex++) {
			 System.out.printf("----");}
			
	
		
	
		 for(int b=1;b<=m;b++) {
			 System.out.println();
			 System.out.printf("%4d|",b);
			 for(int r=1;r<a.length;r++)
			 {
				 e= a[r];
				 System.out.printf("%3s|"," ");
				 for(int c=1;c<=e;c++) {
				  System.out.println("*");
				  System.out.printf("%3s|"," ");
				 } 
				 
			 }
			 
		 }		
	
	 
	 }
		 
	 


	
	  public void print(int[] ca)
	    {
	        String s = "[ ";
	        if(ca.length == 0)
	        {
	            s = s + "]";
	        }
	        else
	        {
	            for (int index = 0; index < ca.length - 1; index++) 
	            {
	                s = s + ca[index] + ", ";
	            }   
	            s = s + ca[ca.length - 1] + " ]";
	        }
	        System.out.println(s);
	    }
}
