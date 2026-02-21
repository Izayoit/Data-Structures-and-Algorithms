
package modelo;


public class Estudiantes {
    
    private String nombre;
    private int codigo;
    private int ciclo;
    private String Escuela;

    public Estudiantes(String nombre, int codigo, int ciclo, String Escuela) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.Escuela = Escuela;
    }
    
    public Object[] getRegistro(){
    return new Object[]{nombre,codigo,ciclo,Escuela};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }
  
    
    
}
