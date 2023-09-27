package dg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChooseColor extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField inputRed, inputGreen, inputBlue;
	JPanel mainPanel;
	List<Color> colors; 
	JButton last, next, save, reset;
	JLabel statusLabel;
	int currentIndex = 0;
	
	public ChooseColor()
	{
		super();
		this.colors = new ArrayList<>();
		setTitle("Farbauswahl");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel upperPanel = inputRGB();
        this.getContentPane().add(upperPanel, BorderLayout.NORTH);
        
        this.mainPanel = new JPanel();
        this.mainPanel.setBackground(Color.WHITE);
        this.getContentPane().add(this.mainPanel, BorderLayout.CENTER);
        
        JPanel buttonPanel = createButtonPanel();
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        setSize(600,400);
        setVisible(true);
	}
	
	private JPanel inputRGB()
    {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		this.statusLabel = new JLabel("Geben Sie jeweils Zahlen von 0 bis 255 ein!");
		this.statusLabel.setHorizontalAlignment(JLabel.CENTER);
		this.statusLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3,2));
        JLabel labelRed = new JLabel(" Rot : ");
        this.inputRed = new JTextField(10);
        JLabel labelBlue = new JLabel(" Blau : ");
        this.inputBlue = new JTextField(10);
        JLabel labelGreen = new JLabel(" Gruen : ");
        this.inputGreen = new JTextField(10);
        
        inputPanel.add(labelRed);
        inputPanel.add(this.inputRed);
        inputPanel.add(labelBlue);
        inputPanel.add(this.inputBlue);
        inputPanel.add(labelGreen);
        inputPanel.add(this.inputGreen);
        
        panel.add(this.statusLabel);
        panel.add(inputPanel);
        return panel;
    }
	
	private JPanel createButtonPanel()
    {
        JPanel panel = new JPanel();
        this.last = new JButton("<");
        this.next = new JButton(">");
        this.save = new JButton("save");
        this.reset = new JButton("reset");
        panel.add(this.last);
        panel.add(this.reset);
        panel.add(this.save);
        panel.add(this.next);
        
        controllerSave();
        controllerReset();
        controllerLast();
        controllerNext();
        
        return panel;
    }
	
	private void controllerSave()
	{
		this.save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("save");
				boolean inputOk = true;
				String redString = ChooseColor.this.inputRed.getText();
				String blueString = ChooseColor.this.inputBlue.getText();
				String greenString = ChooseColor.this.inputGreen.getText();
				int red = 0, blue = 0, green = 0;
				try {
					red = Integer.valueOf(redString).intValue();
					blue = Integer.valueOf(blueString).intValue();
					green = Integer.valueOf(greenString).intValue();
				}
				catch(NumberFormatException nfe) {
					ChooseColor.this.statusLabel.setText("Eingabe muss eine Zahl sein!");
					inputOk = false;
				}
				if(inputOk && !checkNumbers(red, blue, green)) {
					ChooseColor.this.statusLabel.setText("Eingabe muss eine Zahl zwischen 0 und 255 sein!");
					inputOk = false;
				}
				if(inputOk) {
					Color c = new Color(red, blue, green);
					ChooseColor.this.mainPanel.setBackground(c);
					ChooseColor.this.colors.add(c);
					ChooseColor.this.currentIndex = (ChooseColor.this.colors.size() - 1);
					ChooseColor.this.statusLabel.setText("Geben Sie jeweils Zahlen von 0 bis 255 ein!");
					
				}
			}
			
		});
	}
	
	
	private void controllerReset()
	{
		this.reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChooseColor.this.reset();
			}
			
		});
	}
	
	private void controllerLast()
	{
		this.last.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChooseColor.this.currentIndex = (ChooseColor.this.currentIndex > 0) ? ChooseColor.this.currentIndex-1 : 0;
				Color c = ChooseColor.this.colors.get(ChooseColor.this.currentIndex);			
				ChooseColor.this.mainPanel.setBackground(c);
			}
			
		});
	}
	
	private void controllerNext()
	{
		this.next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChooseColor.this.currentIndex = (ChooseColor.this.currentIndex < (ChooseColor.this.colors.size()-1)) ? ChooseColor.this.currentIndex+1 : ChooseColor.this.colors.size()-1;
				Color c = ChooseColor.this.colors.get(ChooseColor.this.currentIndex);
				ChooseColor.this.mainPanel.setBackground(c);
			}
			
		});
	}
	
	private void reset() {
		this.colors.clear();
		this.mainPanel.setBackground(Color.WHITE);
		this.inputRed.setText(""); 
		this.inputGreen.setText(""); 
		this.inputBlue.setText("");
		this.statusLabel.setText("Geben Sie jeweils Zahlen von 0 bis 255 ein!");
		
	}
	
	private boolean checkNumbers(int red, int blue, int green) {
		return (red >= 0 && red < 256 && blue >= 0 && blue < 256 && green >= 0 && green < 256);
	}
	
	public static void main(String[] args) {
		new ChooseColor();

	}

}
