package Modelo;

import Control.Nodo;

public class Enlace {
    
   private int peso;
   private Nodo enlace;

    public Enlace(int peso, Nodo enlace) {
        this.peso = peso;
        this.enlace = enlace;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
   
   
   
   
   
   
   
}
