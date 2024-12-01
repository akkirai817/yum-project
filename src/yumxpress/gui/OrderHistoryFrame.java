/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import yumxpress.dao.OrderDAO;
import yumxpress.pojo.OrderPojo;
import yumxpress.util.UserProfile;

/**
 *
 * @author Admin
 */
public class OrderHistoryFrame extends javax.swing.JFrame {
    private DefaultTableModel model;
    private List<OrderPojo>orderList;
    
    
    
    public OrderHistoryFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblUserProfile.setText("Hello "+UserProfile.getUserName());
        model=(DefaultTableModel)jtDeliveredProductTable.getModel();
        loadDeliveredProductDetails(UserProfile.getUserId().trim());

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDeliveredProductTable = new javax.swing.JTable();
        btnPostReview = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnOrderFood = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnMyAccount = new javax.swing.JButton();
        btnMyCart = new javax.swing.JButton();
        lblUserProfile = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order History Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDeliveredProductTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtDeliveredProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "PRODUCT NAME", "PRODUCT PRICE", "DELIVERY STAFF", "COMPANY NAME", "ADDRESS", "REVIEW"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDeliveredProductTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtDeliveredProductTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jtDeliveredProductTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 860, 370));

        btnPostReview.setBackground(new java.awt.Color(51, 153, 255));
        btnPostReview.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPostReview.setForeground(new java.awt.Color(254, 255, 254));
        btnPostReview.setText("Post Review (0)");
        btnPostReview.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                btnPostReviewInputMethodTextChanged(evt);
            }
        });
        btnPostReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostReviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnPostReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 190, 40));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrderFood.setBackground(new java.awt.Color(255, 176, 9));
        btnOrderFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderFood.setText("Order Food");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrderFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 40));

        btnCancelOrder.setBackground(new java.awt.Color(255, 176, 9));
        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 220, 40));

        btnMyAccount.setBackground(new java.awt.Color(255, 176, 9));
        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 220, 40));

        btnMyCart.setBackground(new java.awt.Color(255, 176, 9));
        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 40));

        lblUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserProfile.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(lblUserProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 7));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 280, 560));

        btnBack.setBackground(new java.awt.Color(51, 153, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(254, 255, 254));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 190, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Order History");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostReviewActionPerformed
        
    }//GEN-LAST:event_btnPostReviewActionPerformed

    private void jtDeliveredProductTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtDeliveredProductTablePropertyChange

    }//GEN-LAST:event_jtDeliveredProductTablePropertyChange

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        new OrderFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        new CustomerAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
        new CustomerCartFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new CustomerOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPostReviewInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_btnPostReviewInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPostReviewInputMethodTextChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderHistoryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnPostReview;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtDeliveredProductTable;
    private javax.swing.JLabel lblUserProfile;
    // End of variables declaration//GEN-END:variables

    private void loadDeliveredProductDetails(String customerId) {
        try{
            orderList=OrderDAO.getOrderDetailsByCustmerId(customerId);
            //System.out.println("size of orderist:"+orderList.size());
            if(orderList.isEmpty()){
                JOptionPane.showMessageDialog(null,"no any orders ");
                jtDeliveredProductTable.setEnabled(false);
                return;
            }
           int i=0;
           Object []rows=new Object[7];
           while(i<orderList.size()){
               OrderPojo ord=orderList.get(i);
               rows[0]=ord.getOrderId();
               rows[1]=ord.getProductName();
               rows[2]=ord.getProductPrice();
               rows[3]=ord.getDeliveryStaffName();
               rows[4]=ord.getCompanyName();
               rows[5]=ord.getCustomerAddress();
               rows[6]=ord.getReview();
               model.addRow(rows);
               i++;   
           }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error in OrderHistoryFrame");
            ex.printStackTrace();
            return;
        }  
    }

}
