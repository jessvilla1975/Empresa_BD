
package vistas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.crudsql;
import java.sql.ResultSet;


/**
 *
 * @author Jess
 */
public class TablaEliminar4 extends javax.swing.JFrame {

    /**
     * Creates new form IngresarColegio
     */
    public TablaEliminar4() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    crudsql crud = new crudsql();
    private boolean boton1 = false;
    private boolean boton2 = false;
  

    private void actualizarTabla(int id) {
    try {
        ResultSet rs = crud.buscarProveedorPorId(id);

        // Crea el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("ID");
        modelo.addColumn("Empresa");
        modelo.addColumn("Nombre Contacto");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");

        while (rs.next()) {
            Object[] fila = new Object[5];
            fila[0] = rs.getInt("nit");
            fila[1] = rs.getString("nombre");
            fila[2] = rs.getString("nom_contacto");
            fila[3] = rs.getString("telefono");
            fila[4] = rs.getString("direccion");
            modelo.addRow(fila);
        }

        // Asigna el modelo a la tabla
        tablapro.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar tabla: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void actualizarTabla2(int id) {
    try {
        ResultSet rs = crud.buscarMateriaPorCodigo(id);

        // Crea el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cant extistente");
        modelo.addColumn("Uni medida");

        while (rs.next()) {
            Object[] fila = new Object[5];
            fila[0] = rs.getInt("codigo");
            fila[1] = rs.getString("tipo");
            fila[2] = rs.getString("descripcion");
            fila[3] = rs.getString("cantidad_exist");
            fila[4] = rs.getString("unidad_medida");
            modelo.addRow(fila);
        }

        // Asigna el modelo a la tabla
        tablamateria.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar tabla: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelColegio = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        Text4 = new javax.swing.JLabel();
        Buscaprove = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        bus1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablamateria = new javax.swing.JTable();
        Text5 = new javax.swing.JLabel();
        Buscamat = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        bus2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(430, 180));
        setUndecorated(true);
        setResizable(false);

        PanelColegio.setBackground(new java.awt.Color(255, 255, 255));
        PanelColegio.setPreferredSize(new java.awt.Dimension(620, 550));

        Eliminar.setBackground(new java.awt.Color(255, 0, 51));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
        });
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Proveedor");

        Buscaprove.setForeground(new java.awt.Color(102, 102, 102));
        Buscaprove.setText("Ingresar nit del proveedor");
        Buscaprove.setBorder(null);
        Buscaprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscaproveMousePressed(evt);
            }
        });
        Buscaprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaproveActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 51, 204));

        bus1.setBackground(new java.awt.Color(18, 90, 173));
        bus1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bus1.setForeground(new java.awt.Color(255, 255, 255));
        bus1.setText("BUSCAR");
        bus1.setBorder(null);
        bus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bus1MouseExited(evt);
            }
        });
        bus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus1ActionPerformed(evt);
            }
        });

        tablamateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Descripcion", "Cant existente", "Uni medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablamateria.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablamateriaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablamateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamateriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablamateria);

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Materia prima");

        Buscamat.setForeground(new java.awt.Color(102, 102, 102));
        Buscamat.setText("Ingresar el codigo de la materia prima");
        Buscamat.setBorder(null);
        Buscamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscamatMousePressed(evt);
            }
        });
        Buscamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscamatActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 51, 204));

        bus2.setBackground(new java.awt.Color(18, 90, 173));
        bus2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bus2.setForeground(new java.awt.Color(255, 255, 255));
        bus2.setText("BUSCAR");
        bus2.setBorder(null);
        bus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bus2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bus2MouseExited(evt);
            }
        });
        bus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus2ActionPerformed(evt);
            }
        });

        tablapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Empresa", "Nombre Contacto", "Telefono", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablapro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaproAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablapro);

        javax.swing.GroupLayout PanelColegioLayout = new javax.swing.GroupLayout(PanelColegio);
        PanelColegio.setLayout(PanelColegioLayout);
        PanelColegioLayout.setHorizontalGroup(
            PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegioLayout.createSequentialGroup()
                        .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text4)
                            .addComponent(Buscaprove, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                                    .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Buscamat, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Text5))
                                    .addGap(375, 375, 375))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelColegioLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bus2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)))
            .addGroup(PanelColegioLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelColegioLayout.setVerticalGroup(
            PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                        .addComponent(Text4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscaprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                        .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                        .addComponent(Text5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bus2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColegio, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_EliminarMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        Eliminar.setBackground(new java.awt.Color(255,0,51));
    }//GEN-LAST:event_EliminarMouseExited

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       System.out.println("Se presionó el botón1 ");
        if(boton1 == true){
        int filaSeleccionada = tablapro.getSelectedRow();
        if (filaSeleccionada != -1) {  
                // Obtener datos de la fila seleccionada
                int nit = Integer.parseInt(tablapro.getValueAt(filaSeleccionada, 0).toString());
                crud.eliminarProveedor(nit);
        }
           
        }else{
            if(boton2 == true){
                System.out.println("se presiono boton2");
                int filaSeleccionada2 = tablamateria.getSelectedRow();
                if (filaSeleccionada2 != -1) {
                    // Obtener datos de la fila seleccionada
                    int codigo = Integer.parseInt(tablamateria.getValueAt(filaSeleccionada2, 0).toString());
                    crud.eliminarMateria(codigo);
                }
            } 
        }
        Buscaprove.setText("Ingresar nit del proveedor");
        Buscamat.setText("Ingresar el codigo de la materia prima");
        
        DefaultTableModel modelo = (DefaultTableModel) tablapro.getModel();
        modelo.setRowCount(0);
        
        DefaultTableModel modelo2 = (DefaultTableModel) tablamateria.getModel();
        modelo2.setRowCount(0);
        
            

    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscaproveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscaproveMousePressed
        if(Buscaprove.getText().equals("Ingresar nit del proveedor"));
           Buscaprove.setText("");
    }//GEN-LAST:event_BuscaproveMousePressed

    private void bus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bus1MouseEntered

    private void bus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bus1MouseExited

    private void bus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus1ActionPerformed
        System.out.println("Se presionó el botón BUSCAR C");
        boton1 = true;
        boton2 = false;
        int xd = Integer.parseInt(Buscaprove.getText());
        actualizarTabla(xd);
        
    }//GEN-LAST:event_bus1ActionPerformed

    private void tablamateriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablamateriaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablamateriaAncestorAdded

    private void tablamateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamateriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablamateriaMouseClicked

    private void BuscaproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaproveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscaproveActionPerformed

    private void BuscamatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscamatMousePressed
        if(Buscamat.getText().equals("Ingresar el codigo de la materia prima"));
           Buscamat.setText("");
    }//GEN-LAST:event_BuscamatMousePressed

    private void BuscamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscamatActionPerformed

    private void bus2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bus2MouseEntered

    private void bus2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bus2MouseExited

    private void bus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus2ActionPerformed
        System.out.println("Se presionó el botón buscar materia");
        boton1 = false;
        boton2 = true;

        int xd = Integer.parseInt(Buscamat.getText());
        actualizarTabla2(xd);
    }//GEN-LAST:event_bus2ActionPerformed

    private void tablaproAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaproAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaproAncestorAdded

    private void tablaproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaproMouseClicked
    

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
            java.util.logging.Logger.getLogger(IngresarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarColegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscamat;
    private javax.swing.JTextField Buscaprove;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel PanelColegio;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JButton bus1;
    private javax.swing.JButton bus2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablamateria;
    private javax.swing.JTable tablapro;
    // End of variables declaration//GEN-END:variables
}
