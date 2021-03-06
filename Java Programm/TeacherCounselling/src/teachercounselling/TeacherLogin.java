/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachercounselling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Mijanur Rahman
 */
public class TeacherLogin extends javax.swing.JFrame {
        Connection conn=null;
        ResultSet rs = null;
        PreparedStatement pst = null;
    /**
     * Creates new form Teacher
     */
    public TeacherLogin() {
        initComponents();
        conn = Test.ConnectrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LebelTeacher = new javax.swing.JLabel();
        jButtonHome1 = new javax.swing.JButton();
        LebelPassword = new javax.swing.JLabel();
        LebelInitial = new javax.swing.JLabel();
        initialGet = new javax.swing.JTextField();
        PasswordGet = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        jButtonCreateAccount = new javax.swing.JButton();
        LebelOr = new javax.swing.JLabel();
        jButtonExit1 = new javax.swing.JButton();
        MessageLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Login System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        LebelTeacher.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LebelTeacher.setForeground(new java.awt.Color(204, 255, 0));
        LebelTeacher.setText("Teacher");
        getContentPane().add(LebelTeacher);
        LebelTeacher.setBounds(250, 50, 140, 50);

        jButtonHome1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHome1.setText("Home");
        jButtonHome1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHome1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHome1);
        jButtonHome1.setBounds(70, 0, 100, 30);

        LebelPassword.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LebelPassword.setForeground(new java.awt.Color(204, 255, 0));
        LebelPassword.setText("Password");
        getContentPane().add(LebelPassword);
        LebelPassword.setBounds(170, 210, 120, 30);

        LebelInitial.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LebelInitial.setForeground(new java.awt.Color(204, 255, 0));
        LebelInitial.setText("Initial");
        getContentPane().add(LebelInitial);
        LebelInitial.setBounds(170, 160, 90, 30);

        initialGet.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(initialGet);
        initialGet.setBounds(300, 160, 190, 30);

        PasswordGet.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(PasswordGet);
        PasswordGet.setBounds(300, 210, 190, 30);

        jButtonLogIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(0, 0, 255));
        jButtonLogIn.setText("Login");
        jButtonLogIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogIn);
        jButtonLogIn.setBounds(350, 270, 80, 30);

        jButtonCreateAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCreateAccount.setForeground(new java.awt.Color(0, 0, 255));
        jButtonCreateAccount.setText("Create new account");
        jButtonCreateAccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCreateAccount);
        jButtonCreateAccount.setBounds(270, 340, 230, 30);

        LebelOr.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        LebelOr.setForeground(new java.awt.Color(255, 255, 102));
        LebelOr.setText("Or");
        getContentPane().add(LebelOr);
        LebelOr.setBounds(380, 310, 20, 20);

        jButtonExit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExit1.setForeground(new java.awt.Color(255, 0, 51));
        jButtonExit1.setText("Exit");
        jButtonExit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit1);
        jButtonExit1.setBounds(0, 0, 70, 30);

        MessageLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageLogin.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(MessageLogin);
        MessageLogin.setBounds(310, 240, 170, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHome1ActionPerformed
        String[] args = null;
            Home.main(args);
    }//GEN-LAST:event_jButtonHome1ActionPerformed

    private void jButtonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAccountActionPerformed
        TeacherRegister.main();
    }//GEN-LAST:event_jButtonCreateAccountActionPerformed

    private void jButtonExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit1ActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
      String query = "select * from admin where Initial=? and Password =?";
      try{
          pst = conn.prepareStatement(query);
          pst.setString(1, initialGet.getText());
          pst.setString(2, PasswordGet.getText());
          rs = pst.executeQuery();
          int count=0;
          while(rs.next()){
              count = count+1;
          }
          if(count==1){
              JOptionPane.showMessageDialog(null, "Log in Succesful!");
          }
          else if(count>1){
              JOptionPane.showMessageDialog(null, "Duplicate name or password!");
          }
          else{
              JOptionPane.showMessageDialog(null, "Username or password is not correct!");
          }
          rs.close();
          pst.close();
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_jButtonLogInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LebelInitial;
    private javax.swing.JLabel LebelOr;
    private javax.swing.JLabel LebelPassword;
    private javax.swing.JLabel LebelTeacher;
    private javax.swing.JLabel MessageLogin;
    private javax.swing.JPasswordField PasswordGet;
    private javax.swing.JTextField initialGet;
    private javax.swing.JButton jButtonCreateAccount;
    private javax.swing.JButton jButtonExit1;
    private javax.swing.JButton jButtonHome1;
    private javax.swing.JButton jButtonLogIn;
    // End of variables declaration//GEN-END:variables
}
