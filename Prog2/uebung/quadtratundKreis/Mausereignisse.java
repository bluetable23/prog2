package quadtratundKreis;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mausereignisse extends JFrame implements MouseListener
{
    private int size;
    private JPanel[][] panels;
    private JPanel panel;

    public Mausereignisse(int size)
    {
        super();
        this.size = size;
        this.setTitle("Mausereignisse");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = initContent(size);

        this.getContentPane().add(mainPanel, BorderLayout.CENTER);

        this.setSize(400,400);
        this.setVisible(true);
    }

    private Color randomColor() 
    {
        Random r = new Random();
        int red = r.nextInt(256);
        int blue = r.nextInt(256);
        int green = r.nextInt(256);

        Color c = new Color(red, blue, green);
        return c;
    }

    private JPanel initContent(int size)
    {
        this.panel = new JPanel();
        this.panel.setLayout(new GridLayout(size, size));
        this.panel.addMouseListener(this);

        this.panels = new JPanel[size][size];
        for (int row = 0; row < panels.length; row++) 
        {
            for (int col = 0; col < panels[row].length; col++) 
            {
                this.panels[row][col] = new JPanel();
                this.panels[row][col].setLayout(new BorderLayout());
                JLabel label = new JLabel(row + " " + col);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setFont(new Font("Verdana", Font.BOLD, 24));
                label.setForeground(Color.WHITE);
                this.panels[row][col].add(label);
                this.panels[row][col].setBackground(randomColor());
                panel.add(this.panels[row][col]);
            }
        }
        return this.panel;
    }

    public static void main(String[] args) 
    {
        new Mausereignisse(4);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");    
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");

    }
}