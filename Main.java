/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUP;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



public class Main extends javax.swing.JFrame {
   

   
    public Main() {
        initComponents();
        
       this.ins1.setVisible(false);
       this.mail.setVisible(false);
       this.signup.setVisible(false);
       this.line1.setVisible(false);
       this.invisi1.setVisible(true);
       this.jLabel8.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ins1 = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        line1 = new javax.swing.JPanel();
        mail = new javax.swing.JLabel();
        inscrip = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        field2 = new javax.swing.JPasswordField();
        butLOG = new javax.swing.JPanel();
        ins2 = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        pass = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jsp2 = new javax.swing.JSeparator();
        jsp1 = new javax.swing.JSeparator();
        field1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsp3 = new javax.swing.JSeparator();
        Signin = new javax.swing.JLabel();
        forget = new javax.swing.JLabel();
        invisi1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ins1.setBackground(new java.awt.Color(153, 105, 54));
        ins1.setFont(new java.awt.Font("Brush Script MT", 1, 20)); // NOI18N
        ins1.setForeground(new java.awt.Color(255, 255, 255));
        ins1.setText("             Sign Up");
        ins1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ins1MousePressed(evt);
            }
        });
        getContentPane().add(ins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 220, 50));

        signup.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        signup.setText("Sign Up ");
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 170, -1));

        line1.setBackground(new java.awt.Color(204, 142, 104));

        javax.swing.GroupLayout line1Layout = new javax.swing.GroupLayout(line1);
        line1.setLayout(line1Layout);
        line1Layout.setHorizontalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        line1Layout.setVerticalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/mail.png"))); // NOI18N
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 40, 30));

        inscrip.setBackground(new java.awt.Color(218, 217, 217));
        inscrip.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 142, 104), 1, true));
        inscrip.setEnabled(false);
        inscrip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(218, 217, 217));
        jTextField1.setBorder(null);
        inscrip.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 250, 0));

        field2.setBackground(new java.awt.Color(218, 217, 217));
        field2.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        field2.setBorder(null);
        inscrip.add(field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 220, 30));

        butLOG.setBackground(new java.awt.Color(153, 105, 54));
        butLOG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 142, 104)));
        butLOG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ins2.setBackground(new java.awt.Color(153, 105, 54));
        ins2.setFont(new java.awt.Font("Brush Script MT", 1, 20)); // NOI18N
        ins2.setForeground(new java.awt.Color(255, 255, 255));
        ins2.setText("              Login In");
        ins2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ins2MousePressed(evt);
            }
        });
        butLOG.add(ins2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        inscrip.add(butLOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, 50));

        line.setBackground(new java.awt.Color(204, 142, 104));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        inscrip.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 10));

        pass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(188, 139, 71));
        pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/passw.png"))); // NOI18N
        inscrip.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 40, 30));

        jPanel4.setBackground(new java.awt.Color(193, 135, 17));

        jsp2.setBackground(new java.awt.Color(255, 255, 255));
        jsp2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        inscrip.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 230, 0));

        jsp1.setBackground(new java.awt.Color(255, 255, 255));
        jsp1.setForeground(new java.awt.Color(255, 255, 255));
        inscrip.add(jsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 20));

        field1.setBackground(new java.awt.Color(218, 217, 217));
        field1.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        field1.setForeground(new java.awt.Color(102, 102, 102));
        field1.setText("Enter your email here");
        field1.setBorder(null);
        field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field1ActionPerformed(evt);
            }
        });
        inscrip.add(field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        inscrip.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 50, 40));

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-username-32.png"))); // NOI18N
        inscrip.add(icone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 30, 30));

        jLabel5.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel5.setText("Read");
        inscrip.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 50, 20));

        jsp3.setBackground(new java.awt.Color(255, 255, 255));
        jsp3.setForeground(new java.awt.Color(255, 255, 255));
        inscrip.add(jsp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, 20));

        Signin.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        Signin.setText("Sign in ");
        inscrip.add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        forget.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        forget.setText("Forgot password?");
        forget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgetMousePressed(evt);
            }
        });
        inscrip.add(forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 180, -1));

        invisi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-invisible-32.png"))); // NOI18N
        invisi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invisi1MousePressed(evt);
            }
        });
        inscrip.add(invisi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 40, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-eye-26.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        inscrip.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 30));

        getContentPane().add(inscrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 330, 380));

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-admin-settings-male.gif"))); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminMousePressed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 40));

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("       Sign up");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 110, 40));

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 20)); // NOI18N
        jLabel4.setText("        Sign In");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 40));

        jPanel2.setBackground(new java.awt.Color(218, 217, 217));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Brush Script MT", 1, 24)); // NOI18N
        jLabel2.setText("     Sign Up");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 140, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/img1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        

    }//GEN-LAST:event_jLabel3MousePressed

       
    
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        field2.setText("");
           int p = this.inscrip.getX();
        if(p>-1){
            Animacion.Animacion.mover_izquierda(510, 117, 1, 3, inscrip);
           
        }
        //button1 desactiver
    

        this.jsp2.setVisible(true);
        this.Signin.setVisible(true);
        this.line.setVisible(true);
        this.icone.setVisible(true);
        this.ins2.setVisible(true);
        this.forget.setVisible(true);
        this.jLabel8.setVisible(true);

        this.ins1.setVisible(false);
        this.mail.setVisible(false);
        this.signup.setVisible(false);
        this.line1.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        field2.setText("");
        int p = this.inscrip.getX();
        if(p>-1){
             Animacion.Animacion.mover_derecha(117, 510, 1, 3, inscrip);
            
        }
        //button1 desactive


        this.jsp2.setVisible(false);
        this.Signin.setVisible(false);
        this.line.setVisible(false);
        this.icone.setVisible(false);
        this.ins2.setVisible(false);
        this.forget.setVisible(false);
        this.invisi1.setVisible(false);
        this.jLabel8.setVisible(false);

        this.ins1.setVisible(true);
        this.mail.setVisible(true);
        this.signup.setVisible(true);
        this.line1.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MousePressed
    private void ins1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ins1MousePressed
        String v1= field1.getText();
        String v2= field2.getText();
          inscrip deuxiemeFrame = new inscrip();
                deuxiemeFrame.setVisible(true);

                // Fermeture de la première frame
                dispose();
                   
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateur","root","");
            String req="insert into login_utilisateur(email,password) values(?,?)";
           PreparedStatement p=con.prepareStatement(req);
            p.setString(1,v1);
            p.setString(2,v2);
                   p.executeUpdate();
                   JOptionPane.showMessageDialog(null,"Your data is save ");          
       }
       catch(Exception e){
            e.printStackTrace();
       } 
            
    }//GEN-LAST:event_ins1MousePressed

    private void field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field1ActionPerformed

    }//GEN-LAST:event_field1ActionPerformed

    private void forgetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetMousePressed
        password troixiemeFrame = new password();
                troixiemeFrame.setVisible(true);

                // Fermeture de la première frame
                dispose();
    }//GEN-LAST:event_forgetMousePressed

    private void adminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMousePressed
             admin adminst = new admin();
                adminst.setVisible(true);

                // Fermeture de la première frame
                dispose();
    }//GEN-LAST:event_adminMousePressed

    private void ins2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ins2MousePressed
        String vlog = field1.getText();
    String vpwd = field2.getText();
    
    //Vérifier si le login/password existent dans la base de données
    String driver = "com.mysql.jdbc.Driver";
    String strcon = "jdbc:mysql://localhost:3306/utilisateur";

    try {
        Class.forName(driver);
        Connection con=DriverManager.getConnection(strcon,"root","");
        String req = "select * from login_utilisateur where Email=? and password=?";
        PreparedStatement st = con.prepareStatement(req);
        st.setString(1, vlog);
        st.setString(2, vpwd);
        ResultSet res = st.executeQuery();
        
        if(res.next()) {
    // Création de la session et stockage des valeurs
    SessionManager sessionManager = SessionManager.getInstance();
    sessionManager.setAttribute("username", vlog);
    int ID=res.getInt("ID");
    sessionManager.setAttribute("ID", res.getInt("ID")); // Exemple de stockage de l'ID utilisateur     
    String req2 = "select * from info_utilisateur where ID=?";
    PreparedStatement st2 = con.prepareStatement(req2); // Utilisez un nouveau PreparedStatement
    st2.setInt(1, ID);
    ResultSet ress = st2.executeQuery(); // Utilisez le nouveau PreparedStatement
    if(ress.next()){
        String nom=ress.getString("lastname");
        String prenom=ress.getString("firstname");
        sessionManager.setAttribute("nom", nom);
        sessionManager.setAttribute("prenom", prenom);
    }
    // Redirection vers la page suivante
    espaceutilisateur acce = new espaceutilisateur();
    acce.setVisible(true);
            // Fermeture de la première frame
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Email or password not matched");
        }
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_ins2MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        invisi1.setVisible(false);
        jLabel8.setVisible(true);
        field2.setEchoChar((char)0);
        
    }//GEN-LAST:event_jLabel8MousePressed

    private void invisi1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invisi1MousePressed
        // TODO add your handling code here:
        jLabel8.setVisible(false);
        invisi1.setVisible(true);
        field2.setEchoChar('*');
        
    }//GEN-LAST:event_invisi1MousePressed

   
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signin;
    private javax.swing.JLabel admin;
    private javax.swing.JPanel butLOG;
    private javax.swing.JTextField field1;
    private javax.swing.JPasswordField field2;
    private javax.swing.JLabel forget;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel ins1;
    private javax.swing.JLabel ins2;
    private javax.swing.JPanel inscrip;
    private javax.swing.JLabel invisi1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSeparator jsp1;
    private javax.swing.JSeparator jsp2;
    private javax.swing.JSeparator jsp3;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line1;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel signup;
    // End of variables declaration//GEN-END:variables

}
