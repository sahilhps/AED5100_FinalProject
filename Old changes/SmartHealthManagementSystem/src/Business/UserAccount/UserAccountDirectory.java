/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Sahil Sonawane
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    
      public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equalsIgnoreCase(username)&& ua.getPassword().equalsIgnoreCase(password)){
                return ua;
            }
        return null;
    }
      public UserAccount createUserAccount() {
        UserAccount ua = new UserAccount();
        userAccountList.add(ua);
        return ua;
    }
    
  
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public UserAccount removeUserAccount(UserAccount ua) {        
        userAccountList.remove(ua);
        return null;
    }
    

      public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public String checkExit(String name,Enterprise enterpirse) {
          for(UserAccount ua:enterpirse.getUserAccountDirectory().getUserAccountList()){
              if(ua.getUsername().equals(name)){
                  return "";             
              }
          }
        return null;
    }

    
    public String checkExit(String name,Organisation org) {    
          for(UserAccount ua:org.getUserAccountDirectory().getUserAccountList()){
              if(ua.getUsername().equals(name)){
                  return "";             
              }
          }
        return null;
    }
}
