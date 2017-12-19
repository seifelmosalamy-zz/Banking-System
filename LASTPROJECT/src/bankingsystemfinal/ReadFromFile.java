/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.CustomerAgentList;
import static bankingsystemfinal.BankingSystemFinal.LoanOfficer;
import static bankingsystemfinal.BankingSystemFinal.Manager;
import static bankingsystemfinal.BankingSystemFinal.Teller;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Seif Elmosalamy
 */
public class ReadFromFile {
    
    public ReadFromFile( ) {
        
      try{
         ObjectInputStream inp = new ObjectInputStream(new FileInputStream("Customer.txt"));
         CustomerList=null;
         CustomerList= (ArrayList< AccountInfo>)inp.readObject();
         inp.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp2 = new ObjectInputStream(new FileInputStream("CustomerAgent.txt"));
         CustomerAgentList= (ArrayList< AccountInfo>)inp2.readObject();
         inp2.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp3 = new ObjectInputStream(new FileInputStream("Teller.txt"));
         Teller= (ArrayList< AccountInfo>)inp3.readObject();
         inp3.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp4 = new ObjectInputStream(new FileInputStream("Manager.txt"));
         Manager= (ArrayList< AccountInfo>)inp4.readObject();
         inp4.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp5 = new ObjectInputStream(new FileInputStream("LoanOfficer.txt"));
         LoanOfficer= (ArrayList< AccountInfo>)inp5.readObject();
         inp5.close();
        }catch(Exception c){
            
            }
    
        
    }
        
}
