package Modelo;

public class Cliente {
    private int Edad;
    private String Nombre;

    public Cliente() {
    }

    public Cliente(int Edad, String Nombre) {
        this.Edad = Edad;
        this.Nombre = Nombre;
    }
    
    public Object[] getRegistro(){
        return new Object[]{Edad, Nombre};
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
