package V6;

public class Rectangle extends Shape {

	
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

	
	
}
