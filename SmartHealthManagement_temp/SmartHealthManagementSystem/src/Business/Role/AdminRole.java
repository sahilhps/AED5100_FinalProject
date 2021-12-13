/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organisation.Organisation;

import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import userinterface.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vandit Kothari
 */
public class AdminRole extends Role{

 @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, account);
    }
    
    
}
