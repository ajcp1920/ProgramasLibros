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
public class DemoConstantes {
    public static final int Lunes = 1;
    public static final int Martes = 2;
    public static final int Miercoles = 3;
    public static final int Jueves = 4;
    public static final int Viernes = 5;
    public static final int Sabado = 6;
    public static final int Domingo = 7;
    
    public static void main(String[] args)
    {
        Scanner miScanner =  new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana (numero): ");
        int v = miScanner.nextInt();
        String dia;
        switch(v)
        {
            case Lunes:
                dia = "Lunes";
                break;
                case Martes:
                dia = "Martes";
                break;
                case Miercoles:
                dia = "Miercoles";
                break;
                case Jueves:
                dia = "Jueves";
                break;
                case Viernes:
                dia = "Viernes";
                break;
                case Sabado:
                dia = "Sabado";
                break;
                case Domingo:
                dia = "Domingo";
                break;
                default:
                    dia = "Dia incorrecto... Ingrese un valor entre 1 y 7.";
        }
        System.out.println(dia);
    }
    
}
