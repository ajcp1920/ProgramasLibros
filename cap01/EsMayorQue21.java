/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

import java.util.Scanner;
/**
 *
 * @author Arturo Cavazos
 */
public class EsMayorQue21 {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = miScanner.nextInt();
        
        if(edad >= 21)
        {
            System.out.println("Ud. es mayor de edad !");
        }
        else
        {
            System.out.println("Ud. es menor de edad");
        }
    }
    
}
