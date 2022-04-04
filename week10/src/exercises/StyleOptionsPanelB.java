package exercises;
/*
 * 
 * part b
 * 
 */
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

public class StyleOptionsPanelB extends JPanel
{
	private JLabel saying,sizeLabel;
	private JCheckBox bold, italic;
	private JComboBox fontCombo; 
	private JSlider sizeSlider;
	private int style = Font.PLAIN;
	String[] fontName= {"Make A Selection...", "Times New Roman", "Arial", "Helvetica", "Courier"};
	
	/**
	* Sets up a panel with a label and some check boxes that
	* control the style of the label's font.
	*/
	public StyleOptionsPanelB()
	{
		setLocation(300, 300);
		setSize(500,100);
		setLayout(null);
		fontCombo = new JComboBox (fontName);
		
		sizeSlider = new JSlider (JSlider.HORIZONTAL, 10, 28, 10);
		sizeSlider.setMajorTickSpacing(5);
		sizeSlider.setMinorTickSpacing(1);
		sizeSlider.setPaintTicks(true);
		sizeSlider.setPaintLabels(true);
		sizeSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		sizeLabel = new JLabel("Font size:");
		sizeLabel.setSize(80, 15);
		sizeLabel.setLocation(275,75);
		
		
	saying = new JLabel("Say it with style!");
	saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
	bold = new JCheckBox("Bold");
	bold.setBackground(Color.cyan);
	italic = new JCheckBox("Italic");
	italic.setBackground(Color.cyan);
	StyleListener listener = new StyleListener();
	bold.addItemListener(listener);
	italic.addItemListener(listener);
	add(fontCombo);
	add(sizeSlider);
	add(saying);
	add(bold);
	add(italic);
	add(sizeLabel);
	setBackground(Color.cyan);
	fontCombo.addItemListener(listener);
	sizeSlider.addChangeListener(listener);
	
	saying.setLocation(20, 20);
	italic.setLocation(75,60);
	bold.setLocation(20,60);
	fontCombo.setLocation(130,70);
	sizeSlider.setLocation(350,70);
	saying.setSize(400,40);
	italic.setSize(60,40);
	bold.setSize(60,40);
	fontCombo.setSize(130,20);
	sizeSlider.setSize(200,50);
	
	setPreferredSize(new Dimension(650,130));
	}
	
	private class StyleListener implements ItemListener,ChangeListener
	{
	/**
	* Updates the style of the label font style.
	*/
		
	public void itemStateChanged(ItemEvent event)
	{
	style = Font.PLAIN;
	if (bold.isSelected())
	{
	style = Font.BOLD;
	}
	if (italic.isSelected())
	{
	style += Font.ITALIC;
	}
	if(bold.isSelected()==false) {
		
	}
		String type = fontCombo.getSelectedItem().toString();
		int size = sizeSlider.getValue();
	changing();
	
	}
	
	public void stateChanged(ChangeEvent e) {
			int size = sizeSlider.getValue();
			sizeLabel.setText("Font size: " +size);
			changing();
		
	}
	}
	
	public void changing() {
		
		int size = sizeSlider.getValue();
		String type = fontCombo.getSelectedItem().toString();
		saying.setFont(new Font(type, style, size));
	}
		
}
