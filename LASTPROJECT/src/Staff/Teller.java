package Staff;

import Networking.Client;
import bankingsystemfinal.Interfaces.ITeller;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Teller extends Workers implements ITeller ,  Serializable{

    public Teller() {
        
        try {
            Client cl=new Client("Teller");
            cl.setVisible(true);
            cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (IOException ex) {
            Logger.getLogger(Teller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String EmployeeField;
    
    public void Salary()
{
            salary=2500;
}
 
    public void Deposit() {
        
    }

    public void Withdraw() {
    }
}
