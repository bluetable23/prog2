package dg;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LabelAdd extends JFrame implements ActionListener{
	
	JButton add ;
	JButton remove;
	JTextField g;
	JPanel mitte;
	List<JLabel> labels = new ArrayList<>();
	public LabelAdd(){
		super();
		add = new JButton("add");
		remove = new JButton("remove");
		g= new JTextField(10);
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
  mitte.setBackground(Color.CYAN);
  JPanel oben =new JPanel();
  
 
  
  oben.add(g);
  oben.add(add);
 
  oben.add(remove);
  
  mainPanel.add(oben,BorderLayout.NORTH);
  mainPanel.add(mitte,BorderLayout.CENTER);
  
  
  add.addActionListener(this);
  
  remove.addActionListener(this);

  
  return mainPanel;
  

	 }
	 
	 
	 
	  @Override
	    public void actionPerformed(ActionEvent e) 
	    {   Object quelle = e.getSource();
	        if(quelle instanceof JButton )
	        {
	            JButton button = (JButton) quelle;
	            if(button.getActionCommand().equals("add"))
	            {
	            	   String s = g.getText();
	                   JLabel f = new JLabel(s);
	                  f.setBackground(Color.RED);
	                  f.setOpaque(true);
	                  mitte.add(f);
	                   labels.add(f);
	            }
	            else if(button.getActionCommand().equals("remove"))
	            {    JLabel s = new JLabel(g.getText());

	          	  for (int i=0;i<labels.size();i++) {
	          		  String as = labels.get(i).getText();
	          		  if (as.equals(s.getText())){
	          			  System.out.println("TEST");
	          			  labels.remove(i);
	          			  
	          			  mitte.removeAll();
	          		  }
	          	  }
	          	Iterator<JLabel> it = labels.iterator();   
	            while(it.hasNext())
	            {
	                mitte.add(it.next());
	            }

	            }
	        }
	        this.repaint();
	        this.revalidate();}


	  
	public static void main(String[] args) {
		new LabelAdd();

	}

}
