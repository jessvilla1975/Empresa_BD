/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;


/**
 *
 * @author Jess
 */
public class MenuEliminar extends javax.swing.JFrame {

    /**
     * Creates new form IngresarDatos
     */
    public MenuEliminar() {
        initComponents();
    }
    TablaEliminar at = new TablaEliminar();
    TablaEliminar2 at1 = new TablaEliminar2();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelColegio1 = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        idColegio2 = new javax.swing.JTextField();
        nombreColegio1 = new javax.swing.JTextField();
        Text7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        Title3 = new javax.swing.JLabel();
        Text8 = new javax.swing.JLabel();
        idColegio3 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Panelmenu = new javax.swing.JPanel();
        titu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        volver = new javax.swing.JButton();
        tabla1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Actprovedor = new javax.swing.JButton();

        PanelColegio1.setBackground(new java.awt.Color(255, 255, 255));

        Title2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title2.setText("Datos Colegio");
        Title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Id Colegio");

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));

        idColegio2.setForeground(new java.awt.Color(102, 102, 102));
        idColegio2.setText("Ingresar id del colegio");
        idColegio2.setBorder(null);
        idColegio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idColegio2MousePressed(evt);
            }
        });

        nombreColegio1.setForeground(new java.awt.Color(102, 102, 102));
        nombreColegio1.setText("Ingresar nombre del colegio");
        nombreColegio1.setBorder(null);
        nombreColegio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreColegio1MousePressed(evt);
            }
        });
        nombreColegio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreColegio1ActionPerformed(evt);
            }
        });

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Nombre del Colegio");

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Datos Uniforme");
        Title3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Id Colegio");

        idColegio3.setForeground(new java.awt.Color(102, 102, 102));
        idColegio3.setText("Ingresar id del colegio");
        idColegio3.setBorder(null);
        idColegio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idColegio3MousePressed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout PanelColegio1Layout = new javax.swing.GroupLayout(PanelColegio1);
        PanelColegio1.setLayout(PanelColegio1Layout);
        PanelColegio1Layout.setHorizontalGroup(
            PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColegio1Layout.createSequentialGroup()
                .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegio1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Text7)
                                .addComponent(nombreColegio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Text6)
                                .addComponent(idColegio2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegio1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title2)
                        .addGap(80, 80, 80)))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegio1Layout.createSequentialGroup()
                        .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelColegio1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Title3))
                            .addGroup(PanelColegio1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text8)
                                    .addComponent(idColegio3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelColegio1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelColegio1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addGap(308, 308, 308)))
        );
        PanelColegio1Layout.setVerticalGroup(
            PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColegio1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegio1Layout.createSequentialGroup()
                        .addComponent(Title3)
                        .addGap(18, 18, 18)
                        .addComponent(Text8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idColegio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelColegio1Layout.createSequentialGroup()
                        .addComponent(Title2)
                        .addGap(18, 18, 18)
                        .addComponent(Text6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idColegio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Text7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreColegio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(PanelColegio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelColegio1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(163, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(844, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelmenu.setBackground(new java.awt.Color(0, 51, 255));
        Panelmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titu.setForeground(new java.awt.Color(255, 255, 255));
        titu.setText("         Eliminar ");
        Panelmenu.add(titu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 46));
        Panelmenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 10));

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
        Panelmenu.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 30));

        tabla1.setBackground(new java.awt.Color(21, 101, 192));
        tabla1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabla1.setForeground(new java.awt.Color(255, 255, 255));
        tabla1.setText("Cliente - Pedido");
        tabla1.setAlignmentY(0.0F);
        tabla1.setBorder(null);
        tabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabla1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabla1MouseExited(evt);
            }
        });
        tabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabla1ActionPerformed(evt);
            }
        });
        Panelmenu.add(tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        Panelmenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, 140));

        Actprovedor.setBackground(new java.awt.Color(21, 101, 192));
        Actprovedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Actprovedor.setForeground(new java.awt.Color(255, 255, 255));
        Actprovedor.setText("Colegio - Uniforme");
        Actprovedor.setBorder(null);
        Actprovedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actprovedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActprovedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActprovedorMouseExited(evt);
            }
        });
        Actprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActprovedorActionPerformed(evt);
            }
        });
        Panelmenu.add(Actprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 30));

        jPanel1.add(Panelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(21, 101, 192));
    }//GEN-LAST:event_volverMouseExited

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        System.out.println("Se presionó el botón venta");
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        setVisible(false);
        at.setVisible(false);
        at1.setVisible(false);
        
        
        
    }//GEN-LAST:event_volverActionPerformed

    private void tabla1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseEntered
        tabla1.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_tabla1MouseEntered

    private void tabla1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseExited
        tabla1.setBackground(new java.awt.Color(21, 101, 192));
    }//GEN-LAST:event_tabla1MouseExited

    private void tabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabla1ActionPerformed
        System.out.println("Se presionó el botón eliminar Colegio - Uniforme - Venta");
        //at1.setVisible(false);
        at.setVisible(true);
        
    }//GEN-LAST:event_tabla1ActionPerformed

    private void idColegio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idColegio2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idColegio2MousePressed

    private void nombreColegio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreColegio1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreColegio1MousePressed

    private void nombreColegio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreColegio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreColegio1ActionPerformed

    private void idColegio3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idColegio3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idColegio3MousePressed

    private void ActprovedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActprovedorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ActprovedorMouseEntered

    private void ActprovedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActprovedorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ActprovedorMouseExited

    private void ActprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActprovedorActionPerformed
        System.out.println("Se presionó el botón eliminar Producto - Proveedor - Materia");

        at.setVisible(false);
        at1.setVisible(true);
    }//GEN-LAST:event_ActprovedorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actprovedor;
    private javax.swing.JPanel PanelColegio1;
    private javax.swing.JPanel Panelmenu;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JTextField idColegio2;
    private javax.swing.JTextField idColegio3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombreColegio1;
    private javax.swing.JButton tabla1;
    private javax.swing.JLabel titu;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
