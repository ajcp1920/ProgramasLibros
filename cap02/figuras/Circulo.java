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
public class Circulo extends FiguraGeometrica{
    private int radio;
    public Circulo(int r)
    {
        super("Circulo");
        radio = r;
    }
    public double area()
    {
        //retorno "PI por radio al cuadrado"
        return Math.PI*Math.pow(radio, 2);
    }
    
}
