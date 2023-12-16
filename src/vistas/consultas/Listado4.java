/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.consultas;
import vistas.ingresar.IngresarColegio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.crudsql;
import java.sql.ResultSet;
/**
 *
 * @author Jess
 */
public class Listado4 extends javax.swing.JFrame {

    /**
     * Creates new form Listado4
     */
    public Listado4() {
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

    private void actualizarTabla(String cod) {
    try {
        ResultSet rs = crud.buscarcolegioCarateristicas(cod);

        // Crea el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("Nombre Colegio");
        modelo.addColumn("Tipo");
        modelo.addColumn("Color");
        modelo.addColumn("Tela");
        modelo.addColumn("Escudo");

        while (rs.next()) {
            Object[] fila = new Object[5];
            fila[0] = rs.getString("Nombre");
            fila[1] = rs.getString("Tipo");
            // Separar las características usando split
            String[] caracteristicas = rs.getString("Caracteristicas").split("-");

            if (caracteristicas.length >= 3) {
                fila[2] = caracteristicas[0]; // Primera característica
                fila[3] = caracteristicas[1]; // Segunda característica
                fila[4] = caracteristicas[2]; // Tercera característica
            } else {
                
                fila[2] = "";
                fila[3] = "";
                fila[4] = "";
            }

        
            modelo.addRow(fila);
        }

        // Asigna el modelo a la tabla
        tablaColegio.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar tabla: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}

    
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelColegio = new javax.swing.JPanel();
        Buscar_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bus1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaColegio = new javax.swing.JTable();
        Text4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(430, 140));
        setUndecorated(true);
        setResizable(false);

        PanelColegio.setBackground(new java.awt.Color(255, 255, 255));
        PanelColegio.setPreferredSize(new java.awt.Dimension(620, 550));

        Buscar_id.setForeground(new java.awt.Color(102, 102, 102));
        Buscar_id.setText("Ingresar el nombre del colegio a consultar");
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

        tablaColegio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Colegio", "Tipo", "Color", "Tela", "Escudo"
            }
        ));
        tablaColegio.setToolTipText("");
        tablaColegio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaColegioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablaColegio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaColegioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaColegio);

        Text4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Text4.setText("LISTADO");

        javax.swing.GroupLayout PanelColegioLayout = new javax.swing.GroupLayout(PanelColegio);
        PanelColegio.setLayout(PanelColegioLayout);
        PanelColegioLayout.setHorizontalGroup(
            PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        PanelColegioLayout.setVerticalGroup(
            PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                .addGroup(PanelColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColegioLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Text4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColegioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
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

    private void Buscar_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar_idMousePressed
        if(Buscar_id.getText().equals("Ingresar el nombre del colegio a consultar"))
        Buscar_id.setText("");
    }//GEN-LAST:event_Buscar_idMousePressed

    private void bus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bus1MouseEntered

    private void bus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bus1MouseExited

    private void bus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus1ActionPerformed
        
        actualizarTabla(Buscar_id.getText());
         
         
    }//GEN-LAST:event_bus1ActionPerformed

    private void Buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_idActionPerformed

    private void tablaColegioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaColegioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaColegioAncestorAdded

    private void tablaColegioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaColegioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaColegioMouseClicked
    

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
    private javax.swing.JTextField Buscar_id;
    private javax.swing.JPanel PanelColegio;
    private javax.swing.JLabel Text4;
    private javax.swing.JButton bus1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaColegio;
    // End of variables declaration//GEN-END:variables
}
