package quadtratundKreis;

public class Figure {
    public int x;
    public int y;
    public int length;

    public Figure(int x, int y, int length) 
    {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}