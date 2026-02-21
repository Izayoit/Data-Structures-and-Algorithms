
package control;


public class estudiante {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private String correo;
    private curso cursoRegistrado;

    public estudiante(String nombre, String apellido, String dni, int edad, String correo, curso cursoRegistrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.correo = correo;
        this.cursoRegistrado = cursoRegistrado;
    }
    
    public Object[] getRegistro(){

        Object[] dato ={getNombre(),getApellido(),getDni(),getEdad(),getCorreo(),getCursoRegistrado()};
        
    return dato;
    }
   public String getCadena(){
   
   return nombre+" "+apellido+" "+dni;
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public curso getCursoRegistrado() {
        return cursoRegistrado;
    }

    public void setCursoRegistrado(curso cursoRegistrado) {
        this.cursoRegistrado = cursoRegistrado;
    }
    
    
    
}
