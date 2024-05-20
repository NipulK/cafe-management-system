/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe_management;

import Dao.userQu;
import javax.swing.JOptionPane;
import model.User;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {
    
    public String emailpattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        bt_Login.setEnabled(false);
    }
    
    public void clear()
    {
        txt_Email.setText("");
        txt_Password.setText("");
        bt_Login.setEnabled(false);
    }
    
    public void validateFields()
    {
        String email=txt_Email.getText();
        String password=txt_Password.getText();
        if(email.matches(emailpattern)|| !password.equals(""))
        {
            bt_Login.setEnabled(true);
        }
        else
        {
            bt_Login.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        bt_Login = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        bt_forgetpassword = new javax.swing.JButton();
        bt_signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 193, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 289, 89, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 349, 89, -1));

        txt_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_EmailKeyReleased(evt);
            }
        });
        getContentPane().add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 286, 381, -1));

        txt_Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 343, 381, -1));

        bt_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 410, -1, -1));

        bt_clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        bt_clear.setText("Clear");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });
        getContentPane().add(bt_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 410, -1, -1));

        bt_exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        bt_exit.setText("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        getContentPane().add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 410, -1, -1));

        bt_forgetpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_forgetpassword.setText("Forgot Password ?");
        bt_forgetpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_forgetpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(bt_forgetpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 474, -1, -1));

        bt_signup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_signup.setText("Signup");
        bt_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signupActionPerformed(evt);
            }
        });
        getContentPane().add(bt_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 474, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1312802.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        // TODO add your handling code here:
        String email=txt_Email.getText();
        String password=txt_Password.getText();
        User user=null;
        user=userQu.login(email,password);
           if(email.matches(emailpattern)||user.getStatus().equals("true"))
                 { user.getStatus().equals(false);
                 
                ImageIcon icon=new ImageIcon("src/popupicon/wait.png");
                 JOptionPane.showMessageDialog(null,"<html><b>Wait for Admin Approvel</b></html","Message",JOptionPane.INFORMATION_MESSAGE,icon);       
                 
                 clear();
                 
                     Home home=new Home();
                     home.setVisible(true);
                     setVisible(false);
                     new Home().setVisible(true);
                 } 
             
          
           else
           {
           if(user == null){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect username or Password</b></html>","Message",JOptionPane.ERROR_MESSAGE);
             
        
        }
        
        
    }//GEN-LAST:event_bt_LoginActionPerformed
    }
    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        // TODO add your handling code here:
        int s=JOptionPane.showConfirmDialog(null, "Do you really want to close Application","select",JOptionPane.YES_NO_OPTION);
        if(s==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_bt_exitActionPerformed

    private void txt_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txt_EmailKeyReleased

    private void txt_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txt_PasswordKeyReleased

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_bt_clearActionPerformed

    private void bt_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signupActionPerformed
        // TODO add your handling code here:
        new Signup().setVisible(true);
    }//GEN-LAST:event_bt_signupActionPerformed

    private void bt_forgetpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_forgetpasswordActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgetPassword().setVisible(true);
    }//GEN-LAST:event_bt_forgetpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_forgetpassword;
    private javax.swing.JButton bt_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
