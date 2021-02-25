/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.excepciones;

/**
 *
 * @author Arturo Cavazos
 */
public class TestLogin {
    public static void main (String[] args)
    {
        try
        {
            Aplicacion app = new Aplicacion();
            //intento el login
            Usuario u = app.login("juan","juan123sito");
            System.out.println(u);
        }
        catch(ErrorFisicoException ex)
        {
            //ocurrio un error
            System.out.println("Servicio temporalmente interrumpido: ");
            System.out.println(ex.getMessage());
        }
    }
}
