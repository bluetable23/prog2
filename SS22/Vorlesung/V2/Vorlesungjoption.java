package V2;
import javax.swing.JOptionPane;

public class Vorlesungjoption {

	public static void main(String[] args)
	{
		String eingabe=JOptionPane.showInputDialog("Geben Sie eine Zahl aus");
		//1. Konstruktoren 
		Integer i1= new Integer (100); //Int-Wert 
		Integer i2=new Integer("100"); //Zahl als String
		
		Character c1 = new Character('a');
		///Character c2 = new Character ("a");
		
		Integer max = Integer.MAX_VALUE;
		System.out.println(max);
		
		//valueOf()
		Integer i3=Integer.valueOf(100);
		Integer i4 = Integer.valueOf("100");
		
		//3. Auto-Boxing
		Integer i5=100; ///das ist eine referenz auf ein Integer Objekt
		System.out.println(i5);
		
		Integer i6 =1000;
		Integer i7=1000;
		Integer i8 = 1001;
		System.out.println(i6==i7);  //muss unboxed sein referenzen kein Vergleich 
		System.out.println(i8>=i7); //nur für wertetypen nicht für referenzen
		
		
		
		
	}
}
