/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.interfaces;

/**
 *
 * @author Arturo Cavazos
 */
public class TestOrdenar {
    public static void main(String[] args)
    {
        //defino un arreglo de alumnos
        Alumno arr[] = {new Alumno("Juan",20,8.5), new Alumno("Pedro",18,5.3), new Alumno("Alberto", 19, 4.6)};
        Util.ordenar(arr); //lo ordeno
        muestraArray(arr);
        String[] arr2 = {"Pablo", "Andres", "Marcelo"};
        Util.ordenar(arr2);
        muestraArray(arr2);
        
        //defino, ordeno y muestro un array de integers
        Integer[] arr3= {new Integer(5), new Integer(3), new Integer(1)};
        Util.ordenar(arr3);
        muestraArray(arr3);
    }
    @SuppressWarnings("unchecked")
    private static void muestraArray(Comparable arr[])
    {
        for(int i = 0; i< arr.length;i++)
        {
            System.out.println(arr[1]);
        }
    }
}
