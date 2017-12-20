/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;
import Exceptions.SignUpException;
import static bankingsystemfinal.BankingSystemFinal.CustomerAgentList;
import static bankingsystemfinal.BankingSystemFinal.LoanOfficer;
import static bankingsystemfinal.BankingSystemFinal.Manager;
import static bankingsystemfinal.BankingSystemFinal.Teller;
import static bankingsystemfinal.BankingSystemFinal.a;
import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;

import java.awt.Color;
import java.awt.FlowLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static java.lang.System.exit;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;




/**
 *
 * @author seifelmosalamy
 */
public class SignUpForm extends JFrame   
{
   private JTextField UserNameTextField;
    private JLabel UserNameLabel ; 
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JButton ReadButton;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel Jlabelname;
    private JButton SaveButton ;
    private JLabel PasswordLabel;
    private JPasswordField jPasswordField1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private ButtonGroup buttongp1;
    private JButton btnCustomer ;
    private JLabel SoraIcon = new JLabel();
    private JPanel panelelsora ; 
     private  JComboBox comboCustomer = new JComboBox<>();
  private JPanel panel = new JPanel();


        public SignUpForm()  {
        
                //Panel
        setTitle("Sign Up");
        JPanel panel = new JPanel();
       panelelsora = new JPanel();
    setResizable(false);
                //Panel
                 
                panelelsora.setLayout(null);
                panelelsora.setSize(500,500);
        setLayout(null);
        panelelsora.setBounds(0, 0, 500, 500);
        panel.setBounds(500, 0, 500, 500);
        panel.setLayout(null);
        panelelsora.setBackground(new Color(3,147,147));
        panel.setBackground(new Color(36, 45, 67));
        add(panel);
        add(panelelsora);
           //JFrame Properties
            
            setBackground(Color.white);
            //setLayout(new FlowLayout());
        //    setTitle("Sign Up");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
            setSize(1000,500);
            
      //Initializing variables 
        buttongp1= new ButtonGroup();
        PasswordLabel = new JLabel("Password");
        UserNameTextField = new JTextField("Enter UserName");
        UserNameLabel = new JLabel("User Name");
        ReadButton = new JButton ("Read From File");
        Jlabelname = new JLabel();
        jButton3 = new JButton();
        jTextField1 = new JTextField("Enter your first name");
        jLabel1 = new JLabel("First Name");
        jLabel2 = new JLabel("Last Name");
        jTextField2 = new JTextField("Enter your last name");
        jLabel3 = new JLabel("Email");
        jLabel4 = new JLabel("Mobile Number");
        jLabel5 = new JLabel("Password");
        jLabel6 = new JLabel("Age");
        jTextField3 = new JTextField("Enter your email here");
        jTextField5 = new JTextField("Enter your mobile number");
        jTextField6 = new JTextField("Enter your age");
        jTextField7 = new JTextField();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton("Submit");
        jLabel10 = new JLabel();
        jLabel9 = new JLabel();
        jPasswordField1 = new JPasswordField();  
        jLabel13 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jButton2 = new JButton("Search for an employee");
        jButton4 = new JButton();
        jButton5 = new JButton();       
        jRadioButton2 = new JRadioButton();
        jRadioButton1 = new JRadioButton();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        SaveButton = new JButton();
        jPasswordField1 = new JPasswordField("Enter Password");
        btnCustomer = new JButton("Sign up as a customer");
        try {
      
          
            ImageIcon iconLogo = new ImageIcon("BankIcon.png");
            
            SoraIcon.setIcon(iconLogo);
        }catch(Exception k){}
        
        
        

  
            //Listners 
            
         jButton1.addActionListener(new ButtonWatcher());
         jButton2.addActionListener(new ButtonWatcher());
         SaveButton.addActionListener(new ButtonWatcher());
         ReadButton.addActionListener(new ButtonWatcher());
         jComboBox1.addActionListener(new ButtonWatcher());
         btnCustomer.addActionListener(new ButtonWatcher());
         jTextField1.addMouseListener(new MouseListner());
         jTextField2.addMouseListener(new MouseListner());
         jTextField3.addMouseListener(new MouseListner());
         jTextField5.addMouseListener(new MouseListner());
         jTextField6.addMouseListener(new MouseListner());
         jTextField7.addMouseListener(new MouseListner());
         jPasswordField1.addMouseListener(new MouseListner());
         UserNameTextField.addMouseListener(new MouseListner());
          
//Setting Bounds 
        //Setting Bounds 
        jComboBox1.addItem("CustomerAgent");
        jComboBox1.addItem("Teller");
        jComboBox1.addItem("Manager");
        jComboBox1.addItem("LoanOfficer");
        jComboBox1.addItem("Customer");
        jComboBox1.setBounds(20,300,130,30);
        comboCustomer.addItem("EGP Account");
        comboCustomer.addItem("Dollar Account");
       
        
        
        
        jTextField1.setBounds(110,0,100,30);
        jTextField2.setBounds(110,40,100,30);
        jTextField3.setBounds(110,80,100,30);
        jTextField5.setBounds(110,120,100,30);
        jTextField6.setBounds(110,160,100,30);
        jTextField7.setBounds(110,150,100,30);     
        UserNameTextField.setBounds(110,200,100,30);
        jPasswordField1.setBounds(110,240,100,30);
        //SoraIcon.setBounds();
        
        
        jLabel1.setBounds(10,0,100,30);
        jLabel2.setBounds(10,40,100,30);
        jLabel3.setBounds(10,80,100,30);   
        jLabel4.setBounds(10,120,100,30);
        PasswordLabel.setBounds(10,240,100,30);
        jLabel6.setBounds(10,160,100,30);
        jLabel7.setBounds(10,210,100,30);
        UserNameLabel.setBounds(10,200,100,30);
        //eh dol!!
        jLabel8.setBounds(10,240,100,30);
        jLabel9.setBounds(10,270,100,30);
        jLabel10.setBounds(10,300,100,30);//valid age
        Jlabelname.setBounds(10,330,100,30);//valid first name
        jLabel5.setBounds(10,280,100,30);
        jLabel14.setBounds(10,390,100,30);
        jLabel15.setBounds(10,420,100,30);//valid phone number
        SoraIcon.setBounds(250,250,250 ,250);
        
        SaveButton.setBounds(20,400,100,30);
        ReadButton.setBounds(130, 400,130,30);
        btnCustomer.setBounds(280,400,180,30);
        jButton1.setBounds(180,300,100,30);
        jRadioButton1.setBounds(350,300,100,30);
        jRadioButton1.setForeground(Color.white);
        jRadioButton2.setForeground(Color.white);
        jRadioButton1.setBackground(new Color(36, 45, 67));
        jRadioButton2.setBackground(new Color(36, 45, 67));
        jRadioButton2.setBounds(350,350,100,30);
        jRadioButton1.setText("Male");
        jRadioButton2.setText("Female");
       
        
        //Colors
        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);
        jLabel3.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        jLabel6.setForeground(Color.white);
        UserNameLabel.setForeground(Color.white);
        
        SaveButton.setForeground(Color.black);
        SaveButton.setText("Save to file");
        PasswordLabel.setForeground(Color.white);
        
       //Adding to the form 
        buttongp1.add(jRadioButton1);
        buttongp1.add(jRadioButton2);
        panelelsora.add(SoraIcon);
        panel.add(UserNameLabel);
        panel.add(UserNameTextField);
        panel.add(PasswordLabel);
        panel.add(jPasswordField1);
        panel.add(jLabel1);
        panel.add(jTextField1);
        panel.add(Jlabelname);
        panel.add(jLabel2);
        panel.add(jTextField2);
        panel.add(jLabel3);
        panel.add(jTextField3);
        panel.add(jLabel4);
        panel.add(jTextField5);
        panel.add(jLabel15);
        panel.add(jLabel6);
        panel.add(jTextField6);
        panel.add(jLabel10); 
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(SaveButton);
        panel.add(ReadButton);
        panel.add(jComboBox1);
        panel.add(jRadioButton1);
        panel.add(jRadioButton2);
        panel.add(btnCustomer);
      
        

         
  
      
            
        
    }
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;

  private class ButtonWatcher implements ActionListener 
  {
       SignUpException ex=new SignUpException();
                public void actionPerformed(ActionEvent e) {
                    Object buttonpressed = e.getSource();
                    try{
               if(buttonpressed.equals(btnCustomer) && jComboBox1.getSelectedItem().toString() !="Customer" ){
                     JOptionPane.showMessageDialog(null,"Please Select customer first");
                     }
                  
                        if(buttonpressed.equals(btnCustomer) && jComboBox1.getSelectedItem().toString().equals("Customer") )
                        {
                            
                          String s =JOptionPane.showInputDialog(null,"Do you want to open a $ account or an EGP\n for Dollar Press (1) \n For EGP press (2)");
                   
                          if(s.equals("1"))
                     {
                         a.setAccountCurrencyType("$");
                       
                          JOptionPane.showMessageDialog(null, "You choosed $ Account");
                         
                     }
                     else if (s.equals("2"))
                     {      
                         a.setAccountCurrencyType("EGP");  
                         
                         JOptionPane.showMessageDialog(null, "You choosed EGP Account");
                         
                     }
                     else {
                         JOptionPane.showMessageDialog(null, "Enter Correct Number");
                     }
                     }
                         
                        
                    }catch(Exception l ){}
                    if (buttonpressed.equals(jButton1))
                    { 
                        try{
                        if(buttonpressed.equals(jRadioButton1)){
                        a.setGender("Male");
                        }
                        else if(buttonpressed.equals(jRadioButton2)){
                                a.setGender("Female");}
                                          
                        String U = UserNameTextField.getText();
                        
                       
                           for (AccountInfo searchitem : CustomerList){
  
                if (searchitem.getUserName().equals(U)){
                    U="found";
                }}
                        if(U.equals("Enter UserName") || U.equals("") || U.equals("found")){
                            String Uerror="Enter another user name";
                            ex.setUsername(Uerror);
                        }
                        else{
                        a.setUserName(U);
                        }
                        
                        String s = jTextField1.getText();                       
                        char[] p = jPasswordField1.getPassword();
                        
                        if(p.equals("Enter Password") || p.equals("")){
                            String PWerror="Enter a valid password";
                            ex.setPW(PWerror);
                            }
                        else{
                        a.setPassword(p);
                        }
                     if(s.equals("Enter your first name") || s.equals(""))
                     {
                       Jlabelname.setText("Enter valid name");
                       Jlabelname.setForeground(Color.red);
                     }
                     else{
                               Jlabelname.setText("Valid");
                               Jlabelname.setForeground(Color.green);
                         a.setFname(s);
                     }
                 String lname = jTextField2.getText();
                 if(lname.equals("Enter your last name") || lname.equals("")){
                     String Lerror="Enter a valid Last name";
                            ex.setLname(Lerror);
                     }
                 else{
                         a.setLname(lname);
                 }

                 String Answer = jTextField7.getText();
                    a.setSecurityAnswer(Answer);

                 String email = jTextField3.getText();
                 a.setEmail(email);
            
                 char[] Password = jPasswordField1.getPassword();
                 a.setPassword(Password);
            int age ;
            try{
            age= Integer.parseInt(jTextField6.getText());
            
            a.setAge(age);      
            if(a.getAge() == 0 )
            {
                   
            String ageerror="Enter Valid Age";     
                            ex.setAge(ageerror);
            }
         int mobilePhone = Integer.parseInt(jTextField5.getText());
              String sPhoneNumber = jTextField5.getText();

              Pattern pattern = Pattern.compile("\\d{11}");
              Matcher matcher = pattern.matcher(sPhoneNumber);

              if (matcher.matches()) {
                 a.setMobileNumber(mobilePhone);
                 jLabel15.setText("Valid");
                     jLabel15.setForeground(Color.green);
              }
              else {
                   jLabel15.setText("Incorrect phone number");
                  jLabel15.setForeground(Color.red);
                  String PhNumberError=" Enter a valid mobile number";
                  ex.setPhonenumber(PhNumberError);
                   jLabel10.setText("invalid");
                   jLabel10.setForeground(Color.red);
              }}catch(Exception ageEx){
                  
              }
                  throw new SignUpException(); 
              }catch(SignUpException error){
                 
                    
              JOptionPane.showMessageDialog(null, ex.toString());
                    }
                    }
         
//            jLabel10.setText(error);
//
//            jLabel10.setForeground(Color.red);
//            age= Integer.parseInt(jTextField6.getText());
//                    }
//                    else {
//                            jLabel10.setText("Valid");
//                        jLabel10.setForeground(Color.green);
//
//                    }
                
                
                    
                

                if (buttonpressed.equals(jButton2))
                {

                       DeleteEmployeeForm de = new DeleteEmployeeForm();
                       de.setTitle("Delete Form");
                       de.setVisible(true);
                }
                else if (buttonpressed.equals(SaveButton))
                {
                    String type =jComboBox1.getSelectedItem().toString();
                    ArrayList<AccountInfo> choosen= new ArrayList<AccountInfo>(3);                  
                    if(type.equals("CustomerAgent"))
                        choosen=CustomerAgentList;
                    else if(type.equals("Teller"))
                        choosen=Teller;
                    else if(type.equals("Manager"))
                        choosen=Manager;
                    else if(type.equals("LoanOfficer"))
                        choosen=LoanOfficer;
                    else if(type.equals("Customer"))
                        
                        choosen=CustomerList;
                     try {
            choosen.add(a);
            a =null;
            ObjectOutputStream ob= new ObjectOutputStream(new FileOutputStream(type+".txt"));
            ob.writeObject(choosen);
            ob.close();      
              } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Error in save");}
        
                }
                else if ( buttonpressed.equals(ReadButton))
                {
                      try{
         ObjectInputStream inp1 = new ObjectInputStream(new FileInputStream("Customer.txt"));
         CustomerList= (ArrayList< AccountInfo>)inp1.readObject();
         inp1.close();
        }catch(Exception c){
            exit(0);
            }
    } 
                }
                }
  
 

   private class MouseListner extends MouseAdapter
    {
       Object press = new Object();
        public void mouseClicked(MouseEvent me) {
           press = me.getSource();
            if(press.equals(jTextField1)){ jTextField1.setText("");}
            if(press.equals(jPasswordField1))jPasswordField1.setText("");
            if(press.equals(jTextField2)){jTextField2.setText("");}
            if(press.equals(jTextField3)) jTextField3.setText("");
            if(press.equals(jTextField6))jTextField6.setText("");
            if(press.equals(jTextField5))jTextField5.setText("");
            if(press.equals(jTextField7))jTextField7.setText("");
            if(press.equals(UserNameTextField))UserNameTextField.setText("");
        
        }

     
    }}


