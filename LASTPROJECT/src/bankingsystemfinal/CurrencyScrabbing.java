/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;
import static bankingsystemfinal.BankingSystemFinal.Scrabbinglist;
import java.awt.FlowLayout;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.Element;
    
 import org.jsoup.Jsoup;

 /*
 * @author Seif Elmosalamy
 */
public class CurrencyScrabbing extends JFrame
{
    
  
    private JLabel lbl; 
  
    public CurrencyScrabbing()  throws IOException
            
    {       
        setResizable(false);
        setTitle("Currency Today");
        setSize(500,500);
        setLayout(new FlowLayout());
        try{
            
        
        final org.jsoup.nodes.Document document = Jsoup.connect("http://www.nbe.com.eg/en/ExchangeRate.aspx").get(); 
      
        for (org.jsoup.nodes.Element row : document.select("table#dgPrices tr"))
        {

            final String title = row.select(".td1").text();  
            Scrabbinglist.add(title);
        }  }catch(Exception e)
        {
            System.out.println("error in site ");
        }
        
    
        AddToLabels();
        setVisible(true);
        
       
    }

        public void AddToLabels ()
        {
           
        lbl = new JLabel("1st & 2nd Columns are the Currency");
        add(lbl);
         lbl = new JLabel("| 3rd Column is the Code");
        add(lbl);
        
          lbl = new JLabel("| 4th Column is the Buy Price");
        add(lbl);
         lbl = new JLabel("| 5th Column is the Sell Price");
        add(lbl);
        
         lbl = new JLabel("| 6th Column is the Transfers/Buy Price");
        add(lbl);
         lbl = new JLabel("| 7th Column is the Transfers/Sell Price");
            add(lbl);
            
            for (int ctr = 0; ctr<18 ; ctr ++ )
            {
             
            if(ctr%2 == 1)
            {  
               String replaced = Scrabbinglist.get(ctr).replace(" ", "  |   ");
               
                lbl = new JLabel(replaced);
                add(lbl);
            }
            else {
                  lbl = new JLabel ( "____________________________________________");
                add(lbl);
            }
            }

            
        }
        }


    

