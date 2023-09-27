package dg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Klausur extends JFrame implements ActionListener {

	
	JLabel g = new JLabel();
	JTextField rot = new JTextField(10);
	JTextField blau=new JTextField(10);
	JTextField grün= new JTextField(10);
	JPanel mitte=new JPanel();
    List<Color> l = new ArrayList<Color>();
    int akindex;
	

	public Klausur(){
		super();
		this.setTitle("Klausuraufgabe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.setSize(400, 300);
		this.setLocation(300, 200);
		this.setVisible(true);
	}
	   
	
	private JPanel initContent() {
		
		
	     JPanel mainPanel = new JPanel();
	        mainPanel.setLayout(new BorderLayout());
	       
	        
	        JPanel oben = new JPanel();
	       oben.setLayout(new GridLayout(2,1));
	       g.setText("Geben sie jeweils eine Zahl von 18-255 ein");
	       g.setHorizontalAlignment(JLabel.CENTER);
	       oben.add(g);
	       oben.add(eingabe());
	       mainPanel.add(oben,BorderLayout.NORTH);
	    
	    	
	       mainPanel.add(mitte,BorderLayout.CENTER);
	       mainPanel.add(unten(),BorderLayout.SOUTH);
	       return mainPanel;}
	       
	       
	     private   JPanel eingabe() {
	    	   JPanel eingabe = new JPanel();
	    	   eingabe.setLayout(new GridLayout(3,2));
	    	   
	    	   JLabel g= new JLabel ("rot" ) ;    JLabel e= new JLabel ("blau" );    JLabel d= new JLabel ("gruen" );
	    	   eingabe.add(g); eingabe.add(rot); eingabe.add(e); eingabe.add(blau); eingabe.add(d); eingabe.add(grün);
	    	   return eingabe;
	       }
	       
	     
	     
	     private JPanel unten() {
	    	 JPanel unten = new JPanel();
	    	 JButton n1 = new JButton("<");
	    	 n1.addActionListener(this);
	    	 JButton reset = new JButton("reset");
	    	 reset.addActionListener(this);
	    	 JButton save = new JButton("save");
	    	 save.addActionListener(this);
	    	 JButton n2 = new JButton(">");
	    	 n2.addActionListener(this);
	    	 
	    	 unten.add(n1);unten.add(reset);unten.add(save);unten.add(n2);
	    	 return unten;

	     }
	       
	      
	       

	     @Override
	       public void actionPerformed(ActionEvent e) 
	       {   Object quelle = e.getSource();
	           if(quelle instanceof JButton )
	           {
	               JButton button = (JButton) quelle;
	               if(button.getActionCommand().equals("save"))
	               {
	            	   if((isRight(rot.getText() )&& (isRight(blau.getText())) && (isRight(grün.getText())))) {
	            		   
	            		   Color c = new Color( Integer.parseInt(rot.getText()), Integer.parseInt(blau.getText()), Integer.parseInt(grün.getText()));
	            	    l.add(c);
	            	    akindex=l.size()-1;
	            		   mitte.setBackground(c);
	            		   g.setText(" geben sie eine Zahl von 0-255 ein");}}
	               
	            		  
	               if(button.getActionCommand().equals(">")){	  
	            	   if(akindex<l.size()-1) {
		            	   akindex=akindex+1;
	                    	 mitte.setBackground(l.get(akindex));} 
	               } 
	               if(button.getActionCommand().equals("<")){
	            	 
	            	   if(akindex>0) {
	            	    akindex= akindex-1;
	                    	 mitte.setBackground(l.get(akindex));}}
	            	   
	            	   
	               if(button.getActionCommand().equals("reset")){
	            	  rot.setText(" ");  blau.setText(" ");  grün.setText(" ");
	            	  l.clear();
	            	  mitte.setBackground(Color.WHITE);
	               
	               }}
	       
	       }

	     
	     
	      
	       public boolean isRight(String value) {
	    	  
	    	   try {
       		    Integer.parseInt(value);
       	
       		 }
       		 catch(NumberFormatException e) {
       			g.setText("Das war keine Zahl");
       		   return false;
       		 }
	    	   if(Integer.parseInt(value)>255||Integer.parseInt(value)<0) {
	    		   g.setText("Zahl außerhalb des Rahmens");
	    		   return false;
	    	   }
	    	   
	    	   return true;
	       }
	    
	       
	       

	public static void main(String[] args){
new Klausur();
	}
	
}
