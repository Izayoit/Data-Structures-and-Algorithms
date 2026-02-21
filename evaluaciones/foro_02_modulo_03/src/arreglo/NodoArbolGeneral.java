
package arreglo;

import java.util.ArrayList;
import java.util.List;
import modelo.Alumno;


public class NodoArbolGeneral {
    
    private Alumno alumno;
    private List<NodoArbolGeneral> hijos;

    public NodoArbolGeneral(Alumno alumno) {
        this.alumno = alumno;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(NodoArbolGeneral hijo) {
        hijos.add(hijo);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<NodoArbolGeneral> getHijos() {
        return hijos;
    }

    public void setHijos(List<NodoArbolGeneral> hijos) {
        this.hijos = hijos;
    }

   
    
}
