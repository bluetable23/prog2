package V4;

public class IllegalSideLengthException extends RuntimeEception{

	public IllegalSideLengthException(String s) {
		super(s);
	}
	
	
	public IllegalSideLengthException () {
		super("Each side has to be greater than zero!");
		
	}
}
