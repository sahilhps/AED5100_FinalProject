/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class FeedbackWorkRequest extends WorkRequest{
     
    private String feedbackMessage;
    private UserAccount customerService;
    private String okay1;
    private String okay2;
    private String okay3;

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public UserAccount getCustomerService() {
        return customerService;
    }

    public void setCustomerService(UserAccount customerService) {
        this.customerService = customerService;
    }

    public String getokay1() {
        return okay1;
    }

    public void setokay1(String okay1) {
        this.okay1 = okay1;
    }

    public String getokay2() {
        return okay2;
    }

    public void setokay2(String okay2) {
        this.okay2 = okay2;
    }

    public String getokay3() {
        return okay3;
    }

    public void setokay3(String okay3) {
        this.okay3 = okay3;
    }

    public String getokay4() {
        return okay4;
    }

    public void setokay4(String okay4) {
        this.okay4 = okay4;
    }

    public String gethowOkay1() {
        return howOkay1;
    }

    public void sethowOkay1(String howOkay1) {
        this.howOkay1 = howOkay1;
    }

    public String gethowOkay2() {
        return howOkay2;
    }

    public void sethowOkay2(String howOkay2) {
        this.howOkay2 = howOkay2;
    }

    public String gethowOkay3() {
        return howOkay3;
    }

    public void sethowOkay3(String howOkay3) {
        this.howOkay3 = howOkay3;
    }

    public String gethowOkay4() {
        return howOkay4;
    }

    public void sethowOkay4(String howOkay4) {
        this.howOkay4 = howOkay4;
    }

    public String getletOkay1() {
        return letOkay1;
    }

    public void setletOkay1(String letOkay1) {
        this.letOkay1 = letOkay1;
    }

    public String getletOkay2() {
        return letOkay2;
    }

    public void setletOkay2(String letOkay2) {
        this.letOkay2 = letOkay2;
    }

    public String getletOkay3() {
        return letOkay3;
    }

    public void setletOkay3(String letOkay3) {
        this.letOkay3 = letOkay3;
    }

    public String getletOkay4() {
        return letOkay4;
    }

    public void setletOkay4(String letOkay4) {
        this.letOkay4 = letOkay4;
    }
    private String okay4;
    
    private String howOkay1;
    private String howOkay2;
    private String howOkay3;
    private String howOkay4;
    
    private String letOkay1;
    private String letOkay2;
    private String letOkay3;
    private String letOkay4;
    
    private Date date;

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

}
