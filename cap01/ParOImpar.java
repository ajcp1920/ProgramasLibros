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
public class ParOImpar {
    public static void main (String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int v = miScanner.nextInt();
        
        //obtenemos el resto de dividir v * 2
        int resto = v % 2;
        
        //para preguntar por igual usamos ==
        if (resto == 0)
        {
            System.out.println(v + " es Par");
        }
        else
        {
            System.out.println(v + " es impar");
        }
    }
    
}
