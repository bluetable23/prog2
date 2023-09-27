package aufgabe71;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Taschenrechner extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField text;
	int zahl1;

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
		this.text = new JTextField();
		text.setPreferredSize(new Dimension(250, 40)); // Breite & HÃ¶he
		oben.add(text);
		main.add(oben, BorderLayout.NORTH);
		
		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(6, 3, 10, 10));
		mitte.setBorder(new EmptyBorder(10, 20, 20, 20));
		JButton btn1 = new JButton("1");
		btn1.addActionListener(this);
		JButton btn2 = new JButton("2");
		btn2.addActionListener(this);
		JButton btn3 = new JButton("3");
		btn3.addActionListener(this);
		JButton btn4 = new JButton("4");
		btn4.addActionListener(this);
		JButton btn5 = new JButton("5");
		btn5.addActionListener(this);
		JButton btn6 = new JButton("6");
		btn6.addActionListener(this);
		JButton btn7 = new JButton("7");
		btn7.addActionListener(this);
		JButton btn8 = new JButton("8");
		btn8.addActionListener(this);
		JButton btn9 = new JButton("9");
		btn9.addActionListener(this);
		JButton btn10 = new JButton("(");
		btn10.addActionListener(this);
		JButton btn0 = new JButton("0");
		btn10.addActionListener(this);
		JButton btn11 = new JButton(")");
		btn11.addActionListener(this);
		JButton btn12 = new JButton("*");
		btn12.addActionListener(this);
		JButton btn13 = new JButton("/");
		btn13.addActionListener(this);
		JButton btn14 = new JButton("+");
		btn14.addActionListener(this);
		JButton btn15 = new JButton("-");
		btn15.addActionListener(this);
		JButton btn16 = new JButton(".");
		btn16.addActionListener(this);
		JButton btn17 = new JButton("=");
		btn17.addActionListener(this);
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
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source instanceof JButton){
			JButton button = (JButton) source;
  
			   
			if (button.getActionCommand().equals("1")){
				this.text.setText("1");}
			   
					if (button.getActionCommand().equals("2")){
						this.text.setText("2");}
					   
					if (button.getActionCommand().equals("3")){
						this.text.setText("3");}
					   
					if (button.getActionCommand().equals("4")){
						this.text.setText("4");}
					   
					if (button.getActionCommand().equals("5")){
						this.text.setText("5");}
					   
					if (button.getActionCommand().equals("6")){
						this.text.setText("6");}
					   
					if (button.getActionCommand().equals("7")){
						this.text.setText("7");}
					   
					if (button.getActionCommand().equals("8")){
						this.text.setText("8");}
					   
					if (button.getActionCommand().equals("9")){
						this.text.setText("9");}
					   
					if (button.getActionCommand().equals("(")){
						this.text.setText("(");}
					   
					if (button.getActionCommand().equals("0")){
						this.text.setText("0");}
					   
					if (button.getActionCommand().equals(")")){
						this.text.setText(")");
						System.out.println(text);
						}
					   
					if (button.getActionCommand().equals("*")){
						this.text.setText("*");}
					   
					if (button.getActionCommand().equals("/")){
						this.text.setText("/");}
					   
					if (button.getActionCommand().equals("+")){
						this.text.setText("+");}
					   
					if (button.getActionCommand().equals("-")){
						this.text.setText("-");}
					   
					if (button.getActionCommand().equals(".")){
						this.text.setText(".");}
					   
					if (button.getActionCommand().equals("=")){
						this.text.setText("=");}}
			
		
		
		
		
		}
			
	private void eingabeGleich() 
	{
		
		if(!zahl1Gesetzt)
		{
			zahl1 = Double.parseDouble(aktEingabe);
			eingabe = String.valueOf(zahl1);
			kommaGesetzt = false;
			
			System.out.println("if wurde ausgeführt");
		}
		else
		{
			zahl1Gesetzt = false;
			zahl2 = Double.parseDouble(aktEingabe);
			
			switch(operator)
			{
			case "+" : zahl1 = zahl1 + zahl2; break;
			case "-" : zahl1 = zahl1 - zahl2; break;
			case "*" : zahl1 = zahl1 * zahl2; break;
			case "/" : zahl1 = zahl1 / zahl2; break;
			}
			eingabe = String.valueOf(zahl1);
			aktEingabe = "0";
			operator = "";
			kommaGesetzt = false;
			
			System.out.println("else");
		}
		
	}
			
	
	
	public static void main(String[] args)
	{
		new Taschenrechner();
	}
	}

