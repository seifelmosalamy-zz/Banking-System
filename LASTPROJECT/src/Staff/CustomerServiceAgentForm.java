/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;


import static Staff.CustomerServiceAgent.ty;
import bankingsystemfinal.BankingSystemFinal;

import static bankingsystemfinal.BankingSystemFinal.CustomerList;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Mohamed
 */
public class CustomerServiceAgentForm extends JFrame implements Serializable{
    
    public CustomerServiceAgentForm() {
        
        initComponents();
        addComponents();
    }

    private void initComponents() {
        setSize(800,400);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
jPanel1 = new JPanel();
jLabel1  = new JLabel();
jLabel2 = new JLabel();
jLabel3 = new JLabel();
jButton1= new JButton();
jButton2= new JButton();
AccountTypes = new JComboBox<String>();
AccountTypeButton = new JButton();

AccountTypes.addItem("Saving");
AccountTypes.addItem("Company");
AccountTypes.addItem("TimeDeposit");
AccountTypes.addItem("YouthAccount");




jButton3= new JButton();
jTextField1= new JTextField();
jTextField2= new JTextField();
jCheckBox1= new JCheckBox();
jCheckBox2= new JCheckBox();
jPanel1.setLayout(null);

setTitle("Customer Service Agent");
jPanel1.setBackground(new Color(20, 100, 190));

        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);        
        jLabel3.setForeground(Color.white);
     
        jLabel1.setText("Register Customer");
        jLabel1.setBounds(0, 15, 120, 25);
        
        jLabel2.setText("Remove Customer");
        jLabel2.setBounds(0, 90, 150, 25);
       
        jLabel3.setText("Cards");
        jLabel3.setBounds(0, 0, 150, 300);
        
        jTextField1.setText("Enter The Customer Name");
        jTextField1.setBounds(120, 90, 160, 25);
        
        jTextField2.setText("Enter The Customer Name");
        jTextField2.setBounds(120, 135, 160, 25);
        
        jButton1.setText("SignUp");
        jButton1.setBounds(130,15,80,25);
        
        jButton2.setText("Search");
        jButton2.setBounds(300, 90, 100, 25);
        
        jButton3.setText("Remove");
        jButton3.setBounds(430, 90, 100, 25);
        AccountTypes.setBounds(580, 90, 100, 25);
        
       
        
        jCheckBox1.setText("Credit Card");
        jCheckBox1.setBounds(300, 135, 100, 25);
        jCheckBox1.setBackground(new Color(20, 100, 190));
        jCheckBox1.setForeground(Color.white);
       
        
        jCheckBox2.setText("Debit Card");
        jCheckBox2.setBounds(430, 135, 100, 25);
        jCheckBox2.setBackground(new Color(20, 100, 190));
        jCheckBox2.setForeground(Color.white);

    }
 private JPanel  jPanel1;
 private JLabel jLabel1;
 private JLabel jLabel2;
 private JLabel jLabel3;
 private JButton jButton1;
 private JButton jButton2;
 private JButton jButton3;
 private JTextField jTextField1;
 private JTextField jTextField2;
 private JCheckBox jCheckBox1;
 private JCheckBox jCheckBox2;
 private JButton AccountTypeButton ; 
 
private JComboBox AccountTypes ; 
    private void addComponents() {
        add(jPanel1);
        jPanel1.add(AccountTypes);
        jCheckBox1.addActionListener(new ButtonWatcher());
        jButton1.addActionListener(new ButtonWatcher());
        jButton2.addActionListener(new ButtonWatcher());
        jButton3.addActionListener(new ButtonWatcher());
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jTextField1);
        jPanel1.add(jTextField2);
        jPanel1.add(jCheckBox1);
        jPanel1.add(jCheckBox2);

    }
 
private class ButtonWatcher implements ActionListener
    {
CustomerServiceAgent po = new CustomerServiceAgent();
     String type;
       
        public void actionPerformed(ActionEvent ne) {
        Object b= ne.getSource();

        if(b.equals(AccountTypes))
        {
            String selected=AccountTypes.getSelectedItem().toString();
            ty.setAccountType(selected);
            
        }
        if (b.equals(jButton1)) 
        {
            
        }     
        

        if (b.equals(jButton1))  {
            po.AddNewAccount();
        }  
        if(b.equals(jButton2)){
        po.search(CustomerList, jTextField1);
        }
        if(b.equals(jButton3)){
        po.RemoveAccount(CustomerList, jTextField1);
        }
        if(b.equals(jCheckBox1)){
           
        po.SellCreditCard();
        }
        if(b.equals(jCheckBox2)){
        po.SellDebitCard();
        }

}

       
    }}