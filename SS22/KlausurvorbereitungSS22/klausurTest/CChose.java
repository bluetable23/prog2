package klausurTest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import dg.KlicksZaehlen;
public class CChose extends JFrame implements ActionListener {
    int aktIndex;
	JPanel mitte;
	JPanel unten;
	JLabel toben;
	JTextField rot = new JTextField(10);
	JTextField grün= new JTextField(10);
	JTextField blau= new JTextField(10);
	List<Color> l = new ArrayList<Color>();
	public CChose(){
		super();
		this.setTitle("Aufgabe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.setSize(400, 300);
		this.setLocation(300, 200);
		this.setVisible(true);}
	


	 private JPanel initContent(){
   JPanel mainPanel= new JPanel();
   mainPanel.setLayout(new BorderLayout());
   
   mitte = new JPanel();
   mitte.setBackground(Color.WHITE);
  mainPanel.add(mitte,BorderLayout.CENTER);
  unten = new JPanel();
  
  JButton n1 = new JButton("save");
  JButton n2 = new JButton("reset");
  JButton n3 = new JButton("<");
  JButton n4 = new JButton(">");
  n1.addActionListener(this);
  n2.addActionListener(this);
  n3.addActionListener(this);
  n4.addActionListener(this);
  
   
  unten.add(n1); unten.add(n2); unten.add(n3);
  unten.add(n4);
  mainPanel.add(unten,BorderLayout.SOUTH);
  
  JPanel oben=new JPanel();
  oben.setLayout(new GridLayout(2,1));;
  toben= new JLabel("Geben sie eine Zahl von 0 - 255");
  oben.add(toben);
  
  JPanel oben2 = new JPanel();
  oben2.setLayout(new GridLayout(3,2));
  oben2.add(new JLabel ("   rot"));
  oben2.add(rot);
  oben2.add(new JLabel ("   blau"));
  oben2.add(blau);
  oben2.add(new JLabel ("   grün"));
  oben2.add(grün);
  
  oben.add(oben2);
  
  mainPanel.add(oben,BorderLayout.NORTH);
  return mainPanel;
 

  
  
  
	   } 
	 
	 
	 @Override
	    public void actionPerformed(ActionEvent e) 
	    {
	        Object quelle = e.getSource();
	        if(quelle instanceof JButton )
	        {
	            JButton button = (JButton) quelle;
	            if(button.getText().equals("save"))
	            {
	               String s1= rot.getText();
	               String s2 = blau.getText();
	               String s3 = grün.getText();
	               
	               if(isValid(s1) && isValid(s2) && isValid(s3)) {
	            	   Color g = new Color (Integer.parseInt(s1), Integer.parseInt(s2), Integer.parseInt(s3));
	            	   mitte.setBackground(g);
	            	   l.add(g);
	            	   aktIndex = l.size()-1;
	               }
	               
	            }
	            else if(button.getText().equals("<"))
	            {
	            	if(aktIndex>0) {
	          
	            	aktIndex= aktIndex-1;
	              	Color n = l.get(aktIndex);
	                mitte.setBackground(n);
	            }}
	            else if(button.getText().equals(">"))
	            {  
	            	if(aktIndex+1< l.size()-1) {
	            		aktIndex= aktIndex+1;
	            		Color n = l.get(aktIndex);
	            
	                mitte.setBackground(n);
	            }}
	            else if(button.getText().equals("reset"))
	            {
	               mitte.setBackground(Color.WHITE);
	               l.clear();
	            }
	        }
	       
	    }
	 
	 public boolean isValid(String s) {
		 try {
              Integer.parseInt(s);
         }
         catch(NumberFormatException e)
         {            toben.setText("keine zahl");
            return false;

         }
		 
		 if( Integer.parseInt(s)>255 || Integer.parseInt(s)<0) {
	            toben.setText("zwischen 0 und 255");
			 return false;
		 }
		 
		 return true;
	 }
	 
	 public static void main(String[] args)
	    {
	        new CChose();
	    }


}
