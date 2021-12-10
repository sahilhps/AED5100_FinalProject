/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.DoctorOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import userinterface.DoctorRole.DoctorHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class DoctorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorHomePageJPanel(userProcessContainer, account, (DoctorOrganisation)organization, enterprise, business);
    }
}
