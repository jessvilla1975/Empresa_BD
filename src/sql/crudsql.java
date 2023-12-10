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
            JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarPedido(int numPedido, int idCliente, String estado, double abono, String fechaEncargo, String fechaEntrega, String articulo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO pedido (Num_pedido, Id_Cliente, Estado, Abono, Fecha_Encargo, Fecha_Entrega, articulo) VALUES " +
                 "('" + numPedido + "','" + idCliente + "','" + estado + "','" + abono + "','" + fechaEncargo + "','" + fechaEntrega + "','" + articulo + "');";

            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se guardo pedido correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Se guardo datos producto correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Se guardo datos inventario correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
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
    
    public void insertarDescuenta(String codigoFact, int numPedido) {
    try {
        Connection conexion = conectar();
        String sql = "INSERT INTO DESCUENTA (Codigo_Fact, CODIGO) " +
                     "SELECT '" + codigoFact + "', PT.Codigo " +
                     "FROM VENTA V " +
                     "JOIN PRODUCTO_TERMINADO PT ON V.Num_pedido = PT.Num_pedido " +
                     "WHERE V.Num_pedido = " + numPedido + ";";

        st = conexion.createStatement();
        st.execute(sql);
        st.close();
        conexion.close();
        
        //JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "El registro no se guardó: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void insertarSuministra(int nitProveedor, int codigoMateria) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();
        String sql = "INSERT INTO SUMINISTRA (Nit_Proveedor, Codigo_Materia) VALUES ('" + nitProveedor + "','" + codigoMateria + "');";
        st.execute(sql);
        st.close();
        conexion.close();
        //JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "El registro no se guardó " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
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
    
public ResultSet buscarPedidoPorNumero(int numPedido) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM pedido WHERE Num_pedido = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, numPedido);
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar pedido por Num_pedido: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
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
    public ResultSet buscarUniformePorCodigo(String codigo) {
        try {
            Connection conexion = conectar();
            String sql = "SELECT * FROM uniforme WHERE Codigo = ?";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, codigo);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar uniforme por código: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public ResultSet buscarVentaPorNumPedido(int numPedido) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM PEDIDO " +
                     "INNER JOIN PRODUCTO_TERMINADO ON PRODUCTO_TERMINADO.Num_pedido = PEDIDO.Num_pedido " +
                     "WHERE PEDIDO.Num_pedido = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, numPedido);
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar venta por Num_pedido: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}


    
    public ResultSet buscarCodigoFact(String cod) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM VENTA WHERE Codigo_Fact = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, cod);  
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar Codigo_Fact: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    
    public ResultSet buscarProductoTerminadoEnInventario(String codigoProducto) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM producto_terminado INNER JOIN inventario ON producto_terminado.Codigo = inventario.Codigo WHERE producto_terminado.Codigo = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, codigoProducto);
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar producto terminado en inventario: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    public ResultSet buscarProveedorPorId(int idProveedor) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM proveedor WHERE nit = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idProveedor);
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar proveedor por ID: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    public ResultSet buscarMateriaPorCodigo(int codigo) {
    try {
        Connection conexion = conectar();
        String sql = "SELECT * FROM materia WHERE codigo = ?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, codigo);

        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar materia por código: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    
    public void insertarUtiliza(String codProd, int codMateria) {
        try {
            Connection conexion = conectar();
            String sql = "INSERT INTO UTILIZA (Cod_prod, Cod_Materia) VALUES (?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, codProd);
            preparedStatement.setInt(2, codMateria);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            conexion.close();

            //JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    ///////////////////EDITAR///////////////////////////////////////
    public void editarMateriaPrima(int codigo, String tipo, String descripcion, int cantidadExistente, String unidadMedida) {
    try {
        Connection conexion = conectar();
        String sql = "UPDATE materia SET tipo=?, descripcion=?, cantidad_exist=?, unidad_medida=? WHERE codigo=?";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, tipo);
        ps.setString(2, descripcion);
        ps.setInt(3, cantidadExistente);
        ps.setString(4, unidadMedida);
        ps.setInt(5, codigo);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Materia prima editada correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar la materia prima", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar materia prima: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}

    public void editarProveedor(int idProveedor, String nuevoNombre, String nuevoContacto, String nuevoTelefono, String nuevaDireccion) {
    try {
        Connection conexion = conectar();

        // Verificar si el proveedor con el ID dado existe antes de editar
        String verificarSql = "SELECT * FROM proveedor WHERE nit = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setInt(1, idProveedor);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un proveedor con el ID proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el proveedor existe, realizar la actualización
        String editarSql = "UPDATE proveedor SET nombre = ?, nom_contacto = ?, telefono = ?, direccion = ? WHERE nit = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setString(1, nuevoNombre);
        ps.setString(2, nuevoContacto);
        ps.setString(3, nuevoTelefono);
        ps.setString(4, nuevaDireccion);
        ps.setInt(5, idProveedor);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Proveedor editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el proveedor", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar proveedor: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}

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
    public void editarVenta(String codigoFact, int numPedido, int idCliente, double montoFinal) {
    try {
        Connection conexion = conectar();

        // Verificar si la venta con el código dado existe antes de editar
        String verificarSql = "SELECT * FROM VENTA WHERE Codigo_Fact = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setString(1, codigoFact);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró una venta con el código proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si la venta existe, realizar la actualización
        String editarSql = "UPDATE VENTA SET Num_pedido = ?, Id_Cliente = ?, Monto_Final = ? WHERE Codigo_Fact = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setInt(1, numPedido);
        ps.setInt(2, idCliente);
        ps.setDouble(3, montoFinal);
        ps.setString(4, codigoFact);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Venta editada correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar la venta", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar venta: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    public void editarProductoTerminado(String codigo, int nuevoNumPedido, String nuevaDescripcion, int nuevaCantidadExistente,
        String nuevoSexo, double nuevoPrecioVenta, String nuevaTalla, String nuevasMedidas) {
    try {
        Connection conexion = conectar();

        // Verificar si el producto terminado con el código dado existe antes de editar
        String verificarSql = "SELECT * FROM producto_terminado WHERE codigo = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setString(1, codigo);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un producto terminado con el código proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el producto terminado existe, realizar la actualización
        String editarSql = "UPDATE producto_terminado SET num_pedido = ?, descripcion = ?, cantidad_existente = ?, sexo = ?, precio_venta = ?, talla = ?, medidas = ? WHERE codigo = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setInt(1, nuevoNumPedido);
        ps.setString(2, nuevaDescripcion);
        ps.setInt(3, nuevaCantidadExistente);
        ps.setString(4, nuevoSexo);
        ps.setDouble(5, nuevoPrecioVenta);
        ps.setString(6, nuevaTalla);
        ps.setString(7, nuevasMedidas);
        ps.setString(8, codigo);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Producto terminado editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el producto terminado", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar producto terminado: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void editarInventario(String codigo, int nuevaCantidadExistente, String nuevaDescripcion) {
    try {
        Connection conexion = conectar();

        // Verificar si el producto terminado con el código dado existe antes de editar el inventario
        String verificarSql = "SELECT * FROM inventario WHERE codigo = ?";
        PreparedStatement verificarPs = conexion.prepareStatement(verificarSql);
        verificarPs.setString(1, codigo);
        ResultSet verificarRs = verificarPs.executeQuery();

        if (!verificarRs.next()) {
            JOptionPane.showMessageDialog(null, "No se encontró un registro en inventario con el código proporcionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el registro en inventario existe, realizar la actualización
        String editarSql = "UPDATE inventario SET cantidad_existente = ?, descripcion = ? WHERE codigo = ?";
        PreparedStatement ps = conexion.prepareStatement(editarSql);
        ps.setInt(1, nuevaCantidadExistente);
        ps.setString(2, nuevaDescripcion);
        ps.setString(3, codigo);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Registro en inventario editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el registro en inventario", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar registro en inventario: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}


    //////////////////////ELIMINAR////////////////////////////////////////////////////
    public void eliminarCliente(int idCliente) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();

        // Eliminar registros en cascada (incluyendo PEDIDO, PRODUCTO_TERMINADO, INVENTARIO, VENTA)
        String sql = "DELETE FROM CLIENTE WHERE ID = " + idCliente + ";";
        st.execute(sql);

        st.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null, "Cliente y registros asociados eliminados con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar cliente y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void eliminarPedido(int numPedido) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();

        // Eliminar registros en cascada (incluyendo PRODUCTO_TERMINADO, INVENTARIO, VENTA)
        String sql = "DELETE FROM PEDIDO WHERE Num_pedido = " + numPedido + ";";
        st.execute(sql);

        st.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null, "Pedido y registros asociados eliminados con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar pedido y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    public void eliminarColegio(int idColegio) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();

        // Eliminar COLEGIO
        String sqlColegio = "DELETE FROM COLEGIO WHERE Id = " + idColegio + ";";
        st.execute(sqlColegio);

        st.close();
        conexion.close();

        JOptionPane.showMessageDialog(null, "Colegio y registros asociados eliminados con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar colegio y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    public void eliminarUniforme(String codigoUniforme) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();

        // Eliminar UNIFORME
        String sqlUniforme = "DELETE FROM UNIFORME WHERE Codigo = '" + codigoUniforme + "';";
        st.execute(sqlUniforme);

        st.close();
        conexion.close();

        JOptionPane.showMessageDialog(null, "Uniforme y registros asociados eliminados con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar uniforme y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    public void eliminarVenta(String codigoFactura) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();
        String sqlVenta = "DELETE FROM VENTA WHERE Codigo_Fact = '" + codigoFactura + "';";
        st.execute(sqlVenta);

        st.close();
        conexion.close();

        JOptionPane.showMessageDialog(null, "Venta y registros asociados eliminados con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar venta y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void eliminarProveedor(int nitProveedor) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();

        // Eliminar registros en cascada (incluyendo PRODUCTO_TERMINADO)
        String sql = "DELETE FROM PROVEEDOR WHERE Nit = " + nitProveedor + ";";
        st.execute(sql);

        st.close();
        conexion.close();

        JOptionPane.showMessageDialog(null, "Proveedor y registros asociados eliminados con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar proveedor y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    public void eliminarMateria(int codigoMateria) {
    try {
        Connection conexion = conectar();
        st = conexion.createStatement();

        // Eliminar registros en cascada (incluyendo PRODUCTO_TERMINADO)
        String sql = "DELETE FROM MATERIA WHERE Codigo = " + codigoMateria + ";";
        st.execute(sql);

        st.close();
        conexion.close();

        JOptionPane.showMessageDialog(null, "Materia y registros asociados eliminados con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar materia y registros asociados: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}
    
    //// CONSULTAS /////////////////////////////////////////////
    
    public ResultSet listarPedidosEnProceso() {
        try {
            Connection conexion = conectar(); 
            String sql = "SELECT c.ID, c.Nombre, c.telefono, p.Num_pedido, pt.Codigo, pt.Descripcion\n" +
                        "FROM CLIENTE c\n" +
                        "JOIN PEDIDO p ON c.ID = p.Id_Cliente\n" +
                        "JOIN PRODUCTO_TERMINADO pt ON p.Num_pedido = pt.Num_pedido\n" +
                        "WHERE p.Estado <> 'Entregado'";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar pedidos en proceso: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public ResultSet listarProductosNoEntregados() {
        try {
            Connection conexion = conectar(); 
            String sql = "SELECT c.ID, p.fecha_encargo, p.Num_pedido, pt.Codigo, pt.Descripcion\n" +
                        "FROM CLIENTE c\n" +
                        "JOIN PEDIDO p ON c.ID = p.Id_Cliente\n" +
                        "JOIN PRODUCTO_TERMINADO pt ON p.Num_pedido = pt.Num_pedido\n" +
                        "WHERE p.Estado <> 'Entregado'\n" +
                        "ORDER BY p.fecha_encargo ASC;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar pedidos en proceso: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public ResultSet colegiosFabricanUniformes() {
        try {
            Connection conexion = conectar(); 
            String sql = "SELECT c.ID, c.Nombre, u.Codigo, u.Tipo, u.Caracteristicas\n" +
                        "FROM COLEGIO c\n" +
                        "JOIN UNIFORME u ON c.ID = u.Id_Colegio;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar pedidos en proceso: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public ResultSet buscarcolegioCarateristicas(String nombreColegio) {
        try {
            Connection conexion = conectar();
            String sql = "SELECT c.Nombre, u.Tipo, u.Caracteristicas\n" +
                        "FROM COLEGIO c\n" +
                        "JOIN UNIFORME u ON c.ID = u.ID_Colegio\n" +
                        "WHERE c.Nombre = ?;";
            
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, nombreColegio);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar uniforme por colegio: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public ResultSet totalProductosVendidosxColegio() {
        try {
            Connection conexion = conectar(); 
            String sql = "SELECT c.nombre, SUM(pt.cantidad_existente ) AS Total_Productos_Vendidos\n" +
                            "FROM Colegio c\n" +
                            "JOIN Uniforme u ON c.id = u.Id_colegio\n" +
                            "JOIN Pedido p ON u.codigo = p.articulo\n" +
                            "JOIN producto_terminado pt ON p.num_pedido = pt.num_pedido\n" +
                            "JOIN Venta v ON pt.num_pedido = v.num_pedido\n" +
                            "GROUP BY c.nombre;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar colegios en proceso: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public ResultSet totalProductosVendidos() {
        try {
            Connection conexion = conectar(); 
            String sql = "SELECT SUM(Monto_Final) AS Total_Ventas\n" +
                            "FROM VENTA;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar colegios en proceso: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
///////////////////////////extras/////////////////////////////////////////////////
    
    public void cambiarEstadoEntregado(int numPedido) {
        try {
            Connection conexion = conectar();
            String sql = "UPDATE PEDIDO SET Estado = 'Entregado' WHERE Num_pedido = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, numPedido);

            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Estado del pedido actualizado a 'Entregado' con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el pedido con el número especificado", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

            ps.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el estado del pedido: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void descontarInventario(int numPedido) {
        try {
            Connection conexion = conectar();
            String sql = "UPDATE INVENTARIO " +
                         "SET Cantidad_Existente = Cantidad_Existente - (SELECT COALESCE(SUM(pt.Cantidad_Existente), 0) " +
                         "FROM PRODUCTO_TERMINADO pt " +
                         "WHERE pt.Num_pedido = ?) " +
                         "WHERE Codigo IN (SELECT pt.Codigo FROM PRODUCTO_TERMINADO pt WHERE pt.Num_pedido = ?)";

            try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                ps.setInt(1, numPedido);
                ps.setInt(2, numPedido);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Inventario actualizado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al descontar inventario: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }
    
}
