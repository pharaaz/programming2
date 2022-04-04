package exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class Exercise3 extends JFrame implements ActionListener{
	private JLabel label;
	
	public Exercise3(String title) {
	super(title);
	setLocation(100, 100);
	setSize(300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//setResizable(false);
	setLayout(null);
	
	
	
	JButton aButton = new JButton("Random phrase");
	getContentPane().add(aButton);
	aButton.setLocation(85, 102);
	aButton.setSize(150, 80);
	aButton.addActionListener(this);
	this.getContentPane().add(aButton);
	
	label = new JLabel("Hello World!");
	label.setSize(150, 80);
	label.setLocation(125, 10);
	this.getContentPane().add(label);
	
	}
	
	public static void main(String[] args) {
		Exercise3 frame;
	    frame = new Exercise3("My Window");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random rand= new Random();
		int num = rand.nextInt(5);
		String[] words = {"Hello!! xD ", "How are you?", "Supppp ;P", "Yooooooo :)", "What up? =D"};
		label.setText(words[num]);
	}
}
