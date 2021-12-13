/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Register;

import Business.Ambulance.Ambulance;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class AmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceJPanel
     */
//    public AmbulanceJPanel() {
//        initComponents();
//    }
    JPanel userProcessContainer;

    AmbulanceJPanel(JPanel userProcessContainer) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtlocation = new javax.swing.JTextField();
        txtInjury = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        btnbook = new javax.swing.JButton();
        LabAmb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 199, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 335, 33));
        add(txtInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 335, 71));

        btnBack.setBackground(new java.awt.Color(0, 24, 91));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 780, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 33)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BOOK AMBULANCE");
        jPanel1.add(jLabel11);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 628, 60));

        jLabel8.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("In case of emergency, call (413)1560981");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 20));

        jLabel9.setFont(new java.awt.Font("PT Serif", 0, 14)); // NOI18N
        jLabel9.setText("Provide your location");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, -1, 20));

        jLabel10.setFont(new java.awt.Font("Raanana", 3, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Provide all the inputs in order to pre-book the ambulance!!");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, 20));

        jLabel12.setFont(new java.awt.Font("PT Serif", 0, 14)); // NOI18N
        jLabel12.setText("Provide detailed description");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, -1, 20));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, 181, -1));

        jLabel13.setFont(new java.awt.Font("PT Serif", 0, 14)); // NOI18N
        jLabel13.setText("Provide booking date");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, -1, 20));

        btnbook.setBackground(new java.awt.Color(0, 24, 91));
        btnbook.setForeground(new java.awt.Color(255, 255, 255));
        btnbook.setText("Book ambulance");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });
        add(btnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 780, 166, -1));

        LabAmb.setFont(new java.awt.Font("PT Serif", 0, 14)); // NOI18N
        LabAmb.setIcon(new javax.swing.ImageIcon("/Users/mitishah/Kaam wala folder/Finalproject/ambulance.gif")); // NOI18N
        add(LabAmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 970, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
        // TODO add your handling code here:
        Ambulance ab = new Ambulance();
        ab.setInjury(txtInjury.getText());
        ab.setLocation(txtlocation.getText());
        JOptionPane.showMessageDialog(null, "Your Ambulance will arrive on  "+ jDateChooser1.getDate() + " for your "
                + " assisstance at " + ab.getLocation() + "  for your injury " + ab.getInjury());

    }//GEN-LAST:event_btnbookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabAmb;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnbook;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtInjury;
    private javax.swing.JTextField txtlocation;
    // End of variables declaration//GEN-END:variables
}