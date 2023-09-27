package übungen12;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.*;

public class View extends JFrame
{
    JButton[] buttons; 
    JLabel labelStatus;
    JButton btnStart;
    Model model;

    View(Model model)
    {
        super();
        this.model = model;
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center panel
        JPanel hauptPanel = init();
        this.getContentPane().add(hauptPanel, BorderLayout.CENTER);

        // label panel
        JPanel labelPanel = new JPanel();
        this.labelStatus = new JLabel();
        this.labelStatus.setFont(new Font("Verdana", Font.BOLD, 24));
        this.labelStatus.setText(" ");
        labelPanel.add(this.labelStatus);
        this.getContentPane().add(labelPanel, BorderLayout.NORTH);

        // button panel
        this.btnStart = new JButton("Start");
        this.getContentPane().add(this.btnStart, BorderLayout.SOUTH);

        setSize(400,400);
        setVisible(true);
    }

    private JPanel init()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3,10,10));

        this.buttons = new JButton[9];
        for (int i=0; i<this.buttons.length; i++)
        {
            this.buttons[i]=new JButton();  
            this.buttons[i].setFont(new Font("Verdana", Font.BOLD, 48));
            this.buttons[i].setActionCommand(Integer.toString(i));
            panel.add(buttons[i]);
        }
        return panel;
    }

    public void restart() {
        for (int i=0; i<this.buttons.length; i++)
        {
            this.buttons[i].setText("");
            this.revalidate();
            this.repaint();
        }
    }



}