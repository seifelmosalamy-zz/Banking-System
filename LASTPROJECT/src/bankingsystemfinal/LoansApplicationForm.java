/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import Staff.LoanOfficerForm;
import static bankingsystemfinal.BankingSystemFinal.LoansApplicationList;
import static bankingsystemfinal.BankingSystemFinal.ob;
import static bankingsystemfinal.BankingSystemFinal.font;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.font.GraphicComponent;

/**
 *
 * @author seifelmosalamy
 */

public class LoansApplicationForm extends JFrame implements Serializable, Runnable{
    public static int ScoreSheetPoints;
   private ButtonGroup buttongp1 ;
                private     String fname;
                private     String lname ;
                private     String email ;
                private     String address ;
                private    String gender;
                private     String MobileNumber;
                private JButton btn ; 
                

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }
    LoansApplicationForm()
    {                
        
    initComp();
    addComp();
    
    
    
    }

    
    private class ButtonSubmit implements ActionListener 
  {

                public void actionPerformed(ActionEvent e) {
                    
                        Object buttonpressed = e.getSource();
                        if (buttonpressed.equals(btn))
                        {
                                     FrameForPaint ffp = new FrameForPaint();
                                     
                        }
                        
                        if(buttonpressed.equals(jButton1))
                        {
                        
                      fname = jTextField1.getText();
                      lname = jTextField2.getText();
                      email = jTextField3.getText();
                      address = jTextField5.getText();
                      
            if(jRadioButton1.isSelected())

            { 
                ob.gender = "Male";
  
            
            }else if(jRadioButton2.isSelected()) {
                ob.gender = "Female";}
            
                     ob.MobileNumber = jTextField5.getText();
                     String combo1 = jComboBox1.getSelectedItem().toString();
                     
                     if(combo1.equals("El-Zamalek")){
                     ScoreSheetPoints+=5;
                     }
                     else if(combo1.equals("New Cairo")){
                     ScoreSheetPoints+=5;
                     }
                     else if(combo1.equals("El-Rehab")){
                     ScoreSheetPoints+=5;
                     }
                     else if(combo1.equals("Madinaty")){
                     ScoreSheetPoints+=5;
                     }
                      else if(combo1.equals("Sheraton")){
                     ScoreSheetPoints+=4;
                     }       
                            
                     else if(combo1.equals("Nasr City")){
                     ScoreSheetPoints+=3;
                     }
                     else if(combo1.equals("Other")){
                     ScoreSheetPoints+=1;
                     }
                                      
                     if( fname.equals(""))
                     {
                         JOptionPane jop = new JOptionPane();
                         
                       jop.showMessageDialog(null,"Enter valid name");
                       
                     }
                     else{
                               jLabelValid.setForeground(Color.green);
                               jLabelValid.setText("Valid");
                               
                         
                     }
                     
                     String combo2 = jComboBox2.getSelectedItem().toString();
                     
                     if(combo2.equals("2000 or less")){
                     ScoreSheetPoints+=0;
                     }
                     else if(combo2.equals("from 2000 to 5000")){
                     ScoreSheetPoints+=1;
                     }
                     else if(combo2.equals("from 5000 or 7500")){
                     ScoreSheetPoints+=2;
                     }
                     else if(combo2.equals("from 10,000 or 15,000")){
                     ScoreSheetPoints+=3;
                     }
                      else if(combo2.equals("from 25,000 to 50,000")){
                     ScoreSheetPoints+=4;
                     }       
                            
                     else if(combo2.equals("from 50,000 or more")){
                     ScoreSheetPoints+=5;
                     }
                     
                     
                 if(ScoreSheetPoints>5){
                
                        LoansApplicationList.add(ob);
                       
                        ob = new LoansApplicationForm();
                        ScoreSheetPoints=0;
                 }else if(ScoreSheetPoints<6){
                     JOptionPane JO = new JOptionPane();
                JO.showMessageDialog(null, "Sorry your application denied.");
                ScoreSheetPoints=0;
                 }
                
                 
                 String ChoosenLoan =jComboBox5.getSelectedItem().toString();
        LoanOfficerForm LOF = new LoanOfficerForm();
        LOF.approveloans(ChoosenLoan);
        try {
            Thread.sleep(2);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null,"Error in thread");
        }
                 if(LOF.approve==true){
                 JOptionPane.showMessageDialog(null,"Approved");
                 }
                 else if(LOF.approve==false){
                     JOptionPane.showMessageDialog(null,"Disapproved");
                 }
                }    
 
     
    }
    }
    private void initComp() {
        setTitle("Loans Application Form");
                setSize(600,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buttongp1= new ButtonGroup();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8= new JLabel();
        jLabel9= new JLabel();
        jLabelValid= new JLabel();
        btn = new  JButton ("Check Insights");
        
        jTextField1= new JTextField();
        jTextField2= new JTextField();
        jTextField3= new JTextField();
        
       
        jComboBox1= new JComboBox();
         jComboBox2= new JComboBox();
         jComboBox5= new JComboBox();
        jTextField5= new JTextField();
        jRadioButton1= new JRadioButton();
        jRadioButton2= new JRadioButton();
        
        jButton1= new JButton();
        
        jPanel1.setLayout(null);
        jPanel1.setBackground(new Color(20, 100, 190));

         jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);        
        jLabel3.setForeground(Color.white);
         jLabel4.setForeground(Color.white);
        jLabel5.setForeground(Color.white);        
        jLabel6.setForeground(Color.white);
        jLabel7.setForeground(Color.white);
        jLabel8.setForeground(Color.white);
        
        
        jLabel1.setText("Loans Application");
        
        jLabel1.setFont(font);
        jLabel2.setText("First Name:");
        jLabel2.setFont(font);
        jLabel3.setText("Last Name:");
        jLabel3.setFont(font);
        jLabel4.setText("Email:");
        jLabel5.setText("Address:");
        jLabel6.setText("Gender:");
        jLabel7.setText("Mobile Number:");
        jLabel8.setText("Salary");
        
        jLabel1.setBounds(200, 0, 120, 50);
        jLabel2.setBounds(0, 50, 100, 30);
        jLabel3.setBounds(0,100,100,30);
        jLabel4.setBounds(0,150,100,30);
        jLabel5.setBounds(0,200,100,30);
        jLabel6.setBounds(0,250,100,30);
        jLabel7.setBounds(0,300,100,30);
        jLabel8.setBounds(0,350,100,30);
        
        jTextField1.setBounds(200, 55, 120, 20);
        jTextField2.setBounds(200, 100, 120, 20);
        jTextField3.setBounds(200, 150, 120, 20);
        jTextField5.setBounds(200, 305, 120, 20);

        jComboBox2.setBounds(200,350,120,20);
        
        jComboBox1.setBounds(200, 200, 120, 20);
        jComboBox1.addItem("El-Zamalek");
        jComboBox1.addItem("New Cairo");
        jComboBox1.addItem("El-Rehab");
        jComboBox1.addItem("Madinaty");
        jComboBox1.addItem("Sheraton");
        jComboBox1.addItem("Nasr City");
        jComboBox1.addItem("Other");
        
        jComboBox2.addItem("2000 or less");
        jComboBox2.addItem("from 2000 to 5000");
        jComboBox2.addItem("from 5000 or 7500");
        jComboBox2.addItem("from 10,000 or 15,000");
        jComboBox2.addItem("from 25,000 to 50,000");
        jComboBox2.addItem("from 50,000 or more");
        
        jRadioButton1.setText("Male");
        jRadioButton2.setText("Female");
        jRadioButton1.setBackground(new Color(20, 100, 190));
        jRadioButton2.setBackground(new Color(20, 100, 190));
        jRadioButton1.setForeground(Color.white);
        jRadioButton2.setForeground(Color.white);
        
        jRadioButton1.setBounds(200, 250, 100, 30);
        jRadioButton2.setBounds(300, 250, 100, 30);
        
        jButton1.setText("Submit");
        jButton1.setBounds(200,585,100,50);
        btn.setBounds(200,650,100,50);
        jButton1.addActionListener(new ButtonSubmit());
        btn.addActionListener(new ButtonSubmit());
        
        jLabelValid.setBounds(320,405,100,50);
        
        
        
        jLabel9.setText("Choose Your Loan type");
        jLabel9.setBounds(0,400,200,30);
        jLabel9.setForeground(Color.white);
        
        jComboBox5.addItem("Conforming Loans");
        jComboBox5.addItem("Conventional Loans");
        jComboBox5.addItem("Custom Loans");
        jComboBox5.addItem("Auto Loans");
        jComboBox5.addItem("Small Business Loans");
        jComboBox5.addItem("Mortgage Loans");
        jComboBox5.addItem("Wedding Finance Loans");
        jComboBox5.setBounds(200,405,150,25);
        jComboBox5.setForeground(Color.black);
    }

    private void addComp() {
        buttongp1.add(jRadioButton1);
        buttongp1.add(jRadioButton2);
        add(jPanel1);
        jPanel1.add(btn);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel6);
        jPanel1.add(jLabel7);
        jPanel1.add(jTextField1);
        jPanel1.add(jTextField2);
        jPanel1.add(jTextField3);
        jPanel1.add(jComboBox1);
        jPanel1.add(jTextField5);
        jPanel1.add(jRadioButton1);
        jPanel1.add(jRadioButton2);
        jPanel1.add(jLabel8);
        jPanel1.add(jLabel9);
        jPanel1.add(jButton1);
        jPanel1.add(jLabelValid);
        jPanel1.add(jComboBox2);
        jPanel1.add(jComboBox5);
    }
    
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelValid;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
     private JComboBox jComboBox5;
    private JTextField jTextField5;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JButton jButton1;
    
    
    public void run() {
          
        
    }
}