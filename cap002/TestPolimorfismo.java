/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap002;
import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;
/**
 *
 * @author Arturo Cavazos
 */
public class TestPolimorfismo {
    public static void main(String[] args)
    {
        // a fec (de tipo fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");
        
        //a obj (de tipo object) le asigno un objeto FechaDetallada
        Object obj = new FechaDetallada("3/12/2008");
        
        //Imprimo los dos objetos
        System.out.println("fec = " + fec); //invoca a tostring de fec
        System.out.println("obj = " + obj); //invoca a tostring de obj
    }
}
