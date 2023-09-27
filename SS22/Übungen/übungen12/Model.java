package übungen12;




import java.util.Random;

/*
 * Implementierung von TicTacToe
 *
 */
public class Model
{
    private Player[][] field;
    public enum Player {RED, BLACK, EMPTY};
    private Player player;
    private int size;

    public Model(int size)
    {
        this.size = size;
        this.field = new Player[this.size][this.size];
        for(int row = 0; row < this.size; row++)
        {
            for(int col = 0; col < this.size; col++)
            {
                this.field[row][col] = Player.EMPTY;
            }
        }
        this.player = Player.BLACK;     // BLACK faengt an
    }

    public void restart() {
        this.field = new Player[this.size][this.size];
        for(int row = 0; row < this.size; row++)
        {
            for(int col = 0; col < this.size; col++)
            {
                this.field[row][col] = Player.EMPTY;
            }
        }
        this.player = Player.BLACK;     
    }

    public int getSize() {
        return this.size;
    }

    public Player[][] getField() {
        Player[][] copy = new Player[this.size][this.size];
        for(int row = 0; row < this.size; row++)
        {
            for(int col = 0; col < this.size; col++)
            {
                copy[row][col] = this.field[row][col];
            }
        }
        return copy;
    }

    public void printField()
    {
        for(int row = 0; row < this.size; row++)
        {
            for(int col = 0; col < this.size; col++)
            {
                if(this.field[row][col] == Player.EMPTY)
                {
                    System.out.print("- ");
                }
                else if(this.field[row][col] == Player.BLACK)
                {
                    System.out.print("x ");
                }
                else if(this.field[row][col] == Player.RED)
                {
                    System.out.print("o ");
                }
            }
            // Ende der Zeile
            System.out.println();
        }
        // nach Ausgabe des Feldes
        System.out.println();
    }

    public void switchPlayer()
    {
        this.player = (this.player == Player.BLACK) ? Player.RED : Player.BLACK;
    }

    public void move(int row, int col)
    {

        if(this.movePossible(row, col))
        {
            this.field[row][col] = this.player;
            this.switchPlayer();
        }
    }

    public Player curPlayer() {
        return this.player;
    }

    public boolean movePossible(int row, int col)
    {
        boolean movePossible = false;
        // row und col jeweils koorekter Index ???
        if(row >= 0 && row < this.size && col >= 0 && col < this.size)
        {
            // ist das Feld ueberhaupt leer (0) ???
            if(this.field[row][col] == Player.EMPTY)
            {
                movePossible = true;
            }
        }
        return movePossible;
    }

    public boolean won()
    {
        boolean won = false;
        // 3 nebeneinander ???
        for(int row = 0; row < this.size && !won; row++)
        {
            if( this.field[row][0] == this.player && 
                this.field[row][1] == this.player &&
                this.field[row][2] == this.player) 
            {
                won = true;
            }
        }
        // 3 untereinander ???
        for(int col = 0; col < this.size && !won; col++)
        {
            if( this.field[0][col] == this.player && 
                this.field[1][col] == this.player &&
                this.field[2][col] == this.player) 
            {
                won = true;
            }
        }
        // von links oben nach rechts unten - Diagonale
        if( !won && this.field[0][0] == this.player && 
            this.field[1][1] == this.player &&
            this.field[2][2] == this.player) 
        {
            won = true;
        }
        // von rechts oben nach links unten - Diagonale
        if( !won && this.field[0][2] == this.player && 
            this.field[1][1] == this.player &&
            this.field[2][0] == this.player) 
        {
            won = true;
        }
        return won;
    }


    public void printWon()
    {
        if(this.player == Player.BLACK)
        {
            System.out.println("Spielerin x hat gewonnen !!!" );
        }
        else
        {
            System.out.println("Spielerin o hat gewonnen !!!" );
        }
    }

    public boolean fieldFilled()
    {
        for(int row = 0; row < this.size; row++)
        {
            for(int col = 0; col < this.size; col++)
            {
                if(this.field[row][col] == Player.EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean draw()
    {
        return this.fieldFilled() && !this.won();
    }

    public boolean finished()
    {
        return this.draw() || this.won();
    }

    public void automaticMove()
    {
        Random r = new Random();
        int row = r.nextInt(this.size);
        int col = r.nextInt(this.size);
        while(!this.movePossible(row, col))
        {
            row = r.nextInt(this.size);
            col = r.nextInt(this.size);
        }
        this.move(row, col);
    }

    public void automaticMoveAndCheck()
    {
        this.automaticMove();
        this.printField();
        if(this.finished())
        {
            if(this.won())
            {
                this.printWon();
            }
            else    // draw
            {
                System.out.println("Unentschieden !!!");
            }
        }
        else
        {
            this.switchPlayer();
        }
    }

    public void playGame()
    {
        while(!this.finished())
        {
            this.automaticMoveAndCheck();
        }
    }


}