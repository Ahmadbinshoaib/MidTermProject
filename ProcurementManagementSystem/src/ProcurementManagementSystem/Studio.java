/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcurementManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria
 */
public class Studio {
    private List<Employee>list= new ArrayList<Employee>();

    /**
     * @return the list
     */
    public List<Employee> getList() {
        return list;
       
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Employee> list) {
        this.list = list;
    }
    
    public void addList( Employee a)
    {
        list.add(a);
    }
    
   public void deleteEmployee(List<Employee> list,int a)
   {
       list.remove(a);
   }
   
   public void updateEmployee(List<Employee>list, Employee b, int a)
   {
       list.set(a,b);
       
   }
    
}
