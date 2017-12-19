/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;


import bankingsystemfinal.AccountInfo;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import static bankingsystemfinal.BankingSystemFinal.a;
import bankingsystemfinal.LoginForm;
import static bankingsystemfinal.LoginForm.CUN;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author new
 */
public class CustomerForm extends JFrame implements Serializable{
    
    
    public CustomerForm() {
       setSize(800,660);
       setTitle("Customer");
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
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel10;
    private JLabel jLabel20;

    public void setjLabel10(String jLabel10) {
        this.jLabel10.setText(jLabel10);
    }

    public void setjLabel20(String jLabel20) {
        this.jLabel20.setText(jLabel20);
    }

    public void setjLabel30(char[] jLabel30) {
    String y =String.copyValueOf(jLabel30);
        this.jLabel30.setText(y);
    }

    public void setjLabel40(String jLabel40) {
        this.jLabel40.setText(jLabel40);
    }

    public void setjLabel50(String jLabel50) {
        this.jLabel50.setText(jLabel50);
    }

    public void setjLabel60(String jLabel60) {
        this.jLabel60.setText(jLabel60);
    }

    public void setjLabel70(String jLabel70) {
        this.jLabel70.setText(jLabel70);
    }

    public void setjLabel80(String jLabel80) {
        this.jLabel80.setText(jLabel80);
    }
    private JLabel jLabel30;
    private JLabel jLabel40;
    private JLabel jLabel50;
    private JLabel jLabel60;
    private JLabel jLabel70;
    private JLabel jLabel80;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JTextField jTextField2;
   

    private void initComponents() {
        
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel10 = new JLabel();
        jLabel20 = new JLabel();
        jLabel30 = new JLabel();
        jLabel40 = new JLabel();
        jLabel50 = new JLabel();
        jLabel60 = new JLabel();
        jLabel70 = new JLabel();
        jLabel80 = new JLabel();
        jLabel9 = new JLabel();
        jTextField2 = new JTextField();
        jButton2 = new JButton();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1000,660);
        jPanel1.setBackground(new Color(20, 100, 190));
          
        jLabel1.setBounds(10,20,100,25);
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setText("Fname ");
        
        jLabel2.setBounds(10,70,100,25);
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setText("Lname ");
        
         jLabel3.setBounds(10,120,100,25);
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setText("Password ");
        
         jLabel4.setBounds(10,170,100,25);
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setText("Email ");
        
         jLabel5.setBounds(10,220,100,25);
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setText("MobileNumber ");
        
         jLabel6.setBounds(10,270,100,25);
        jLabel6.setForeground(Color.WHITE);
        jLabel6.setText("BankAmount ");
        
         jLabel7.setBounds(10,320,130,25);
        jLabel7.setForeground(Color.WHITE);
        jLabel7.setText("AccountCurrencyType ");
        
        jLabel8.setBounds(10,370,100,25);
        jLabel8.setForeground(Color.WHITE);
        jLabel8.setText("UserName ");
        
        jLabel10.setBounds(210,20,100,25);
        jLabel10.setForeground(Color.WHITE);
        
        
        jLabel20.setBounds(210,70,100,25);
        jLabel20.setForeground(Color.WHITE);
       
        
         jLabel30.setBounds(210,120,100,25);
        jLabel30.setForeground(Color.WHITE);
        
        
         jLabel40.setBounds(210,170,100,25);
        jLabel40.setForeground(Color.WHITE);
        
         jLabel50.setBounds(210,220,100,25);
        jLabel50.setForeground(Color.WHITE);
        
        
         jLabel60.setBounds(210,270,100,25);
        jLabel60.setForeground(Color.WHITE);
       
        
         jLabel70.setBounds(210,320,130,25);
        jLabel70.setForeground(Color.WHITE);
        
        
        jLabel80.setBounds(210,370,100,25);
        jLabel80.setForeground(Color.WHITE);
        
        
        jLabel9.setBounds(10,420,100,25);
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText("Modify ");
        
        jComboBox1.setBounds(200,420,130,25);
        jComboBox1.addItem("Fname");
        jComboBox1.addItem("UserName");
        jComboBox1.addItem("AccountCurrencyType");
        jComboBox1.addItem("MobileNumber");
        jComboBox1.addItem("Email");
        jComboBox1.addItem("Password");
        jComboBox1.addItem("Lname");

        jTextField2.setBounds(370,420,150,25);    
        
        jButton1.setBounds(10,500,80,40);
        jButton1.setText("Modify");
        jButton1.setBounds(370,500,80,40);
        
        
            jButton1.addActionListener(new ButtonWatcher());
             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);
             jPanel1.add(jComboBox1);
             jPanel1.add(jLabel1);
             jPanel1.add(jLabel2);
             jPanel1.add(jLabel3);
             jPanel1.add(jLabel4);
             jPanel1.add(jLabel5); 
             jPanel1.add(jLabel6);
             jPanel1.add(jLabel7);
             jPanel1.add(jLabel8); 
             jPanel1.add(jLabel10);
             jPanel1.add(jLabel20);
             jPanel1.add(jLabel30);
             jPanel1.add(jLabel40);
             jPanel1.add(jLabel50); 
             jPanel1.add(jLabel60);
             jPanel1.add(jLabel70);
             jPanel1.add(jLabel80); 
             jPanel1.add(jLabel9);
             jPanel1.add(jTextField2);
             
    }
    private class ButtonWatcher implements ActionListener 
  {

       
        public void actionPerformed(ActionEvent e) {
            
           Object buttonpressed = e.getSource();
           if(buttonpressed.equals(jButton1)){
           String combo1 = jComboBox1.getSelectedItem().toString();
           String LCUN= CUN;          
                     for (AccountInfo searchitem3 : CustomerList){
  
                if (searchitem3.getUserName().equals(LCUN)){
                     if(combo1.equals("Fname")){                        
                    searchitem3.setFname(jTextField2.getText());
                    jLabel10.setText(jTextField2.getText());
                     }
                     else if(combo1.equals("UserName")){
                     searchitem3.setUserName(jTextField2.getText());
                     jLabel80.setText(jTextField2.getText());
                     }
                     else if(combo1.equals("AccountCurrencyType")){
                   searchitem3.setAccountCurrencyType(jTextField2.getText());
                   jLabel70.setText(jTextField2.getText());
                     }
                     else if(combo1.equals("MobileNumber")){
                         int MN =Integer.parseInt(jTextField2.getText());
                        searchitem3.setMobileNumber(MN); 
                        jLabel50.setText(""+jTextField2.getText());
                     }
  
                      else if(combo1.equals("Email")){
                     searchitem3.setEmail(jTextField2.getText());
                     jLabel40.setText(jTextField2.getText());
                     }       
                     else if(combo1.equals("Password")){ 
                     String p =jTextField2.getText();
                     
                     char [] pw = null;
                     for(int i=0;i<p.length();i++){
                        pw[i]=p.charAt(i);
                         }
                   searchitem3.setPassword(pw);
                   jLabel30.setText(p);
                     }       
                     else if(combo1.equals("Lname")){
                     searchitem3.setLname(jTextField2.getText());
                     jLabel20.setText(jTextField2.getText());
                     }          
                      try {
                          
            a =null;
            ObjectOutputStream ob= new ObjectOutputStream(new FileOutputStream("Customer"+".txt"));
            ob.writeObject(CustomerList);
            ob.close();      
              } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Error in save");}
        
                }
           }
        }
    }
    
}}
