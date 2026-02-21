package Modelo;

public class Cliente {
    private int Edad;
    private String Nombre;
    private int Ciudad;

    public Cliente() {
    }

    public Cliente(int Edad, String Nombre, int Ciudad) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
    }
    
    public Object[] getRegistro(){
        return new Object[]{Edad, Nombre, Ciudad};
    }
    
    public String getCadena(){
        return Edad + Nombre + Ciudad;
    }

    public int getCiudad() {
        return Ciudad;
    }

    public void setCiudad(int Ciudad) {
        this.Ciudad = Ciudad;
    }        

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
