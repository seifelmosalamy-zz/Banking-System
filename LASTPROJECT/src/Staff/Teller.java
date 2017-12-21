package Staff;

import Networking.Client;
import static bankingsystemfinal.BankingSystemFinal.c;
import bankingsystemfinal.Interfaces.ITeller;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Teller extends Workers implements ITeller ,  Serializable{

    public Teller() {
        
       
    }

    public void BeingATellerClient()
    {
        try{
        c= new Client("Teller");
        c.setVisible(true);

    }catch(Exception e ){}
        
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
