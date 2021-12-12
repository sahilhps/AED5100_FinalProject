/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisterRequest;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Patient.Patient;
import Business.Role.Role;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class RegisterRequest {
    public RegisterRequest(){
        doctorRegistration = new Employee();
        patientRegistration = new Patient ();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getdoctorRegistration() {
        return doctorRegistration;
    }

    public void setdoctorRegistration(Employee doctorRegistration) {
        this.doctorRegistration = doctorRegistration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organisation getOrganisation() {
        return Organisation;
    }

    public void setOrganisation(Organisation Organisation) {
        this.Organisation = Organisation;
    }

    public String getisApprovedorNot() {
        return isApprovedorNot;
    }

    public void setisApprovedorNot(String isApprovedorNot) {
        this.isApprovedorNot = isApprovedorNot;
    }

    public Patient getpatientRegistration() {
        return patientRegistration;
    }

    public void setpatientRegistration(Patient patientRegistration) {
        this.patientRegistration = patientRegistration;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    private String username;
    private String password;
    private Employee doctorRegistration;
    private String name;
    private Organisation Organisation;
    private String isApprovedorNot;
    private Patient patientRegistration;
    private Enterprise enterprise;
    private Network network;
    private Role role;
    
}
