/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class Network {
    private EnterpriseDirectory enterpriseDirectory;
    private String name;

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }


    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     @Override
    public String toString() {
        return name;
    }
}
