package SignUP;


import SignUP.IterAdmin;
import SignUP.SessionManager;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Member extends javax.swing.JFrame {

    /**
     * Creates new form Member
     */
    private SessionManager sessionManager;
    private String LOG;
    private int ID;
    private String nom;
    private String prenom;
      
    public Member() {
    initComponents();
    SessionManager sessionManager = SessionManager.getInstance();
    String LOG = (String) sessionManager.getAttribute("username");
     ID = (int) sessionManager.getAttribute("ID");
    String nom = (String) sessionManager.getAttribute("nom");
    String prenom = (String) sessionManager.getAttribute("prenom");

    String driver = "com.mysql.jdbc.Driver";
    String strcon = "jdbc:mysql://localhost:3306/utilisateur";
    String req = "SELECT lastname, firstname, birthday, adresse, CIN, phone FROM info_utilisateur WHERE ID=?";
    String req1 = "SELECT email, password FROM login_utilisateur WHERE ID=?";

    try {
        Class.forName(driver);
        Connection conn = (Connection) DriverManager.getConnection(strcon, "root", "");
        
        // Update the first table
        PreparedStatement p = conn.prepareStatement(req);
        p.setInt(1, ID);
        ResultSet res = p.executeQuery();
        if (res.next()) {
            fl1.setText(res.getString("lastname"));
            fl2.setText(res.getString("firstname"));
            fl3.setText(res.getString("birthday"));
            fl4.setText(res.getString("adresse"));
            fl7.setText(res.getString("CIN"));
            fl5.setText(res.getString("phone"));
        }
        
        // Update the second table
        PreparedStatement q = conn.prepareStatement(req1);
        q.setInt(1, ID);
        ResultSet res1 = q.executeQuery();
        if (res1.next()) {
            fl8.setText(res1.getString("email"));
            fl6.setText(res1.getString("password"));
        }
        
        // Close resources
        res.close();
        res1.close();
        p.close();
        q.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
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

        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fl6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fl1 = new javax.swing.JTextField();
        fl2 = new javax.swing.JTextField();
        fl3 = new javax.swing.JTextField();
        fl4 = new javax.swing.JTextField();
        fl5 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fl7 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        fl8 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(99, 131, 118));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 240, 10));

        jLabel2.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel2.setText("             Update");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 322, 50));

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel3.setText("Phone :");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 20));

        fl6.setBackground(new java.awt.Color(218, 217, 217));
        fl6.setText("   ");
        fl6.setBorder(null);
        fl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl6ActionPerformed(evt);
            }
        });
        jPanel5.add(fl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 240, 30));

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel4.setText("Last Name :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jLabel5.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel5.setText("First Name :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        jLabel6.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel6.setText("Adresse :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 20));

        jLabel7.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel7.setText("Birth_Day :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 20));

        jLabel8.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel8.setText("CIN");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, 20));

        jLabel9.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel9.setText("Password :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 80, 20));

        fl1.setBackground(new java.awt.Color(218, 217, 217));
        fl1.setText("   ");
        fl1.setBorder(null);
        fl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl1ActionPerformed(evt);
            }
        });
        jPanel5.add(fl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 240, 30));

        fl2.setBackground(new java.awt.Color(218, 217, 217));
        fl2.setText("   ");
        fl2.setBorder(null);
        fl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl2ActionPerformed(evt);
            }
        });
        jPanel5.add(fl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 240, 30));

        fl3.setBackground(new java.awt.Color(218, 217, 217));
        fl3.setText("   ");
        fl3.setBorder(null);
        fl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl3ActionPerformed(evt);
            }
        });
        jPanel5.add(fl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 240, 30));

        fl4.setBackground(new java.awt.Color(218, 217, 217));
        fl4.setText("     YYYY/MM/DD");
        fl4.setBorder(null);
        fl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl4ActionPerformed(evt);
            }
        });
        jPanel5.add(fl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 240, 30));

        fl5.setBackground(new java.awt.Color(218, 217, 217));
        fl5.setText("   ");
        fl5.setBorder(null);
        fl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl5ActionPerformed(evt);
            }
        });
        jPanel5.add(fl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 240, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 240, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 240, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 240, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 240, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 10));

        jButton1.setBackground(new java.awt.Color(218, 217, 217));
        jButton1.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 120, 30));

        jButton2.setBackground(new java.awt.Color(218, 217, 217));
        jButton2.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 110, 30));

        fl7.setBackground(new java.awt.Color(218, 217, 217));
        fl7.setText("   ");
        fl7.setBorder(null);
        fl7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl7ActionPerformed(evt);
            }
        });
        jPanel5.add(fl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 240, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 240, 10));

        fl8.setBackground(new java.awt.Color(218, 217, 217));
        fl8.setText("   ");
        fl8.setBorder(null);
        fl8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl8ActionPerformed(evt);
            }
        });
        jPanel5.add(fl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 240, 30));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 240, 10));

        jLabel10.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel10.setText("Email :");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 370, 520));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/liv.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 890, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl6ActionPerformed

    private void fl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl1ActionPerformed

    private void fl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl2ActionPerformed

    private void fl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl3ActionPerformed

    private void fl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl4ActionPerformed

    private void fl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl5ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String v1= fl1.getText();
        String v2= fl2.getText();
        String v3= fl3.getText();
        String v4= fl4.getText();
        String v5= fl5.getText();
        String v7= fl7.getText();
        String r1= fl6.getText();
        String r2= fl8.getText();
        String driver="com.mysql.jdbc.Driver";
        String strcon = "jdbc:mysql://localhost:3306/utilisateur";
        
        try {
    if (v1.isEmpty() || v2.isEmpty() || v3.isEmpty() || v4.isEmpty() || v5.isEmpty() || v7.isEmpty() || r1.isEmpty() || r2.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Fill in all the fields please !!");
    } else {
        Class.forName(driver);
        Connection con = (Connection)DriverManager.getConnection(strcon, "root", "");

        // Update the first table
        String req = "UPDATE info_utilisateur SET lastname=?, firstname=?, birthday=?, adresse=?, CIN=?, phone=? WHERE ID=?";
        PreparedStatement p = con.prepareStatement(req);
        p.setString(1, v1);
        p.setString(2, v2);
        p.setString(3, v3);
        p.setString(4, v4);
        p.setString(5, v7);
        p.setString(6, v5);
        p.setInt(7, ID);
        p.executeUpdate();

        // Update the second table
        String req1 = "UPDATE login_utilisateur SET email=?, password=? WHERE ID=?";
        PreparedStatement q = con.prepareStatement(req1);
        q.setString(1, r1);
        q.setString(2, r2);
        q.setInt(3, ID);
        q.executeUpdate();

        JOptionPane.showMessageDialog(null, "Your information has been saved.");
    }
} catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        espaceutilisateur deuxiemeFrame = new espaceutilisateur();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
                  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fl7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl7ActionPerformed

    private void fl8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl8ActionPerformed

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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fl1;
    private javax.swing.JTextField fl2;
    private javax.swing.JTextField fl3;
    private javax.swing.JTextField fl4;
    private javax.swing.JTextField fl5;
    private javax.swing.JTextField fl6;
    private javax.swing.JTextField fl7;
    private javax.swing.JTextField fl8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}