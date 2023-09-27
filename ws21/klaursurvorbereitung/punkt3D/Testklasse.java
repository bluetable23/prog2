package punkt3D;
import java.util.Random;
public class Testklasse {

	public static void main(String[] args) {
		Punkt2D[] arr = new Punkt2D[3];
		Random r = new Random();
		int n=0;
		while(n!=3) {
		
		int bound = (9 - 0) + 0;  // +0
		int x= r.nextInt(bound) + 0;
		int y= r.nextInt(bound) + 0;
		int z= r.nextInt(bound) + 0;
		
		if(z==0) {
			arr[n]= new Punkt2D(x,y); 
			new Punkt2D(x,y).print();
			n++;
		}
		else {
			new Punkt3D(x,y,z).print();
			
		}
	}
		
	Strecke a = new Strecke(arr[0],arr[1])	;
	Strecke b = new Strecke(arr[1],arr[2])	;

	Strecke d = new Strecke(2,4,4,8);
		a.print();
		b.print();
		d.print();
		System.out.println("__________________________________________");
		PunkteArray  p= new PunkteArray(15);
		p.fillArray();
		p.print();
		p.printStrecken();

}
	
}
