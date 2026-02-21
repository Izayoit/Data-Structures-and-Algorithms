
package modelo;

import java.util.Date;


public class SolicitudMatricula {
    
    private String Alumno;
    private String Curso;
    private  Date FechaSolicitud;
    
 public Object[]getRegistro(){
 return new Object[]{Alumno,Curso,FechaSolicitud};
 }
    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Date getFechaSolicitud() {
        return FechaSolicitud;
    }

    public void setFechaSolicitud(Date FechaSolicitud) {
        this.FechaSolicitud = FechaSolicitud;
    }
    
    
    
    
}
