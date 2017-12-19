/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author seifelmosalamy
 */
public class DeleteEmployeeForm extends JFrame {

    public DeleteEmployeeForm()  {
        initComp();
        addComp();
        
    }
    
    private void initComp()
    {
        setSize(1000,500);
        setTitle("Delete Form");
     jPanel1 = new JPanel();
       jPanel1.setLayout(null);
        jPanel1.setBackground(new Color(20, 100, 190));
        
            
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
    jTextField1= new JTextField();
    
    
    jLabel7.setText("Search for employee"); 
    
    jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);        
        jLabel3.setForeground(Color.white);
         jLabel4.setForeground(Color.white);
        jLabel5.setForeground(Color.white);        
        jLabel6.setForeground(Color.white);
        
        jLabel1.setBounds(0, 100, 100, 30);
        jLabel2.setBounds(0, 150, 100, 30);
        jLabel3.setBounds(0,200,100,30);
        jLabel4.setBounds(0,250,100,30);
        jLabel5.setBounds(0,300,100,30);
        jLabel6.setBounds(0,350,100,30);
        jLabel7.setBounds(5,10,120,30);

jTextField1.setBounds(10,50,150,30);
    }
    
   private void addComp()
    {
    add(jPanel1);
     jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel6);
        jPanel1.add(jTextField1);
        jPanel1.add(jLabel7);
    }
   
   private JPanel jPanel1;
   private JTextField jTextField1;
   private JLabel jLabel1; 
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
}
