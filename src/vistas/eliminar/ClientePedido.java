/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.eliminar;
import vistas.ingresar.IngresarColegio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.crudsql;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import vistas.tablasVistas.tablas;

/**
 *
 * @author Jess
 */
public class ClientePedido extends javax.swing.JFrame {

    /**
     * Creates new form IngresarColegio
     */
    public ClientePedido() {
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
    private boolean buscarventa = false;

    private void actualizarTabla(int id) {
    try {
        ResultSet rs = crud.buscarClientePorId(id); 

        // Crea el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tel");
        while (rs.next()) {
            Object[] fila = new Object[3];
            fila[0] = rs.getInt("id");
            fila[1] = rs.getString("nombre");
            fila[2] = rs.getString("telefono");
            modelo.addRow(fila);
        }
        // Asigna el modelo a la tabla
        tablacliente.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar tabla: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    private void actualizarTabla2(int num) {
    try {
        ResultSet rs = crud.buscarPedidoPorNumero(num);

        // Crea el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("Num pedido");
        modelo.addColumn("Estado");
        modelo.addColumn("Abono");
        modelo.addColumn("Fecha_Encargo");
        modelo.addColumn("Fecha_Entrega");
    
        while (rs.next()) {
            java.sql.Date fechaEncargo = rs.getDate("Fecha_Encargo");
            String fechaEncargoStr = (fechaEncargo != null) ? fechaEncargo.toString() : ""; 
            java.sql.Date fechaEntrega = rs.getDate("Fecha_Entrega");
            String fechaEntregaStr = (fechaEntrega != null) ? fechaEntrega.toString() : ""; 
            
            Object[] fila = new Object[5];
            fila[0] = rs.getString("Num_pedido");
            fila[1] = rs.getString("estado");
            fila[2] = rs.getString("abono");
            fila[3] = fechaEncargoStr;
            fila[4] = fechaEntregaStr;
            modelo.addRow(fila);
        }

        // Asigna el modelo a la tabla
        tablapedido.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar tabla: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelColegio = new javax.swing.JPanel();
        Text3 = new javax.swing.JLabel();
        Buscar_id = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bus1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        Text4 = new javax.swing.JLabel();
        BuscarPedido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        bus2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablapedido = new javax.swing.JTable();
        ta = new javax.swing.JLabel();
        ta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(430, 140));
        setUndecorated(true);
        setResizable(false);

        PanelColegio.setBackground(new java.awt.Color(255, 255, 255));
        PanelColegio.setPreferredSize(new java.awt.Dimension(620, 550));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Datos Cliente ");

        Buscar_id.setForeground(new java.awt.Color(102, 102, 102));
        Buscar_id.setText("Ingresar id del cliente");
        Buscar_id.setBorder(null);
        Buscar_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Buscar_idMousePressed(evt);
            }
        });
        Buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_idActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 0, 51));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("ELIMINAR");
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

        jSeparator1.setForeground(new java.awt.Color(0, 51, 204));

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

        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablacliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaclienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablacliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacliente);

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Datos Pedido");

        BuscarPedido.setForeground(new java.awt.Color(102, 102, 102));
        BuscarPedido.setText("Ingresar numero del pedido");
        BuscarPedido.setBorder(null);
        BuscarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarPedidoMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 51, 204));

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

        tablapedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Num Pedido", "Estado", "Abono", "Fecha 1", "Fecha 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablapedido.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablapedidoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablapedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapedidoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablapedido);

        ta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tabla.png"))); // NOI18N
        ta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ta.setFocusable(false);
        ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taMouseClicked(evt);
            }
        });

        ta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tabla.png"))); // NOI18N
        ta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ta1.setFocusable(false);
        ta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelColegioLayout = new javax.swing.GroupLayout(PanelColegio);
        PanelColegio.setLayout(PanelColegioLayout);
        PanelColegioLayout.setHorizontalGroup(
            PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegioLayout.createSequentialGroup()
                        .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelColegioLayout.createSequentialGroup()
                        .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bus2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ta1)
                        .addGap(75, 75, 75))))
            .addGroup(PanelColegioLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelColegioLayout.setVerticalGroup(
            PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Text3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelColegioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelColegioLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Text4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(bus2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColegio, javax.swing.GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE)
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
        int filaSeleccionada = tablacliente.getSelectedRow();
        if (filaSeleccionada != -1) {  
                // Obtener datos de la fila seleccionada
                int id = Integer.parseInt(tablacliente.getValueAt(filaSeleccionada, 0).toString());
                crud.eliminarCliente(id); 
        }
           
        }else{
            if(boton2 == true){
                System.out.println("se presiono boton2");
                int filaSeleccionada2 = tablapedido.getSelectedRow();
                if (filaSeleccionada2 != -1) {
                    // Obtener datos de la fila seleccionada
                    int num = Integer.parseInt(tablapedido.getValueAt(filaSeleccionada2, 0).toString());
                    crud.eliminarPedido(num);
                }
            } 
        }
        Buscar_id.setText("Ingresar id del cliente");
        BuscarPedido.setText("Ingresar numero del pedido");
        
        DefaultTableModel modelo = (DefaultTableModel) tablacliente.getModel();
        modelo.setRowCount(0);
        
        DefaultTableModel modelo2 = (DefaultTableModel) tablapedido.getModel();
        modelo2.setRowCount(0);

        //setVisible(false);

    }//GEN-LAST:event_EliminarActionPerformed

    private void Buscar_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar_idMousePressed
        if(Buscar_id.getText().equals("Ingresar id del cliente"))
        Buscar_id.setText("");
    }//GEN-LAST:event_Buscar_idMousePressed

    private void bus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bus1MouseEntered

    private void bus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bus1MouseExited

    private void bus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus1ActionPerformed
        boton1 = true;
        boton2 = false;
        buscarventa = false;
        int idABuscar = Integer.parseInt(Buscar_id.getText());
         actualizarTabla(idABuscar);
         
         
    }//GEN-LAST:event_bus1ActionPerformed

    private void tablaclienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaclienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaclienteAncestorAdded

    private void tablaclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaclienteMouseClicked

    private void BuscarPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarPedidoMousePressed
        if(BuscarPedido.getText().equals("Ingresar numero del pedido"))
        BuscarPedido.setText("");
    }//GEN-LAST:event_BuscarPedidoMousePressed

    private void bus2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bus2MouseEntered

    private void bus2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bus2MouseExited

    private void bus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus2ActionPerformed
        System.out.println("Se presionó el botón buscar pedido");
        boton2 = true;
        boton1 = false;
        buscarventa = false;
        int num = Integer.parseInt(BuscarPedido.getText());
        actualizarTabla2(num);
        
    }//GEN-LAST:event_bus2ActionPerformed

    private void Buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_idActionPerformed

    private void tablapedidoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablapedidoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablapedidoAncestorAdded

    private void tablapedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapedidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablapedidoMouseClicked

    private void taMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taMouseClicked
        System.out.println("generar tabla");
        tablas ventana = new tablas();
        ResultSet resultados = crud.buscar("Cliente");
        String[] nombresColumnas = {
                "ID",
                "Nombre",
                "Telefono"
            };
        // Llamar al método actualizarTabla con los resultados y nombres de columnas
        ventana.actualizarTabla(resultados, nombresColumnas);
        ventana.setVisible(true);
    }//GEN-LAST:event_taMouseClicked

    private void ta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta1MouseClicked
        System.out.println("generar tabla");
        tablas ventana = new tablas();
        ResultSet resultados = crud.buscar("Pedido");
        String[] nombresColumnas = {
            "Num_pedido",
            "Id_Cliente",
            "Estado",
            "Abono",
            "Fecha_Encargo",
            "Fecha_Entrega",
            "articulo"
        };
        // Llamar al método actualizarTabla con los resultados y nombres de columnas
        ventana.actualizarTabla(resultados, nombresColumnas);
        ventana.setVisible(true);
    }//GEN-LAST:event_ta1MouseClicked
    

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
    private javax.swing.JTextField BuscarPedido;
    private javax.swing.JTextField Buscar_id;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel PanelColegio;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JButton bus1;
    private javax.swing.JButton bus2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel ta;
    public javax.swing.JLabel ta1;
    private javax.swing.JTable tablacliente;
    private javax.swing.JTable tablapedido;
    // End of variables declaration//GEN-END:variables
}
