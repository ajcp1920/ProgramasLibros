/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.interfaces.criterios;
import libro.cap02.interfaces.Alumno;
/**
 *
 * @author Arturo Cavazos
 */
//heredo de criterio especializando en alumno
public class CriterioAlumNombre extends Criterio<Alumno> {

    CriterioAlumNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int comparar(Alumno a, Alumno b)
    {
        int diff = a.compareTo(a) - b.compareTo(b);
        return diff > 0 ? 1: diff < 0 ? -1 : 0;
    }
    
}
