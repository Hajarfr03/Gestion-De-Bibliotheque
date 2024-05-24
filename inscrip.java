
package SignUP;

import java.sql.*;
import javax.swing.JOptionPane;

public class inscrip extends javax.swing.JFrame {

    public inscrip() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel1.setText("             Sign up");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 322, 50));

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 17)); // NOI18N
        jLabel3.setText("Phone :");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 110, 20));

        fl6.setBackground(new java.awt.Color(218, 217, 217));
        fl6.setBorder(null);
        fl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl6ActionPerformed(evt);
            }
        });
        jPanel5.add(fl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 280, 30));

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
        jLabel9.setText("Gender :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 20));

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
        fl4.setText("YYYY/MM/DD");
        fl4.setBorder(null);
        fl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl4ActionPerformed(evt);
            }
        });
        jPanel5.add(fl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 280, 30));

        fl5.setBackground(new java.awt.Color(218, 217, 217));
        fl5.setBorder(null);
        fl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fl5ActionPerformed(evt);
            }
        });
        jPanel5.add(fl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 280, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 280, 10));

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

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 280, 10));

        buttonGroup1.add(radio1);
        radio1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });
        jPanel5.add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        buttonGroup1.add(radio2);
        radio2.setFont(new java.awt.Font("Brush Script MT", 0, 17)); // NOI18N
        jPanel5.add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 60, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 10));

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
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 120, 30));

        jButton2.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Male");
        jLabel10.setToolTipText("");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 50, -1));

        jLabel11.setFont(new java.awt.Font("Brush Script MT", 0, 17)); // NOI18N
        jLabel11.setText("Female");
        jLabel11.setToolTipText("");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 50, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 400, 510));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 40));

        jLabel14.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel14.setText("Read");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 40, -1));

        jLabel15.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel15.setText("Welcome   to   our   library");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 280, 330));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/livre.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 905, -1));

        jLabel12.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel12.setText("Welcome   to   our   library");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 280, 330));

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

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String v1= fl1.getText();
          String v2= fl2.getText();
          String v3= fl3.getText();
          String v4= fl4.getText();
          String v5= fl5.getText();
          String v6= fl6.getText();
          boolean r1= radio1.isSelected();
          boolean r2= radio2.isSelected();
           //convertir boolean to string:
           String v7=String.valueOf(r1);
        String v8=String.valueOf(r2);
        try{
         if(v1.isEmpty()|| v2.isEmpty() || v3.isEmpty()|| v4.isEmpty() || v5.isEmpty()|| v6.isEmpty() ||( v7.equals("false") && v8.equals("false"))){
              JOptionPane.showMessageDialog(null,"Full in the fields please !!");
   
         }
            
         else {
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateur","root","");
           String req="insert into info_utilisateur(lastname,firstname,adresse,birthday,phone,CIN,gender) values(?,?,?,?,?,?,?)";
           PreparedStatement p=con.prepareStatement(req);
            p.setString(1,v1);
            p.setString(2,v2);
            p.setString(3,v3);
            p.setString(4,v4);
            p.setString(6,v5);
            p.setString(5,v6);
                   if(r1){
                    p.setString(7,"FEMALE");
                   }
                   else if(r2){
                     p.setString(7,"MALE");
                   
                   }
                   p.executeUpdate();
                   JOptionPane.showMessageDialog(null,"Your data is save ");
        
        Main frame2 = new Main();
                frame2.setVisible(true);

                // Fermeture de la première frame 
                dispose();
         }}
       catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fl1.setText("");
        fl2.setText("");
        fl3.setText("");
        fl4.setText("");
        fl5.setText("");
        fl6.setText("");
        radio1.setText("");
        radio2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        
        
    }//GEN-LAST:event_jButton1MousePressed

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
            java.util.logging.Logger.getLogger(inscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inscrip().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField fl1;
    private javax.swing.JTextField fl2;
    private javax.swing.JTextField fl3;
    private javax.swing.JTextField fl4;
    private javax.swing.JTextField fl5;
    private javax.swing.JTextField fl6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    // End of variables declaration//GEN-END:variables
}
