package Staff;

import bankingsystemfinal.AccountInfo;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import bankingsystemfinal.Interfaces.ICustomerServiceAgent;
import bankingsystemfinal.SignUpForm;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CustomerServiceAgent extends Staff implements ICustomerServiceAgent, Serializable {

    public static AccountInfo ty;
public void search(ArrayList<AccountInfo> lis,JTextField tf)
    {
        for (AccountInfo searchitem3 : lis){
                   String EUN = tf.getText();
                if (searchitem3.getUserName().equals(EUN)){
                    JOptionPane.showMessageDialog(null,"Found");

                    searchitem3=ty;
                }else{ JOptionPane.showMessageDialog(null," Not Found");}
        }
    }

                
                
public void RemoveAccount(ArrayList<AccountInfo> lis,JTextField tf)
    {
        int ctr=0;
        for (AccountInfo searchitem3 : lis){
                   String EUN = tf.getText();
                   
                if (searchitem3.getUserName().equals(EUN)){
                    ;
                    ctr++;
                }}
    lis.remove(ctr);
    }

public void ChooseAccountType (ArrayList<AccountInfo> lis,JTextField tf)
{
        
}
    public void AddNewAccount() {
        SignUpForm csas = new SignUpForm();
        csas.setVisible(true);
        CustomerServiceAgentForm hide = new CustomerServiceAgentForm();
        hide.setVisible(false);
    }

    public void RemoveAccount() {
    }

    public void SellCreditCard(AccountInfo c) {
        c.setCard("CreditCard");
    }

    public void SellDebitCard(AccountInfo c) {
        c.setCard("DebitCard");
    }

    public void DeleteUserAccount() {
    }

    @Override
    public void SellCreditCard() {
       
    }

    @Override
    public void SellDebitCard() {
      
    }
}
