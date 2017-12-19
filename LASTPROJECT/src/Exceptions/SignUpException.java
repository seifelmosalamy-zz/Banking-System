/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Seif Elmosalamy
 */
public class SignUpException extends Exception{
    private String age="";
    private String fname="";
    private String lname="";
    private String Email="";
    private String phonenumber="";
    private String Username="";
    private String PW="";

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }
    
    public SignUpException(String message,int Age) {
        super(message);
        
                
    }

    public String getFname() {
        return fname;
    }

   
    public String getLname() {
        return lname;
    }

   
    public String getEmail() {
        return Email;
    }

    public SignUpException() {
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getAge() {
        return this.age;
    }
   public String toString(){
       if(age==""&&
   fname==""&&
    lname==""&&
    Email==""&&
    phonenumber==""&&
    Username==""&&
    PW=="")
           return "Valid";
       else{
  return ""+this.PW+" "+this.Email+" "+this.Username+" "+this.age+" "+this.fname+" "+this.lname+" "+this.phonenumber;
}}
}
