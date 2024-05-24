
package SignUP;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;

public class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();
        invisi.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        invisi = new javax.swing.JLabel();
        visi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/backk.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jLabel9.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Only for administrator .....");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 350, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-warning (1).gif"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 40));

        jPanel2.setBackground(new java.awt.Color(218, 217, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 142, 104)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-invisible-32.png"))); // NOI18N
        invisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invisiMousePressed(evt);
            }
        });
        jPanel2.add(invisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 30, 30));

        visi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-eye-26.png"))); // NOI18N
        visi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                visiMousePressed(evt);
            }
        });
        jPanel2.add(visi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 30, 30));

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel3.setText("Login in");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        jPanel3.setBackground(new java.awt.Color(204, 142, 104));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/passw.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 260, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-username-32.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 40, 40));

        jPanel4.setBackground(new java.awt.Color(153, 105, 54));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Brush Script MT", 1, 20)); // NOI18N
        jLabel8.setText("              Login In");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 50, 40));

        jLabel7.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel7.setText("Read");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, 20));

        pass.setBackground(new java.awt.Color(218, 217, 217));
        pass.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        pass.setBorder(null);
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 250, 40));

        email.setBackground(new java.awt.Color(218, 217, 217));
        email.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("      Enter your email");
        email.setBorder(null);
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 369));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/img1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed

        //Récupération des données envoyées par le formulaire
        String vlog = email.getText();
        String vpwd = pass.getText();
        //Vérifier si le login/password existent dans la base de données

        if(vlog.equals("omaha@gmail.com")&& vpwd.equals("HAO123")) {//Si OK
            IterAdmin PremierFrame = new IterAdmin();
            PremierFrame.setVisible(true);

            // Fermeture de la première frame si nécessaire
            dispose();
        }
        else {//si not ok
            JOptionPane.showMessageDialog(null,"Your data is not correct");
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void visiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visiMousePressed
        invisi.setVisible(true);
        visi.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_visiMousePressed

    private void invisiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invisiMousePressed
         visi.setVisible(true);
        invisi.setVisible(false);
        pass.setEchoChar('*');
    }//GEN-LAST:event_invisiMousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        Main deuxiemeFrame = new Main();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel invisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel visi;
    // End of variables declaration//GEN-END:variables
}
