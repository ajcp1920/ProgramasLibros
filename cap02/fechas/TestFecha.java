/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;

/**
 *
 * @author Arturo Cavazos
 */

//este codigo el autor menciona que no compila
//public class TestFecha{
//    public static void main(String[] args){
//    Fecha f = new Fecha();
//    f.dia = 2; // la variable dia es privada, no tenemos acceso
//    f.mes = 10; 
//    f.anio = 1970;
//    }
//}
//Ahora viene el codigo correcto
    public class TestFecha {
        public static void main(String[] args)
        {
            Fecha f =  new Fecha();
            f.setDia(2);
            f.setMes(10);
            f.setAnio(1970);
            
            //imprime el dia
            System.out.println("Dia = " + f.getDia());
            
            //immprime el mes
            System.out.println("Mes = " + f.getMes());
            
            //imprime el año
            System.out.println("Año = " + f.getAnio());
            
            //imprime la fecha
            System.out.println(f);
        }
}
