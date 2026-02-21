
package modelo;


public class Archivo {
    
    private String nombre;
    private int velocidad; // en milisegundos

    public Archivo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
