package V6;

public class Testklasse {

	
	public static void printPerimeter (Shape s) {
		System.out.println("perimeter : "+s.perimeter()+"cm");
	
	}
	
	public static double getSumPerimeters(Shape [] shapes) {
		double sumPerimeters=0.0;
		
		for(Shape s : shapes) {
			sumPerimeters+=s.perimeter();
		}
		return sumPerimeters;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		Shape r2  = new Rectangle (20,30);
		printPerimeter(new Rectangle(20,30));
		printPerimeter(r1);
		Shape[] shapes = new Shape [4];
		shapes [0]= new Rectangle(20,30);
		shapes [1]= r2;
	}
}


