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
public class Products {
    
    private String productName;
    private String companyName;
    private String price;
    private int quantity;
    private String type;
    

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     * @return 
     */
    public boolean setProductName(String productName) {
    boolean flag= true;   
    int count=0;
    int len= productName.length();
    char[] aproductName= new char[len];
    aproductName= productName.toCharArray();
    if(len<=20)
    {
    for(int i=0; i<len; i++)
    {
      if((aproductName[i]>='A' && aproductName[i]<='Z') || (aproductName[i]>='a' && aproductName[i]<='z') || (aproductName[i]>='0' && aproductName[i]<='9') || (aproductName[i]>=' ')  )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.productName= productName;
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
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     * @return 
     */
    public boolean setCompanyName(String companyName) {
    boolean flag= true;   
    int count=0;
    int len= companyName.length();
    char[] acompanyName= new char[len];
    acompanyName= companyName.toCharArray();
    if(len<=20)
    {
    for(int i=0; i<len; i++)
    {
      if((acompanyName[i]>='A' && acompanyName[i]<='Z') || (acompanyName[i]>='a' && acompanyName[i]<='z') || (acompanyName[i]>='0' && acompanyName[i]<='9') )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.companyName= companyName;
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
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     * @return 
     */
    public boolean setPrice(String price) {
    boolean flag= true;   
    int count=0;
    int len= price.length();
    char[] aprice= new char[len];
    aprice= price.toCharArray();
    if(len<=10)
    {
    for(int i=0; i<len; i++)
    {
      if((aprice[i]>='0' && aprice[i]<='9') )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.price= price;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public boolean setQuantity(int quantity) {
          
        boolean flag= false;
        this.quantity = quantity;
        return true;
        
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     * @return 
     */
    public boolean setType(String type) {
        
        boolean flag= false;
        this.type = type;
        return true;
        
    }

    
    
    
    
}
