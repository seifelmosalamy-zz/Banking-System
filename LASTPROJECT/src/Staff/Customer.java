package Staff;

import bankingsystemfinal.Interfaces.ICustomer;
import bankingsystemfinal.AccountInfo;
import java.io.Serializable;

public class Customer extends AccountInfo implements ICustomer , Serializable{

    private int Balance;

    private int No;

    public Customer()
    {
            
    }

    public void BankAccount() {
        
    }
    
}
