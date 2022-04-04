package exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Exercise6 extends JFrame implements ActionListener{
	private JButton aButton;
	private JTextField data;
	private JLabel title, num, avg;

	
	public Exercise6(String name) {
		super(name);
		setLocation(300, 300);
		setSize(500,360);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		title = new JLabel("Enter text segment: ");
		title.setSize(300, 10);
		title.setLocation(165,3);
		this.getContentPane().add(title);
		
		data = new JTextField();
		data.setLocation(10, 20);
		data.setSize(450, 80);
		getContentPane().add(data);
		
		aButton =new JButton("Compute Stats");
		getContentPane().add(aButton);
		aButton.setLocation(165, 60);
		aButton.setSize(130, 25);
		aButton.addActionListener(this);
		
		num = new JLabel("Number of words in text: ");
		num.setSize(150, 10);
		num.setLocation(165,20);
		this.getContentPane().add(num);
		
		avg = new JLabel("The average length of word in text: ");
		avg.setSize(250, 15);
		avg.setLocation(150,40);
		this.getContentPane().add(avg);
		
		TitledBorder border = new TitledBorder("Stat Box");
		border.setTitleJustification(TitledBorder.LEFT);
		border.setTitlePosition(TitledBorder.TOP);
		JPanel panel = new JPanel(null);
		panel.setBorder(border);
		panel.setSize(450,160);
		panel.setLocation(10, 105);
		
		add(title);
		add(data);
		panel.add(avg);
		panel.add(num);
		panel.add(aButton);
		add(panel);
		
		aButton.addActionListener(this);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==aButton) {
			String[] read= data.getText().trim().replaceAll("[^a-zA-Z ]", "").split("\\s+");
			int current = read.length;
			num.setText("Number of words in text: " +current);
			
			 int calc=0;
	           if(current != 0)
	           {
	               int total= 0;
	               for(int i =0;i<current;i++)
	               {
	                   total = total+(read[i].length());
	               }
	               calc = total/current; 
	           }
	           avg.setText("The average length of word in text: "+calc);
	       }
	   }
	
	public static void main(String[] args) {
		JFrame frame = new Exercise6("Compute text stat");
		frame.setVisible(true);
	}
	 

	
}
