package login;

import AppPackage.AnimationClass;
import java.awt.Color;
import vistas.menus.MenuPrincipal;

public class Login extends javax.swing.JFrame {
    
    
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        userTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 110));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(400, 500));
        bg.setPreferredSize(new java.awt.Dimension(400, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(153, 153, 153));
        userTxt.setText("Username");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 260, 30));

        passTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passTxt.setForeground(new java.awt.Color(102, 102, 102));
        passTxt.setText("****");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N
        bg.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        iconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/candado.png"))); // NOI18N
        bg.add(iconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.setAlignmentY(0.0F);
        login.setBorder(null);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        bg.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Username")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("****");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("****")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Username");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_loginMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        System.out.println("Se presionó el botón login");
        usersLogin log = new usersLogin ();
        System.out.println(userTxt.getText()+passTxt.getText());
        boolean verificar = log.ingresoAdmin(userTxt.getText(), passTxt.getText());
        if(verificar == true)
        {
            setVisible(false);
            MenuPrincipal mp = new MenuPrincipal();
            mp.setVisible(true);
            mp.welcome.setText("Hello "+userTxt.getText());
        }else{
            userTxt.setText("Username");
            passTxt.setText("****");
            
        }
              
       
    }//GEN-LAST:event_loginActionPerformed

    private void userTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseEntered
        AnimationClass menus = new AnimationClass();
        menus.jLabelXLeft(70, 50, 5, 10, iconUser);
    }//GEN-LAST:event_userTxtMouseEntered

    private void userTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseExited
        AnimationClass menus = new AnimationClass();
        menus.jLabelXRight(50, 70, 5, 10, iconUser);
    }//GEN-LAST:event_userTxtMouseExited

    private void passTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMouseEntered
        AnimationClass menus = new AnimationClass();
        menus.jLabelXLeft(70, 50, 5, 10, iconPass);
    }//GEN-LAST:event_passTxtMouseEntered

    private void passTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMouseExited
        AnimationClass menus = new AnimationClass();
        menus.jLabelXLeft(50, 70, 5, 10, iconPass);
    }//GEN-LAST:event_passTxtMouseExited

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
    private javax.swing.JPanel bg;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
