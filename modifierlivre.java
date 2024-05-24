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

public class modifierlivre extends javax.swing.JFrame {

    private String isbn, title, author, date;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        reset = new javax.swing.JButton();
        Brouws = new javax.swing.JButton();
        back = new javax.swing.JButton();
        lab1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel12.setText("Welcome   to   our   library");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 280, 330));

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel1.setText("             Update BOOK");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 370, 50));

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

        text1.setBackground(new java.awt.Color(218, 217, 217));
        text1.setBorder(null);
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        jPanel5.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, 30));

        text2.setBackground(new java.awt.Color(218, 217, 217));
        text2.setBorder(null);
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        jPanel5.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 280, 30));

        text3.setBackground(new java.awt.Color(218, 217, 217));
        text3.setBorder(null);
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        jPanel5.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 280, 30));

        text4.setBackground(new java.awt.Color(218, 217, 217));
        text4.setBorder(null);
        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        jPanel5.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 280, 30));

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
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, 10));

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

        back.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel5.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 110, 30));

        lab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 180));

        update.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateMousePressed(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel5.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 400, 510));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 40));

        jLabel14.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel14.setText("Read");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 40, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/livre.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setisbn(String isbn) {
        this.isbn = isbn;
        text1.setText(isbn); // Mettre à jour le champ de texte ici
    }

    public void setTitle(String title) {
        this.title = title;
        text2.setText(title); // Mettre à jour le champ de texte ici
    }

    public void setAuthor(String author) {
        this.author = author;
        text3.setText(author); // Mettre à jour le champ de texte ici
    }

    public void setDate(String date) {
        this.date = date;
        text4.setText(date); // Mettre à jour le champ de texte ici
    }

    public modifierlivre() {
        initComponents();
    }

       
    
            
    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void resetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMousePressed

    }//GEN-LAST:event_resetMousePressed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");

    }//GEN-LAST:event_resetActionPerformed
       String path;
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        IterAdmin deuxiemeFrame = new IterAdmin();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMousePressed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String v1= text1.getText();
        String v2= text2.getText();
        String v3= text3.getText();
        String v4= text4.getText();

        try {
            InputStream is = new FileInputStream(new File(path));
            if(v1.isEmpty() || v2.isEmpty() || v3.isEmpty() || v4.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill in all the fields please!!");
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateur", "root", "");
                String req = "update book  set Title=?, Author=?, Date=?, Link=? where ISBN=?";
                PreparedStatement p = con.prepareStatement(req);
                p.setString(1, v2);
                p.setString(2, v3);
                p.setString(3, v4);
                p.setString(5, v1);

                p.setBytes(4, is.readAllBytes());
                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your Book is saved.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(modifierlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifierlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifierlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifierlivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifierlivre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brouws;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JButton reset;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
