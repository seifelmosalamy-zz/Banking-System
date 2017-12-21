/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author seifelmosalamy
 */
public class Receipt extends JFrame
{
      private JComboBox<String> combo1 = new JComboBox();
      private JLabel lbl1= new JLabel();
       
      private int ctr = 0 ;
    public Receipt() {
        
        JPanel panel = new JPanel ();
        setLayout(null);
        setSize(400,600);
        setTitle("Task Form");
        
        combo1.addItem("Customer Service Agent");
        combo1.addItem("Deposit With Draw");
        combo1.addItem("Check your balance");
        combo1.addItem("Submit For a Loan");
           lbl1.setText("Choose the task you want to finish");
           lbl1.setBounds(0,20, 250, 30);
          panel.setBounds(10, 50, 400, 600);
           add(lbl1);
           add(combo1);
           
          add(panel);
          
        setVisible(true);
    }
    
    private class Buttonwatcher implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object b = e.getSource();
            if (b.equals(b)){}
        }
        
    }
    
}
