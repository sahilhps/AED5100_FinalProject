/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import java.util.ArrayList;
import Business.Organisation.Organisation.Type;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class OrganisationDirectory {
    private ArrayList<Organisation> organizationList;

    public OrganisationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organizationList;
    }
    
    public Organisation createOrganization(Type type){
        Organisation organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganisation();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganisation();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganisation();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganisation();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.DrugSales.getValue())){
            organization = new DrugSalesOrganisation();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.HHS.getValue())){
            organization = new HealthandHumanServicesOrganisation();
            organizationList.add(organization);
        }
              
        return organization;
    }
}
