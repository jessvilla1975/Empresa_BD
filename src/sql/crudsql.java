package sql;

import getset.variables;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Date;

public class crudsql extends conexionsql {

    java.sql.Statement st;
    ResultSet rs;
    variables var = new variables();

    public void insertarCliente(int id, String nombre, String telefono) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into cliente(id, nombre, telefono) values('" + id + "','" + nombre + "','" + telefono + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarPedido(int numPedido, int idCliente, String estado, double abono, String fechaEncargo, String fechaEntrega) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO pedido (Num_pedido, Id_Cliente, Estado, Abono, Fecha_Encargo, Fecha_Entrega) VALUES " +
                 "('" + numPedido + "','" + idCliente + "','" + estado + "','" + abono + "','" + fechaEncargo + "','" + fechaEntrega + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            //JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarColegio(int idColegio, String Nombre) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO colegio(id, nombre) VALUES('" + idColegio + "','" + Nombre + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarUniforme(String Codigo, int Id_Colegio, String Tipo, String Car) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO uniforme(Codigo, Id_Colegio, Tipo, Caracteristicas) VALUES('" + Codigo + "','" + Id_Colegio + "','" + Tipo + "','" + Car + "');";

            st.execute(sql);
            st.close();
            conexion.close();
            //JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarProducto(String Codigo, int Num_pedido, String Descripcion, int Cantidad_Existente, String Sexo, 
            double Precio_venta, String Talla, String Medidas) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO producto_terminado (Codigo, Num_pedido, Descripcion, Cantidad_Existente, Sexo, Precio_venta, Talla, Medidas) VALUES ('"
            + Codigo + "','" + Num_pedido + "','" + Descripcion + "','" + Cantidad_Existente + "','" + Sexo + "','" 
                    + Precio_venta + "','" + Talla + "','" + Medidas + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void insertarInventario(String codigo, int cantidad, String descripcion) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO inventario (Codigo, Cantidad_Existente, Descripcion) VALUES ('"
                    + codigo + "','" + cantidad + "','" + descripcion + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
}
    
    public void insertarProveedor(int nit, String nombre, String nomContacto, String telefono, String direccion) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();
        String sql = "INSERT INTO proveedor(Nit, Nombre, Nom_contacto, Telefono, Direccion) VALUES('" + nit + "','" + nombre + "','" + nomContacto + "','" + telefono + "','" + direccion + "');";
        st.execute(sql);
        st.close();
        conexion.close();
        JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "El registro no se guardó " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void insertarMateria(int codigo, String tipo, String descripcion, int cantidadExistente, String unidadMedida) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();
        
        String sql = "INSERT INTO materia (Codigo, Tipo, Descripcion, Cantidad_Exist, Unidad_Medida) VALUES ('"
            + codigo + "','" + tipo + "','" + descripcion + "','" + cantidadExistente + "','" + unidadMedida + "');";

        st.execute(sql);
        st.close();
        conexion.close();
        JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "El registro no se guardó " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    public void insertarVenta(String codigoFact, int numPedido, int idCliente, double montoFinal) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();
        String sql = "INSERT INTO VENTA (Codigo_Fact, Num_pedido, Id_Cliente, Monto_Final) VALUES " +
                     "('" + codigoFact + "','" + numPedido + "','" + idCliente + "','" + montoFinal + "');";
        st.execute(sql);
        st.close();
        conexion.close();
         JOptionPane.showMessageDialog(null, "La venta se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "La venta no se guardó: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}



    //////////////////  Buscar //////////////
    public ResultSet buscarClientePorId(int id) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM cliente INNER JOIN pedido ON cliente.id = pedido.id_cliente WHERE cliente.id = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar cliente por ID: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    public ResultSet buscarColegioPorId(int id) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM colegio INNER JOIN uniforme ON colegio.id = uniforme.id_colegio WHERE colegio.id = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar colegio por ID: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    public ResultSet buscarVentaPorNumPedido(int numPedido) {
        try {
            Connection conexion = conectar();
            String sql = "SELECT * FROM venta INNER JOIN pedido ON venta.num_pedido = pedido.num_pedido INNER JOIN cliente ON venta.id_cliente = cliente.id WHERE venta.num_pedido = ?";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, numPedido);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar venta por Num_pedido: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    

    
    ///////////////////EDITAR///////////////////////////////////////
    public void editarCliente(int id, String nuevoNombre, String nuevoTelefono) {
    try {
        Connection conexion = conectar();

        // Verificar si el cliente con el ID dado existe antes de editar
        String verificarSql = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setInt(1, id);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un cliente con el ID proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el cliente existe, realizar la actualización
        String editarSql = "UPDATE cliente SET nombre = ?, telefono = ? WHERE id = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setString(1, nuevoNombre);
        ps.setString(2, nuevoTelefono);
        ps.setInt(3, id);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Cliente editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el cliente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar cliente: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void editarPedido(int numPedido, String estado, double abono, Date fechaEncargo, Date fechaEntrega) {
    try {
        Connection conexion = conectar();
        
        // Verificar si el pedido con el Num_pedido dado existe antes de editar
        String verificarSql = "SELECT * FROM pedido WHERE Num_pedido = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setInt(1, numPedido);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un pedido con el Num_pedido proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el pedido existe, realizar la actualización
        String editarSql = "UPDATE pedido SET Estado = ?, Abono = ?, Fecha_Encargo = ?, Fecha_Entrega = ? WHERE Num_pedido = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setString(1, estado);
        ps.setDouble(2, abono);
        ps.setDate(3, new java.sql.Date(fechaEncargo.getTime())); // Convertir a java.sql.Date
        ps.setDate(4, new java.sql.Date(fechaEntrega.getTime())); // Convertir a java.sql.Date
        ps.setInt(5, numPedido);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Pedido editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el pedido", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar pedido: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}

    public void editarColegio(int id, String nuevoNombre) {
    try {
        Connection conexion = conectar();

        // Verificar si el colegio con el ID dado existe antes de editar
        String verificarSql = "SELECT * FROM colegio WHERE id = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setInt(1, id);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un colegio con el ID proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el colegio existe, realizar la actualización
        String editarSql = "UPDATE colegio SET nombre = ? WHERE id = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setString(1, nuevoNombre);
        ps.setInt(2, id);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Colegio editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el colegio", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar colegio: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void editarUniforme(String codigo, int idColegio, String tipo, String caracteristicas) {
    try {
        Connection conexion = conectar();

        // Verificar si el uniforme con el código dado existe antes de editar
        String verificarSql = "SELECT * FROM uniforme WHERE Codigo = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setString(1, codigo);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un uniforme con el código proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el uniforme existe, realizar la actualización
        String editarSql = "UPDATE uniforme SET Id_Colegio = ?, Tipo = ?, Caracteristicas = ? WHERE Codigo = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setInt(1, idColegio);
        ps.setString(2, tipo);
        ps.setString(3, caracteristicas);
        ps.setString(4, codigo);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Uniforme editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el uniforme", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar uniforme: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}


    
    




    
    

    /*public void mostrar(String idempleado) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from empleados where idempleado='" + idempleado + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var.setIdempleado(rs.getString("idempleado"));
                var.setNombre(rs.getString("nombre"));
                var.setApellido(rs.getString("apellido"));
                var.setPuesto(rs.getString("puesto"));
            } else {
                var.setIdempleado("");
                var.setNombre("");
                var.setApellido("");
                var.setPuesto("");
                JOptionPane.showMessageDialog(null, "no se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en programa " + e, "Erro de sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar(String nombre, String apellido, String puesto, String idempleado) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update empleados set nombre='" + nombre + "',apellido='" + apellido + "',puesto='" + puesto + "' where idempleado='" + idempleado + "'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminar(String idempleado){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql="delete from empleados where idempleado='"+idempleado+"'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }*/
    
}
