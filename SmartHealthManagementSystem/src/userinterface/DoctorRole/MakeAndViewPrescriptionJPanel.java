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
import Business.Role.DrugSalesAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahil Sonawane
 */
public class MakeAndViewPrescriptionJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientDoctorWorkRequest patientDoctorWorkRequest;
    private DoctorOrganisation organization;
    private EcoSystem ecoSystem;
    
    /**
     * Creates new form MakeAndViewPrescriptionJPanel
     */
    public MakeAndViewPrescriptionJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganisation organization, Enterprise enterprise, EcoSystem ecoSystem,PatientDoctorWorkRequest patientDoctorWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganisation)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        this.patientDoctorWorkRequest = patientDoctorWorkRequest;
        populatePharmacyJComboBox();
        populateRequestTable();
    }
    
    public void populatePharmacyJComboBox() {
        pharmacyJComboBox.removeAllItems();
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
                
                        pharmacyJComboBox.addItem(emfe);

                    }
        }


    }
    public void populateRequestTable(){
    DefaultTableModel model = (DefaultTableModel) drugRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
            Object[] row = new Object[4];
            row[0] = patientDoctorWorkRequest.getnameOfDrug();
            row[1] = patientDoctorWorkRequest.getquantofDrug();
            row[2] = patientDoctorWorkRequest.getReceiveEnterprise();
            row[3] = patientDoctorWorkRequest.getpreStat();

            
            model.addRow(row);
    }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharmacyJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugRequestJTable = new javax.swing.JTable();
        drugRequestJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 196, 146));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pharmacyJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        pharmacyJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmacyJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyJComboBoxActionPerformed(evt);
            }
        });
        add(pharmacyJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 127, 127, 30));

        jLabel1.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel1.setText("Pharmacy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        drugRequestJTable.setBackground(new java.awt.Color(230, 196, 146));
        drugRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Demand Quantity", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(drugRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 615, 136));

        drugRequestJButton.setBackground(new java.awt.Color(0, 24, 91));
        drugRequestJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        drugRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        drugRequestJButton.setText("Request Drug");
        drugRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugRequestJButtonActionPerformed(evt);
            }
        });
        add(drugRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Raanana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 24, 91));
        jLabel2.setText("Drug Catalog:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel13.setBackground(new java.awt.Color(0, 24, 91));
        jLabel13.setFont(new java.awt.Font("Lucida Grande", 3, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRESCRIBE MEDICINES");
        jPanel1.add(jLabel13);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 560, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacyJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pharmacyJComboBoxActionPerformed

    private void drugRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugRequestJButtonActionPerformed
        // TODO add your handling code here:    
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestDrugJPanel", new RequestDrugJPanel(userProcessContainer,userAccount,organization,enterprise,ecoSystem,patientDoctorWorkRequest));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_drugRequestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorHomePageJPanel dwjp = (DoctorHomePageJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton drugRequestJButton;
    private javax.swing.JTable drugRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox pharmacyJComboBox;
    // End of variables declaration//GEN-END:variables
}
