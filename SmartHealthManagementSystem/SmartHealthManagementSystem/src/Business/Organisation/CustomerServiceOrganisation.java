/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.CustomerServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class CustomerServiceOrganisation extends Organisation {
    public CustomerServiceOrganisation() {
        super(Organisation.Type.CustomerService.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerServiceRole());
        return roles;
    }
}
