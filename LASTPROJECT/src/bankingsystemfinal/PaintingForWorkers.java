/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Seif Elmosalamy
 */
public class PaintingForWorkers extends JPanel {
  
 private int [] arr = {500,200,300,100,200};
         private      int arr2[] ={500,200,300,100,200};
    public PaintingForWorkers()
    {
        
        setSize(1000,1000);
        setBackground(Color.black);
        setVisible(true);
              
    }
    
           public void paintComponent(Graphics g){
            super.paintComponent(g);
              g.setColor(Color.cyan);          
              g.drawPolyline(arr, arr2, 5);
}
}