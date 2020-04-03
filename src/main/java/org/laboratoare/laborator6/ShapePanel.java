package org.laboratoare.laborator6;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D ; 
import java.awt.geom.Ellipse2D ;


public class ShapePanel extends JPanel {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final MainFrame frame ;
	    JComboBox<?> shapeCombo;
		private Graphics2D g;
	    
	    public ShapePanel(MainFrame frame) {
	        this.frame = frame;
	        init();
	    }
	    Graphics2D g2d = (Graphics2D)g;
	    int x = 0;
	    
	    int y = 0;
	   
	    int w = getSize().width-1;
	   
	    int h = getSize().height-1;
		
		private void init() {
		List<Shape> shapelist = new ArrayList<Shape>();
	    
		{
	     for (int i=1; i<=1;i++) {
	         shapelist.add( new Ellipse2D.Double(x,y,w,h));
	         shapelist.add( new Line2D.Double(x,y,w,h));
	         shapelist.add( new Polygon());
	         }
	       }
		
		String[] shapes = { "Polygon", "Ellipse", "Line" };
	     JComboBox<?> jComboBox = new JComboBox(shapes);
	     jComboBox.setPreferredSize(new Dimension(200,20));
		 shapeCombo = jComboBox;
	     add(shapeCombo);
	     
	    jComboBox.setSelectedIndex(0);
	    add(jComboBox);
	    
	    jComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
	        JComboBox cd =(JComboBox)e.getSource();
	        String msg = (String)cd.getSelectedItem();
	        switch (msg) {
	        case "Poligon": ;
	           break;
	        case "Ellipse": ;
	           break;
	        case "Line":  ;
	        break;
	        
	            }
            }
            
	    });
		}
}
