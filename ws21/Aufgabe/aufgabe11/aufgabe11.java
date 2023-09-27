package aufgabe11;
import java.util.Random;

public class aufgabe11 {

	public char[] createAndFillCharArray() {
		char  [] a = new char [25];
	    Random r = new Random();
	    for(int i=0; i<a.length; i++){
	    	int bound = (122 - 97) + 1; 
	        int ra = r.nextInt(bound) + 97;
	    
		        char c=(char)ra;
		        if (contains(a, c)==false) {
		        a[i]=c;    
	    }
		        else {i--;}   
	    }
	    sort(a);
	    return a;
	}
	public boolean contains(char[] ca, char c) {
		
		
		    boolean found = false;
		    for(int index=0; index<ca.length; index++)
		    {
		        if(ca[index]==c)
		        {
		            found = true;
		        }
		       
		    }
		    return found;
		}
		
	public char[] sort(char[] a) {

for(int bubble=1; bubble<=a.length-1; bubble++)
{
    for(int index=0; index<a.length-bubble; index++)
    {
        if(a[index] > a[index+1])
        {
            char  tmp = a[index+1];
            a[index+1] = a[index];
            a[index] = tmp;
        }
    }
}
return a;
	}
	
	
	 public void printArray(char [] a)
	    {
	        System.out.print("[ ");
	        for(int index=0; index<a.length; index++)
	        {
	            System.out.print(a[index] + ", ");
	        }
	        System.out.println(" ]");
	    }
	 

	 
	 
	 
	 
	//////////////////////Zusatzaufgabe
	 
	 public char getMissingLetter(char[] a) {
	
		char [] alphabet = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','x','y','z'};
		  for(int i=0; i<a.length; i++) {
				for(int index=0; index<alphabet.length; index++) {
			
			    	if(a[i] ==alphabet[index]) {
			    		alphabet [index]=0;
	}}}
		  for(int j=0;j<a.length;j++) {
			  if(alphabet[j] !=0) {
				  char b = alphabet [j];
				  ////System.out.print(b);
				  return b;
			  }}
		return 0;}
	 
	 public char zufallsbuchstabe()
	 {
		 char [] b= createAndFillCharArray();
		 char c = getMissingLetter(b);
		 return c;
	 }
	 
	 public void findWord(String word) {
	
		for  (int n = 0; n < word.length(); n ++){
			 char q = word.charAt(n);
			 int a =1;
			 while(q != zufallsbuchstabe ()) {
				 System.out.print(".");
				 a++;
			 }
			 System.out.print(q+ "("+a+")");
			 System.out.println();
		 }			
	 }
	 
}
