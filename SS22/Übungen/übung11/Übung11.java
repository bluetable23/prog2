package übung11;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // list muss hier händisch hinzugefügt werden
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Übung11 extends JFrame implements ActionListener {

	List<JLabel> labels = new ArrayList<>();
	JTextField tf;
	JPanel unten;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Übung11() {
		super();
		this.setTitle("Elemente hinzufügen");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.setSize(450, 350);
		this.setLocation(200, 300);
		this.setVisible(true);
	}

	JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 1));

		JPanel oben = new JPanel();
		oben.setBackground(Color.yellow);

		this.tf = new JTextField(19);

		oben.add(tf);

		JButton btn1 = new JButton("add");
		oben.add(btn1);
		btn1.addActionListener(this);
		
		JButton btn11 = new JButton("gadd");
		oben.add(btn11);
		btn11.addActionListener(this);

		JButton btn2 = new JButton("remove");
		oben.add(btn2);
		btn2.addActionListener(this);

		this.unten = new JPanel();
		unten.setBackground(Color.cyan);

		mainPanel.add(oben);
		mainPanel.add(unten);
		return mainPanel;
	}

	public static void main(String[] args) {
		new Übung11();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source instanceof JButton) {
			JButton button = (JButton) source;

			if (button.getActionCommand().equals("add") || button.getActionCommand().equals("gadd")) {
				System.out.println("add gedrückt");
				String input = this.tf.getText();
				System.out.println(input);
				JLabel neuLabel = new JLabel(input);
				neuLabel.setOpaque(true);
				neuLabel.setBackground(Color.RED);
				this.labels.add(neuLabel);
				this.unten.add(neuLabel);

			} else if (button.getActionCommand().equals("remove")) {
				System.out.println("remove gedrückt");
				String input = this.tf.getText();
				Iterator<JLabel> it = this.labels.iterator();
				while (it.hasNext()) {
					JLabel curLabel = it.next();
					if (curLabel.getText().equals(input)) {
						it.remove();
						this.unten.remove(curLabel);
					}
				}

			}

		}
		this.unten.revalidate();
		this.unten.repaint();
	}
}
