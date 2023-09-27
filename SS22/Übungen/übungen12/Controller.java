package übungen12;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener
{
    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.model.restart();
        this.view = view;
        for(int i = 0; i < this.view.buttons.length; i++) {
            this.view.buttons[i].addActionListener(this);
        }
        this.view.btnStart.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	Object source = e.getSource();
		if (source instanceof JButton) {
			JButton button = (JButton) source;
			
			if(button.getActionCommand().equals("Start")){
			System.out.println("Start-Button");
			}
			else
			{
				String command =button.getActionCommand();
				int index = Integer.valueOf(command).intValue();
				System.out.println("Button"+index+"geklickt");
				int row = index/this.model.getSize();
				int col =index % this.model.getSize();
				this.model.move(row, col);
			if(this.model.curPlayer()==Model.Player.BLACK){
			button.setText("X");
			button.setForeground(Color.black);
			}
			else if(this.model.curPlayer()==Model.Player.RED) {
			button.setText("0");
			button.setForeground(Color.RED);
			}
			this.model.switchPlayer();

    }
}
}}