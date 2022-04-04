package exercises;
/*
 * 
 * used for part A, part b on StyleOptionsPanelB
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
	private JLabel saying;
	private JCheckBox bold, italic;
	private JComboBox fontCombo, sizeCombo;
	String[] fontName= {"Make A Selection...", "Times New Roman", "Arial", "Helvetica", "Courier"};
	String [] fSize= {"10","12","14","16","18","20","22","24","26","28"};
	
	
	/**
	* Sets up a panel with a label and some check boxes that
	* control the style of the label's font.
	*/
	public StyleOptionsPanel()
	{
		setLocation(300, 300);
		setSize(300,100);
		setLayout(null);
		fontCombo = new JComboBox (fontName);
		sizeCombo = new JComboBox (fSize);
		
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
	add(sizeCombo);
	add(saying);
	add(bold);
	add(italic);
	setBackground(Color.cyan);
	fontCombo.addItemListener(listener);
	sizeCombo.addItemListener(listener);
	
	saying.setLocation(20, 20);
	italic.setLocation(75,60);
	bold.setLocation(20,60);
	fontCombo.setLocation(130,70);
	sizeCombo.setLocation(265,70);
	saying.setSize(400,40);
	italic.setSize(60,40);
	bold.setSize(60,40);
	fontCombo.setSize(130,20);
	sizeCombo.setSize(40,20);
	
	setPreferredSize(new Dimension(450,100));
	}
	
	private class StyleListener implements ItemListener
	{
	/**
	* Updates the style of the label font style.
	*/
	public void itemStateChanged(ItemEvent event)
	{
	int style = Font.PLAIN;
	if (bold.isSelected())
	{
	style = Font.BOLD;
	}
	if (italic.isSelected())
	{
	style += Font.ITALIC;
	}
		String type = fontCombo.getSelectedItem().toString();
		int size = Integer.parseInt(sizeCombo.getSelectedItem().toString());
	saying.setFont(new Font(type, style, size));
	}
	}
		
}
	

