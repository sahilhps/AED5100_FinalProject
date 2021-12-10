/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.DoctorOrganisation;
import Business.Organisation.Organisation;
import Business.Organisation.PatientOrganisation;
import Business.Patient.Patient;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class CreateMyProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganisation patientOrganization;
    /**
     * Creates new form CreateMyProfileJPanel
     */
    public CreateMyProfileJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganisation patientOrganization, Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganisation)patientOrganization;
        this.enterprise = enterprise;
        populatePrimaryDoctorNameJComboBox();
    }
    
        public void populatePrimaryDoctorNameJComboBox() {
        primaryDoctorNameJComboBox.removeAllItems();
        for (Organisation organization : enterprise.getOrganisationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganisation) {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getRole() instanceof DoctorRole) {
                        primaryDoctorNameJComboBox.addItem(ua);
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

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        numberJTextField = new javax.swing.JTextField();
        emailJTextField = new javax.swing.JTextField();
        zipCodeJTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        streetAddressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        areaCodeJTextField = new javax.swing.JTextField();
        primaryDocNameJLabel = new javax.swing.JLabel();
        primaryDoctorNameJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        patientIDJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Create My Profile");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 26, 229, -1));

        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 79, -1, -1));

        nameJTextField.setEditable(false);
        nameJTextField.setEnabled(false);
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 74, 183, -1));

        jLabel2.setText("Age");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, -1, -1));

        ageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageJTextFieldActionPerformed(evt);
            }
        });
        add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 155, 183, -1));

        numberJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberJTextFieldFocusLost(evt);
            }
        });
        add(numberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 362, 106, -1));

        emailJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailJTextFieldFocusLost(evt);
            }
        });
        add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 318, 182, -1));

        zipCodeJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipCodeJTextFieldFocusLost(evt);
            }
        });
        add(zipCodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 274, 185, -1));

        cityJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityJTextFieldFocusLost(evt);
            }
        });
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 236, 185, -1));

        streetAddressJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetAddressJTextFieldFocusLost(evt);
            }
        });
        add(streetAddressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 198, 185, -1));

        jLabel6.setText("Phone Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 367, -1, -1));

        jLabel5.setText("Email Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 323, -1, -1));

        jLabel3.setText("Zip Code");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 279, -1, -1));

        jLabel7.setText("City/Town");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 241, -1, -1));

        jLabel8.setText("Street Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 203, -1, -1));

        jLabel10.setText("-");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 367, -1, -1));

        areaCodeJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                areaCodeJTextFieldFocusLost(evt);
            }
        });
        add(areaCodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 362, 50, -1));

        primaryDocNameJLabel.setText("Primary Doctor Name");
        add(primaryDocNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 410, -1, -1));

        primaryDoctorNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        primaryDoctorNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primaryDoctorNameJComboBoxActionPerformed(evt);
            }
        });
        add(primaryDoctorNameJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 406, 144, -1));

        jLabel4.setText("Patient ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 116, -1, -1));

        patientIDJTextField.setEditable(false);
        patientIDJTextField.setEnabled(false);
        patientIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDJTextFieldActionPerformed(evt);
            }
        });
        add(patientIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 111, 183, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 469, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 501, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void ageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageJTextFieldActionPerformed

    private void numberJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberJTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_numberJTextFieldFocusLost

    private void emailJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_emailJTextFieldFocusLost

    private void zipCodeJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipCodeJTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_zipCodeJTextFieldFocusLost

    private void cityJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_cityJTextFieldFocusLost

    private void streetAddressJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetAddressJTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_streetAddressJTextFieldFocusLost

    private void areaCodeJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaCodeJTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_areaCodeJTextFieldFocusLost

    private void patientIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        ManageMyProfileJPanel dwjp = (ManageMyProfileJPanel) component;
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        
        //(nameJTextField.getText().length()==0)||
        
        if((ageJTextField.getText().length()==0)||
                (streetAddressJTextField.getText().length()==0)||
                (cityJTextField.getText().length()==0)||
                (zipCodeJTextField.getText().length()==0)||
                (emailJTextField.getText().length()==0)||
                (areaCodeJTextField.getText().length()==0)||
                (numberJTextField.getText().length()==0))
        {
            JOptionPane.showMessageDialog(null, "Alert! Inputs can not be empty! ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if((ageJTextField.getText().length() != 0) ||
             (streetAddressJTextField.getText().length()!=0) ||
            (cityJTextField.getText().length() != 0)||
                (zipCodeJTextField.getText().length() !=0)||
                (emailJTextField.getText().length() !=0)||
                (areaCodeJTextField.getText().length() !=0)||
                (numberJTextField.getText().length() !=0)) {
            try{

//                String patientName = userAccountnameJTextField.getText();
                int age = Integer.parseInt(ageJTextField.getText());
                String streetAddress = streetAddressJTextField.getText();
                String town = cityJTextField.getText();
                int zipCode = Integer.parseInt(zipCodeJTextField.getText());
                String emailAddress = emailJTextField.getText();
                int areaCode = Integer.parseInt(areaCodeJTextField.getText());
                int phoneNumber = Integer.parseInt(numberJTextField.getText());
                
                
                Patient patient = patientOrganization.getPatientDirectory().createPtient(userAccount.getName());
                userAccount.setPatient(patient);
                patient.setPatientName(userAccount.getName());
                patient.setAge(age);
                patient.setAreaCode(areaCode);
                patient.setEmailAddress(emailAddress);
                patient.setPhoneNumber(phoneNumber);
                patient.setStreetAddress(streetAddress);
                patient.setTown(town);
                patient.setZipCode(zipCode);
                patient.setMydoctor((UserAccount)primaryDoctorNameJComboBox.getSelectedItem());
                
                
                patient.setMyDoctor(String.valueOf(primaryDoctorNameJComboBox.getSelectedItem()));


                JOptionPane.showMessageDialog(null, "Create Patient Information Successfully!", "Warning", JOptionPane.WARNING_MESSAGE);
                resetFields();
            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Alert! Please enter appropriate values! ", "Warning", JOptionPane.WARNING_MESSAGE);

            }
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void primaryDoctorNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primaryDoctorNameJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primaryDoctorNameJComboBoxActionPerformed

    public void resetFields(){
        
        ageJTextField.setText("");
        nameJTextField.setText("");
        streetAddressJTextField.setText("");
        cityJTextField.setText("");
        zipCodeJTextField.setText("");
        emailJTextField.setText("");
        areaCodeJTextField.setText("");
        numberJTextField.setText("");
       
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JTextField areaCodeJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField numberJTextField;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JComboBox primaryDoctorNameJComboBox;
    private javax.swing.JTextField streetAddressJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}
