/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUP;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Blacklist extends javax.swing.JFrame {

   
    public Blacklist() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        book = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T3 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        Refrech = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        Add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(103, 113, 121));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 60, 40));

        jLabel2.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel2.setText("Read");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, 40, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/backk.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 60));

        jPanel3.setBackground(new java.awt.Color(103, 113, 121));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(103, 113, 121));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(103, 113, 121));
        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(206, 206, 206));
        jLabel4.setText("Borrowers");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 60));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 140, 120));

        jPanel5.setBackground(new java.awt.Color(103, 113, 121));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book.setFont(new java.awt.Font("Brush Script MT", 1, 27)); // NOI18N
        book.setForeground(new java.awt.Color(206, 206, 206));
        book.setText("   Books");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookMousePressed(evt);
            }
        });
        jPanel5.add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 35));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, 110));

        jPanel6.setBackground(new java.awt.Color(103, 113, 121));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Brush Script MT", 1, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(206, 206, 206));
        jLabel6.setText("   Blacklist");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, 120));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(206, 206, 206));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/khadija.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 430));

        T3.setBackground(new java.awt.Color(204, 204, 204));
        T3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "LastName", "FirstName"
            }
        ));
        jScrollPane2.setViewportView(T3);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 980, 260));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        Refrech.setBackground(new java.awt.Color(204, 204, 204));
        Refrech.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        Refrech.setText("Refrech");
        Refrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrechActionPerformed(evt);
            }
        });
        jPanel1.add(Refrech, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        supprimer.setBackground(new java.awt.Color(204, 204, 204));
        supprimer.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        supprimer.setText("Delete");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        jPanel1.add(supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 380, -1, -1));

        Add.setBackground(new java.awt.Color(204, 204, 204));
        Add.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel4MousePressed

    private void bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMousePressed

    }//GEN-LAST:event_bookMousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        IterAdmin deuxiemeFrame = new IterAdmin();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();

    }//GEN-LAST:event_backActionPerformed
                 private boolean clicked = false;
    private void RefrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrechActionPerformed
        // TODO add your handling code here:
        if (!clicked) {
            DefaultTableModel model = (DefaultTableModel) T3.getModel();

            String driver="com.mysql.jdbc.Driver";
            String strcon= "jdbc:mysql://localhost:3306/utilisateur";
            String req= "select *  from blacklist";

            try{
                Class.forName(driver);
                Connection conn = (Connection)DriverManager.getConnection(strcon,"root","");
                PreparedStatement pre= conn.prepareStatement(req);
                ResultSet res= pre.executeQuery();
                while(res.next()){
                    model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

            // Désactiver le clic sur le label
            Refrech.setEnabled(false);
            clicked = true;
        }
    }//GEN-LAST:event_RefrechActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) T3.getModel();
        String driver="com.mysql.jdbc.Driver";
        String strcon= "jdbc:mysql://localhost:3306/utilisateur";
        String req= "delete from blacklist where id=?";
        int selectedRow = T3.getSelectedRow();

        if (selectedRow != -1) {
            try {
                Class.forName(driver);
                Connection conn = (Connection)DriverManager.getConnection(strcon, "root", "");
                PreparedStatement pre = conn.prepareStatement(req);

                // Passer la valeur de l'ID à supprimer
                String id = (String) model.getValueAt(selectedRow, 0);
                pre.setString(1, id);

                // Exécuter la requête de suppression
                int rowsDeleted = pre.executeUpdate();

                // Supprimer la ligne de la table si la suppression dans la base de données a réussi
                if (rowsDeleted > 0) {
                    model.removeRow(selectedRow);
                }

                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_supprimerActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        ajouterpersonnenoire deuxiemeFrame = new ajouterpersonnenoire();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_AddActionPerformed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        IterAdmin deuxiemeFrame = new IterAdmin();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

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
            java.util.logging.Logger.getLogger(Blacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blacklist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Refrech;
    private javax.swing.JTable T3;
    private javax.swing.JButton back;
    private javax.swing.JLabel book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
