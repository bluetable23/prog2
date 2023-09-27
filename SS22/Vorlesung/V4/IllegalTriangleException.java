package V4;

public class IllegalTriangleException extends RuntimeException{

	public IllegalTriangleException(String s) {
		super(s);
	}
	
	
	public IllegalTriangleException () {
		super("Each side has to be smaller than the sum of the other sides.");
		
	}
}

	