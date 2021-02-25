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
public class Demo2 {
    {
    try 
    {
        int i = Integer.parseInt("no es una cadena numerica");
    }
    catch(ArrayIndexOutOfBoundsException ex)
    {
        System.out.println("Entre al catch");
    }
    finally
    {
        System.out.println("esto sale siempre!");
    }
}
}


