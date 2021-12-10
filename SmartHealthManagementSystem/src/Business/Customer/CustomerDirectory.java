/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Role.PatientRole;
import Business.Role.Role;

/**
 *
 * @author harold
 */
public class CustomerDirectory {

    public static Customer loginCustomer(String usr, String pass) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     PatientRole r = new PatientRole();
     String contactNo ="43534";
     String name = "sadho";
             Address add = new Address(usr, 0, usr, usr, 0);
    Customer s = new Customer(usr, pass, r, contactNo, name, add);
    return s;
    
    
    }
    
}
