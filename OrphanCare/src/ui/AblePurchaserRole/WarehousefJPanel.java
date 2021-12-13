/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AblePurchaserRole;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Business.Enterprise.Enterprise;
import Business.Item.Clothes;
import Business.Item.Food;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequest;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author yuenasu
 */
public class WarehousefJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount ua;

    /**
     * Creates new form WarehouseJPanel
     */
    public WarehousefJPanel(JPanel userProcessContainer, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;

        populateFoodTable();
    }

    private void populateFoodTable() {
        DefaultTableModel model = (DefaultTableModel) tblFood.getModel();
        model.setRowCount(0);

        List<Object[]> table = new ArrayList<>();

        for (Food f : Food.values()) {
            //初始化，所有食物都是0个，用Object[]因为一列是String，一列是int
            table.add(new Object[]{f.toString(), 0});
        }
        
        for (WorkRequest wr :ua.getWorkQueue().getWorkRequestList()){
            if (wr instanceof FoodRequest && ((FoodRequest) wr).isReceived()){ //已接收的食物
                List<Food> foods = ((FoodRequest) wr).getFoods();
                if (foods.size() > 0) {  //如果食物大于0
                    int count = 0;      //计数器，用于定位食物在table里的row
                    for (Food f : Food.values()) {
                        
                        if (foods.get(0).equals(f)) { //加上有多少食物
                            table.get(count)[1] = (int)table.get(count)[1] + foods.size();
                        }
                        count++;
                    }
                }
            }
        }

        for (Object[] o : table) { //populate the table
            model.addRow(o);
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
        tblFood = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(67, 80, 108));

        tblFood.setBackground(new java.awt.Color(102, 102, 102));
        tblFood.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        tblFood.setForeground(new java.awt.Color(255, 255, 255));
        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFood);

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 233, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Able Food Warehouse");

        jButton1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFood;
    // End of variables declaration//GEN-END:variables
}
