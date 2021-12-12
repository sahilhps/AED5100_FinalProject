/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Network.Network;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Organisation.Organisation;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organisation{
    
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    

    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
          return ecoSystem;
    }
    private EcoSystem(){
        super(null);
        networkList  = new ArrayList<>();
    }

    public static EcoSystem getBusiness() {     
        return ecoSystem;
    }


    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

  
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {      
        ArrayList <Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public Customer loginCustomer(String usr,String pass){
        return CustomerDirectory.loginCustomer(usr,pass);
    }
}
