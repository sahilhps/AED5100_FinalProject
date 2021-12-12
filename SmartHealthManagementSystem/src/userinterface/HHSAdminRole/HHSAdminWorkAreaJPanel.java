/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HHSAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.HealthandHumanServicesOrganisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class HHSAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HHSAdminWorkAreaJPanel
     */
    public HHSAdminWorkAreaJPanel() {
        initComponents();
    }
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HealthandHumanServicesOrganisation organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form HHSAdminWorkAreaJPanel
     */
    Timer timer;
    public HHSAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HealthandHumanServicesOrganisation organization, Enterprise enterprise, EcoSystem ecoSystem) {
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
        this.organization = (HealthandHumanServicesOrganisation)organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Labtime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(182, 145, 145));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel14.setBackground(new java.awt.Color(0, 51, 153));
        jLabel14.setFont(new java.awt.Font("Raanana", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HEALTH AND HUMAN SERVICES ADMIN");
        jPanel1.add(jLabel14);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 43, 800, 63));

        jButton1.setBackground(new java.awt.Color(182, 145, 145));
        jButton1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton1.setText("View All Reports List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 213, -1));

        Labtime.setBackground(new java.awt.Color(0, 24, 91));
        Labtime.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Labtime.setForeground(new java.awt.Color(0, 24, 91));
        add(Labtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAllReportsListJPanel panel = new ViewAllReportsListJPanel(userProcessContainer,userAccount,organization,enterprise,ecoSystem);
        userProcessContainer.add("ViewAllReportsListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labtime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
