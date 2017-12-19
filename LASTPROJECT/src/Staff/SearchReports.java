/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import bankingsystemfinal.AccountInfo;
import bankingsystemfinal.LoansApplicationForm;
import java.util.ArrayList;

/**
 *
 * @author Mohamed
 */
public abstract class SearchReports {
     
    
    public abstract int SearchForReports(String currItem, ArrayList<LoansApplicationForm> anylist);
    public abstract int SearchWorkers(String currItem );
     public void Search(String currItem, ArrayList<AccountInfo> acc){
    //el implementation da el mafrod nest3amlo fi search 3al accountinfo wel report mafihash search 3al accountinfo
        int ctr=0;        
        for(AccountInfo i:acc)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        
        
    }
        
}
}