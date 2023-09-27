package V7;

public class Rectangle extends Shape implements Comparable<Rectangle>{

	
	private int width,heigth;
	
	
	
	
	public Rectangle(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public double perimeter() {
		return 2*(this.width+this.heigth);
	}

	@Override
	public double area() {
	return this.heigth*this.width;
	}

	

	@Override
	public int compareTo(Rectangle o) {
		
		return (int)((this.perimeter() - o.perimeter()));
	}
	
}
