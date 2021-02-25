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
public class ParOImpar2 {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Ingrese un valor: ");
        int v = miScanner.nextInt();
        
        //utilizando un if inline
        int resto = v % 2;
        String mssg = (resto == 0) ? "es Par" : "es Impar";
        
        //muestra el resultado
        System.out.println(v+ " " + mssg);
    }
    
}
