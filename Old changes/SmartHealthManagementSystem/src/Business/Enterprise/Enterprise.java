/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
//import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author Sahil Sonawane
 */
public abstract class Enterprise extends Organisation {
    
    private EnterpriseType enterpriseType;
//    private String value;
    private OrganisationDirectory OrganisationDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        OrganisationDirectory = new OrganisationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"), Pharmacy("Pharmacy"), Government("Government"),EquipmentManufacturer("Equipment Manufacturer");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
//
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return OrganisationDirectory;
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
