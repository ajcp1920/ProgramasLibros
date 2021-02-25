/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.interfaces.criterios;

/**
 *
 * @author Arturo Cavazos
 */
public class Util {
    public static void ordenar(Object arr[], Criterio cr)
    {
        boolean ordenado= false;
        while (!ordenado)
        {
            ordenado = true;
            for(int i = 0; i < arr.length-1;i++)
            {
                //ahora la decision sobre quien precede a quien la toma instancia de criterio cr
                if (cr.comparar(arr[i+1],arr[i])< 0)
                {
                    Object aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }
    }
    public static void imprimir(Object arr[])
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
