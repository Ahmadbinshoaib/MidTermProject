/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcurementManagementSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author Maria
 */
public class Studio {
    static Studio instance;
    static Studio a= new Studio();
    
    
    
    
    public List<Employee>list= new ArrayList<>();
    public List<Products>product= new ArrayList<>();
    public List<Request>request= new ArrayList<>();
    
    
     public static Studio getInstance(){
        if(instance==null)
        {
            instance = new Studio();
        }
        
        return instance;
    }
     
     private Studio(){
         
     }
     
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainPage a= new MainPage();
        a.setVisible(true);
        //driver d= new driver()
        Studio b= Studio.getInstance();
        b.loadEmployee();
        b.loadProduct();
        b.loadRequest();
        b.loadManager();
        
        
       
        
    }
    public void addList( Employee a)
    {
        list.add(a);
    }
    
   public void deleteEmployee(int a)
   {
       list.remove(a);
   }
   
   public void updateEmployee(Employee b, int a)
   {
       list.set(a,b);
       
   }
   
     public boolean saveData(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            for(int i = 0 ; i < list.size();i++)
            {
                bw.write(list.get(i).getName() + ","+
                        list.get(i).getEmail() + ","+
                        list.get(i).getPhoneNumber()+","+
                        list.get(i).getDesignation()+","+
                        list.get(i).getUsername()+","+
                        list.get(i).getPassword()+","+
                        list.get(i).getEmployeeID()+","+
                        list.get(i).getCNIC()+"\n"
                        
                );
            }
           
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
     
 public  void loadEmployee(){
         
     try {
         try (FileReader fr = new FileReader("Employee.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Employee e = new Employee();
                 String[] str = line.split(",");
                 e.setName(str[0]);
                 e.setEmail(str[1]);
                 e.setPhoneNumber(str[2]);
                 e.setDesignation(str[3]);
                 e.setUsername(str[4]);
                 e.setPassword(str[5]);
                 e.setEmployeeID(str[6]);
                 e.setCNIC(str[7]);
                         
                
                 list.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
     
     
     
     
     public void addProductList( Products a)
    { 
        product.add(a);
      
    }
    
   public void deleteProductList(int a)
   {
       product.remove(a);
   }
   
   public void updateProductList(Products b, int a)
   {
       product.set(a,b);
       
   }
   
   public boolean saveProductData(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            for(int i = 0 ; i < product.size();i++)
            {
                bw.write(product.get(i).getProductName() + ", "+
                        product.get(i).getCompanyName() + ","+
                        product.get(i).getPrice()+","+
                        product.get(i).getQuantity()+","+
                        product.get(i).getType()+"\n"
                        
                        
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
   
   public  void loadProduct(){
         
     try {
         try (FileReader fr = new FileReader("ProductData.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Products e = new Products();
                 String[] str = line.split(",");
                 e.setProductName(str[0]);
                 e.setCompanyName(str[1]);
                 e.setPrice(str[2]);
                 //int a= Integer.parseInt(str[3]);
                 e.setQuantity(Integer.parseInt(str[3]));
                 e.setType(str[4]);
                 
                         
                
                 product.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
   
   public void addRequestList( Request obj)
    {
        request.add(obj);
    }
    
   public void deleteRequestList(int a)
   {
       request.remove(a);
   }
   
   public void updateRequestList(Request b, int a)
   {
       request.set(a,b);
       
   }
   
   public boolean saveRequestData(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            for(int i = 0 ; i < request.size();i++)
            {
                bw.write(request.get(i).getEmpName() + ","+
                        request.get(i).getEmpUsername() + ","+
                        request.get(i).getProductName()+","+
                        request.get(i).getProductType()+","+
                        request.get(i).getEMPID()+"," +
                        request.get(i).getApproval() + ","+  
                        request.get(i).getProductQuantity() + ","+
                        request.get(i).getAccRej()+"\n"
                        
                        
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
   
   public  void loadRequest(){
         
     try {
         try (FileReader fr = new FileReader("Request.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Request e = new Request();
                 String[] str = line.split(",");
                  e.setEmpName(str[0]);
                  e.setEmpUsername(str[1]);
                  e.setProductName(str[2]);
                  e.setProductType(str[3]);
                  e.setEMPID(str[4]);
                  e.setApproval(str[5]);
                  e.setProductQuantity(Integer.parseInt(str[6]));
                  e.setAccRej(str[7]);

                 
                         
                
                 request.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
   
   public boolean saveManager(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
               Manager b= Manager.getInstance();
                bw.write(b.getCNIC() + ", "+
                        b.getEmail() + ","+
                        b.getName()+","+
                        b.getPassword()+","+
                        b.getPhoneNumber()+"," +
                        b.getUsername()  
                        
                        
                        
                );
            
            
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
   
    public  void loadManager(){
         
     try {
         try (FileReader fr = new FileReader("Manager.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Manager b= Manager.getInstance();
                 String[] str = line.split(",");
                  b.setCNIC(str[0]);
                  b.setEmail(str[1]);
                  b.setName(str[2]);
                  b.setPassword(str[3]);
                  b.setPhoneNumber(str[4]);
                  b.setUsername(str[5]);
                  

                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
        
    

}
