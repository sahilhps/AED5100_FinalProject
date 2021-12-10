/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.HHSAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class HealthandHumanServicesOrganisation extends Organisation{
    public HealthandHumanServicesOrganisation() {
        super(Organisation.Type.HHS.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HHSAdminRole());
        return roles;
    }
}
