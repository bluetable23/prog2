package V3;
import java.utils

import javax.swing.JOptionPane;
public class VorlesungV3 {
	
	public static int divide(int a, int b) {
		return(a/b);
	}
	
	public static void main(String[] args) {
		int nr1=7;
		int nr2=0;
		
		
		int [] arr= {1,2,3,4,5,6};
		int index=6;
		
		try {
			int result=divide(nr1,nr2);
			System.out.printf("%d / %d = %d %n",nr1,nr2,result);
			
		
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Divison durch 0 nicht erlaubt");
		}
	   
		
	String eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein");
	int zahl = Integer.parseInt(eingabe);
	
	System.out.println("Ihre Zahl" + zahl);
		
		System.out.println("Programmende");
	}

}
