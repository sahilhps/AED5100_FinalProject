/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Sahil Sonawane
 */
public abstract class WorkRequest {

    
    private String status;
    private Date requestDate;
    private Date resolveDate;

    public UserAccount getPatient() {
        return patient;
    }

    public void setPatient(UserAccount patient) {
        this.patient = patient;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Network getSenderNetwork() {
        return senderNetwork;
    }

    public void setSenderNetwork(Network senderNetwork) {
        this.senderNetwork = senderNetwork;
    }

    public Enterprise getReceiveEnterprise() {
        return receiveEnterprise;
    }

    public void setReceiveEnterprise(Enterprise receiveEnterprise) {
        this.receiveEnterprise = receiveEnterprise;
    }
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount patient;
    private UserAccount doctor;
    private Date date;
    private Enterprise senderEnterprise;
    private Network senderNetwork;
    private Enterprise receiveEnterprise;
    
    
    public WorkRequest(){
        date = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
