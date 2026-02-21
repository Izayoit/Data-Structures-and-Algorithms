/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloOperaciones;

/**
 *
 * @author User
 */
public class VueloTurista {
      private int codigoVueloTurista;
    private String clase;
    private int numeroVuelo;     
    private int codigoViaje;

    public VueloTurista(int codigoVueloTurista, String clase, int numeroVuelo, int codigoViaje) {
        this.codigoVueloTurista = codigoVueloTurista;
        this.clase = clase;
        this.numeroVuelo = numeroVuelo;
        this.codigoViaje = codigoViaje;
    }

    public VueloTurista(Object[] registro) {
        codigoVueloTurista = (int)registro[0];
        clase = registro[1].toString();
        numeroVuelo = (int)registro[2];
        codigoViaje = (int)registro[3];
        
    }
    public Object[] getRegistro(){
    return new Object[]{codigoVueloTurista, clase, numeroVuelo, codigoViaje};
    }

    public int getCodigoVueloTurista() {
        return codigoVueloTurista;
    }

    public void setCodigoVueloTurista(int codigoVueloTurista) {
        this.codigoVueloTurista = codigoVueloTurista;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(int codigoViaje) {
        this.codigoViaje = codigoViaje;
    }
    
}
