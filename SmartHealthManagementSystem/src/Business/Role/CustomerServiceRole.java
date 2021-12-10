/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

//import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.CustomerServiceOrganisation;
//import Business.Organization.Organization;
//import Business.UserAccount.UserAccount;
import userinterface.CustomerServiceRole.CustomerServiceWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author raunak
 */
public class CustomerServiceRole extends Role{

    
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerServiceWorkAreaJPanel(userProcessContainer, account, (CustomerServiceOrganisation)organization, enterprise,business);
    }
    
}
