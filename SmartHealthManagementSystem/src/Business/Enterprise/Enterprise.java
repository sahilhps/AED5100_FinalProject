/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Customer.Address;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
//import Business.Organization.OrganizationDirectory;

/**
 *
 * @author dongyueli
 */
public abstract class Enterprise extends Organisation {
    
    private String enterpriseName;
    private Address add;
//    
//    public Enterprise(String name, EnterpriseType type) {
//        super(name);
//        this.enterpriseType = type;
//        organizationDirectory = new OrganizationDirectory();
//    }
    
//    public enum EnterpriseType{
//        Hospital("Hospital"), Pharmacy("Pharmacy"), Government("Government"),EquipmentManufacturer("Equipment Manufacturer");
//        
//        private String value;
//
//        private EnterpriseType(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//
//    public EnterpriseType getEnterpriseType() {
//        return enterpriseType;
//    }
//
//    public OrganizationDirectory getOrganizationDirectory() {
//        return organizationDirectory;
//    }
//
//    @Override
//    public String toString() {
//        return getName();
//    }
//    

    public Enterprise(String enterpriseName, Address add) {
        this.enterpriseName = enterpriseName;
        this.add = add;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}
