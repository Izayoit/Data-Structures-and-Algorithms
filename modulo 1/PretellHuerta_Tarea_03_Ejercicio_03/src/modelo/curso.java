
package modelo;


public class curso {
    private String nombre;
    private String codigo;
    private String docente;
    private int cantidadEstudiantesRegistrados;
    private int cantidadEstudiantesMaxima; 

    public curso(String nombre, String codigo, String docente, int cantidadEstudiantesRegistrados, int cantidadEstudiantesMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.docente = docente;
        this.cantidadEstudiantesRegistrados = cantidadEstudiantesRegistrados;
        this.cantidadEstudiantesMaxima = cantidadEstudiantesMaxima;
    }
 public Object[] getRegistro(){
 Object[] dato ={getNombre(),getCodigo(),getDocente(),getCantidadEstudiantesRegistrados(),getCantidadEstudiantesMaxima()};
 
 return dato;
 }
 public String getCadena(){
 return nombre + " "+ codigo ;
 }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCantidadEstudiantesRegistrados() {
        return cantidadEstudiantesRegistrados;
    }

    public void setCantidadEstudiantesRegistrados(int cantidadEstudiantesRegistrados) {
        this.cantidadEstudiantesRegistrados = cantidadEstudiantesRegistrados;
    }

    public int getCantidadEstudiantesMaxima() {
        return cantidadEstudiantesMaxima;
    }

    public void setCantidadEstudiantesMaxima(int cantidadEstudiantesMaxima) {
        this.cantidadEstudiantesMaxima = cantidadEstudiantesMaxima;
    }
    
    public String toString(){
    return nombre + " "+codigo;
    }
    
} 
