package quadtratundKreis;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class QuadratundKreis extends JFrame implements MouseListener , MouseMotionListener{
    Canvas canvas;
    JLabel label;
    Figure vf;
    Figure kf;
    Point start;
    boolean pressed;
    boolean Vmove;

    public QuadratundKreis()
    {
        super();
        this.setTitle("Klausur");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.canvas = new Canvas();
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);
        this.getContentPane().add(this.createNorthPanel(), BorderLayout.NORTH);
        this.getContentPane().add(this.createSouthPanel(), BorderLayout.SOUTH);
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }

    JPanel createNorthPanel()
    {
        JPanel north = new JPanel();
        north.setBackground(Color.GRAY);

        label = new JLabel("");
        north.add(label);

        return north;
    }

    JPanel createSouthPanel()
    {
        JPanel south = new JPanel();
        south.setBackground(Color.GRAY);
        JButton new1 = new JButton("New");
      
        new1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            { pressed=true;
            
            int abstand = 10;
            int links = abstand;
            int oben = abstand;
            int unten = canvas.getHeight() - abstand;
            int hoehe = unten - oben;
            

         
        	

            
                
            	if( canvas.getWidth()>canvas.getHeight()) {
            	
               
            	 vf= new Figure(links, oben, hoehe-10);
                 kf= new Figure(links+canvas.getWidth()/2, oben, hoehe);
            	}

            	if(canvas.getHeight()> canvas.getWidth()) {
            		int c =canvas.getWidth()/2-hoehe/4;
            		 vf= new Figure(c, oben, hoehe/2-10);
                     kf= new Figure(c, oben+canvas.getHeight()/2, hoehe/2);
            		
            	}
            
            	
            	canvas.repaint();
            }
        });
        
    
        south.add(new1);

        return south;
    }
    


    class Canvas extends JPanel
    {  
        @Override
        public void paintComponent(Graphics g)
        { 
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;

            
            int hoehe = this.getHeight();
            int breite = this.getWidth();
            g2.setStroke(new BasicStroke(2));
            
            
            if(hoehe>breite) {
            	label.setText("hoeher"+": ("+breite+","+hoehe+")");
            	g2.drawLine(0,hoehe/2, breite, hoehe/2);
      
            }
            
            if(breite>hoehe) {
            	label.setText("breiter"+": ("+breite+","+hoehe+")");
            	g2.drawLine(breite/2,0, breite/2, hoehe);
            }
            
            if(pressed) {
            	 g2.setColor(Color.yellow);
            g2.fillRect(vf.x, vf.y, vf.length, vf.length);
            g2.setColor(Color.GREEN);
            g2.fillOval(kf.x, kf.y, kf.length, kf.length);}
            

   
        
        }
    }


    public static void main(String[] args) 
    {
        new QuadratundKreis();
    }

	@Override
	public void mouseDragged(MouseEvent e) {
	  
		Point ende = e.getPoint();
		int diffxx= ende.x-start.x;
		int diffyy = ende.y -start.y;
	
		if(Vmove==true) {
		vf.x=vf.x+diffxx;
		vf.y=vf.y+diffyy;}
		
		if(Vmove==false) {
		
		kf.x=kf.x+diffxx;
		kf.y=kf.y+diffyy;
		

	
		
		}
		start = ende;
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
    start = e.getPoint();
	     

		
		if(start.x>vf.x && start.x <vf.x+vf.length && start.y>vf.y && start.y <vf.y+vf.length) {
		  
       Vmove=true;
		}
		
		if(start.x>kf.x && start.x <kf.x+vf.length && start.y>kf.y && start.y <kf.y+vf.length) {
			 
       Vmove=false;;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(kf.x<vf.x+30 && kf.x >vf.x-30 && kf.y<vf.y+30 && kf.y>vf.y-30  ) {
        	System.out.println("rest");
        	kf.x=vf.x;
        	kf.y=vf.y;
        }
		
		this.canvas.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	     
        
		
	}
}   