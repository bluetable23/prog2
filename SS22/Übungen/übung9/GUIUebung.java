package übung9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import aufgabe7.RoundJTextField;

public class GUIUebung extends JFrame
{
	tf.setSize(20,20);
	oben.add(tf);
	tf.getText();
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUIUebung() {
		super();
		JFrame uebung = new JFrame();
		this.setTitle("GUI Übung");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.setSize(450, 350);
		this.setLocation(300, 200);
		this.setVisible(true);

	}

	private JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		oben.setBorder(BorderFactory.createLineBorder(Color.red, 2, true));

		JLabel n = new JLabel("Text");
		n.setForeground(Color.WHITE);
		oben.add(n);
		oben.setBackground(Color.BLUE);
		mainPanel.add(oben, BorderLayout.NORTH);
		
		
		JPanel mitte = new JPanel();
		
		
		JPanel mitteoben= new JPanel();
		JPanel mitteunten = new JPanel();
		
		
		mitteoben.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		mitteunten.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JLabel b = new JLabel("Text");
		mitteoben.add(b);
		JTextField field = new JTextField(15);
		mitteoben.add(field);
		
		mainPanel.add(mitteoben, BorderLayout.CENTER);
		mainPanel.add(mitteunten, BorderLayout.CENTER);
		
		
		
		
		return mainPanel;
		
		// Ein paar Tipps:
		// mehrere Panels verwenden
		// JTextField hat verschiedene Konstruktoren, nicht nur JTextField(int columns)
		// Rahmen können mit BorderFactory erzeugt werden
		// Beim FlowLayout ändert sich die Größe der Steuerelemente nicht,
		// bei GridLayout passt sich die Größe an den Container an

	}

    public static void main(String[] args) 
    {
        new GUIUebung();
    }

}