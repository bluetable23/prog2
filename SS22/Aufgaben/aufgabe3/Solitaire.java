package aufgabe3;


public class Solitaire {
    private Moves game;
    private State[][] field;

    public Solitaire()
    {
        this.game = new Moves();
        this.field = new State[7][7];
        for(int row = 0; row < this.field.length; row++)
        {
            for(int col = 0; col < this.field[row].length; col++)
            {
                if((row < 2 || row > 4) && (col < 2 || col > 4))
                {
                    this.field[row][col] = State.NOT;
                }
                else
                {
                    this.field[row][col] = State.USED;
                }
            }
        }
        this.field[3][3] = State.FREE;
    }

    /*
     * Geben Sie das Spielfeld aus! Am Anfang sollte auf der
     * Konsole so ein Bild erscheinen:
     *     o o o     
     *     o o o     
     * o o o o o o o 
     * o o o   o o o 
     * o o o o o o o 
     *     o o o     
     *     o o o 
     * 
     */
    public void print()
    {
       for(int g = 0;g<field.length;g++) {
    	  for(int i=0;i<field.length;i++) {
    		  if(field [i][g] == State.NOT  || i==3 && g==3 ) {
    			  System.out.print("   ");
    		  }
    		  
    		  if(field[i][g] ==State.USED) {
       		   System.out.print(" o ");
       	   } 
    		  
    		  
    		  
    		 
    	  }
    	  System.out.println(); 
       }
       
       
        
    }
     

    /*
     * diese Methode gibt ein true zurueck, wenn von der
     * uebergebenen Position (row,col) ein Zug moeglich ist
     * d.h. 
     * 1. auf der angegebenen Position muss ein Stein sein
     * 2. zwei Steine weiter (oben, unten, rechts oder links)
     *      darf kein Stein sein
     * 3. dazwischen muss ein Stein sein
     */
    public boolean possibleFrom(int row, int col)
    {
    if( field [row] [col] != State.USED ) {
        return false;
    }
    
    if(field [row-1] [col] ==State.USED && field [row-2] [col] == State.FREE) {
    	return true;
    }
    if(field [row+1] [col] ==State.USED && field [row+2] [col] == State.FREE) {
    	return true;
    }
    if(field [row] [col-1] ==State.USED && field [row] [col-2] == State.FREE) {
    	return true;
    }
    if(field [row] [col+1] ==State.USED && field [row] [col+2] == State.FREE) {
    	return true;
    }
    		return false;
    }

    /*
     * diese Methode gibt alle Positionen (Point) zurueck,
     * AUF die von (fromRow,fromCol) aus gesprungen werden
     * kann
     */
    public Point[] possibleTo(int fromRow, int fromCol)
    {
    	int b=0;
        if(!possibleFrom(fromRow, fromCol)) return new Point[0];
       
        if(field [fromRow+1] [fromCol] ==State.USED && field [fromRow+2] [fromCol] == State.FREE) {
        b++;  }
        

        if(field [fromRow-1] [fromCol] ==State.USED && field [fromRow-2] [fromCol] == State.FREE) {
        b++;
        }

        if(field [fromRow] [fromCol-1] ==State.USED && field [fromRow-2] [fromCol-2] == State.FREE) {
        b++;}
        

        if(field [fromRow] [fromCol-1] ==State.USED && field [fromRow] [fromCol-2] == State.FREE) {
        b++;}
        
        Point [] g = new Point[b];
        
        int i =0;
        
        	  if(field [fromRow+1] [fromCol] ==State.USED && field [fromRow+2] [fromCol] == State.FREE) {
        	      g[i] = new Point (fromRow+2, fromCol);
        	    		  i++; }
        	        

        	        if(field [fromRow-1] [fromCol] ==State.USED && field [fromRow-2] [fromCol] == State.FREE) {
        	        	g[i] = new Point (fromRow-2, fromCol);
      	    		  i++; }

        	        if(field [fromRow] [fromCol-1] ==State.USED && field [fromRow-2] [fromCol-2] == State.FREE) {
        	        	g[i] = new Point (fromRow, fromCol+2);
      	    		  i++; }
        	        

        	        if(field [fromRow] [fromCol-1] ==State.USED && field [fromRow] [fromCol-2] == State.FREE) {
        	        	g[i] = new Point (fromRow, fromCol-2);
      	    		   
        }
        	       
        return g;}
      
    /* diese Methode erzeugt ein Moves-Objekt
    * in dieses Moves-Objekt werden mithilfe der
    * Objektmethode addMove() (aus Moves) alle
    * moeglichen Zuege hinzugefuegt
    * (moeglich im aktuellen Zustand von field[][])
    */
    public Moves possibleMoves()
    {
        Moves possibleMoves = new Moves();
       
        
        
       Moves.addMove(null);
   ;
        // next line for debugging
        possibleMoves.printMoves();
        return possibleMoves;
    }

    /*
     * gibt ein true zurueck, wenn im aktuellen Zustand 
     * von field[][] ueberhaupt noch ein Zug moeglich ist
     * sonst false
     */
    public boolean movePossible()
    {
    	boolean g=false;
    	
    	g=possibleTo(row.getFrom(),col.getFrom());
                
     

        return false;
    }

    /*
     * ruft die Methode move(Move move) auf,
     * wenn ein Zug moeglich ist (dann true zurueck)
     * sonst false
     */
    public boolean moveFirstPossible()
    {
        if(!movePossible()) return false;
        /*
         *  hier einen moeglichen Zug ausfuehren
         *  den ersten, den Sie finden (siehe
         *  possibleMoves() )
         */
        return true;
    }

    /*
     * hier wird der Zug Move move ausgefuehrt
     * nach dem Zug ist 
     * 1. die from-Position leer
     * 2. die to-Position mit einem Stein besetzt
     * 3. dazwischen leer (Stein wird "entfernt")
     * falls Zug nicht moeglich, wird eine 
     * IllegalArgumentException geworfen 
     */
    public void move(Move move) throws IllegalArgumentException
    {

    }
    
    public static void main(String[] args) {
    	
    }

}