/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.excepciones;
import java.util.ResourceBundle;
/**
 *
 * @author Arturo Cavazos
 */
public class Aplicacion {
    public Usuario login(String username, String password)
            throws ErrorFisicoException
    {
        try
        {
            //leemos el archivo de propiedades que deve estar ubicado en el package root
            ResourceBundle rb = ResourceBundle.getBundle("usuario");
            //leemos el valor de la propiedad username
            String usr = rb.getString("username");
            //leemos el valor de la propiedad password
            String pwd = rb.getString("password");
            
            //definimos la variable de retorno
            Usuario u = null;
            
            //si coinciden los datos proporcionados con los leidos 
            if(usr.equals(username) && pwd.equals(password))
            {
                //instancio y seteo todos los datos
                u = new Usuario();
                u.setUsername(usr);
                u.setPassword(pwd);
                u.setNombre(rb.getString("nombre"));
                u.setEmail(rb.getString("email"));
            }
            return u;
        }
        catch(Exception ex)
                {
                    //cualquier error "salgo por excepcion"
                    throw new ErrorFisicoException(ex);
                }
    }
    
}
