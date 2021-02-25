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
public class TestFecha3 {
    public static void main(String[] args){
        Scanner miScanner = new Scanner(System.in);
        
        // el usuario ingresa los datos de la fecha
        System.out.println("Ingrese la fecha1 (dia, mes, año): ");
        int dia = miScanner.nextInt();
        int mes = miScanner.nextInt();
        int anio = miScanner.nextInt();
        
        //crea el objeto de la clase fecha
        Fecha f1 = new Fecha(dia, mes, anio);
        
        //el usuario ingresa los datos de la fecha
        System.out.print("Ingrese la fecha2 (dia, mes y año): ");
        dia = miScanner.nextInt();
        mes = miScanner.nextInt();
        anio = miScanner.nextInt();
        
        //crea un objeto de la clase fecha
        Fecha f2 = new Fecha(dia,mes,anio);
        System.out.println("Fecha 1 = " + f1);
        System.out.println("Fecha 2 = " + f2);
        
        if(f1.equals(f2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son distintas");
        }
    }
}
