package exercises;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Exercise1 extends JFrame{
	public Exercise1(String title) {
		super(title);
		setLocation(100, 100);
		setSize(450,115);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setLayout(null);
		
		JButton aButton = new JButton("Naruto");
		getContentPane().add(aButton);
		aButton.setLocation(10, 10);
		aButton.setSize(100, 50);
		aButton.setForeground(Color.orange);
		aButton.setFont((new Font("SansSerif", Font.BOLD, 20)));
		JButton aButton1 = new JButton("Power");
		getContentPane().add(aButton1);
		aButton1.setLocation(115, 10);
		aButton1.setSize(100, 50);
		aButton1.setForeground(Color.magenta);
		aButton1.setFont((new Font("Courier", Font.PLAIN, 14)));
		JButton aButton2 = new JButton("Speed");
		getContentPane().add(aButton2);
		aButton2.setLocation(220, 10);
		aButton2.setSize(100, 50);
		aButton2.setForeground(Color.green);
		aButton2.setFont((new Font("Times New Roman", Font.ITALIC, 8)));
		JButton aButton3 = new JButton("Fitness");
		getContentPane().add(aButton3);
		aButton3.setLocation(325, 10);
		aButton3.setSize(100, 50);
		aButton3.setForeground(Color.pink);
		aButton3.setFont((new Font("Arial", Font.ITALIC, 18)));

	}
	
	public static void main(String[] args) {
		JFrame frame = new Exercise1("My Window");
		frame.setVisible(true);
	}

}
