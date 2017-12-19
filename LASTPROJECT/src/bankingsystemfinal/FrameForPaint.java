/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import javax.swing.JFrame;

/**
 *
 * @author seifelmosalamy
 */
public class FrameForPaint extends JFrame
{

    public FrameForPaint() {
        
     Reports re = new Reports();
         re.GenderReport();                
          setSize(1000,1000);    
          setTitle("Painting Statistics");
          add(new GraphicsClass());
          setVisible(true);
           
             
    }
    
    
}
