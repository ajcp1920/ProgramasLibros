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
public class DemoMatriz {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de filas: ");
        int n = miScanner.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int m = miScanner.nextInt();
        
        //crea la matriz de n filas y m columnas
        int mat[][] = new int [n][m];
        int nro;
        for(int i= 0; i < n; i++)
        {
            for (int j = 0; j<m; j++)
            {
                //genera el numero aleatorio entre 0 y 1000
                nro = (int)(Math.random()*1000);
                
                //asigna el numero en la matriz
                mat[i][j]= nro;
            }
        }
        for (int i =0; i<n;i++)
        {
            for (int j=0;j<m; j++)
            {
                //imprime la celda de la matriz
                System.out.print(mat[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    
}
