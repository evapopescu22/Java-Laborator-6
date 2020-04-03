
package org.laboratoare.laborator6;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
        resetButton.addActionListener((ActionListener) canvas);
       
        add(resetButton);
        add(exitButton);
      
        
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
         {
         	   JFileChooser fileChooser = new JFileChooser();
         	   int returnVal = fileChooser.showSaveDialog(null);
         	   if ( returnVal == JFileChooser.APPROVE_OPTION ){
         	       File file = fileChooser.getSelectedFile();
         	       try {
         	   
 					ImageIO.write(frame.canvas.image, "png", file);
 					
 				} catch (IOException e1) {
 					
 					e1.printStackTrace();
 				}
         	   }
         }
     });
        
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
        	    JFileChooser fileChooser = new JFileChooser();
        	    int a = fileChooser.showOpenDialog(null);

        	    if (a == JFileChooser.APPROVE_OPTION) {
        	      File fileToOpen = fileChooser.getSelectedFile();
        	      try {
					Desktop.getDesktop().open(fileToOpen);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
        	    }
        	  }
     });
    
    exitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        	System.exit(0);
        }
    });
    
    resetButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {     
        	
        	
        	
        }
    });
    
   
      

     }
}