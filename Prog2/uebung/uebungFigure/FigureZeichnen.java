package uebungFigure;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import uebungFigure.Figure.Shape;



public class FigureZeichnen extends JFrame implements MouseListener , MouseMotionListener{
    Canvas canvas;
    JButton plus ;
    JButton minus;
    JButton losch ;
    JButton farb;
    JButton ellip;
    Point start2;
    int diffxx;
    int diffyy;

    boolean move;
    boolean clicked=false;
    Figure f;
    
    public FigureZeichnen()
    {
        super();
        this.setTitle("GrundgeruestMitCanvas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.canvas = new Canvas();
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);

        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        JPanel content = this.initContent();
        this.getContentPane().add(content);

        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }

	   private JPanel initContent()
	    {
	        JPanel mainPanel = new JPanel();
	        mainPanel.setLayout(new BorderLayout());

	        JButton ellip = new JButton("Ellipse");
	        JButton losch = new JButton("Löschen");
	        JButton farb = new JButton("Farbe Ändern");
	        JButton plus= new JButton("+");
	        JButton minus = new JButton("-");
	        
	        JPanel unten = new JPanel();
	        unten.setLayout(new GridLayout(1,2));
	        unten.add(losch);
	        unten.add(farb);

	        mainPanel.add(ellip, BorderLayout.NORTH);
	        mainPanel.add(plus,BorderLayout.EAST);
	        mainPanel.add(minus, BorderLayout.WEST);
	        mainPanel.add(this.canvas, BorderLayout.CENTER);
	        mainPanel.add(unten,BorderLayout.SOUTH);

	
	      
	        
	        
	      
	      ellip.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) 
	            { if(f.shape!=Shape.Rectangle) {
	            	f.shape=Shape.Rectangle;
	            	ellip.setText("Rectangle");
	            }
                  if(f.shape==Shape.Rectangle) {
	            	f.shape=Shape.Oval;
	            	ellip.setText("Oval");
	            }
	            	 canvas.repaint();
	            } });
	     losch.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) 
	            { f.start.x=0;
	               f.start.y=0;
	            	 canvas.repaint();
	            } });
	     farb.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) 
	            {  f.changeColor();
	            
	            	 canvas.repaint();
	            } });
	      plus.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) 
	            { f.bigger();
	            	 canvas.repaint();
	            } });
	      minus.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) 
	            {  f.smaller();
	            	 canvas.repaint();
	            } });
	      
	      return mainPanel;
	     
	    }
	   
	   
    private class Canvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);        
            Graphics2D g2 = (Graphics2D)g;  
          if(clicked == true) {
        	
           
         
            g2.setColor(f.color);
            
            if(f.shape==Shape.Rectangle) {
                g2.fillRect(f.start.x,f.start.y,f.width, f.height);}
            
         
          if(f.shape==Shape.Oval) {
              g2.fillOval(f.start.x,f.start.y,f.width, f.height);}
          }
          
          }}
      
        
        
    


	   
	   
	   

    public static void main(String[] args) 
    {
        new FigureZeichnen();
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		Point ende = e.getPoint();
		if(move==true) {
		 diffxx= ende.x-start2.x;
		diffyy = ende.y-start2.y;
		
	
		f.addSideLength(diffxx/2,diffyy/2);
		
		System.out.println(f.width);
		}
		
		this.canvas.repaint();
    
    
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		clicked=true;
		start2 = e.getPoint();
		f = new Figure (Shape.Rectangle,start2);
		  
		move = true;
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		move=false;
		canvas.repaint();
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