/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.figuras;

/**
 *
 * @author Arturo Cavazos
 */
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Rectangulo (double b, double h)
    {
        super("Rectangulo");
        base = b;
        altura= h;
    }
    public double area()
    {
        return base * altura;
    }
}
