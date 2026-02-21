package Modelo;

public class Alumno {
    private int idAlumno;
    private String Apellidos;
    private String Nombres;
    
    public Alumno(Object[] Registro){
        idAlumno = Integer.parseInt(Registro[0].toString());
        Apellidos = Registro[1].toString();
        Nombres = Registro[2].toString();
    }
    
    public Object[] getRegistro(){ return new Object[]{idAlumno,Apellidos,Nombres}; }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }   
    
    public String getApellidos() { return Apellidos; }

    public void setApellidos(String Apellidos) { this.Apellidos = Apellidos; }

    public String getNombres() { return Nombres; }

    public void setNombres(String Nombres) { this.Nombres = Nombres; }
            
}
