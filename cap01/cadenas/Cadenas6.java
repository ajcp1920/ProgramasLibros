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
public class Cadenas6 {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        int v = miScanner.nextInt();
        System.out.println("Valor ingresado: " + v);
        System.out.println("binario = " + Integer.toBinaryString(v));
        System.out.println("octal = " + Integer.toOctalString(v));
        System.out.println("hexadecimal = " + Integer.toHexString(v));
        System.out.print("Ingrese una base numerica: ");
        int b = miScanner.nextInt();
        
        String sBaseN = Integer.toString(v,b);
        System.out.println(v + " en base(" + b + ") = " + sBaseN);
    }
}
