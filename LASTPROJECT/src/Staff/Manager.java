package Staff;

import Networking.Server;
import bankingsystemfinal.Interfaces.IManager;
import bankingsystemfinal.Interfaces.ISignUp;
import java.io.IOException;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Manager extends Workers implements IManager,ISignUp,Serializable {

    public Manager() {
        try {
            Server s=new Server();
            s.setVisible(true);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Thread t=new Thread(s);
            t.start();
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
  
public void Salary()
{
salary=10000;
}
   
    public boolean approveTransaction() {
    
        return true;
    }

    @Override
    public void SignUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
