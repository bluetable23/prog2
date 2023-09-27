package dg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class KlicksZaehlen extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyPanel[][] panels;
    int meistenClicks;

    KlicksZaehlen(int hoehe, int breite)
    {
        super("Klicks zaehlen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(createMainPanel(hoehe, breite), BorderLayout.CENTER);
        this.setSize(400, 400);
        this.setVisible(true);
        this.meistenClicks=0;
    }

    JPanel createMainPanel(int hoehe, int breite)
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(hoehe, breite, 2, 2));
        mainPanel.setBackground(Color.DARK_GRAY);
        this.panels = new MyPanel[hoehe][breite];
        
        for(int zeile=0; zeile<this.panels.length; zeile++)
        {
            for(int spalte=0; spalte<this.panels[zeile].length; spalte++)
            {
                this.panels[zeile][spalte] = new MyPanel(zeile, spalte);
                this.panels[zeile][spalte].addMouseListener(new MouseListener() {

        			@Override
        			public void mouseClicked(MouseEvent e) {
        				MyPanel mp = (MyPanel)e.getSource();
        		        mp.nrClicks++;
        		        mp.label.setText(String.valueOf(mp.nrClicks));
        		        if(mp.nrClicks>KlicksZaehlen.this.meistenClicks) KlicksZaehlen.this.meistenClicks=mp.nrClicks;
        		        for(int zeile=0; zeile<KlicksZaehlen.this.panels.length; zeile++)
        		        {
        		            for(int spalte=0; spalte<KlicksZaehlen.this.panels[zeile].length; spalte++)
        		            {
        		                if(KlicksZaehlen.this.panels[zeile][spalte].nrClicks == KlicksZaehlen.this.meistenClicks)
        		                {
        		                    KlicksZaehlen.this.panels[zeile][spalte].setBackground(Color.RED);
        		                }
        		                else
        		                {
        		                    KlicksZaehlen.this.panels[zeile][spalte].setBackground(Color.LIGHT_GRAY);
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
                mainPanel.add(this.panels[zeile][spalte]);
            }
        }
        return mainPanel;
    }
    
    public static void main(String[] args)
    {
        new KlicksZaehlen(4,3);
    }

}