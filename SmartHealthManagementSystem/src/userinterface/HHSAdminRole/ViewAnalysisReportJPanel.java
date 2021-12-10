/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HHSAdminRole;

/**
 *
 * @author dongyueli
 */
public class ViewAnalysisReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAnalysisReportJPanel
     */
    public ViewAnalysisReportJPanel() {
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

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        averageRespiratoryRateJTextField = new javax.swing.JTextField();
        averageHeartRateJTextField = new javax.swing.JTextField();
        averageWeightJTextField = new javax.swing.JTextField();
        averageSystolicBloodPressureJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        respiratoryStatusJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        heartStatusJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bloodStatusJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightStatusJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        longestTotalTimeJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        shortestTotalTimeJTextField = new javax.swing.JTextField();
        averageTotalTimeJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Analysis Report");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 33, 215, -1));

        jLabel1.setText("Average Respiratory Rate:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 144, -1, -1));

        jLabel2.setText("Average Heart Rate:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 182, -1, -1));

        jLabel3.setText("Average Systolic Blood Pressure:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 226, -1, -1));

        jLabel4.setText("Average Weight in Pounds:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 270, -1, -1));

        averageRespiratoryRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageRespiratoryRateJTextFieldActionPerformed(evt);
            }
        });
        add(averageRespiratoryRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 139, 109, -1));

        averageHeartRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageHeartRateJTextFieldActionPerformed(evt);
            }
        });
        add(averageHeartRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 177, 109, -1));

        averageWeightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageWeightJTextFieldActionPerformed(evt);
            }
        });
        add(averageWeightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 265, 109, -1));

        averageSystolicBloodPressureJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageSystolicBloodPressureJTextFieldActionPerformed(evt);
            }
        });
        add(averageSystolicBloodPressureJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 221, 109, -1));

        jLabel5.setText("Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 144, -1, -1));
        add(respiratoryStatusJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 139, 91, -1));

        jLabel6.setText("Status:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 182, -1, -1));
        add(heartStatusJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 177, 91, -1));

        jLabel7.setText("Status:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 226, -1, -1));
        add(bloodStatusJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 221, 91, -1));

        jLabel8.setText("Status:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 270, -1, -1));
        add(weightStatusJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 265, 91, -1));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 410, -1, -1));

        jLabel14.setText("Average Fitness Total Time:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 450, -1, -1));

        longestTotalTimeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longestTotalTimeJTextFieldActionPerformed(evt);
            }
        });
        add(longestTotalTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 369, 139, -1));

        jLabel15.setText("The Longest Fitness Total Time:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 374, -1, -1));

        jLabel16.setText("The Shortest Fitness Total Time:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 412, -1, -1));

        shortestTotalTimeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortestTotalTimeJTextFieldActionPerformed(evt);
            }
        });
        add(shortestTotalTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 407, 139, -1));

        averageTotalTimeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageTotalTimeJTextFieldActionPerformed(evt);
            }
        });
        add(averageTotalTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 445, 139, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("Fitness Record");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 329, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("Vital Signs");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 99, -1, -1));

        backJButton.setText("<<Back");
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 498, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void averageRespiratoryRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageRespiratoryRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageRespiratoryRateJTextFieldActionPerformed

    private void averageHeartRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageHeartRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageHeartRateJTextFieldActionPerformed

    private void averageWeightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageWeightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageWeightJTextFieldActionPerformed

    private void averageSystolicBloodPressureJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageSystolicBloodPressureJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageSystolicBloodPressureJTextFieldActionPerformed

    private void longestTotalTimeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longestTotalTimeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longestTotalTimeJTextFieldActionPerformed

    private void shortestTotalTimeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortestTotalTimeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shortestTotalTimeJTextFieldActionPerformed

    private void averageTotalTimeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageTotalTimeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageTotalTimeJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField averageHeartRateJTextField;
    private javax.swing.JTextField averageRespiratoryRateJTextField;
    private javax.swing.JTextField averageSystolicBloodPressureJTextField;
    private javax.swing.JTextField averageTotalTimeJTextField;
    private javax.swing.JTextField averageWeightJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodStatusJTextField;
    private javax.swing.JTextField heartStatusJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField longestTotalTimeJTextField;
    private javax.swing.JTextField respiratoryStatusJTextField;
    private javax.swing.JTextField shortestTotalTimeJTextField;
    private javax.swing.JTextField weightStatusJTextField;
    // End of variables declaration//GEN-END:variables
}