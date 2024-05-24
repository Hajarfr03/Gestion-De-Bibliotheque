/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUP;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class ajouterlivre extends javax.swing.JFrame {

    /**
     * Creates new form ajouterlivre
     */
    public ajouterlivre() {
        initComponents();
    }

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fl1 = new javax.swing.JTextField();
        fl2 = new javax.swing.JTextField();
        fl3 = new javax.swing.JTextField();
        fl4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        reset = new javax.swing.JButton();
        Brouws = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lab1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel14.setText("Welcome   to   our   library");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 260, 290));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jLabel15.setText("jLabel13");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 40));

        jLabel16.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel16.setText("Read");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 40, -1));

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel1.setText("             ADD BOOK");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 322, 50));

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel4.setText("ISBN :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jLabel5.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel5.setText("Title :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        jLabel6.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel6.setText("Author :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 20));

        jLabel7.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel7.setText("Date :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 20));

        jLabel8.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel8.setText("Link image :");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, 20));

        fl1.setBackground(new java.awt.Color(218, 217, 217));
        fl1.setBorder(null);
        fl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl1ActionPerformed(evt);
            }
        });
        jPanel5.add(fl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, 30));

        fl2.setBackground(new java.awt.Color(218, 217, 217));
        fl2.setBorder(null);
        fl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl2ActionPerformed(evt);
            }
        });
        jPanel5.add(fl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 280, 30));

        fl3.setBackground(new java.awt.Color(218, 217, 217));
        fl3.setBorder(null);
        fl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl3ActionPerformed(evt);
            }
        });
        jPanel5.add(fl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 280, 30));

        fl4.setBackground(new java.awt.Color(218, 217, 217));
        fl4.setBorder(null);
        fl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl4ActionPerformed(evt);
            }
        });
        jPanel5.add(fl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 280, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 280, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 280, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 280, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 280, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 10));

        reset.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetMousePressed(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel5.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 110, 30));

        Brouws.setBackground(new java.awt.Color(204, 204, 204));
        Brouws.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        Brouws.setText("Browse");
        Brouws.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrouwsActionPerformed(evt);
            }
        });
        jPanel5.add(Brouws, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 90, 20));

        jButton3.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 110, 30));

        lab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 180));

        ok.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                okMousePressed(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel5.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 400, 510));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/livre.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
  
    
            String path;
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        String v1= fl1.getText();
        String v2= fl2.getText();
        String v3= fl3.getText();
        String v4= fl4.getText();

        try {
            InputStream is = new FileInputStream(new File(path));
            if(v1.isEmpty() || v2.isEmpty() || v3.isEmpty() || v4.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill in all the fields please!!");
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateur", "root", "");
                String req = "insert into book(ISBN, Title, Author, Date, Link) values(?, ?, ?, ?, ?)";
                PreparedStatement p = con.prepareStatement(req);
                p.setString(1, v1);
                p.setString(2, v2);
                p.setString(3, v3);
                p.setString(4, v4);

                byte[] fileBytes = is.readAllBytes();
                p.setBytes(5, fileBytes);

                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your Book is saved.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_okActionPerformed

    private void okMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_okMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        IterAdmin deuxiemeFrame = new IterAdmin();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BrouwsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrouwsActionPerformed
        JFileChooser jf = new  JFileChooser();
        jf.showOpenDialog(null);
        File f = jf.getSelectedFile();
        path = f.getAbsolutePath();
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img= bi.getScaledInstance(230, 180, Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(img);
            lab1.setIcon(ii);
        } catch (IOException ex) {
            Logger.getLogger(ajouterlivre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BrouwsActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        fl1.setText("");
        fl2.setText("");
        fl3.setText("");
        fl4.setText("");

    }//GEN-LAST:event_resetActionPerformed

    private void resetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMousePressed

    }//GEN-LAST:event_resetMousePressed

    private void fl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl4ActionPerformed

    private void fl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl3ActionPerformed

    private void fl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl2ActionPerformed

    private void fl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fl1ActionPerformed

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
            java.util.logging.Logger.getLogger(ajouterlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouterlivre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brouws;
    private javax.swing.JTextField fl1;
    private javax.swing.JTextField fl2;
    private javax.swing.JTextField fl3;
    private javax.swing.JTextField fl4;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lab1;
    private javax.swing.JButton ok;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
