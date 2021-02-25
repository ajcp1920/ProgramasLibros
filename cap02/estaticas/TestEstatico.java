/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.estaticas;

/**
 *
 * @author Arturo Cavazos
 */
public final class TestEstatico {
    private int a = 0;
    public void unMetodo()
    {
        System.out.println("este es unMetodo()");
    }
    public static void main(String[] args)
    {
        TestEstatico t = new TestEstatico();
        //no tengo acceso a la variable a
        System.out.println("a vale " + t.a); //error no compila
        //no tengo acceso al metodo unMetodo
        t.unMetodo(); //error no compila
    }
}
