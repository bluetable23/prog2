package dg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class KliZ extends JFrame implements MouseListener {
	int b = 0;
	myP[][] g;
	int hoehe;
	int breite;
	JPanel mainPanel;
	JPanel grundPanel;
	int meisteKlicks = 0;
   JButton reset ;
	public KliZ(int hoehe, int breite) {
		super();
		this.setTitle("Aufgabe");
		g = new myP[hoehe][breite];
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(hoehe, breite));
		
		
		this.hoehe = hoehe;
		this.breite = breite;
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.setSize(400, 300);
		this.setLocation(300, 200);
		this.setVisible(true);

	}

	private JPanel initContent() {
		grundPanel=new JPanel();
		grundPanel.setLayout(new BorderLayout());
		
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				{
					myP a = new myP();
					g[i][j] = a;
					a.addMouseListener(new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent e) {

							b = a.anzKlicks + 1;
							a.anzKlicks = b;

							a.f.setText(Integer.toString(b));
							if (b >= meisteKlicks) {
								meisteKlicks = b;
								a.setBackground(Color.RED);
							}

							for (int f = 0; f < g.length; f++) {
								for (int h = 0; h < g[f].length; h++) {
									{

										if (g[f][h].anzKlicks < meisteKlicks) {
											g[f][h].setBackground(Color.GRAY);

										}
									}
								}
							}

						}

						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub

						}
					});

					mainPanel.add(a);

				}
			}
		}
		grundPanel.add(mainPanel,BorderLayout.CENTER);
		reset= new JButton("reset");
reset.addMouseListener(new MouseListener() {

	@Override
	public void mouseClicked(MouseEvent e) {
		mainPanel.removeAll();
      

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
});
		grundPanel.add(reset,BorderLayout.SOUTH);
		return grundPanel;

	}

	public static void main(String[] args) {

		new KliZ(4, 3);

	}

}
