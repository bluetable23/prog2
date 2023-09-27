package dg;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
class MyPanel extends JPanel
{
    int zeile;
    int spalte;
    int nrClicks;
    JLabel label;

    MyPanel(int zeile, int spalte)
    {
        this.zeile = zeile;
        this.spalte = spalte;
        this.nrClicks = 0;
        this.label = new JLabel("0");
        this.setLayout(new GridLayout());
        this.label.setFont(new Font("Verdana", Font.BOLD, 48));
        this.label.setHorizontalAlignment(JLabel.CENTER);
        this.label.setForeground(Color.WHITE);
        this.add(label);
        this.setBackground(Color.LIGHT_GRAY);
    }


}