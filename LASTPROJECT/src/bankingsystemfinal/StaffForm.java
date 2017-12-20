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
           setBounds(0,0,600,500);   
        setTitle("Staff ");
        setLayout(null);
        JLabel jLabel1=new JLabel("Check in");
        JLabel jLabel2=new JLabel("Check out");
JTextField jTextField1=new JTextField("Enter your UserName");
JTextField jTextField2=new JTextField("Enter your UserName");

JButton JButton1=new JButton("Ok");
JButton1.setBounds(200, 200, 90, 60);
jLabel1.setBounds(10,10,100,25);
jLabel2.setBounds(10,40,100,25);
jTextField1.setBounds(120,10,150,25);
jTextField2.setBounds(120,45,150,25);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1000,500);
         panel.setBackground(new Color(20, 100, 190));
        add(panel);
        panel.add(jLabel1);
        panel.add(jTextField1);
        panel.add(jLabel2);
        panel.add(jTextField2);
        panel.add(JButton1);

 setVisible(true);
    }
}