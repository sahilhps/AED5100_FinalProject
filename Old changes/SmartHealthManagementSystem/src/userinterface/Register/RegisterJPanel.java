/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Register;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EquipmentManufacturerEnterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.RegisterRequest.RegisterRequest;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Sahil Sonawane
 */
public class RegisterJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    /**
     * Creates new form RegisterJPanel
     */
    Timer timer;
    public RegisterJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
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
        this.ecoSystem = ecoSystem;
        populateNetworkCombox();
        btnAmbulance.setEnabled(false);
//        check();
    }
    
    private void populateNetworkCombox() {
        networkJComboBox.removeAllItems();
        for (Network network : ecoSystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if(enterprise instanceof PharmacyEnterprise){
                return;
            }
            else if(enterprise instanceof GovernmentEnterprise){
                return;
            }
            else if(enterprise instanceof EquipmentManufacturerEnterprise){
                return;
            }else{
                enterpriseJComboBox.addItem(enterprise);
            }
        }
    }
    
    private void populateOrganizationComboBox(Enterprise enterprise) {
        organizationJComboBox.removeAllItems();
        for (Organisation org : enterprise.getOrganisationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(org);

        }
    }
    
    private void populateRoleComboBox(Organisation org1) {
        roleJComboBox.removeAllItems();
        for (Role role : org1.getSupportedRole()) {
            roleJComboBox.addItem(role);
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

        jLabel2 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordJField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        btnAmbulance = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Labtime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 199, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel2.setText("User Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 113, -1));

        jLabel3.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        passwordJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJFieldActionPerformed(evt);
            }
        });
        add(passwordJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 113, -1));

        jLabel4.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 113, -1));

        jLabel5.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel5.setText("Please Select your State");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 268, -1));

        jLabel6.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel6.setText("Please Select your Hospital ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 268, -1));

        jLabel7.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel7.setText("Please Select your Department");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 268, -1));

        jLabel8.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("In case of emergency, call 911");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, -1, 20));

        roleJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 268, -1));

        submitJButton.setBackground(new java.awt.Color(0, 24, 91));
        submitJButton.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, -1));

        btnAmbulance.setBackground(new java.awt.Color(0, 24, 91));
        btnAmbulance.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        btnAmbulance.setForeground(new java.awt.Color(255, 255, 255));
        btnAmbulance.setText("Call Ambulance");
        btnAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbulanceActionPerformed(evt);
            }
        });
        add(btnAmbulance, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel12.setBackground(new java.awt.Color(0, 24, 91));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REGISTRATION");
        jPanel1.add(jLabel12);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 560, 60));

        jLabel9.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel9.setText("Please Select your Role");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        Labtime.setBackground(new java.awt.Color(0, 24, 91));
        Labtime.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Labtime.setForeground(new java.awt.Color(0, 24, 91));
        add(Labtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 170, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 430, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void passwordJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJFieldActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setUsername(userNameJTextField.getText());
        registerRequest.setPassword(passwordJField.getText());
        registerRequest.setName(nameJTextField.getText());

        registerRequest.setNetwork((Network) networkJComboBox.getSelectedItem());
        registerRequest.setEnterprise((Enterprise) enterpriseJComboBox.getSelectedItem());
        registerRequest.setOrganisation((Organisation) organizationJComboBox.getSelectedItem());
        registerRequest.setRole((Role) roleJComboBox.getSelectedItem());
        if (registerRequest.getRole().toString().equals("Business.Role.DoctorRole")) {
            registerRequest.getdoctorRegistration().setEmpName(registerRequest.getName());
        }
        else if (registerRequest.getRole().toString().equals("Business.Role.PatientRole")) {
            registerRequest.getpatientRegistration().setpatientName(registerRequest.getName());
        }

        Enterprise en = (Enterprise) enterpriseJComboBox.getSelectedItem();

        for (UserAccount ua : en.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().toString().equals("Business.Role.AdminRole")) {
                ua.getRegisterRequestDirectory().getregisterToRequestList().add(registerRequest);
            }

        }
        
        JOptionPane.showMessageDialog(null, "Submit successfully");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        if (enterprise != null) {
            populateOrganizationComboBox(enterprise);

        }
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
        Organisation org = (Organisation) organizationJComboBox.getSelectedItem();
        if (org != null) {
            populateRoleComboBox(org);
        }
//        String a = 
        if (organizationJComboBox.getSelectedItem().toString() == "Patient Department"){
            btnAmbulance.setEnabled(true);
//            System.out.println(organizationJComboBox.getSelectedItem());
        }
        else{
            btnAmbulance.setEnabled(false);
        }
//        System.out.println(org);
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void btnAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbulanceActionPerformed
        // TODO add your handling code here:
        AmbulanceJPanel panel = new AmbulanceJPanel(userProcessContainer);
        userProcessContainer.add("AmbulanceJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAmbulanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labtime;
    private javax.swing.JButton btnAmbulance;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

    private void check() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Organisation org = (Organisation) organizationJComboBox.getSelectedItem();
//        System.out.println(organizationJComboBox.getSelectedItem());
        if (organizationJComboBox.getSelectedItem() == "Patient Department"){
            btnAmbulance.setEnabled(true);
        }
    }
}
