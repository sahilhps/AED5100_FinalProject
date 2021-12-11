/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

import Business.Organisation.Organisation;
import Business.RegisterRequest.RegisterRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mitishah
 */
public class ManageRegisterRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount ua;
    /**
     * Creates new form ManageRegisterRequest
     */
    public ManageRegisterRequestJPanel(JPanel userProcessContainer, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua= ua;
        
        populateTable();
        
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        
        for(RegisterRequest registerRequest:ua.getRegisterRequestDirectory().getRegisterRequestList()){
            Object[] row = new Object[5];
            row[0] = registerRequest;
            row[1] = registerRequest.getNetwork();
            row[2] = registerRequest.getEnterprise();
            row[3] = registerRequest.getOrganisation();
            row[4] = registerRequest.getApproveOrNot();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        approveJButton = new javax.swing.JButton();
        delinceJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Network", "Enterprise", "Organization", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 715, 203));

        approveJButton.setBackground(new java.awt.Color(0, 24, 91));
        approveJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        approveJButton.setForeground(new java.awt.Color(255, 255, 255));
        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        delinceJButton.setBackground(new java.awt.Color(0, 24, 91));
        delinceJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        delinceJButton.setForeground(new java.awt.Color(255, 255, 255));
        delinceJButton.setText("Decline");
        delinceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delinceJButtonActionPerformed(evt);
            }
        });
        add(delinceJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel12.setBackground(new java.awt.Color(0, 24, 91));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Register Request List");
        jPanel1.add(jLabel12);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 440, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select one row");
        }else{
            RegisterRequest registerRequest = (RegisterRequest) jTable1.getValueAt(selectedRow, 0);
            
            registerRequest.setApproveOrNot("Approved");
            
            Organisation userOrganization = registerRequest.getOrganisation();
            UserAccount uaa = userOrganization.getUserAccountDirectory().createUserAccount();
            uaa.setUsername(registerRequest.getUsername());
            uaa.setPassword(registerRequest.getPassword());
            uaa.setRole(registerRequest.getRole());
            
            registerRequest.setName(registerRequest.getName());
            uaa.setName(registerRequest.getName());

//            if(registerRequest.getRole().toString().equals("Business.Role.PatientRole")){
//                uaa.getPatient().setPatientName(registerRequest.getRegisterpatient().getPatientName());
//            }

            
            JOptionPane.showMessageDialog(null, "Success");
            populateTable();

        }
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void delinceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delinceJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select one row");
        }else{
            RegisterRequest registerRequest = (RegisterRequest) jTable1.getValueAt(selectedRow, 0);
            registerRequest.setApproveOrNot("delince");
            populateTable();
        }
        
    }//GEN-LAST:event_delinceJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delinceJButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
