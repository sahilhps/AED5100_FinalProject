/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahil Sonawane
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;

        populateTable();
        populateNetworkComboBox();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise;
                    row[1] = network.getName();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : ecoSystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
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

        createEnterpriseAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        DeleteJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(164, 213, 225));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createEnterpriseAdmin.setBackground(new java.awt.Color(0, 24, 91));
        createEnterpriseAdmin.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        createEnterpriseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        createEnterpriseAdmin.setText("Create New Enterprise Admin");
        createEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEnterpriseAdminActionPerformed(evt);
            }
        });
        add(createEnterpriseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 320, -1));

        jLabel4.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 170, -1));

        enterpriseJTable.setBackground(new java.awt.Color(164, 213, 225));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 730, 160));

        jLabel5.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 160, -1));

        jLabel1.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 210, -1));

        DeleteJButton.setBackground(new java.awt.Color(0, 24, 91));
        DeleteJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        DeleteJButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteJButton.setText("Delete");
        DeleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJButtonActionPerformed(evt);
            }
        });
        add(DeleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, -1));

        jLabel2.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 150, -1));

        jLabel3.setFont(new java.awt.Font("Savoye LET", 0, 30)); // NOI18N
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 290, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel12.setBackground(new java.awt.Color(0, 24, 91));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MANAGE ENTERPRISE ADMIN");
        jPanel1.add(jLabel12);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 560, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void createEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEnterpriseAdminActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();

        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);

        enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        populateTable();
    }//GEN-LAST:event_createEnterpriseAdminActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void DeleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow <= 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row First");
        } else {
            
            UserAccount userAccount = (UserAccount) enterpriseJTable.getValueAt(selectedRow, 2); 
            for (Network network : ecoSystem.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {                    
                    enterprise.getUserAccountDirectory().getUserAccountList().remove(userAccount);
                }
            }
            JOptionPane.showMessageDialog(null, "Successfully removed!");
            populateTable();
        }


    }//GEN-LAST:event_DeleteJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEnterpriseAdmin;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
