package Staff;

import bankingsystemfinal.Interfaces.IManager;
import bankingsystemfinal.Interfaces.ISignUp;

import java.io.Serializable;


public class Manager extends Workers implements IManager,ISignUp,Serializable {

    
   
  
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
