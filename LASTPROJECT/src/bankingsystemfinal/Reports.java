package bankingsystemfinal;

import Staff.SearchReports;
import static bankingsystemfinal.BankingSystemFinal.LoansApplicationList;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import static bankingsystemfinal.BankingSystemFinal.CustomerAgentList;
import static bankingsystemfinal.BankingSystemFinal.HrList;
import static bankingsystemfinal.BankingSystemFinal.Teller;
import static bankingsystemfinal.BankingSystemFinal.Manager;
import static bankingsystemfinal.BankingSystemFinal.LoanOfficer;
import static bankingsystemfinal.BankingSystemFinal.ctrf;
import static bankingsystemfinal.BankingSystemFinal.ctrfc;
import static bankingsystemfinal.BankingSystemFinal.ctrfw;
import static bankingsystemfinal.BankingSystemFinal.ctrm;
import static bankingsystemfinal.BankingSystemFinal.ctrmc;
import static bankingsystemfinal.BankingSystemFinal.ctrmw;
import static bankingsystemfinal.BankingSystemFinal.ctrt;
import static bankingsystemfinal.BankingSystemFinal.ctrtt;
import static bankingsystemfinal.BankingSystemFinal.ctrtw;
import bankingsystemfinal.Interfaces.IReport;
import java.io.Serializable;
import java.util.ArrayList;

public class Reports extends SearchReports implements IReport , Serializable {

    public void GenderReport() { 
        //calculate Female and male then we can add them
        
        //ctrm=counter male  ctrf= counter Female ctrt=counter total 
        //ctrmw=counter male worker , ctrfw= counter female worker , ctrtw=counter total workers 
        //ctrtt= counter total kolo
        ctrf= SearchForReports("Female",LoansApplicationList);
        ctrm=SearchForReports("Male",LoansApplicationList);
        ctrt=ctrf+ctrm;
      
       ctrmw=SearchWorkers("Male");
       ctrfw=SearchWorkers("Female");
       ctrtw=ctrmw+ctrfw;
        ctrfc= SearchCustomer("Female");
        ctrmc=SearchCustomer("Male");
    
       ctrtt=ctrtw+ctrt;
       
//Female+Male
    }
    public void TransactionsReport() {
    }

    public void ProductsReport() {
    }

    public void LoansReport() {
        LoansApplicationList.size();
    }

    public void EmployeeReport() {
        
    }
public int SearchForReports(String currItem, ArrayList<LoansApplicationForm> LoansApplicationList ){
        
        int ctr=0;        
        for(LoansApplicationForm i:LoansApplicationList)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
    return ctr;
        }
 
public int SearchCustomer (String currItem){
    int ctr=0;
    
  for(AccountInfo i:CustomerList)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
return ctr;
}

    public  int SearchWorkers(String currItem )
    {
     int ctr=0;        
       
        
      
        for(AccountInfo i:CustomerAgentList)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
        for(AccountInfo i:HrList)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
        for(AccountInfo i:Manager)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
        for(AccountInfo i:LoanOfficer)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
        for(AccountInfo i:Teller)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
    return ctr;
    
    }

}