package übung4;

public class Test {
	  public static void main(String[] args) {
	    	TicTacToe g = new TicTacToe();
	    
	g.makeMove(0, 1, State.BLACK);

	g.makeMove(1, 1, State.BLACK);
	g.makeMove(2, 1, State.BLACK);

	
	g.makeMove(0, 0, State.BLACK);

	g.makeMove(0, 1, State.BLACK);
	g.makeMove(0, 2, State.BLACK);

	g.makeMove(1, 0, State.BLACK);
	g.makeMove(1, 2, State.BLACK);
	g.makeMove(2, 0, State.BLACK);

	g.makeMove(2, 2, State.BLACK);

	g.print();
	System.out.print(g.unentschieden());
	
	    }
}
