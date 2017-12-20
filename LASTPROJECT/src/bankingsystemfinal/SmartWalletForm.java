/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author seifelmosalamy
 */
public class SmartWalletForm extends JFrame{
   
    public SmartWalletForm(){
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
      setLayout(null);
       setBackground(new Color(20, 100, 190));
        setTitle("Smart Wallet");
           setBounds(0,0,1000,500);   
       JLabel JLabel1=new JLabel("Smart Wallet: ");
      
        JButton jButton1 = new JButton("Ok");
        JTextField jTextField1=new JTextField("Enter The amount here");
         JComboBox JComboBox1=new JComboBox(new String[]{"VodafoneCredit","EtisalatCredit","OrangeCredit"});
        JComboBox JComboBox2=new JComboBox(new Integer[]{10,25,50,75,100,150,200,250});
       JLabel Jlabel2=new JLabel("EGP"); // 3ashan yt7at gamb tany combo box w howa bykhtar el integer
       JComboBox JComboBox3=new JComboBox(new String[]{"Fawry","Go Bus","Tickets Marche"});
     JLabel1.setBounds(labelbounds);
     Jlabel2.setBounds(labelbounds);
    jTextField1.setBounds(textfieldbounds);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBounds(0,0,1000,500);
        panel.setBackground(new Color(20, 100, 190));
        add(panel);
    panel.add(JLabel1);
       panel. add(jTextField1);
    panel.add(JComboBox1);
    panel.add(JComboBox2);
    panel.add(Jlabel2);
     panel.add(JComboBox3);
    panel.add(jButton1);

         setVisible(true);
     

    }
}