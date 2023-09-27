package dg;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Uebung extends JFrame implements ActionListener{

	JTextField input = new JTextField(10); 
    JPanel mitte = new JPanel();
    List<JLabel> labels = new ArrayList<>();
	public Uebung(){
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = this.initContent();
		this.getContentPane().add(content);

		this.setSize(400, 300);
		this.setLocation(300, 200);
		this.setVisible(true);}
	
  
	

	 private JPanel initContent(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
     ;
        
        JPanel oben = new JPanel();
        oben.setLayout(new GridLayout(2,1));
        
        JPanel oben1= new JPanel();
        oben1.add(input);
        
        JPanel oben2 = new JPanel();
        oben2.setLayout(new GridLayout(1,2));
        JButton nr1 = new JButton("add");
        nr1.addActionListener(this); 
        JButton nr2 = new JButton("remove");
        nr2.addActionListener(this); 
        oben2.add(nr1);
        oben2.add(nr2);
        
        oben.add(oben1); oben.add(oben2);
       

        
        mainPanel.add(mitte,BorderLayout.CENTER);
        mainPanel.add(oben,BorderLayout.NORTH);
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
	            	
	            	if(keineZahl(input.getText())) {
	            	
	            	JLabel label = new JLabel(input.getText());
	            label.setBackground(Color.RED);
	            label.setOpaque(true);
	                labels.add(label);
	               mitte.add(label);
	            }}
	            else if(button.getActionCommand().equals("remove"))
	            {
	            	  Iterator<JLabel> it = labels.iterator();
	                  while(it.hasNext())
	                  {
	                	  
	                	 JLabel a =it.next();
	                	 
	                      if(a.getText().equals(input.getText())) {
	                      labels.remove(a);
	                      mitte.remove(a);
	                  }}

	            }
	        }
	        mitte.requestFocus(); 
	        mitte.revalidate();
	        mitte.repaint();
	    }

	  public boolean keineZahl(String g) throws IllegalArgumentException {
	         for(int index=0; index < g.length(); index++){
	                char c = g.charAt(index);
	                    if(Integer.valueOf(c)>47 && Integer.valueOf(c)<57){
	            throw new IllegalArgumentException("Eingabe enthält Zahlen");}}
	                  return true;}

	 
	
	
	 public static void main(String[] args) {
		 System.out.println(Integer.valueOf('c'));
		 
		 new Uebung();
	 }




}
