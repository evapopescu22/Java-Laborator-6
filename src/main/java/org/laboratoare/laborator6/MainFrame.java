package org.laboratoare.laborator6;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	 ConfigPanel configPanel;
	 ControlPanel controlPanel;
	 DrawingPanel canvas;
	
	 public MainFrame() {
		 super("My Drawing Application");
		 init();
		 addComponents();
		 }
   

    private void init() {
    	 {
    	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	        configPanel= new ConfigPanel(this);
    	        canvas = new DrawingPanel(this);
    	        controlPanel = new ControlPanel(this);
    	    }
    }

    private void addComponents(){
        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        pack();
    }
}
