/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.PatientOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class PatientHomePageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientHomePageJPanel
     */
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganisation patientOrganization;
    //private PatientDirectory patientDirectory;
    /**
     * Creates new form PatientHomePageJPanel
     */
    public PatientHomePageJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganisation patientOrganization, Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganisation)patientOrganization;
        this.enterprise = enterprise;
        //this.patientDirectory = patientDirectory;
//        patientNameLable.setText(userAccount.getName());
    }
    public PatientHomePageJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}