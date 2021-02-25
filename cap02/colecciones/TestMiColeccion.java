/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;
import java.util.Scanner;
/**
 *
 * @author Arturo Cavazos
 */
public class TestMiColeccion {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        
        //leo el primer nombre
        System.out.println("Ingrese nombre: ");
        String nom = miScanner.next();
        //creo una coleccion con capacidad inicial = 5
        MiColeccion<String> mc = new MiColeccion(5);
        while(!nom.equals("FIN"))
        {
            //inserto siempre en la posicion 0
            mc.insertar(nom,0);
            //leo el siguiente nombre
            nom = miScanner.next();
        }
        String aux;
        //recorro la coleccion y tomo cada uno de sus elementos
        for(int i =0; i<mc.cantidad();i++)
        {
            //el metodo obtener retorna un object entonces tengo que castear a strinh
            aux = mc.obtener(i);
            
            System.out.println(aux + " - " + aux.length()+ " caracteres ");
        }
    }
}
