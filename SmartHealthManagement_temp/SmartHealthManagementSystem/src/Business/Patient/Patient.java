/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class Patient {
    public Patient()
    {
        super();
        count++;
        patientID=count;
        this.recordHistory = new RecordHistory();
    }

    public RecordHistory getRecordHistory() {
        return recordHistory;
    }

    public void setRecordHistory(RecordHistory recordHistory) {
        this.recordHistory = recordHistory;
    }

    public String getpatientName() {
        return patientName;
    }

    public void setpatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getpatientID() {
        return patientID;
    }

    public void setpatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getstreetAddress() {
        return streetAddress;
    }

    public void setstreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }

    public String getMyDoctor() {
        return myDoctor;
    }

    public void setMyDoctor(String myDoctor) {
        this.myDoctor = myDoctor;
    }

    public UserAccount getMydoctor() {
        return mydoctor;
    }

    public void setMydoctor(UserAccount mydoctor) {
        this.mydoctor = mydoctor;
    }

    public UserAccount getMypatient() {
        return mypatient;
    }

    public void setMypatient(UserAccount mypatient) {
        this.mypatient = mypatient;
    }
    private String patientName;
    private int patientID;
    private int age;
    private String streetAddress;
    private String town;
    private int zipCode;
    private String emailAddress;
    private int areaCode;
    private int phoneNumber;
    private static int count = 1000;
    private String myDoctor;
    private UserAccount mydoctor;
    private UserAccount mypatient;
    private RecordHistory recordHistory;
    
   
    @Override
    public String toString() {
        return patientName; 
    }
}
