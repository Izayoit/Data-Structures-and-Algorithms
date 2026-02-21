
package modelo;


public class Alumno {
     private int codigo;
    private String nombre;
    private int ciclo;
    private String escuela;

    public Alumno(int codigo, String nombre,String escuela, int ciclo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.escuela = escuela;
    }

    
    

    public Object[] getDatos() {
        
        return new Object[]{codigo, nombre, escuela,ciclo};
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

  
    
    
    
}
