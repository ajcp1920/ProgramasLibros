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
public abstract class FiguraGeometrica {
    private String nombre;
    //metodo abstracto
    public abstract double area();
    
    public static double areaPromedio(FiguraGeometrica arr[])
    {
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            sum += arr[i].area();
        }
        return sum/arr.length;
    }
    //agregamos un constructor
    public FiguraGeometrica(String nom)
    {
        nombre = nom;
    }
    //ahora en el tostring muestro tambien el nombre
    public String toString()
    {
        return nombre + " (area = " + area() + ")";
    }
    public void getNombre(String nombre)
    {
        this.nombre = nombre;
        
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
