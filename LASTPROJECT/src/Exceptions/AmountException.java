/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author new
 */
public class AmountException extends Exception{
     private long amount;
    
     AmountException(String msg, long amt){
     super(msg);
     this.amount=amt;
     }

    public long getAmount() {
        return this.amount;
    }
     public String toString(){    
         return super.toString()+":"+this.amount;
     }
}
