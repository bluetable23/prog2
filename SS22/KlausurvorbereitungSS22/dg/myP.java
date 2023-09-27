package dg;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class myP extends JPanel{

	JLabel f;
	int anzKlicks=0;
	public  myP(){
		
		anzKlicks=0;
		f= new JLabel(Integer.toString(anzKlicks));
		f.setHorizontalAlignment(JLabel.CENTER);              
		f.setFont(new Font("Verdana", Font.BOLD, 14));
		this.setBackground(Color.GRAY);
		this.add(f);
		this.setVisible(true);
		
	
	}
	

	
}
