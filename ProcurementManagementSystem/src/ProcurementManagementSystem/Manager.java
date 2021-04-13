/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcurementManagementSystem;

/**
 *
 * @author Maria
 */
public class Manager extends Person{
    
    private String Username;
    private String Password;

    
     /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public boolean setUsername(String Username) {
    boolean flag= true;   
    int count=0;
    int len= Username.length();
    char[] aUsername= new char[len];
    aUsername= Username.toCharArray();
    if(len<=10)
    {
    for(int i=0; i<len; i++)
    {
      if((aUsername[i]>='A' && aUsername[i]<='Z') || (aUsername[i]>='a' && aUsername[i]<='z') || (aUsername[i]>='0' && aUsername[i]<='9') )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.Username= Username;
    flag= true;
    }
    else
    {
       
     flag= false;
    }
    }
    return flag;   
    }
    
    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     * @return flag(true or false)
     */
    public boolean setPassword(String Password) {
         
        boolean flag= false;
        this.Password = Password;
        return true;
    }

    
    
    
}
