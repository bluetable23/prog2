package Schach;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import quadtratundKreis.Figure;

public class Schachbrett extends JFrame implements MouseListener {
    Canvas canvas;
    State [][] brett ;
    Point start;
Shape circle;    
boolean clicked;
enum State {EMPTY,USED,MARKED,ERROR};  

List<Shape> kreise = new ArrayList<>();
    public Schachbrett()
    {
        super();
        this.setTitle("Schachbrett");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.canvas = new Canvas();
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);

        this.initfield();
        // NORTH, EAST, WEST geloescht
        this.getContentPane().add(this.initSouth(), BorderLayout.SOUTH);
        this.canvas.addMouseListener(this);
        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }
    
    private void initfield() {
    	 brett = new State[8] [8];
    	  for (int s = 0; s < brett.length; s++)
      	  {      	 
            	
      	  
      	    for (int z = 0; z< brett[s].length; z++)
      	    {   
      	    	 this.brett[s][z] = State.EMPTY;
      	    	 
      	     }
    }}

    private class Canvas extends JPanel
    { int hoehe = 0;
    int breite =0;
        @Override
        protected void paintComponent(Graphics g)
        { 
            super.paintComponent(g);        
            Graphics2D g2 = (Graphics2D)g;
            hoehe = canvas.getHeight()/8;
            breite = canvas.getWidth()/8;
            
            int a= 0;
            int b =0;
            int k =1;
            
            for (int s = 0; s <  Schachbrett.this.brett.length; s++)
      	  {      	 
            	
      	  
      	    for (int z = 0; z< Schachbrett.this.brett[s].length; z++)
      	    {  
      	    	
      	    	if (k%2==0) {
      	        g2.setColor(Color.GRAY);}
      	    	if(k%2!=0) {
      	    		g2.setColor(Color.WHITE);}
      	    	
      	    	
      	    	
      	    	g2.fillRect(a, b, breite, hoehe);
                 a=a+breite;
                 k++;
                 
                 
                 
       	    	
      	     }
      	   k++;
      	  a=0;
      	  b=b+hoehe;
      	   }


            for (int s = 0; s <  Schachbrett.this.brett.length; s++)
        	  {      	 
              	
        	  
        	    for (int z = 0; z< Schachbrett.this.brett[s].length; z++)
        	    {
        	    	
        	    	if(brett[s][z] == State.USED ) {
           	    		int vv = this.getWidth()/8;
           	    		int yy=this.getHeight()/8;
           	    		System.out.print("yes");
           	    		 int spalte =vv*s+vv/3;
           	    		 int zeile = yy*z+yy/3;
           	    		 g2.setColor(Color.RED);
                         
                         
                         System.out.print ("spalte "+s+"zeile"+z+" Punkt s "+spalte +" /Punkt z "+zeile+ "        " +vv+","+yy+ "--"+this.getWidth()+"--"+this.getHeight());

           	    	
           	    		
                     
           	               	         
           	          
                         g2.fillOval(spalte,zeile,vv/3,yy/3);
                         g2.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
                         g2.drawLine( spalte+vv/6,0, spalte+vv/6,this.getHeight());
                         g2.drawLine(0,zeile+yy/6,this.getWidth(),zeile+yy/6);
           	      
           	    	}
        	    	
        	    	
        	    	if(brett[s][z] == State.ERROR ) {
        	    		g2.setColor(Color.green);
        	    		g2.fillRect( s*this.getWidth()/8,z*this.getHeight()/8,this.getWidth()/8,this.getHeight()/8);
        	    		brett[s][z] = State.MARKED;
        	    	}
        	    	}
        	    	
        	    }}
            
            
        }
    

    private JPanel initSouth() 
    {
    	  
    	        JPanel south = new JPanel();
    	        south.setBackground(Color.GRAY);
    	        JButton shapeBtn = new JButton("clear");
    	 
    	      
    	        shapeBtn.addActionListener(new ActionListener() {

    	            @Override
    	            public void actionPerformed(ActionEvent e) 
    	            { 
    	            
    	            canvas.repaint();
    	            }
    	        });
    	        
    	        
    	     

    	        south.add(shapeBtn);
    	   

    	        return south;
    	    
       
    }

    public static void main(String[] args) 
    {
        new Schachbrett();
    }



	@Override
	public void mouseClicked(MouseEvent e) {
		clicked = true;
		int x = e.getX();
        int y = e.getY();
      
        int spalte = x / this.canvas.breite;
        int zeile = y / this.canvas.hoehe;
        
        
        if(  this.brett[spalte][zeile] != State.MARKED) {
        	for(int i =0;i<8;i++) {
        		this.brett[spalte][i]=State.MARKED;
        	}
        	for(int i =0;i<8;i++) {
        		this.brett[i][zeile]=State.MARKED;
        	}
        	
        this.brett[spalte][zeile] = State.USED;
        }
       
        if(  this.brett[spalte][zeile] == State.MARKED) {
        	 this.brett[spalte][zeile]= State.ERROR;
        	 System.out.print("ERROR"+spalte+",,"+zeile);
        }
       
        canvas.repaint();
       
 
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}