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

public class Person {
    private String name;
    private String Email;
    private String phoneNumber;
    private String CNIC;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return is flag(true or false)
     */
    public boolean setName(String name) {
        
    boolean flag= true;   
    int count=0;
    int len= name.length();
    char[] aname= new char[len];
    aname= name.toCharArray();
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
    this.name= name;
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
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public  boolean setEmail(String Email){
        boolean test=true;
        int index = 0;
        char[] ch = new char[Email.length()];
        
        if (ch[0] == '@') {
            test= false;
        } else {
            for (int i = 1; i < Email.length(); i++) {
                if (ch[i] == '@') {
                    index = i;
                    break;
                }
            }
            if (ch[index] == '.') {
               test = false;
            }
        }
        if (test== true) {
            this.Email = Email;
            return true;
            
        } else {
           return false;

        }
}

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public boolean setPhoneNumber(String phoneNumber) {
         boolean flag= false;
     int count=0;
     int len= phoneNumber.length();
     char [] aphoneNumber= new char [len];
     aphoneNumber= phoneNumber.toCharArray();
     if(len==11)
      {
      if(aphoneNumber[0]>='0' && aphoneNumber[0]<='9' && aphoneNumber[1]>='0' && aphoneNumber[1]<='9' && aphoneNumber[2]>='0' && aphoneNumber[2]<='9' && aphoneNumber[3]>='0' && aphoneNumber[3]<='9' && aphoneNumber[4]>='0' && aphoneNumber[4]<='9' && aphoneNumber[5]>='0' && aphoneNumber[5]<='9' && aphoneNumber[6]>='0' && aphoneNumber[6]<='9' && aphoneNumber[7]>='0' && aphoneNumber[7]<='9' && aphoneNumber[8]>='0' && aphoneNumber[8]<='9' && aphoneNumber[9]>='0' && aphoneNumber[9]<='9' && aphoneNumber[10]>='0' && aphoneNumber[10]<='9')
      {
        count= count+1;
      }
      
     
     if(count==1)
     {
         this.phoneNumber= phoneNumber;
         flag=true;
     }
  }
  return flag;
    }

   
   /**
     * @return the CNIC
     */
    public String getCNIC() {
        return CNIC;
    }

    /**
     * @param CNIC the CNIC to set
     * @return flag(true or false)
     */
    public boolean setCNIC(String CNIC) {
     boolean flag= false;
     int count=0;
     int len= CNIC.length();
     char [] aCNIC= new char [len];
     aCNIC= CNIC.toCharArray();
     if(len==13)
      {
      if(aCNIC[0]>='0' && aCNIC[0]<='9' && aCNIC[1]>='0' && aCNIC[1]<='9' && aCNIC[2]>='0' && aCNIC[2]<='9' && aCNIC[3]>='0' && aCNIC[3]<='9' && aCNIC[4]>='0' && aCNIC[4]<='9' && aCNIC[5]>='0' && aCNIC[5]<='9' && aCNIC[6]>='0' && aCNIC[6]<='9' && aCNIC[7]>='0' && aCNIC[7]<='9' && aCNIC[8]>='0' && aCNIC[8]<='9' && aCNIC[9]>='0' && aCNIC[9]<='9' && aCNIC[10]>='0' && aCNIC[10]<='9' && aCNIC[11]>='0' && aCNIC[11]<='9' && aCNIC[12]>='0' && aCNIC[12]<='9'  )
      {
        count= count+1;
      }
      
     
     if(count==1)
     {
         this.CNIC= CNIC;
         flag=true;
     }
  }
  return flag;
   }   
    
    
    
}
