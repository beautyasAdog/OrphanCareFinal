/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FoodSellerRole;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author zhb970327
 */
public class FoodSellerJPanel extends javax.swing.JPanel {

    private UserAccount account;
    EcoSystem system;
    List<WorkRequest> foodTable = new ArrayList<>();

    /**
     * Creates new form FoodSellerJPanel
     */
    public FoodSellerJPanel(UserAccount userAccount, EcoSystem system) {
        initComponents();

        account = userAccount;
        this.system = system;

        populateFoodReq();
    }

    private void populateFoodReq() {
        DefaultTableModel model = (DefaultTableModel) tblFood1.getModel();
        model.setRowCount(0);

        foodTable.clear();
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            String[] row = new String[2];
            if (wr instanceof FoodRequest) {

                row[0] = ((FoodRequest) wr).summary();
                row[1] = ((FoodRequest) wr).isReceived() ? "Sent" : "Received Request";
                model.addRow(row);
                foodTable.add(wr);
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
        tblFood1 = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(67, 80, 108));

        tblFood1.setBackground(new java.awt.Color(102, 102, 102));
        tblFood1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        tblFood1.setForeground(new java.awt.Color(255, 255, 255));
        tblFood1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "FoodRequest", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFood1);

        btnProcess.setBackground(new java.awt.Color(61, 103, 155));
        btnProcess.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnProcess.setText("Food Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(61, 103, 155));
        btnRefresh.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 233, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Food Seller Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcess, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int row = tblFood1.getSelectedRow();
        ((FoodRequest) foodTable.get(row)).Received();
        JOptionPane.showMessageDialog(null, "Successfully Sent");
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateFoodReq();

    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFood1;
    // End of variables declaration//GEN-END:variables
}
