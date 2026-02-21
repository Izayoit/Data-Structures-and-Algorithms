
package modelo;


public class Clientes {
    
private String nombre_completo;
private int edad;
private int dni;
private int telefono;

    public Clientes(String nombre_completo, int edad, int dni, int telefono) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
    }

public Object[] getRegistro(){

    Object[] dato = {getNombre_completo(),getEdad(),getDni(),getTelefono() };
    
return dato;
}


    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
