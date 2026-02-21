package Modelo;

import Control.Nodo;

public class Enlace 
{
    private int Peso;
    private Nodo Enlace;

    public Enlace(int Peso, Nodo Enlace) {
        this.Peso = Peso;
        this.Enlace = Enlace;
    }
    
    public String getCadena(){
        return Peso + "&" + Enlace;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public Nodo getEnlace() {
        return Enlace;
    }

    public void setEnlace(Nodo Enlace) {
        this.Enlace = Enlace;
    }
    
    
    
}
