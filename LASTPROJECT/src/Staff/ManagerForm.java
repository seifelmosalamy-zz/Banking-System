/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;


import bankingsystemfinal.AccountInfo;
import static bankingsystemfinal.BankingSystemFinal.CustomerAgentList;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import static bankingsystemfinal.BankingSystemFinal.LoanOfficer;
import static bankingsystemfinal.BankingSystemFinal.Manager;
import static bankingsystemfinal.BankingSystemFinal.Teller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.StyleConstants;
/**
 *
 * @author seifelmosalamy
 */
public class ManagerForm extends JFrame implements Serializable{
    
     public ManagerForm() {
          setSize(800,400);
       setTitle("Manager");
        setLayout(null);
        initComponents();
    }
     private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JTextField jTextField1;
     private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jTextField1 = new JTextField();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1000,500);
        jPanel1.setBackground(new Color(20, 100, 190));

        jLabel1.setBounds(10,20,100,25);
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Transactions");

        jRadioButton1.setBounds(430,20,100,25);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Appprove");

        jRadioButton2.setBounds(580,20,100,25);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Disapprove");

        jLabel2.setBounds(10,160,100,25);
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Delete Employe");

        jButton1.setBounds(580,160,100,25);
        jButton1.setText("Delete");

        jButton2.setBounds(600,300,80,25);
        jButton2.setText("OK");

        jComboBox1.setBounds(200,20,130,25);
        jComboBox1.addItem("Item 1");
        jComboBox1.addItem("Item 2");
        jComboBox1.addItem("Item 3");
        jComboBox1.addItem("Item 4");
        

        jTextField1.setBounds(200,160,130,25);
        jTextField1.setText("Enter User name");

        jComboBox2.setBounds(200,220,130,25);
        jComboBox2.addItem("CustomerAgent");
        jComboBox2.addItem("Teller");
        jComboBox2.addItem("LoanOfficer");
        jComboBox2.addItem("Manager");
        
        jButton3.setBounds(430,160,100,25);
        jButton3.setText("Search");
        jButton1.addActionListener(new ButtonWatcher());
        jButton2.addActionListener(new ButtonWatcher());
             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);
             jPanel1.add(jButton3);
             jPanel1.add(jLabel1);
             jPanel1.add(jLabel2);
             jPanel1.add(jComboBox1); 
             jPanel1.add(jComboBox2);
             jPanel1.add(jRadioButton1); 
             jPanel1.add(jRadioButton2);
             jPanel1.add(jTextField1); 
            
     }
      private class ButtonWatcher implements ActionListener 
  {

       ArrayList<AccountInfo> choosen4= new ArrayList<AccountInfo>(3); 
       int count=0;
       String type;
        public void actionPerformed(ActionEvent e) {
            
           Object buttonpressed = e.getSource();
           if(buttonpressed.equals(jButton1)){
              type =jComboBox2.getSelectedItem().toString();
                                   
                    if(type.equals("CustomerAgent"))
                        choosen4=CustomerAgentList;
                    else if(type.equals("Teller"))
                        choosen4=Teller;
                    else if(type.equals("Manager"))
                        choosen4=Manager;
                    else if(type.equals("LoanOfficer")){
                        choosen4=LoanOfficer;}
                    
                   for (AccountInfo searchitem3 : choosen4){
                   String EUN = jTextField1.getText();
                if (searchitem3.getUserName().equals(EUN)){
                    JOptionPane.showMessageDialog(null,"Found");
                }
                else {JOptionPane.showMessageDialog(null,"Not Found");
                count++;
                }
           }
               
               
           }
           if(buttonpressed.equals(jButton2)){
           choosen4.remove(count);
           
           }
           if(buttonpressed.equals(jButton3)){           
//               try {
//                   
//                 ObjectOutputStream ob2 = new ObjectOutputStream(new FileOutputStream(type+".txt"));
//            ob2.writeObject(choosen4);
//            ob2.close(); 
//            } catch (FileNotFoundException ex) {
//                   
//               }
        }}
}}