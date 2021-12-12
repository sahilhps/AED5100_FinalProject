/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class PatientDirectory {
     private ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    public PatientDirectory() {
        this.patientList = new ArrayList<>();
    }
     public ArrayList<Patient> searchPatient(String key)
    {
        ArrayList<Patient> searchPatientDirectory = new ArrayList();
        for(Patient patient: patientList)
        {
            if(patient.getpatientName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(patient);
            }
        }
        return searchPatientDirectory;
    }
     
     public Patient createPtient(String name) {
        Patient pt = new Patient();
        pt.setpatientName(name);
        patientList.add(pt);
        return pt;
    }

    
    public void removePatient(Patient pt){
        patientList.remove(pt);
    }
}
