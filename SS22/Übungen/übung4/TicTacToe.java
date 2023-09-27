package übung4;



public class TicTacToe 
{
    State[][] field;

    public TicTacToe()
    {
        field = new State [3][3];
        for(int i=0; i<field.length; i++) 
          for(int j=0; j<field[i].length; j++) 
            field[i][j]=State.EMPTY;
    }

    public void makeMove(int i, int j,State player)
    {
        if(field[i][j]==State.EMPTY && player!=State.EMPTY)  
            field[i][j]=player;
    }
    
    public void print()
    {
       for(int i = 0;i<field.length;i++) {
    	  for(int j=0;j<field.length;j++) {
    		  if(field [i][j] == State.EMPTY) {
    			  System.out.print("-");
    		  }
    		  
    		  if(field[i][j] ==State.RED) {
       		   System.out.print("o");
       	   } 
    		  
    		  
    		  if(field[i][j] ==State.BLACK) {
       		   System.out.print("o");
       	   }  
    		  
    		 
    	  }
    	  System.out.println(); 
       }
       
}
    
    public boolean gewonnen(State player) {
    	  for(int i = 0;i<3;i++) {
                  if(field[i] [0] ==player && field [i] [1] ==player && field [i] [2] ==player) {
                	  return true;
            
                  }}
    	  
    	  for(int j = 0;j<3;j++) {
              if(field[0] [j] ==player && field [1] [j] ==player && field [2] [j] ==player) {
            	  return true;
        
              }}
          if(field[0] [0] ==player && field [1] [1] ==player && field [2] [2] ==player) {
        	  return true;
          }
          if(field[2] [0] ==player && field [1] [1] ==player && field [0] [2] ==player) {
        	  return true;
          }
          return false;
    }
    
    public boolean unentschieden() {
    	 for(int i = 0;i<field.length;i++) {
       	  for(int j=0;j<field.length;j++) {
       		  if(field [i][j] == State.EMPTY) {
       			 return false;
       		  }	
       	  }		
    }
       	  return true;
    	 }
  

}
