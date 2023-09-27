package V8;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFirstWindow extends JFrame
{

    public MyFirstWindow()
    {
        super();
        this.setTitle("My first window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.CYAN);    

        JPanel content = this.initContent();
        this.getContentPane().add(content);

        this.setSize(4000, 3000);
        this.setLocation(300,200);
        this.setVisible(true);
    }

  

    
  





	public JPanel initContent() {
		JPanel main = new JPanel();

	    // Steuerlement-Objekte erstellen
	    JLabel label = new JLabel("Name: ");
	    JTextField input = new JTextField(10);
	    JButton button = new JButton("Klick mich!");

	  
		// Steuerlement-Objekte dem Container (JPanel) hinzufuegen
	    main.add(label);
	    main.add(input);
	    main.add(button);
		
		main.setLayout(new BorderLayout());
		
		main.setBackground(Color.CYAN);

		JButton btn1 = new JButton(" Button2");
		main.add(btn1,BorderLayout.NORTH);
		
		JButton btn2 = new JButton(" Button2");
		main.add(btn2,BorderLayout.WEST);
		
		JButton btn3= new JButton(" Buttowaetwaeaeteatsaet");
		main.add(btn3,BorderLayout.EAST);
		
		return main;
		
		
	}
	
	public static void main(String[] args) 
    {
        new MyFirstWindow();
    }

}
