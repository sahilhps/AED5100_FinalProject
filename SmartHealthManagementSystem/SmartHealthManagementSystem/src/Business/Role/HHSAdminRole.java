/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.HealthandHumanServicesOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import userinterface.HHSAdminRole.HHSAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sahil Sonawane
 */
public class HHSAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, EcoSystem business) {
        return new HHSAdminWorkAreaJPanel(userProcessContainer, account, (HealthandHumanServicesOrganisation)organization, enterprise,business);
    }
}
