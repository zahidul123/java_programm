/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.ticket.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import static oracle.net.aso.C12.c;

/**
 *
 * @author goel1
 */
public class Login extends javax.swing.JFrame {
static String usrnm;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    public Login(String q)
    {
        this.usrnm=q;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 550));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 40));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 140, 140, 30);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jLabel3.setPreferredSize(new java.awt.Dimension(350, 40));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 200, 130, 30);
        getContentPane().add(t2);
        t2.setBounds(400, 200, 150, 30);
        getContentPane().add(t1);
        t1.setBounds(400, 140, 150, 30);

        b1.setBackground(new java.awt.Color(255, 153, 204));
        b1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b1.setText("LOGIN");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(140, 300, 110, 27);

        b2.setBackground(new java.awt.Color(255, 102, 102));
        b2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b2.setText("SIGNUP");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(420, 300, 100, 27);

        b3.setBackground(new java.awt.Color(153, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b3.setText("Forget Password");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(270, 380, 150, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project pics.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 520));
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -80, 1280, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String n=t1.getText();
        String p=t2.getText();
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user","system");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from bus where username='"+n+"' and password='"+p+"'");
        Login h=new Login(n);
        if(rs.next())
        {
            JOptionPane.showMessageDialog(this,"Welcome "+n);
            loginpage f=new loginpage();
            f.setVisible(true);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(this,"Invalid "+n);
        con.close();
        }catch (Exception e) {System.out.print(e);}
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        signup f=new signup();//frames are classes so can only be accessed using objects
        f.setVisible(true);//shows the new frame visiblity and opens new frame
        this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Forgetpass f=new Forgetpass();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b3ActionPerformed

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
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
