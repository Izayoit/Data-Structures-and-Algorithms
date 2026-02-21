
package Modelo;

import Control.Nodo;


public class Enlace {
    private int tiempo;
    private String tipo; //maritimo, terrestre o aereo;
    private Nodo Enlace;
    private double costo_Economico;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Nodo getEnlace() {
        return Enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.Enlace = enlace;
    }

    public double getCosto_Economico() {
        return costo_Economico;
    }

    public void setCosto_Economico(double costo_Economico) {
        this.costo_Economico = costo_Economico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  

    public Enlace(int tiempo, String tipo, Nodo destino, double costo_Economico) {
        this.tiempo = tiempo;
        this.tipo = tipo;
        this.Enlace = destino;
        this.costo_Economico = costo_Economico;
    }
    
    
}
