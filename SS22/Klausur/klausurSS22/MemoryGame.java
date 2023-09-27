package klausurSS22;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.*;



public class MemoryGame extends JFrame implements ActionListener {
    JPanel unten;
    JPanel mitte;
    JPanel oben;
    JLabel obenl;
    JButton show = new JButton ("show");
    JButton start =new JButton ("start");
    JButton check = new JButton ("check");
    JButton new1 = new JButton ("new");
    MemoryPanel[][]  panelsC ;
    List<Color> l = new ArrayList<Color>();
	private MemoryPanel[][] panels;

	public MemoryGame(){
		super();
		this.setTitle("Memory");
		mitte = new JPanel();
		mitte.setLayout(new GridLayout(4,4,2,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		 
		mitte = new JPanel();
		this.setSize(400, 300);
		this.setLocation(300, 200);
		this.setVisible(true);
		
	}
	


	 private JPanel initContent(){
     JPanel mainPanel= new JPanel();
     mainPanel.setLayout(new BorderLayout());
   
     unten = new JPanel();
     unten.add(show); unten.add(start); unten.add(check); unten.add(new1);
     mainPanel.add(unten,BorderLayout.SOUTH);
     
     oben = new JPanel();
     obenl= new JLabel();
     obenl.setHorizontalAlignment(JLabel.CENTER);               
     obenl.setFont(new Font("Verdana", Font.BOLD, 14));
     obenl.setText("Click Start to Start");
     oben.add(obenl);
     
    mainPanel.add(oben,BorderLayout.NORTH);
 
     
    mainPanel.add(mitte,BorderLayout.CENTER);
    
    
 panels =new MemoryPanel [4][4];

    
    int i =0;
while(i<9) {
	i++;
	Random r = new Random();
    int red = r.nextInt(256);
    int blue = r.nextInt(256);
    int green = r.nextInt(256);

    Color c = new Color(red, blue, green);
 l.add(c);	
 
}

ArrayList<Color> n = new ArrayList<Color>() ;

n.addAll(l);
Collections.shuffle(n);
for(Color s : n)
{
    System.out.print(s + " ");
}
System.out.println();
System.out.println("End of list");

    for(int zeile=0; zeile<this.panels.length; zeile++)
    {
        for(int spalte=0; spalte<this.panels[zeile].length; spalte++)
        {  Random r = new Random();
          int e = r.nextInt(16);
          
        
        MemoryPanel f = new MemoryPanel(l.get(e));
        l.remove(e);
       
            this.panels[zeile][spalte] = f;
            mitte.add(f);
        }}
    
    
    
 
    show.addActionListener(new ActionListener() {      // Objekt einer anonymen Klasse

        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	obenl.setHorizontalAlignment(JLabel.CENTER);               
            obenl.setFont(new Font("Verdana", Font.BOLD, 14));
            obenl.setText("Click start to start”");
        }
    });
    
    start.addActionListener(new ActionListener() {      // Objekt einer anonymen Klasse

        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	for(int zeile=0; zeile<panels.length; zeile++)
            {
                for(int spalte=0; spalte<panels[zeile].length; spalte++)
                {  
                    panels[zeile][spalte].setBackground(Color.GRAY);
                }}
        	obenl.setHorizontalAlignment(JLabel.CENTER);               
            obenl.setFont(new Font("Verdana", Font.BOLD, 14));
            obenl.setText("click two panels and check");
           
        }
    });
    
    
    check.addActionListener(new ActionListener() {      // Objekt einer anonymen Klasse

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
        }
    });
    
    
   new1.addActionListener(new ActionListener() {      // Objekt einer anonymen Klasse

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
        }
    });
    
    
    
    
    
    
     
     return mainPanel;
    	 
     
	   } 

    

	
	
	
	  public static void main(String[] args)
	    {
	        new MemoryGame();
	    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	  
}
