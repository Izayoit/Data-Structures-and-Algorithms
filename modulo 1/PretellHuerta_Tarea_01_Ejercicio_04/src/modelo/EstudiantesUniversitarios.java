
package modelo;


public class EstudiantesUniversitarios {
    
    private String nombre;
    private int codigo;
    private String carrera;
    private int dni;
    private int edad;

    public EstudiantesUniversitarios(String nombre, int codigo, String carrera, int dni, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.dni = dni;
        this.edad = edad;
    }
    public EstudiantesUniversitarios(Object[] Registro) {
        nombre = (String)Registro[0];
        codigo =  Integer.parseInt(Registro[1].toString());
        carrera = (String)Registro[2];
        dni = Integer.parseInt(Registro[3].toString());
        edad= Integer.parseInt(Registro[4].toString());
        
    }
    
    public String getCadena(){
    String cadena = nombre+","+codigo+","+carrera+","+dni+","+edad;
    return cadena;
    }
    public Object[] getRegistro(){
    
    Object[] dato = {getNombre(),getCodigo(),getCarrera(),getDni(),getEdad()};
    
    return dato;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
}
