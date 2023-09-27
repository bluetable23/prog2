package aufgabe11;



public class Projectclass {

		public static void main(String[] args) {
			aufgabe11 a11 = new aufgabe11();
			
			char a [] = a11.createAndFillCharArray();
			
            a11.printArray(a);		     
                  
            System.out.printf("%n%n----------------- Erzeugen ------------------%n%n");
            char[] ca1 = a11.createAndFillCharArray();
            a11.printArray(ca1);
            a11.zufallsbuchstabe();
        
        String b = "weihnachten";
        a11.findWord(b);
		

	}

}
