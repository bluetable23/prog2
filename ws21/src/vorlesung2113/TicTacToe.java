package vorlesung2113;

//3*3 feld 2 spieler (1,2) 3 gleiche in reihe und spalte
// 0=nicht gesetzt 1=spieler 1 2=spieler 2

public class TicTacToe {

	private int [] [] field;
	private int player;
	private int size;
	
	public TicTacToe(int size)
	{
		this.size=size;
		this.field= new int [this.size] [this.size];
		for(int row=0;row<this.size;row++)
		{
			for(int col=0;col<this.size;col++)
			{
				this.field[row] [col] =0;
			}
		}
		this.player=1;
	}
	public void printField()
	{
		for(int row=0;row<this.size;row++)
		{
			for(int col=0;col<this.size;col++)
			{
				if(this.field[row] [col] ==0)
				{
					System.out.print("-");
				}
				else if(this.field [row] [col]==1)
				{
					System.out.print("x");
				}
				else if(this.field[row] [col] ==2)
				{
					System.out.print("o");
				}
	
			System.out.println();
}}
	}
	public void switchPlayer()
	{
		if(this.player==1)
		{
			this.player=2;
		}
		else
		{
			this.player=1;
		}
		this.player=(this.player%2)+1;
		
	}	
	
	public void move (int row, int col)
	{
		if(row>0&&row<this.size&&col>=0&&col<this.size)
		{
			if(this.field[row] [col]==0)
			{
				this.field [row] [col] =this.player;
				this.switchPlayer();
			}}
		
			
		}
			
	public boolean movePossible(int row, int col)
	{
		boolean movePossible =false;
		
		if(row>=0&&row<this.size)
		{
			
		}
	
	
	
