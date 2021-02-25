/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;
import java.util.Scanner;
/**
 *
 * @author Arturo Cavazos
 */
public class TestFecha4 {
    public static void main(String[] args)
    {
        Scanner miScanner = new Scanner(System.in);
        
        //el usuario ingresa los datos de la fecha
        System.out.println("Ingrese Fecha (dd/mm/aaaa): ");
        
        //leo la fecha (cadena de caracteres) ingresada
        String sFecha = miScanner.next();
        
        //creo un objeto de la clase Fecha
        Fecha f = new Fecha(sFecha);
        
        // se imprime
        System.out.println("La fecha ingresada es: " + f);
        
        //el usuario ingresa una cantidad de dias a sumar
        System.out.print("Ingrese dias a sumar (puede ser negativo): ");
        int diasSum = miScanner.nextInt();
        
        //le sumo esos dias a la fecha
        f.addDias(diasSum);
        
        //le muestro la nueva fecha (con los dias sumados)
        System.out.println("Sumando " + diasSum + " dias, queda: " + f);
    }
    
}
