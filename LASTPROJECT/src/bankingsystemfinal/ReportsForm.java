package bankingsystemfinal;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author seifelmosalamy
 */
public class ReportsForm extends JFrame{
    public ReportsForm(){
 setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setTitle("Reports");
           setBounds(0,0,1000,500); 
           JButton jButton1=new JButton("Ok");
           JButton jButton2=new JButton("Close");
           JLabel jLabel1=new JLabel("Choose the reports you want to see: ");
            JCheckBox CheckBox1=new JCheckBox("Gender Report");
                JCheckBox CheckBox2=new JCheckBox("Transaction Report");
            JCheckBox CheckBox3=new JCheckBox("Products Report");
                JCheckBox CheckBox4=new JCheckBox("Loans Report");
                    JCheckBox CheckBox5=new JCheckBox("Employee Report");
               add(jLabel1);
               add(CheckBox1);
               add(CheckBox2);
               add(CheckBox3);
               add(CheckBox4);
               add(CheckBox5);
               add(jButton1);
               add(jButton2);

               setVisible(true);


    
    
    }
}