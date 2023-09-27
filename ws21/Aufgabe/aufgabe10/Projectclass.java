package aufgabe10;
import java.util.Random;

public class Projectclass {

	public static void main(String[] args) {
		Random r = new Random();        // java.util.Random importieren
		Aufgabe10 a10 = new Aufgabe10();
		int length = r.nextInt(10)+10;
		int[] arr1 = a10.createAndFillArray(length, 20, 30);

		     
		
		System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
		a10.printUpsideDown(arr1);
	}

}
