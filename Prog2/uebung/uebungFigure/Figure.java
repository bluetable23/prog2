package uebungFigure;
import java.util.Random;
import java.awt.Color;
import java.awt.Point;



import javax.swing.JFrame;


public class Figure extends JFrame {
	
	Shape shape;
	enum Shape {Oval, Rectangle};
	Color color; 
	Point start;
	int width;
	int height;
	   
	
	public Figure (Shape shape,  Point start) {
		this.shape =shape; 
		
		this.start=start;
		this.width=10;
		this.height=10;
		
		/*Random rand = new Random();
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		
*/
	this.color= Color.cyan;
	
	}
	
	public void changeColor()
	{Random rand = new Random();
	int r = rand.nextInt(256);
	int g = rand.nextInt(256);
	int b = rand.nextInt(256);
	
    this.color= new Color(r, g, b);
System.out.println("ne");
		}
	
	
	public void setStartPoint(Point start) {
		this.start=start;
	}
	 public void changeShape() {
		 if(this.shape==Shape.Oval) {
			 shape=Shape.Rectangle;
		 }
		 if(this.shape==Shape.Rectangle) {
			 shape=Shape.Oval;
		 }
	 }
	 public void addSideLength(int xDiff, int yDiff) {
    if(xDiff>=0 && yDiff>=0) {
    	this.width = this.width+xDiff;
    	this.height=this.height+yDiff;
    }
    
    if(xDiff<0 && yDiff<0) {
    	this.start.x=this.start.x+xDiff;
    	this.start.y=this.start.y+yDiff;
    	this.width = this.width+xDiff*-1;
    	this.height=this.height+yDiff*-1;
    }
    
    
    if(xDiff>=0 && yDiff<0) {

    	this.start.y=this.start.y+yDiff;
    	this.width = this.width+xDiff;
    	this.height=this.height+yDiff*-1;
    }
    
    if(xDiff<0 && yDiff>=0) {

    	this.start.x=this.start.x+xDiff;
    	this.width = this.width+xDiff*-1;
    	this.height=this.height+yDiff;
    }
    
    
		 
	 }
	 
	 
	 public void bigger() {
		 int a = (int) (this.width*0.1);
		 int b = (int) (this.height*0.);
		 this.width= this.width+2*a;
		 this.height=this.height+2*b;
		 
		 this.start.x =  this.start.x -a;
		 this.start.y =  this.start.y -b;
	 }
	 
	 public void smaller() {
		 int a = (int) (this.width*0.1);
		 int b = (int) (this.height*0.);
		 this.width= this.width-2*a;
		 this.height=this.height-2*b;
		 
		 this.start.x =  this.start.x +a;
		 this.start.y =  this.start.y +b;
	 }
	 
	 
	 
	public static void main(String[] args) {
	
 new Figure (Shape.Rectangle, new Point (2,2));
	}

}
