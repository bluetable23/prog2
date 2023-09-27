package übung2;
import javax.swing.JOptionPane;


public class Uebung2 {




	public static int inputInt (String message) {
		int zahl=0;
		boolean ok=true;
		int ergebniss;
		
		while(ok==true) {
		String eingabe = JOptionPane.showInputDialog(message);

		try {
			zahl = Integer.parseInt(eingabe);
			ok=false;
		}
		catch(NumberFormatException e) {
          
        message= "Ihre Eingabe war keine Zahl";
		}}


		return zahl;
	}


	
	public static void printDivide() {
		int number1 =inputInt("Zahl 1");
		int number2 =0;
		int result=0;
		String message="Zahl 2";
		
		boolean isZero=true;
		while(isZero) {
		
		number2= inputInt("Zahl 2");
		
	
		try {
		
	     result =number1 / number2;
	     
	     isZero=false;
		}
		
		catch(ArithmeticException e) {
			message="zahl darf nicht 0 sein";
			
		}}
		String output = number1+ " / " +number2 + " = "+result;
		
		JOptionPane.showMessageDialog(null, output);}
		
		
		public static int ss( String g ) {
	String b=" ";
			for(int i=g.length()-1;i>=0;i--) {
		b+=  g.charAt(i)-'0';
		
		}
			int zahl = Integer.parseInt(b);
			return zahl;
		}
	
	public static void main(String[] args) { 
	  ss("22");
		inputInt ("zahl eingeben");     
	  printDivide();
	  
	  
	}
}

