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
public class Request {
    private String EmpName;
    private String EmpUsername;
    private String ProductName;
    private String ProductType;
    private int ProductQuantity;
    private String EMPID;
    private String Approval;
    private String AccRej;

    /**
     * @return the EmpName
     */
    public String getEmpName() {
        return EmpName;
    }

    /**
     * @param EmpName the EmpName to set
     */
    public boolean setEmpName(String EmpName) {
      boolean flag= true;   
    int count=0;
    int len= EmpName.length();
    char[] aname= new char[len];
    aname= EmpName.toCharArray();
    if(len<=50)
    {
    for(int i=0; i<len; i++)
    {
      if((aname[i]>='A' && aname[i]<='Z') || (aname[i]>='a' && aname[i]<='z') || aname[i]==' ' )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.EmpName= EmpName;
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
     * @return the EmpUsername
     */
    public String getEmpUsername() {
        return EmpUsername;
    }

    /**
     * @param EmpUsername the EmpUsername to set
     */
    public boolean setEmpUsername(String EmpUsername) {
        boolean flag= true;   
    int count=0;
    int len= EmpUsername.length();
    char[] aUsername= new char[len];
    aUsername= EmpUsername.toCharArray();
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
    this.EmpUsername= EmpUsername;
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
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public boolean setProductName(String ProductName) {
        boolean flag= true;   
    int count=0;
    int len= ProductName.length();
    char[] aproductName= new char[len];
    aproductName= ProductName.toCharArray();
    if(len<=20)
    {
    for(int i=0; i<len; i++)
    {
      if((aproductName[i]>='A' && aproductName[i]<='Z') || (aproductName[i]>='a' && aproductName[i]<='z') || (aproductName[i]>='0' && aproductName[i]<='9') )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.ProductName= ProductName;
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
     * @return the ProductType
     */
    public String getProductType() {
        return ProductType;
    }

    /**
     * @param ProductType the ProductType to set
     */
    public boolean setProductType(String ProductType) {
         
        boolean flag= false;
        this.ProductType = ProductType;
        return true;
    }

    /**
     * @return the ProductQuantity
     */
    public int getProductQuantity() {
        return ProductQuantity;
    }

    /**
     * @param ProductQuantity the ProductQuantity to set
     */
    public boolean setProductQuantity(int ProductQuantity) {
         boolean flag= false;
        this.ProductQuantity = ProductQuantity;
        return true;
    }
    
    /**
     * @return the EMPID
     */
    public String getEMPID() {
        return EMPID;
    }

    /**
     * @param EMPID the EMPID to set
     */
    public boolean setEMPID(String EMPID) {
       boolean flag= false;
     int count=0;
     int len= EMPID.length();
     char [] aEmployeeID= new char [len];
     aEmployeeID= EMPID.toCharArray();
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
         this.EMPID= EMPID;
         flag=true;
     }
  }
  return flag;
    }

    /**
     * @return the Approval
     */
    public String getApproval() {
        return Approval;
    }

    /**
     * @param Approval the Approval to set
     */
    public boolean setApproval(String Approval) {
        boolean flag= false;
        this.Approval = Approval;
        return true;
       
    }
    
    public String getAccRej() {
        return AccRej;
    }

    /**
     * @param AccRej the Approval to set
     */
    public boolean setAccRej(String AccRej) {
        //AccRej="Pending";
        boolean flag= false;
        this.AccRej = AccRej;
        return true;
       
    }
    
    
    
}
