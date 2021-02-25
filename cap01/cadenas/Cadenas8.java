/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01.cadenas;
import java.util.Scanner;
/**
 *
 * @author Arturo Cavazos
 */
public class Cadenas8 {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String s1 = miScanner.next();
        
        System.out.print("Ingrese otra cadena: ");
        String s2 = miScanner.next();
        
        //muestro las cadenas para verificar lo que contienen
        System.out.println("s1 = [" + s1 + "]");
        System.out.println("s2 = [" + s2 + "]");
        
        //esto esta mal
        //if ( s1 == s2)
        //{
            //System.out.println("Son iguales");
        //}
        //else
        //{
            //System.out.println("Son distintas");
        //}
        //}
        
        //if correcto usando el metodo equals
        if(s1.equals(s2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son distintas");
        }
    }
}
    

