/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Patient.Patient;
import Business.Patient.Record;
import java.util.Date;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class PatientDoctorWorkRequest extends WorkRequest{
    private Patient patient;
    private Record Record;

    public Patient getThePatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Record getRecord() {
        return Record;
    }

    public void setRecord(Record Record) {
        this.Record = Record;
    }

    public String gettestingResult() {
        return testingResult;
    }

    public void settestingResult(String testingResult) {
        this.testingResult = testingResult;
    }

    public String getstatlab() {
        return statlab;
    }

    public void setstatlab(String statlab) {
        this.statlab = statlab;
    }

    public String getpreStat() {
        return preStat;
    }

    public void setpreStat(String preStat) {
        this.preStat = preStat;
    }

    public String getstattoRespond() {
        return stattoRespond;
    }

    public void setstattoRespond(String stattoRespond) {
        this.stattoRespond = stattoRespond;
    }

    public String getstatGov() {
        return statGov;
    }

    public void setstatGov(String statGov) {
        this.statGov = statGov;
    }

    public String getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
    }

    public String getisisNormal() {
        return isisNormal;
    }

    public void setisisNormal(String isisNormal) {
        this.isisNormal = isisNormal;
    }

    public String getFtisNormal() {
        return ftisNormal;
    }

    public void setFtisNormal(String ftisNormal) {
        this.ftisNormal = ftisNormal;
    }

    public String getpatientName() {
        return patientName;
    }

    public void setpatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getresPondtoMess() {
        return resPondtoMess;
    }

    public void setresPondtoMess(String resPondtoMess) {
        this.resPondtoMess = resPondtoMess;
    }

    public String getLabReceiver() {
        return labReceiver;
    }

    public void setLabReceiver(String labReceiver) {
        this.labReceiver = labReceiver;
    }

    public String getnameOfDrug() {
        return nameOfDrug;
    }

    public void setnameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public String getquantofDrug() {
        return quantofDrug;
    }

    public void setquantofDrug(String quantofDrug) {
        this.quantofDrug = quantofDrug;
    }

    public String getrespondFromDoctor() {
        return respondFromDoctor;
    }

    public void setrespondFromDoctor(String respondFromDoctor) {
        this.respondFromDoctor = respondFromDoctor;
    }
    
    private String testingResult;
    
    private String statlab;
    private String preStat;
    private String stattoRespond;
    private String statGov;
    private String drugStatus;
    
    private String isisNormal;
    private String ftisNormal;
    
    private Date date;
    private String patientName;
    private String resPondtoMess;
    private String labReceiver;
    
    private String nameOfDrug;
    private String quantofDrug;
    private String respondFromDoctor;

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }
}
