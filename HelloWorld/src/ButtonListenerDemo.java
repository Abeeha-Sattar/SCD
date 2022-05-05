import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonListenerDemo extends JFrame implements ActionListener{
	JFrame fr;
	JButton b1, b2, b3;
	
	public ButtonListenerDemo() {
		fr = new JFrame();
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		
		
		b1.setBounds(100, 100, 100, 30);
		b2.setBounds(100, 200, 100, 30);
		b3.setBounds(100, 300, 100, 30);
		
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		
		fr.setSize(500, 500);
		fr.setLayout(null);
		fr.setVisible(true);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		ButtonListenerDemo bDemo = new ButtonListenerDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			b1.setVisible(false);
			b2.setVisible(true);
			b3.setVisible(true);
		} else if (e.getSource() == b2) {
			b1.setVisible(true);
			b2.setVisible(false);
			b3.setVisible(true);
		} else {
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(false);
		}
	}
		

}
