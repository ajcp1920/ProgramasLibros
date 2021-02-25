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
public class PrimerosNumeros1 {
    public static void main (String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        
        //lee el valor de n
        int n = miScanner.nextInt();
        int i = 1;
        while (i <= n)
        {
            //muestro el valor de i
            System.out.println(i);
            i++;
        }
        
    }
    
}
