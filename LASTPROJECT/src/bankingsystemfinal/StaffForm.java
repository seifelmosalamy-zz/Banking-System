package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author seifelmosalamy
 */
public class StaffForm extends JFrame{
    public StaffForm(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
           setBounds(0,0,1000,500);   
        setTitle("Staff ");
        setLayout(null);
        JLabel jLabel1=new JLabel("Check in");
        JLabel jLabel2=new JLabel("Check out");
JTextField jTextField1=new JTextField("Enter your id");
JTextField jTextField2=new JTextField("Enter your id");

JButton JButton1=new JButton("Ok");
JButton1.setBounds(200, 200, 100, 100);
jLabel1.setBounds(0,0,100,25);
jLabel2.setBounds(0,30,100,25);
jTextField1.setBounds(120,0,150,25);
jTextField2.setBounds(120,35,150,25);
 add(jLabel1);
 add(jTextField1);
 add(jLabel2);
  add(jTextField2);
  add(JButton1);

 setVisible(true);
    }
}