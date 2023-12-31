/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.menus;
import AppPackage.AnimationClass;
import login.Login;
import login.usersLogin;
/**
 *
 * @author Jess
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    usersLogin user = new usersLogin();
  
    

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panelmenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BotonConsular = new javax.swing.JButton();
        Botoningresar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        icon_menuprincipal = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        IconTextil = new javax.swing.JLabel();
        LabelBienvenido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        welcome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(163, 110));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(844, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelmenu.setBackground(new java.awt.Color(51, 51, 51));
        Panelmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDNA MODA S.A.");
        Panelmenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 30));
        Panelmenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 220, -1));

        BotonConsular.setBackground(new java.awt.Color(51, 51, 51));
        BotonConsular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonConsular.setForeground(new java.awt.Color(255, 255, 255));
        BotonConsular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa.png"))); // NOI18N
        BotonConsular.setText("Consultar");
        BotonConsular.setBorder(null);
        BotonConsular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonConsular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonConsularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonConsularMouseExited(evt);
            }
        });
        BotonConsular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsularActionPerformed(evt);
            }
        });
        Panelmenu.add(BotonConsular, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 400, 230, 30));

        Botoningresar.setBackground(new java.awt.Color(51, 51, 51));
        Botoningresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Botoningresar.setForeground(new java.awt.Color(255, 255, 255));
        Botoningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ingresar.png"))); // NOI18N
        Botoningresar.setText("Ingresar");
        Botoningresar.setAlignmentY(0.0F);
        Botoningresar.setBorder(null);
        Botoningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botoningresar.setFocusPainted(false);
        Botoningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotoningresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotoningresarMouseExited(evt);
            }
        });
        Botoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoningresarActionPerformed(evt);
            }
        });
        Panelmenu.add(Botoningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 250, 230, 30));

        BotonActualizar.setBackground(new java.awt.Color(51, 51, 51));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actualizar.png"))); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.setBorder(null);
        BotonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseExited(evt);
            }
        });
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        Panelmenu.add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 300, 230, 30));

        BotonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        BotonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setBorder(null);
        BotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseExited(evt);
            }
        });
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        Panelmenu.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 350, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N
        Panelmenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 120));

        icon_menuprincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        icon_menuprincipal.setForeground(new java.awt.Color(255, 255, 255));
        icon_menuprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/casa.png"))); // NOI18N
        icon_menuprincipal.setText("Menú Principal");
        icon_menuprincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon_menuprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_menuprincipalMouseClicked(evt);
            }
        });
        Panelmenu.add(icon_menuprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, -1));

        volver.setBackground(new java.awt.Color(21, 101, 192));
        volver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(null);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        Panelmenu.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 30));

        jPanel1.add(Panelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        IconTextil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/textil.png"))); // NOI18N
        IconTextil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(IconTextil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 260, 260));

        LabelBienvenido.setBackground(new java.awt.Color(255, 153, 153));
        LabelBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelBienvenido.setText("BIENVENIDOS A NUESTRA APP");
        jPanel1.add(LabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/usuario.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        welcome.setEditable(false);
        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome.setBorder(null);
        welcome.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        welcome.setEnabled(false);
        welcome.setFocusable(false);
        welcome.setRequestFocusEnabled(false);
        welcome.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsularActionPerformed
        System.out.println("Se presionó el botón consultar");
        MenuListados list = new MenuListados();
        list.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BotonConsularActionPerformed

    private void BotoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoningresarActionPerformed
        System.out.println("Se presionó el botón ingresar");
        MenuIngreso in = new MenuIngreso();
        in.setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_BotoningresarActionPerformed

    private void BotoningresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoningresarMouseEntered
        Botoningresar.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_BotoningresarMouseEntered

    private void BotoningresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoningresarMouseExited
        Botoningresar.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_BotoningresarMouseExited

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        System.out.println("Se presionó el botón actu");
        MenuActualizar act = new MenuActualizar();
        act.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseEntered
        BotonActualizar.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_BotonActualizarMouseEntered

    private void BotonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseExited
        BotonActualizar.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_BotonActualizarMouseExited

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        System.out.println("Se presionó el botón Eliminar");
        MenuEliminar me = new MenuEliminar();
        me.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseEntered
        BotonEliminar.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_BotonEliminarMouseEntered

    private void BotonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseExited
        BotonEliminar.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_BotonEliminarMouseExited

    private void BotonConsularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConsularMouseEntered
        BotonConsular.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_BotonConsularMouseEntered

    private void BotonConsularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConsularMouseExited
        BotonConsular.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_BotonConsularMouseExited

    private void icon_menuprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_menuprincipalMouseClicked
        AnimationClass menus = new AnimationClass();
        menus.jButtonXRight(-250, 0, 10, 5, Botoningresar );
        menus.jButtonXRight(-250, 0, 10, 5, BotonActualizar );
        menus.jButtonXRight(-250, 0, 10, 5, BotonEliminar );
        menus.jButtonXRight(-250, 0, 10, 5, BotonConsular );
    }//GEN-LAST:event_icon_menuprincipalMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(21, 101, 192));
    }//GEN-LAST:event_volverMouseExited

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        System.out.println("Se presionó el botón volver");
        Login lo = new Login();
        lo.setVisible(true);
        setVisible(false);
        

    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonConsular;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton Botoningresar;
    private javax.swing.JLabel IconTextil;
    private javax.swing.JLabel LabelBienvenido;
    private javax.swing.JPanel Panelmenu;
    private javax.swing.JLabel icon_menuprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton volver;
    public javax.swing.JTextField welcome;
    // End of variables declaration//GEN-END:variables
}