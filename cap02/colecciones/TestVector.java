/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;
import java.util.Vector;
import java.util.Collection;
/**
 *
 * @author Arturo Cavazos
 */
public class TestVector {
    public static void main(String[] args)
    {
        //instancio un vector especializado en string
        Vector<String> v = new Vector<String>();
        
        //le asigno algunos valores
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");
        String aux;
        for(int i = 0; i<v.size(); i++)
        {
            //el metodo get retorna el i-esimo elemento
            aux = v.get(i);
            System.out.println(aux);
        }
        Collection<String> coll = UNombres.obtenerLista();
        
        //itero la coleccion de nombres y muestro cada elemento
        for(String nom: coll)
        {
            System.out.println(nom);
        }
    }
}
