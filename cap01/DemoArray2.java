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
public class DemoArray2 {
    public static void main(String[] args)
    {
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        Scanner miScanner = new Scanner(System.in);
        int v = miScanner.nextInt();
        if(v <= dias.length)
        {
            
            //recordemos que los arrays se enumeran desde 0
            System.out.println(dias[v-1]);
        }
        else
        {
           System.out.println("Dia incorrecto...");
        }
    }
}
