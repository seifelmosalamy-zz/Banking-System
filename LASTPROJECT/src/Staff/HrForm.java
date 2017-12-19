package Staff;

import bankingsystemfinal.AccountInfo;
import static bankingsystemfinal.BankingSystemFinal.CustomerAgentList;
import static bankingsystemfinal.BankingSystemFinal.LoanOfficer;
import static bankingsystemfinal.BankingSystemFinal.Manager;
import static bankingsystemfinal.BankingSystemFinal.Teller;
import bankingsystemfinal.SignUpForm;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author seifelmosalamy
 */
public class HrForm extends JFrame implements Serializable{
    public HrForm() {
       setSize(800,400);
       setTitle("HR");
        setLayout(null);    
       initComponents();
    }
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    
   private void initComponents() {
       
      
       
        
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jComboBox1 = new JComboBox<String>();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField3 = new JTextField();
        jButton1 = new JButton();
        jLabel5 = new JLabel();
        jButton2 = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1000,500);
        jPanel1.setBackground(new Color(20, 100, 190));

        jLabel1.setBounds(10,20,100,25);
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setText("Set Salary ");

        jComboBox1.setBounds(270,20,110,25);
        jComboBox1.addItem("Teller");
        jComboBox1.addItem("LoansOfficer");
        jComboBox1.addItem("CustomerServiceAgent");
        
        jLabel2.setBounds(160,20,100,25);
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setText("Staff");

        jTextField2.setBounds(270,70,110,25);
        jTextField2.setText("Employe UserName");

        jLabel3.setBounds(160,70,100,25);
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setBounds(160,130,100,25);
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Salary");

        jTextField3.setBounds(270,130,110,25);
        jTextField3.setText("Enter the amount");

        jButton1.setBounds(500,300,110,25);
        jButton1.setText("OK");
        jButton1.addActionListener(new ButtonWatcher());
        
        jLabel5.setBounds(10,200,100,25);
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Register Employe");

        jButton2.setBounds(270,200,110,25);
        jButton2.setText("SignUp");
        jButton2.addActionListener(new ButtonWatcher());
        
             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);
             jPanel1.add(jComboBox1);
             jPanel1.add(jLabel1);
             jPanel1.add(jLabel2);
             jPanel1.add(jLabel3);
             jPanel1.add(jLabel4);
             jPanel1.add(jLabel5);                                                
             jPanel1.add(jTextField2);
             jPanel1.add(jTextField3); 
   }
            
    
    private class ButtonWatcher implements ActionListener 
    {
ArrayList<AccountInfo> choosen5= new ArrayList<AccountInfo>(3); 
String type;
        @Override
        public void actionPerformed(ActionEvent ae) {
        SignUpForm s = new SignUpForm();
        Object b= ae.getSource();
        if (b.equals(jButton2))          
            s.setVisible(true);
        if (b.equals(jButton2)){
        type =jComboBox1.getSelectedItem().toString();
                                   
                    if(type.equals("CustomerAgent"))
                        choosen5=CustomerAgentList;
                    else if(type.equals("Teller"))
                        choosen5=Teller;                  
                    else if(type.equals("LoanOfficer")){
                        choosen5=LoanOfficer;}
        for (AccountInfo searchitem4 : choosen5){
                   String EUN = jTextField2.getText();
                if (searchitem4.getUserName().equals(EUN)){
                   int q=Integer.parseInt(jTextField3.getText()); 
                    searchitem4.setSalary(q);
                }
                else {
               JOptionPane.showMessageDialog(null, "Not Found");
                }
           }
        }
        }
        
    }
    
}