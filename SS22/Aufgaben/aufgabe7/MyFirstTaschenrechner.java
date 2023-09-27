package aufgabe7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFirstTaschenrechner extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFirstTaschenrechner() {
		super();
		JFrame window = new JFrame();
		this.setTitle("Annas Taschenrechner");

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
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.PINK, 35, true));

		JPanel oben = new JPanel();

		oben.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		JTextField field = new RoundJTextField(15);
		oben.add(field);
		oben.setBackground(Color.PINK);

		JPanel mitte = new JPanel();
		mitte.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4, true));
		mitte.setLayout(new GridLayout(6, 3, 10, 10));
		for (int i = 1; i < 10; i++) {
			JButton b = (new RoundButton(String.valueOf(i), 20));
			b.setForeground(Color.PINK);
			b.setBackground(Color.white);
			b.setFont(new Font("Aharoni", Font.BOLD, 15));
			mitte.add(b);

		}

		mitte.add(test(new RoundButton("(", 10)));
		mitte.add(test(new RoundButton("0", 20)));
		mitte.add(test(new RoundButton(")", 20)));
		mitte.add(test(new RoundButton("*", 20)));
		mitte.add(test(new RoundButton("/", 20)));
		mitte.add(test(new RoundButton("+", 20)));
		mitte.add(test(new RoundButton("-", 20)));
		mitte.add(test(new RoundButton(".", 20)));
		mitte.add(test(new RoundButton("=", 20)));
		mitte.setBackground(Color.PINK);

		JPanel unten = new JPanel();
		unten.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		unten.setBackground(Color.PINK);

		;

		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(mitte, BorderLayout.CENTER);
		mainPanel.add(unten, BorderLayout.SOUTH);

		return mainPanel;
	}

	public RoundButton test(RoundButton b1) {
		b1.setForeground(Color.ORANGE);
		b1.setBackground(Color.white);

		b1.setFont(new Font("Aharoni", Font.BOLD, 15));
		return b1;
	}

	public static void main(String[] args) {
		new MyFirstTaschenrechner();
	}

}
