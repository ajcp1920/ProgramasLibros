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
public class HolaMundoNombre {
    public static void main(String[] args)
    {
        
        Scanner miScanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Escriba su nombre, edad y altura: ");
        //leemos el nombre
        String nombre = miScanner.next();
        //leemos la edad
        int edad = miScanner.nextInt();
        //leemos la altura
        double altura = miScanner.nextDouble();
        //mostramos los datos por consola
        System.out.println("Hola Mundo: " + nombre + "Edad" + edad + "Altura" + altura);
    }
}
