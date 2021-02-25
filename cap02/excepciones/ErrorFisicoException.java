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
@SuppressWarnings ("serial")
public class ErrorFisicoException extends Exception {
    public ErrorFisicoException(Exception ex)
    {
        super("Ocurrio un error fisico",ex);
    }
    
}
