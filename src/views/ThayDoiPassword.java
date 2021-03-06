/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.PasswordController;
import controllers.LoginController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Account;

/**
 *
 * @author acer
 */
public class ThayDoiPassword extends javax.swing.JFrame {

    /**
     * Creates new form ThayDoiPassword
     */
    public ThayDoiPassword() {
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

        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelNewPassword = new javax.swing.JLabel();
        jLabelNewPasswordAgain = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldNewPasswordAgain = new javax.swing.JPasswordField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldNewPassword = new javax.swing.JPasswordField();
        jButtonChange = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUserName.setText("Tên đăng nhập");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPassword.setText("Mật khẩu cũ");

        jLabelNewPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNewPassword.setText("Mật khẩu mới");

        jLabelNewPasswordAgain.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNewPasswordAgain.setText("Nhập lại mật khẩu mới");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("         THAY ĐỔI MẬT KHẨU");

        jButtonChange.setBackground(new java.awt.Color(0, 204, 51));
        jButtonChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonChange.setText("THAY ĐỔI");
        jButtonChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonChangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonChangeMouseExited(evt);
            }
        });
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("QUAY LẠI");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(jTextFieldUsername))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordFieldNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        ArrayList<Account> list=LoginController.getAccount();
        //System.out.println(list.get(1).getPassword());
        LoginController lc=new LoginController();
        String userName1=jTextFieldUsername.getText();
        String password1=String.valueOf(jPasswordFieldPassword.getPassword());
        String newPassword1=String.valueOf(jPasswordFieldNewPassword.getPassword());
        String newPassword2=String.valueOf(jPasswordFieldNewPasswordAgain.getPassword());
        boolean test=true;
        int k=newPassword1.compareTo(newPassword2) ;
        if (userName1.length()==0){
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không được để trống");
            test=false;
        }
        if (test && (password1==null)){
             JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            test=false;
        }
        if (test && (newPassword1==null)){
             JOptionPane.showMessageDialog(this, "Mật khẩu mới không được để trống");
            test=false;
        }
        if (test && (newPassword2==null)){
             JOptionPane.showMessageDialog(this, "Nhập lại mật khẩu mới không được để trống");
            test=false;
        }
        if (test && ((newPassword2.length()<6)||(newPassword1.length()<6||(password1.length()<6)))){
             JOptionPane.showMessageDialog(this, "Mật khẩu phải dài ít nhất 6 ký tự");
            test=false;
        }
        if(test){
   
            if (lc.login(userName1, password1,list)){
                if (newPassword1.equals(newPassword2))
                {   
                    JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu thành công.");
                    int index=PasswordController.getIdOfUserChange(userName1, password1, list);
                    PasswordController.changePassword(index, newPassword1);
                    this.setVisible(false);
                    LoginFrame loginFrame = new LoginFrame();
                    loginFrame.setLocationRelativeTo(null);
                    loginFrame.setResizable(false);
                    loginFrame.setVisible(true);
                }
                else{
                     JOptionPane.showMessageDialog(this, "Mật khẩu mới phải trùng nhau.");
                }
                /*this.setVisible(false);
                MainFrame mainFrame = new MainFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setResizable(false);
                mainFrame.setVisible(true);*/
            }
            else{
                JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng", "Chú ý!!", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        LoginFrame td=new LoginFrame();
        td.setLocationRelativeTo(null);
        td.setAlwaysOnTop(true);
        td.setLocationRelativeTo(null);
        td.setResizable(false);
        td.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChangeMouseEntered
        jButtonChange.setBackground(new Color(145, 218, 102));
    }//GEN-LAST:event_jButtonChangeMouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setBackground(new Color(145, 218, 102));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButtonChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChangeMouseExited
        jButtonChange.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButtonChangeMouseExited

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
            java.util.logging.Logger.getLogger(ThayDoiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThayDoiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThayDoiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThayDoiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThayDoiPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNewPassword;
    private javax.swing.JLabel jLabelNewPasswordAgain;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPasswordField jPasswordFieldNewPassword;
    private javax.swing.JPasswordField jPasswordFieldNewPasswordAgain;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
