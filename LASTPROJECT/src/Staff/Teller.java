package Staff;

import bankingsystemfinal.Interfaces.ITeller;
import java.io.Serializable;

public class Teller extends Workers implements ITeller ,  Serializable{

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
