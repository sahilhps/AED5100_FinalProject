/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organisation.DoctorOrganisation;
import Business.Organisation.HealthandHumanServicesOrganisation;
import Business.Organisation.Organisation;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mitishah
 */
public class DoctorHomePageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHomePageJPanel
     */
//    public DoctorHomePageJPanel() {
//        initComponents();
//    }
    private JPanel userProcessContainer;
    private DoctorOrganisation organization;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    //private PatientDirectory patientDirectory;

    /**
     * Creates new form DoctorHomePageJPanel
     */
    public DoctorHomePageJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganisation organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganisation)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        doctorNameLable.setText(account.getName());
        populateTable();


    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewVitalSignsJTable.getModel();

        model.setRowCount(0);

        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
                if (request != null) {
                    PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
                    if (patientDoctorWorkRequest.getDoctor()== userAccount) {
                    Object[] row = new Object[7];
                    row[0] = patientDoctorWorkRequest;
                    row[1] = patientDoctorWorkRequest.getPatientName();
                    row[2] = patientDoctorWorkRequest.getVsNormalorNot();
                    row[3] = patientDoctorWorkRequest.getFtNormalorNot();
                    row[4] = patientDoctorWorkRequest.getLabStatus() == null ? null : patientDoctorWorkRequest.getLabStatus();
                    row[5] = patientDoctorWorkRequest.getPreStatus() == null ? null : patientDoctorWorkRequest.getPreStatus();
                    row[6] = patientDoctorWorkRequest.getRespondStatus() == null ? null : patientDoctorWorkRequest.getRespondStatus();
                    model.addRow(row);
                    }
                }
            }
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

        searchBoxJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        viewDetails = new javax.swing.JButton();
        respondJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        reportToGovernmentHHSDJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        doctorNameLable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewVitalSignsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 196, 146));

        jButton1.setBackground(new java.awt.Color(230, 196, 146));
        jButton1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton1.setText("Search Patient By Name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewDetails.setBackground(new java.awt.Color(230, 196, 146));
        viewDetails.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        viewDetails.setText("View Details");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        respondJButton.setBackground(new java.awt.Color(230, 196, 146));
        respondJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        respondJButton.setText("Respond To Patient");
        respondJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondJButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("!");
        jLabel2.setEnabled(false);

        jButton6.setBackground(new java.awt.Color(230, 196, 146));
        jButton6.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton6.setText("Request / View Test");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(230, 196, 146));
        jButton7.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton7.setText("Make / View Prescription");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        reportToGovernmentHHSDJButton.setBackground(new java.awt.Color(230, 196, 146));
        reportToGovernmentHHSDJButton.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        reportToGovernmentHHSDJButton.setText("Report to Government Health and Human Services Department");
        reportToGovernmentHHSDJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportToGovernmentHHSDJButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 24, 91));
        jButton2.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        doctorNameLable.setBackground(new java.awt.Color(0, 153, 153));
        doctorNameLable.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        doctorNameLable.setForeground(new java.awt.Color(51, 51, 51));
        doctorNameLable.setText("<doctorName>");
        doctorNameLable.setEnabled(false);

        viewVitalSignsJTable.setBackground(new java.awt.Color(230, 196, 146));
        viewVitalSignsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Timestamp", "Patient Name", "Vital Signs", "Fitness", "Lab Status", "Prescription", "Respond"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewVitalSignsJTable);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome");
        jLabel1.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel12.setBackground(new java.awt.Color(0, 24, 91));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MY PATIENTS LIST");
        jPanel1.add(jLabel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorNameLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(592, 592, 592)
                        .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(viewDetails)
                .addGap(67, 67, 67)
                .addComponent(respondJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reportToGovernmentHHSDJButton)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(doctorNameLable)
                    .addComponent(jLabel2))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewDetails)
                    .addComponent(respondJButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton6)))
                .addGap(61, 61, 61)
                .addComponent(reportToGovernmentHHSDJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //        String key= searchBoxJTextField.getText().trim();
        //        if(key.length()==0)
        //        {
            //            JOptionPane.showMessageDialog(this, "Please enter key.", "Error", JOptionPane.ERROR_MESSAGE);
            //            return;
            //        }
        //        ArrayList<Patient> searchPatients;
        //        searchPatients = patientDirectory.searchPatient(key);
        //        populateTable(searchPatients);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void respondJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);

        }

        PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) viewVitalSignsJTable.getValueAt(selectedRow, 0);
        patientDoctorWorkRequest.setRespondStatus("Processing");

        FitnessRecordRespondJPanel panel = new FitnessRecordRespondJPanel(userProcessContainer,enterprise,patientDoctorWorkRequest);
        userProcessContainer.add("FitnessRecordRespondJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_respondJButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{
            PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest)viewVitalSignsJTable.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestandViewTestJPanel", new RequestandViewTestJPanel(userProcessContainer,userAccount, organization, enterprise,patientDoctorWorkRequest));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) viewVitalSignsJTable.getValueAt(selectedRow, 0);

        MakeAndViewPrescriptionJPanel panel = new MakeAndViewPrescriptionJPanel(userProcessContainer,userAccount,organization,enterprise,ecoSystem,patientDoctorWorkRequest);
        userProcessContainer.add("MakeAndViewPrescriptionJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void reportToGovernmentHHSDJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportToGovernmentHHSDJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{

            PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest)viewVitalSignsJTable.getValueAt(selectedRow, 0);

            patientDoctorWorkRequest.setSenderEnterprise(enterprise);
            patientDoctorWorkRequest.setDoctor(userAccount);

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
                if (e instanceof GovernmentEnterprise) {
                    GovernmentEnterprise emfe =(GovernmentEnterprise)e;
                    for(Organisation o:emfe.getOrganisationDirectory().getOrganizationList()){
                        if(o instanceof HealthandHumanServicesOrganisation){
                            org=o;
                            break;
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(patientDoctorWorkRequest);
                //userAccount.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Success! ");
            }

        }

    }//GEN-LAST:event_reportToGovernmentHHSDJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctorNameLable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reportToGovernmentHHSDJButton;
    private javax.swing.JButton respondJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton viewDetails;
    private javax.swing.JTable viewVitalSignsJTable;
    // End of variables declaration//GEN-END:variables
}
