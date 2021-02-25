/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01.cadenas;

/**
 *
 * @author Arturo Cavazos
 */
public class Cadenas5a {
    public static void main(String[] args)
    {
        //obtengo el milisegundo actual
        long hi = System.currentTimeMillis();
        //instancio un stringbuffer (que salio error y cuando lo corregi se corrigio con un stringbuilder) inicialmente vacio
        StringBuilder sb = new StringBuilder();
        
        //instancio a concatenar n caracteres
        int n= 100000;
        
        char c; 
        for (int i=0; i < n; i++)
        {
            //obtengo caracteres entre 'A' y 'Z'
            c = (char)('A' + i%('Z' - 'A' + 1));
            
            //concateno el caracter en el stringbuilder
            sb.append(c);
        }
        
        //obtengo el milisegundo actual
        long hf = System.currentTimeMillis();
        
        //muestro la cadena resultante
        System.out.println(sb.toString());
        
        //muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi) + "milisegundos");
    }
}
