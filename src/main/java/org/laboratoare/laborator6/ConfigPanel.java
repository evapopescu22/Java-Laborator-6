package org.laboratoare.laborator6;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {

	final MainFrame frame;
	 JLabel label; // we’re drawing regular polygons
	 JSpinner sidesField; // number of sides
	 JComboBox<?> colorCombo; 
	 
	 public  ConfigPanel(MainFrame frame) {
		 this.setBorder(BorderFactory.createTitledBorder("Toolbar"));
		 this.frame = frame;
		 init();
		 this.setLayout(new GridLayout(2,2));
		 }
   
	private static final long serialVersionUID = 1L;
	  private void init() {
		  
	 JLabel sidesLabel = new JLabel("Number of sides:");
	 sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
	 sidesField.setValue(6);
	 JLabel colorLabel = new JLabel("Color:");
	 
    String[] colors = { "Black", "Random" };
     JComboBox<?> jComboBox = new JComboBox(colors);
	colorCombo = jComboBox;
       
  
    	add(sidesLabel); //JPanel uses FlowLayout by default
    	add(sidesField);     
        add(colorLabel);
        add(colorCombo);
    }

}
