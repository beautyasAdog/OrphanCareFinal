/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DisableLeaderRole;

import Business.Child.Child;
import Business.Constant;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FitnessEnterprise;
import Business.Network.Network;
import Business.Organization.AbleOrganization;
import Business.Organization.DisableOrganization;
import Business.Organization.DisableRecoverOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SendToFitnessRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuenasu
 */
public class SendToDisableRecoverOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendToDisableRecoverOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private DisableOrganization organization;
    private EcoSystem system;
    private UserAccount ua;
    private FitnessEnterprise fitness;
    private Child child = null;

    public SendToDisableRecoverOrganizationJPanel(JPanel userProcessContainer, DisableOrganization organization, EcoSystem system, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        this.ua = ua;
        fitness = null;
        populateFitnessBox();

    }

    private void populateFitnessBox() {
        boxHospital.removeAllItems();

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof FitnessEnterprise) {
                    boxHospital.addItem(e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExam = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxHospital = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(67, 80, 108));

        tblExam.setBackground(new java.awt.Color(102, 102, 102));
        tblExam.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        tblExam.setForeground(new java.awt.Color(255, 255, 255));
        tblExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Child Name", "Gym Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExam);

        txtID.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(61, 103, 155));
        jButton1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(61, 103, 155));
        btnSend.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnSend.setText("Send to Gym");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 233, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Child Disable Recovery");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 8)); // NOI18N
        jLabel2.setText("<Leader>");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 233, 235));
        jLabel4.setText("ID:");

        jButton3.setText("jButton3");

        jButton4.setBackground(new java.awt.Color(61, 103, 155));
        jButton4.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 233, 235));
        jLabel3.setText("Gym:");

        boxHospital.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        boxHospital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHospitalActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(61, 103, 155));
        btnDelete.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(99, 99, 99))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(475, 475, 475)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 200, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSend)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnSend)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(131, 131, 131)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = txtID.getText();
        if (!id.matches(Constant.INT)) {
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }

        for (Child c : organization.getChildren().getChildren()) {
            if (c.getId() == Integer.parseInt(id)) {
                child = c;
                DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
                model.setRowCount(0);
                model.addRow(new String[]{c.getName(), c.getFitness(), c.getFitnessStatus()});
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Child not found.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if (fitness == null || child == null) {
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }

        for (Organization o : fitness.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DisableRecoverOrganization) {  //disable的gym
                for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                    SendToFitnessRequest sr = new SendToFitnessRequest(child);
                    sr.getChild().setFitnessStatus("Waiting for response");
                    sr.getChild().setFitness(fitness.getName());
                    ua.getWorkQueue().getWorkRequestList().add(sr);
                    u.getWorkQueue().getWorkRequestList().add(sr);
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Child Sent");
        populateExamRequestTable();

    }//GEN-LAST:event_btnSendActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        populateExamRequestTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void boxHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHospitalActionPerformed
        fitness = (FitnessEnterprise) boxHospital.getSelectedItem();
    }//GEN-LAST:event_boxHospitalActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Integer selectedRow = tblExam.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table");
            return;
        }

        Child child = (Child) tblExam.getValueAt(selectedRow, 0);

        if (!child.getFitnessStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "This child has been sent to a gym!");
            return;
        }

        organization.removeChild(child);
        populateExamRequestTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void populateExamRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
        model.setRowCount(0);

        for (Child c : organization.getChildren().getChildren()) {
            Object[] row = new Object[3];

            row[0] = c;
            row[1] = c.getFitness();
            row[2] = c.getFitnessStatus();
            model.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxHospital;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblExam;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}