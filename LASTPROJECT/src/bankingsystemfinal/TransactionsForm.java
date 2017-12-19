/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.a;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import static bankingsystemfinal.BankingSystemFinal.x;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author seifelmosalamy
 */
public class TransactionsForm extends JFrame
{
 
    
            private JButton TranseferToAnotherAccountSameCurrency ;
            private JButton TranseferToAnotherAccountCrossCurrency ;
            private JButton TranseferToOwnAccountSameCurrency ;
            private JButton TranseferToOwnAccountCrossCurrency ;
            private JFrame jf ;
            private JTextField text1; 
            private JTextField text2 ; 
            private JLabel lbl2 ; 
            private JButton Transefer ; 
            

    public TransactionsForm() {
     
        setSize(400,400);
        setTitle("Transactions Form");
        setLayout(new FlowLayout());
        setBackground(Color.yellow);
        JPanel panel = new JPanel ();
       
         panel.setLayout(new FlowLayout());
         jf=new JFrame("Transfers");
         jf.setSize(400,400);
        
        TranseferToAnotherAccountSameCurrency = new  JButton ("Transfer to another account same currency ");
       TranseferToAnotherAccountCrossCurrency = new  JButton ("Transfer to another account cross currency");
        TranseferToOwnAccountSameCurrency= new  JButton ("Transfer to own account same currency");
         TranseferToOwnAccountCrossCurrency = new  JButton ("Transfer to own account cross currency");
         text1 = new JTextField("Enter user here");
         Transefer = new JButton("Transefer");
         Transefer.setBounds(labelbounds);
         Transefer.addActionListener(new ButtonWatcher());
            text2 = new JTextField("Enter second user here");
            lbl2 = new JLabel("Please Select Destination Account");
        TranseferToAnotherAccountSameCurrency.setBounds(labelbounds);
        TranseferToAnotherAccountCrossCurrency.setBounds(labelbounds);
        TranseferToOwnAccountSameCurrency.setBounds(labelbounds);
        TranseferToOwnAccountCrossCurrency.setBounds(labelbounds);
        
        //lisnters
        TranseferToAnotherAccountCrossCurrency.addActionListener(new ButtonWatcher());
        
       add( TranseferToAnotherAccountSameCurrency );
       add( TranseferToAnotherAccountCrossCurrency);
       add(TranseferToOwnAccountSameCurrency);
       add(TranseferToOwnAccountCrossCurrency);
    
       
    
    }
            
            private class ButtonWatcher implements ActionListener
            {
                    
                
        public void actionPerformed(ActionEvent ae) {
          Object ButtonPressed =  ae.getSource();
          if(ButtonPressed.equals(Transefer))
          {
              String sourceCurrency  = "";
              String sourceCurrency2  = "";
           a.searchForTwoAccounts(sourceCurrency, sourceCurrency2, text1,text2);
              
              
                     if(!sourceCurrency.equals(sourceCurrency2)&& !sourceCurrency.equals("") && !sourceCurrency2.equals("")){
                     JOptionPane.showMessageDialog(null, "Transfer Done");
                     }
                     else{JOptionPane.showMessageDialog(null, "Cannot be Transfered or Not Found ");}
          }
            if(ButtonPressed.equals(TranseferToAnotherAccountCrossCurrency))
            {
                
                    JLabel lbl1= new JLabel("Please Select a source Account");
                    lbl1.setBounds(labelbounds);
                    text1.setBounds(textfieldbounds);
                    lbl2.setBounds(labelbounds);
                    text2.setBounds(textfieldbounds);
                    jf.add(lbl1);
                    jf.add(text1);
                    jf.add(lbl2);
                    jf.add(text2);
                    jf.add(Transefer);
                    jf.setLayout(new FlowLayout());
                    
                    jf.setVisible(true);
            }
            else if (ButtonPressed.equals(TranseferToAnotherAccountSameCurrency))
            {
                
            }
            else if (ButtonPressed.equals(TranseferToOwnAccountCrossCurrency))
            {
                
                
            }
            else if (ButtonPressed.equals(TranseferToOwnAccountSameCurrency))
            {
                
            }
        }
                
            }
        
    
}
