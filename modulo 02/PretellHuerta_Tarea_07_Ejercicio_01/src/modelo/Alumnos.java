
package modelo;


public class Alumnos {
    
    private String nombre;
    private String codigo;
    private String escuela;
    private int dni;

    public Alumnos(String nombre, String codigo, String escuela, int dni) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escuela = escuela;
        this.dni = dni;
    }

    public Object[]getRegistro(){
        
    return new Object[]{nombre,codigo,escuela,dni};
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

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    
}
