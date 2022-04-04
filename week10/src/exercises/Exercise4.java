package exercises;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercise4 extends JFrame implements ActionListener{
	
	private JLabel label;
	private JLabel name;
	private int count = 50;
	JButton aButton;

	public Exercise4(String title) {
	super(title);
	setLocation(300, 300);
	setSize(335,150);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//setResizable(false);
	setLayout(null);
	
	aButton = new JButton("Increment");
	getContentPane().add(aButton);
	aButton.setLocation(50, 40);
	aButton.setSize(115, 25);
	aButton.addActionListener(this);
	this.getContentPane().add(aButton);
	JButton aButton1 = new JButton("Decrement");
	getContentPane().add(aButton1);
	aButton1.setLocation(170, 40);
	aButton1.setSize(115, 25);
	aButton1.addActionListener(this);
	
	label = new JLabel("50");
	label.setSize(100, 10);
	label.setLocation(165,3);
	this.getContentPane().add(label);
	
	name = new JLabel("Increment-Decrement");
	name.setSize(400, 10);
	name.setLocation(2,15);
	this.getContentPane().add(name);
	
	}
	
	public static void main(String[] args) {
		Exercise4 frame;
	    frame = new Exercise4("My Window");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==aButton) {
			count++;
			label.setText("" +count);
		}else {
			count--;
			label.setText("" +count);
		}
	}
	
	/*
	 * 
	 * used for part A
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("" +count);
	}
	
	private class Decrease implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			count--;
			label.setText("" +count);
		}
		
	}

*/


}
