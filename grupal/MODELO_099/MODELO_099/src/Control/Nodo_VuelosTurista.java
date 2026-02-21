package Control;

import Modelo.VuelosTurista;

public class Nodo_VuelosTurista {

    private VuelosTurista Elemento;
    private Nodo_VuelosTurista Izq, Der;

    public Nodo_VuelosTurista(VuelosTurista Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }
    
    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getCodigoVuelo(),
            Elemento.getClase(),
            Elemento.getVuelos_NumeroVuelo(),
            Elemento.getViajesContratados_CodigoViaje()};
    }

    //Para mostrar la altura
    public int getAltura() {
        int hIzq = 0;
        int hDer = 0;
        if (this.getElemento() == null) {
            return 0;
        }
        if (this.getIzq() != null) {
            hIzq = this.getIzq().getAltura();
        }
        if (this.getDer() != null) {
            hDer = this.getDer().getAltura();
        }
        return Math.max(hIzq, hDer) + 1;
    }

    //Se necesita para el orden
    public int getFactor_e() {
        int hIzq = 0;
        int hDer = 0;
        if (this.getIzq() != null) {
            hIzq = this.getIzq().getAltura();
        }
        if (this.getDer() != null) {
            hDer = this.getDer().getAltura();
        }
        return (hDer - hIzq);
    }

    public VuelosTurista getElemento() {
        return Elemento;
    }

    public void setElemento(VuelosTurista Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_VuelosTurista getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_VuelosTurista Izq) {
        this.Izq = Izq;
    }

    public Nodo_VuelosTurista getDer() {
        return Der;
    }

    public void setDer(Nodo_VuelosTurista Der) {
        this.Der = Der;
    }

}
