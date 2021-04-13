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
public class Employee extends Person {
    private String Designation;
    private String EmployeeID;
    private String Username;
    private String Password;

    /**
     * @return the Designation
     */
    public String getDesignation() {
        return Designation;
    }

    /**
     * @param Designation the Designation to set
     */
    public boolean setDesignation(String Designation) {
    boolean flag= true;   
    int count=0;
    int len= Designation.length();
    char[] aDesignation= new char[len];
    aDesignation= Designation.toCharArray();
    if(len<=50)
    {
    for(int i=0; i<len; i++)
    {
      if((aDesignation[i]>='A' && aDesignation[i]<='Z') || (aDesignation[i]>='a' && aDesignation[i]<='z') || aDesignation[i]==' ' )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.Designation= Designation;
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
     * @return the EmployeeID
     */
    public String getEmployeeID() {
        return EmployeeID;
    }

    /**
     * @param EmployeeID the EmployeeID to set
     */
    public boolean setEmployeeID(String EmployeeID) {
     boolean flag= false;
     int count=0;
     int len= EmployeeID.length();
     char [] aEmployeeID= new char [len];
     aEmployeeID= EmployeeID.toCharArray();
     if(len==7)
      {
      if(aEmployeeID[0]>='A' && aEmployeeID[0]<='Z' && aEmployeeID[1]>='A' && aEmployeeID[1]<='Z' && aEmployeeID[2]>='A' && aEmployeeID[2]<='Z')
      {
        count= count+1;
      }
      if(aEmployeeID[3]=='-')
      {
         count=count+1; 
      }

         if(aEmployeeID[4]>='0' && aEmployeeID[4]<='9' && aEmployeeID[5]>='0' && aEmployeeID[5]<='9' && aEmployeeID[6]>='0' && aEmployeeID[6]<='9')
         {
             count=count+1;
         }
     
     if(count==3)
     {
         this.EmployeeID= EmployeeID;
         flag=true;
     }
  }
  return flag;
   }
 
    

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
    