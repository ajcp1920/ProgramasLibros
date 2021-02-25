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
public class DemoArray {
    public static void main(String[] args)
    {
        //defino un array de 10 enteros
        int arr[] = new int[10];
        
        //el scanner para leer por el teclado
        Scanner miScanner = new Scanner(System.in);
        
        //lee el primer valor
        System.out.print("Ingrese un valor (0=>fin): ");
        int v = miScanner.nextInt();
        int i = 0;
        
        //mientras v sea distinto de cero AND i sea menor que 10
        while (v != 0 && i < 10)
        {
            //asigna v en arr[i] y luego incrementa el valor de i
            arr[i++] = v;
            
            //lee el siguiente valor
            System.out.print("Ingrese el siguiente valor (0=> fin): ");
            v = miScanner.nextInt();
        }
        //recorro el array mostrando el contenido
        for (int j = 0; j<i; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
