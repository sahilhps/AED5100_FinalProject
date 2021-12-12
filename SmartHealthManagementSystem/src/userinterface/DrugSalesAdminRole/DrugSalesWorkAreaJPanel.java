/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugSalesAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.DrugSalesOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DrugSalesWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugSalesWorkAreaJPanel
     */
//    public DrugSalesWorkAreaJPanel() {
//        initComponents();
//    }
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DrugSalesOrganisation organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form DrugSalesWorkAreaJPanel
     */
    Timer timer;
    public DrugSalesWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DrugSalesOrganisation organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
                ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        Date date = new Date();
        DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        String time = timeformat.format(date);
        Labtime.setText(time);
            }
        };
        timer = new Timer(1000, actionlistener);
        timer.setInitialDelay(0);
        timer.start();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = (DrugSalesOrganisation)organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        populateTable();
    }
      public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) drugRequestJTable.getModel();    
        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if (request != null) {
        
            PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
            Object[] row = new Object[6];
            row[0] = patientDoctorWorkRequest;
            row[1] = patientDoctorWorkRequest.getnameOfDrug();
            row[2] = patientDoctorWorkRequest.getquantofDrug();
            row[3] = patientDoctorWorkRequest.getSender();
            row[4] = patientDoctorWorkRequest.getReceiveEnterprise();
            row[5] = patientDoctorWorkRequest.getpreStat();
            
            model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        drugRequestJTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Labtime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 147, 147));

        drugRequestJTable.setBackground(new java.awt.Color(239, 147, 147));
        drugRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Drug Name", "Demand Quantity", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(drugRequestJTable);

        jButton2.setBackground(new java.awt.Color(0, 24, 91));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Assign To Me");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 24, 91));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel13.setBackground(new java.awt.Color(0, 51, 153));
        jLabel13.setFont(new java.awt.Font("Raanana", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DRUG SALES ADMIN");
        jPanel1.add(jLabel13);

        Labtime.setBackground(new java.awt.Color(0, 24, 91));
        Labtime.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Labtime.setForeground(new java.awt.Color(0, 24, 91));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(177, 177, 177)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Labtime, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Labtime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(135, 135, 135))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(218, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }else{
            PatientDoctorWorkRequest request = (PatientDoctorWorkRequest) drugRequestJTable.getValueAt(selectedRow, 0);
            request.setReceiveEnterprise(enterprise);
            populateTable();
            JOptionPane.showMessageDialog(null, "Success");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }
        PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) drugRequestJTable.getValueAt(selectedRow, 0);
        patientDoctorWorkRequest.setpreStat("Accept");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labtime;
    private javax.swing.JTable drugRequestJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
