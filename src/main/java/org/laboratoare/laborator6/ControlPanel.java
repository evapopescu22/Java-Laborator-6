
package org.laboratoare.laborator6;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ControlPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    Graphics2D graphics; 
	final MainFrame frame;
    JButton loadButton = new JButton("Load");
    JButton saveButton = new JButton("Save");
    JButton resetButton = new JButton("Reset");
    JButton exitButton = new JButton("Exit");

	protected DrawingPanel canvas;
   
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
    	setLayout(new GridLayout(1,4));
        add(loadButton);
        add(saveButton);
        add(resetButton);
        add(exitButton);
    
    exitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        	System.exit(0);
        }
    });
 
    resetButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        	int sides=6;
			int radius = 50;
		
			repaint();
        }
    });

     }
}