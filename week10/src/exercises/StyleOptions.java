package exercises;

import javax.swing.JFrame;


public class StyleOptions {

	public static void main(String[] args)
	{
	JFrame frame = new JFrame("Style Options");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//used for part A
	//frame.getContentPane().add(new StyleOptionsPanel());
	frame.getContentPane().add(new StyleOptionsPanelB());
	frame.pack();
	frame.setVisible(true);
	}
}

