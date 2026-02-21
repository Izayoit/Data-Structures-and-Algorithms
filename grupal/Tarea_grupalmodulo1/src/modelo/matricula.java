
package modelo;


public class matricula {
    
    private int codigoMatricula;
    private alumno codigoAlumno;
    private String carrera;
    private String ciclo;
    private String SemestreAcademico;

    public matricula(int codigoMatricula, alumno codigoAlumno, String carrera, String ciclo, String SemestreAcademico) {
        this.codigoMatricula = codigoMatricula;
        this.codigoAlumno = codigoAlumno;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.SemestreAcademico = SemestreAcademico;
    }

   
    public Object[] getRegistro(){

        Object[] dato ={getCodigoMatricula(),getCodigoAlumno(),getCarrera(),getCiclo(),getSemestreAcademico()};
    
    return dato;
    }

    public int getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(int codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public alumno getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(alumno codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getSemestreAcademico() {
        return SemestreAcademico;
    }

    public void setSemestreAcademico(String SemestreAcademico) {
        this.SemestreAcademico = SemestreAcademico;
    }
    

  
    
    
    
    
    
    
    
}
