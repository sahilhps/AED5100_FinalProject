/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisterRequest;

import java.util.ArrayList;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class RegisterRequestDirectory {
    private ArrayList<RegisterRequest> registerToRequestList;

    public ArrayList<RegisterRequest> getregisterToRequestList() {
        return registerToRequestList;
    }

    public void setregisterToRequestList(ArrayList<RegisterRequest> registerToRequestList) {
        this.registerToRequestList = registerToRequestList;
    }
    public RegisterRequestDirectory() {
        registerToRequestList = new ArrayList<>();
    }
    public RegisterRequest createRegisterRequest() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerToRequestList.add(registerRequest);
        return registerRequest;
    }
    
}
