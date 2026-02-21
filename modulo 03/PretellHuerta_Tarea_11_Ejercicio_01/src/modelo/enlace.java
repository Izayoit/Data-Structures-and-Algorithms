
package modelo;

import Arreglo.Nodo;


public class enlace {
    private int desplazamiento;
    private Nodo enlace;

    public enlace(int desplazamiento, Nodo enlace) {
        this.desplazamiento = desplazamiento;
        this.enlace = enlace;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
    
    
    
}
