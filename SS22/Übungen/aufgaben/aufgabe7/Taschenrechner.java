package aufgaben.aufgabe7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Taschenrechner extends JFrame {

	public Taschenrechner()
	{
		super(); 

		this.setTitle("Taschenrechner");  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		JPanel content = this.initContent();
		this.getContentPane().add(content); 

		this.setSize(300, 400);   
		this.setLocation(300, 200); 
		this.setVisible(true); 
		
	}
	
	public JPanel initContent()
	{
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(250, 40)); // Breite & HÃ¶he
		oben.add(text);
		main.add(oben, BorderLayout.NORTH);
		
		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(6, 3, 10, 10));
		mitte.setBorder(new EmptyBorder(10, 20, 20, 20));
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn10 = new JButton("(");
		JButton btn0 = new JButton("0");
		JButton btn11 = new JButton(")");
		JButton btn12 = new JButton("*");
		JButton btn13 = new JButton("/");
		JButton btn14 = new JButton("+");
		JButton btn15 = new JButton("-");
		JButton btn16 = new JButton(".");
		JButton btn17 = new JButton("=");
		mitte.add(btn1);
		mitte.add(btn2);
		mitte.add(btn3);
		mitte.add(btn4);
		mitte.add(btn5);
		mitte.add(btn6);
		mitte.add(btn7);
		mitte.add(btn8);
		mitte.add(btn9);
		mitte.add(btn10);
		mitte.add(btn0);
		mitte.add(btn11);
		mitte.add(btn12);
		mitte.add(btn13);
		mitte.add(btn14);
		mitte.add(btn15);
		mitte.add(btn16);
		mitte.add(btn17);
		main.add(mitte);
		
		
		
		return main;
	}
	
	public static void main(String[] args)
	{
		new Taschenrechner();
	}
}
