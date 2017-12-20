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
        setLayout(null);
        setTitle("Reports");
           setBounds(0,0,1000,500); 
           JButton jButton1=new JButton("Ok");
           JButton jButton2=new JButton("Close");
           JLabel jLabel1=new JLabel("Choose the reports you want to see: ");
<<<<<<< HEAD
    JCheckBox CheckBox1=new JCheckBox("Gender Report");
        JCheckBox CheckBox2=new JCheckBox("Transaction Report");
    JCheckBox CheckBox3=new JCheckBox("Products Report");
        JCheckBox CheckBox4=new JCheckBox("Loans Report");
            JCheckBox CheckBox5=new JCheckBox("Employee Report");
             JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBounds(0,0,1000,500);
         panel.setBackground(new Color(20, 100, 190));
              add(panel);
              panel.add(jLabel1);
              panel.add(CheckBox1);
              panel.add(CheckBox2);
              panel.add(CheckBox3);
              panel.add(CheckBox4);
              panel.add(CheckBox5);
              panel.add(jButton1);
              panel.add(jButton2);
=======
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
>>>>>>> 34da4b40a6252691a6e469b76b51102d107b6a32

               setVisible(true);


    
    
    }
}