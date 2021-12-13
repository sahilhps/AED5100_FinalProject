/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.LabOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import userinterface.LabAssistant.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sahil Sonawane
 */
public class LabAssistantRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, EcoSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, (LabOrganisation)organization, enterprise);
    }
}
