package Übung10;

public class Uebung10 {

	public void print (char[] ca) {
	
		String s = "[";
		
		if(ca.length==0){
			System.out.print(s+"]");
		}
		else{
		  for(int index =0; index<ca.length-1;index++){
			  s=s+ca[index]+",";
		  }
		  s=s+ca[ca.length-1]+"]";
		}
		System.out.print(s);
	}

	public void print (int[] ca){
		String s = "[";
		
		if(ca.length==0){
			System.out.print(s+"]");
		}
		else{
		  for(int index =0; index<ca.length-1;index++){
			  s=s+ca[index]+",";
		  }
		  s=s+ca[ca.length-1]+"]";
		}
		System.out.print(s);
	}
	
	
	public char stringToCharArray(String s) {


		
}
