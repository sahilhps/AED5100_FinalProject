/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organisation.DoctorOrganisation;
import Business.Organisation.DrugSalesOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class RequestDrugJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientDoctorWorkRequest patientDoctorWorkRequest;
    private DoctorOrganisation organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form RequestDrugJPanel
     */
    public RequestDrugJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganisation organization, Enterprise enterprise, EcoSystem ecoSystem,PatientDoctorWorkRequest patientDoctorWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganisation)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        this.patientDoctorWorkRequest = patientDoctorWorkRequest;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        drugNameJTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 196, 146));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel1.setText("Drug Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, -1));

        requestTestJButton.setBackground(new java.awt.Color(0, 24, 91));
        requestTestJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Add");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, 30));

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel2.setText("Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));
        add(drugNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 210, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel13.setBackground(new java.awt.Color(0, 24, 91));
        jLabel13.setFont(new java.awt.Font("Lucida Grande", 3, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" DRUG ORDER REQUEST");
        jPanel1.add(jLabel13);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 560, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        // TODO add your handling code here:
//        
//        String drugName = drugNameJTextField.getText();
//        String drugQuantity = quantityJTextField.getText();

        //PatientDoctorWorkRequest request = new PatientDoctorWorkRequest();
        patientDoctorWorkRequest.setDrugName(drugNameJTextField.getText());
        patientDoctorWorkRequest.setDrugQuantity(quantityJTextField.getText());
        patientDoctorWorkRequest.setSender(userAccount);
        patientDoctorWorkRequest.setPreStatus("Sent");
        
        Network targetNetwork = null;

        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e == enterprise) {
                    targetNetwork = network;
                    break;
                }
            }
        }
        
        Organisation org = null;
        for (Enterprise e : targetNetwork.getEnterpriseDirectory().getEnterpriseList()) {
         
            if (e instanceof PharmacyEnterprise) {
                PharmacyEnterprise emfe =(PharmacyEnterprise)e;
                for(Organisation o:emfe.getOrganisationDirectory().getOrganizationList()){
                    if(o instanceof DrugSalesOrganisation){
                        org=o;
                        break;
                    }
                }
            }
        }
       
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(patientDoctorWorkRequest);
//            userAccount.getWorkQueue().getWorkRequestList().add(patientDoctorWorkRequest);
            JOptionPane.showMessageDialog(null, "Success! ");
        }


    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MakeAndViewPrescriptionJPanel dwjp = (MakeAndViewPrescriptionJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField drugNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
