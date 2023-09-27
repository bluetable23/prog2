package quadtratundKreis;



import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphZeichnen 	extends JFrame implements MouseListener , MouseMotionListener{
    Canvas canvas;
    List<Point> l = new ArrayList<>();
    boolean h;
    Point s;
    int index;
    
	    public GraphZeichnen()
	    {
	        super();
	        this.setTitle("Klausur");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	        this.canvas = new Canvas();
	        this.getContentPane().add(this.canvas, BorderLayout.CENTER);
	        this.canvas.addMouseListener(this);
	        this.canvas.addMouseMotionListener(this);
	        this.setSize(400, 300);
	        this.setLocation(300,200);
	        this.setVisible(true);
	    }

	  

	  


	    class Canvas extends JPanel
	    {  
	        @Override
	        public void paintComponent(Graphics g)
	        { 
	            super.paintComponent(g);
	            Graphics2D g2 = (Graphics2D)g;
                
	            

               Point start= l.get(0);
                
	            for(Point  p : l)
	            {    
	            	 g2.fillOval(p.x, p.y, 30, 30);
	            	 g2.setColor(Color.black);
	            	 g2.setStroke(new BasicStroke(2));
	            	 g2.drawLine(l.get(0).x, start.y, p.x, p.y);
	            	 start=p;
	            }

	            Point ende =l.get(l.size()-1);
		        g2.drawLine(l.get(1).x, l.get(1).y,ende.x,ende.y);
	       
	        
	        }
	    }


		@Override
		public void mouseDragged(MouseEvent e) {
			 /* 
			Point ende = e.getPoint();
			int diffxx= ende.x-s.x;
			int diffyy = ende.y -s.y;
		
			if(h==true) {
			l.get(index).x=l.get(index).x+diffxx;
			l.get(index).y=l.get(index).y+diffyy;}
			
			
			s = ende;
			this.canvas.repaint();*/
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		    Point start = e.getPoint();
		    l.add(start);
			this.canvas.repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Point s = e.getPoint();
		     
			  
			 for(Point  p : l)
	            {    
	            	if(s.x<p.x+20 && s.x>p.x-20 && s.y<p.y+20 && s.y>p.y-20 ) {
	            		h=true;
	            		System.out.println("jee");
	            	
	            	}
	            }

			
		
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			this.canvas.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
		     
	        
			
		}
		


	    public static void main(String[] args) 
	    {
	        new GraphZeichnen();
	    }
	}   
