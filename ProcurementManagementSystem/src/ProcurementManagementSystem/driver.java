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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainPage a= new MainPage();
        a.setVisible(true);
        
        Person b= new Person();
        if(b.setPhoneNumber("0309802164a"))
        {
            System.out.println("Okay");
            
        }
        else
        {
           System.out.println("NOkay"); 
        }
        
        
    }
    
}
