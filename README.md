## Introducción: Sistema de Gestión para Empresa de Confecciones
Este proyecto tiene como objetivo implementar una base de datos para administrar una empresa de confecciones que produce uniformes para colegios y prendas de vestir. El sistema aborda la gestión de colegios, características de uniformes, proveedores de materias primas, inventario de productos y clientes que realizan encargos.

Los clientes pueden hacer pedidos de uniformes o prendas, registrando detalles como medidas, fechas y abonos. El sistema también controla la producción por encargo, asociando productos a números de pedido. Se distinguen dos roles de usuario: administrador y vendedor, cada uno con sus respectivas capacidades.

En resumen, se busca crear una herramienta que optimice la administración de la producción, inventario y pedidos de la empresa, adaptada a las funciones específicas de administradores y vendedores.

## Instrucciones de Uso

1. Haz una copia de este repositorio mediante el comando de clonación.
2. Extrae el contenido del archivo comprimido (rar) llamado "Librerias" y añádelo a las dependencias de tu proyecto.
3. Importa las tablas del archivo DatosSQL.txt en PgAdmin4 para configurar la base de datos.
4. Inserta los datos proporcionados en las sentencias de inserts.txt correspondientes.
5. Actualiza la dirección URL, nombre de usuario y contraseña en tu servidor de PgAdmin4 según las configuraciones necesarias.


    public class conexionsql {
        Connection conn=null;
        String url="jdbc:postgresql://localhost/empresa";
        String usuario="postgres";
        String clave="Manuel3312";
        
        public Connection conectar(){
            try {
                Class.forName("org.postgresql.Driver");
                conn=DriverManager.getConnection(url,usuario,clave);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al conectar "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        return conn;
        }
        
    }
## Instrucciones para Acceder al Sistema
Una vez que el programa esté en ejecución, accede al módulo de inicio de sesión.
Utiliza las credenciales predeterminadas:
:fa-user: Usuario: admin
:fa-lock: Contraseña: admin

##Interfaz Login

![](https://github.com/jessvilla1975/Empresa_BD/blob/main/InterfazBD/LOGIN.JPG)
