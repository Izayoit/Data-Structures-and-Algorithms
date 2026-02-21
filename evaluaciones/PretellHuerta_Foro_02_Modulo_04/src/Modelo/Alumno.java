package Modelo;

public class Alumno {
    private int idAlumno;
    private String dni;
    private String Nombres;
    private String Apellidos;
    private String correo;
    private int telefono;
    private int Idcarrera;
    
    public Alumno(Object[] Registro){
        idAlumno = Integer.parseInt(Registro[0].toString());
        dni = Registro[1].toString();
        Nombres = Registro[2].toString();
        Apellidos = Registro[3].toString();
        correo= Registro[4].toString();
        telefono = Integer.parseInt(Registro[5].toString());
        Idcarrera = Integer.parseInt(Registro[6].toString());
        
        
        
    }
    
    public Object[] getRegistro(){ return new Object[]{idAlumno,dni,Nombres,Apellidos,correo,telefono,Idcarrera}; }

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdcarrera() {
        return Idcarrera;
    }

    public void setIdcarrera(int Idcarrera) {
        this.Idcarrera = Idcarrera;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }   
    
    public String getApellidos() { return Apellidos; }

    public void setApellidos(String Apellidos) { this.Apellidos = Apellidos; }

    public String getNombres() { return Nombres; }

    public void setNombres(String Nombres) { this.Nombres = Nombres; }
            
}
