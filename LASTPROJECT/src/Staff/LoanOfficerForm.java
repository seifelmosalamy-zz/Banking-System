package Staff;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.*;

/**
 *
 * @author mosta
 */
public class LoanOfficerForm extends JFrame implements Serializable{

    public boolean approve = false;

    public LoanOfficerForm() {
          setSize(800,400);
       setTitle("LoanOfficer");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
    }
    public void approveloans(String message ) {
        
        
    String Title = "Approve Lone";
    int reply = JOptionPane.showConfirmDialog(null,message,Title,JOptionPane.YES_NO_OPTION);
    if(reply == JOptionPane.YES_OPTION)   {
        approve=true;
    } 
    }
    
  
}