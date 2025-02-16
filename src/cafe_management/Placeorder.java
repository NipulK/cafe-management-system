/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe_management;

import Dao.BillDao;
import Dao.CategoryDao;
import Dao.ProductDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Product;
import model.Bill;
import model.Category;


/**
 *
 * @author User
 */
public class Placeorder extends javax.swing.JFrame {

    public String useremail;
    public int billId = 1;
    public int grandTotal = 0;
    public int productprice = 0;
    public int producttotal = 0;
    public String userEmail;
    public String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobilepattern = "^[0-9]*$";

    /**
     * Creates new form Placeorder
     */
    public Placeorder() {
        initComponents();
    }

    public Placeorder(String email) {
        initComponents();
        txt_productname.setEditable(false);
        txt_price.setEditable(false);
        txt_total.setEditable(false);

        btn_addcart.setEnabled(false);
        btn_bill_print.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf.setEnabled(false);
        userEmail = email;
    }

    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.getAllRecordsByCategory(category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productobj = itr.next();
            dtm.addRow(new Object[]{productobj.getName()});
        }
    }

    public void filterproductbyname(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterproductbyname(name, category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productobj = itr.next();
            dtm.addRow(new Object[]{productobj.getName()});
        }

    }

    public void clearProductField() {
        txt_productname.setText("");
        txt_price.setText("");
        jSpinner1.setValue(1);
        txt_total.setText("");
        btn_addcart.setEnabled(false);
    }

    public void validateField() {
        String customername = txt_cname.getText();
        String customerMobile = txt_cMobilenumber.getText();
        String customeremail = txt_cemail.getText();

        if (!customeremail.equals("") || customerMobile.length() == 10 || customerMobile.matches(mobilepattern) || customeremail.matches(emailpattern)) {
            btn_bill_print.setEnabled(true);
        } else {
            btn_bill_print.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cMobilenumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_productname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        btn_addcart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        ldl_grandtot = new javax.swing.JLabel();
        btn_bill_print = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 35, 130, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1262, 23, 41, 42));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 121, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 173, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 229, 125, -1));

        txt_cname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cnameKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 267, 222, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 325, 155, -1));

        txt_cMobilenumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cMobilenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cMobilenumberKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cMobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 363, 222, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 421, 157, -1));

        txt_cemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cemailKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 459, 222, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 113, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 160, 274, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 229, 66, -1));

        txt_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 267, 274, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 410, 284, 350));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 111, 163, 27));

        txt_productname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 156, 163, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 114, 57, -1));

        txt_price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 156, 199, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 229, 163, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 267, 163, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 229, 43, -1));

        txt_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 267, 199, -1));

        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 359, -1, -1));

        btn_addcart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_addcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btn_addcart.setText("Add to Cart");
        getContentPane().add(btn_addcart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1106, 359, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 404, 442, 360));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Grand Total  Rs.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 790, 130, -1));

        ldl_grandtot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldl_grandtot.setForeground(new java.awt.Color(255, 255, 255));
        ldl_grandtot.setText("0000");
        getContentPane().add(ldl_grandtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 790, 70, -1));

        btn_bill_print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_bill_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        btn_bill_print.setText("Generate Bill and Print");
        btn_bill_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bill_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bill_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 780, 220, -1));

        jLabel15.setText("00");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, -1, 910));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home(useremail).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        billId = Integer.parseInt(BillDao.getId());
        jLabel15.setText(BillDao.getId());
        ArrayList<Category> list = CategoryDao.getAllRecorde();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryobj = itr.next();
            jComboBox1.addItem(categoryobj.getName());
        }

        String category = (String) jComboBox1.getSelectedItem();
        productNameByCategory(category);

    }//GEN-LAST:event_formComponentShown

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        String name = txt_search.getText();
        String category = (String) jComboBox1.getSelectedItem();
        filterproductbyname(name, category);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String productName = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByname(productName);
        txt_productname.setText(product.getName());
        txt_price.setText(product.getPrice());

        jSpinner1.setValue(1);
        txt_total.setText(product.getPrice());
        productprice = Integer.parseInt(product.getPrice());
        producttotal = Integer.parseInt(product.getPrice());
        btn_addcart.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int quantity = (Integer) jSpinner1.getValue();
        if (quantity <= 1) {
            jSpinner1.setValue(1);
            quantity = 1;

        }
        producttotal = productprice * quantity;
        txt_total.setText(String.valueOf(producttotal));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String category = (String) jComboBox1.getSelectedItem();
        productNameByCategory(category);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txt_cnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cnameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txt_cnameKeyReleased

    private void txt_cMobilenumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cMobilenumberKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txt_cMobilenumberKeyReleased

    private void txt_cemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cemailKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txt_cemailKeyReleased

    private void btn_bill_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bill_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bill_printActionPerformed

    /**
     * @param args the command line argument
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
            java.util.logging.Logger.getLogger(Placeorder.class.getName()).log(java.util.logging.Level.SEVERE, "1", ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Placeorder.class.getName()).log(java.util.logging.Level.SEVERE, "2", ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Placeorder.class.getName()).log(java.util.logging.Level.SEVERE, "3", ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Placeorder.class.getName()).log(java.util.logging.Level.SEVERE, "4", ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Placeorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addcart;
    private javax.swing.JButton btn_bill_print;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel ldl_grandtot;
    private javax.swing.JTextField txt_cMobilenumber;
    private javax.swing.JTextField txt_cemail;
    private javax.swing.JTextField txt_cname;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_productname;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
