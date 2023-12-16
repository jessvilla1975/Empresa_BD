
package login;

import javax.swing.JOptionPane;


/**
 *
 * @author Jess
 */
public class usersLogin {
    
    String admin="admin";
    String clave="admin";
    String vendedor = "jess";
    String passVendedor = "1111";
  
    public boolean ingresoAdmin(String user, String password) {
        System.out.println("ingreso admin");
        if (user.equals(admin) && password.equals(clave)) {
            System.out.println("iguales");    
            return true; // Credenciales correctas, devuelve true
        } else if(user.equals(vendedor)&& password.equals(passVendedor)){
            return true;
        }else{
            JOptionPane.showMessageDialog(
                null,
                "El usuario no existe.",
                "Usuario no encontrado",
                JOptionPane.WARNING_MESSAGE
            );
        }
        
            
            return false; // Credenciales incorrectas, devuelve false
        }
    
    
    
   
    
    
}
