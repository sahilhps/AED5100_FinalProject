/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author dongyueli
 */
public abstract class Organisation {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organisation.counter = counter;
    }
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory; 
    private int organizationID;
    private static int counter;
//    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization")
        ,Patient("Patient Organization"),CustomerService("Customer Service Organization")
        ,DrugSales("Drug Sales Organization"),HHS("Health and Human Services Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
//
    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        organizationID = counter;
        ++counter;
    }
//
    public abstract ArrayList<Role> getSupportedRole();
//    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
//
//    public PatientDirectory getPatientDirectory() {
//        return patientDirectory;
//    }
//
//    public void setPatientDirectory(PatientDirectory patientDirectory) {
//        this.patientDirectory = patientDirectory;
//    }
//    
//
//    public int getOrganisationID() {
//        return OrganisationID;
//    }
//
//    public EmployeeDirectory getEmployeeDirectory() {
//        return employeeDirectory;
//    }
//
//    public String getName() {
//        return name;
//    }
//    
//
//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }
//
    @Override
    public String toString() {
        return name;
    }
}
