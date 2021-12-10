/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.DrugSalesOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import userinterface.DrugSalesAdminRole.DrugSalesWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class DrugSalesAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, EcoSystem business) {
        return new DrugSalesWorkAreaJPanel(userProcessContainer, account, (DrugSalesOrganisation)organization, enterprise,business);
    }
}
