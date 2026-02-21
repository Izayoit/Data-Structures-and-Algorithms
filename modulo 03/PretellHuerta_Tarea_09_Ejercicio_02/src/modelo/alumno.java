
package modelo;


public class alumno {
    
    private String alumno;
    private int codigo;
    private double nota;

    public alumno(String alumno, int codigo, double nota) {
        this.alumno = alumno;
        this.codigo = codigo;
        this.nota = nota;
    }

    public Object[] getRegistro(){
    
    return new  Object[]{alumno,codigo,nota};
    }
    
   
    
    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
           
    
    
    
}
