package Übung10;

public class Projectclass {
	public static void main(String[] args)
	{
		char[] ca1= {'a','b','c','a','b','c'};
		char [] ca2=new char[0];
		
		
		int [] ia1= {4,2,8,1,6,2,4,1,8};
		int [] ia2= {4};
		
		Uebung10 u1 =new Uebung10();
		u1.print(ca1);
		u1.print(ca2);
		u1.print(ia1);
		u1.print(ia2);
		
		char[] ca3 =u1.StringToCharArray("Hallo FIW");
		u1.print(ca3);
		
		int[] ia3=u1.reverse(ia1);
		u1.print(ia1);
		u1.print(ia3);
				
	}

}
