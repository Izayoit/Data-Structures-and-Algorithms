package Control;

import Modelo.Estancias;

public class Nodo_Estancias {

    private Estancias Elemento;
    private Nodo_Estancias Izq, Der;

    public Nodo_Estancias(Estancias Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }

    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getCodigoEstancia(), 
            Elemento.getPension(), 
            Elemento.getFechaEntrada(), 
            Elemento.getFechaSalida(), 
            Elemento.getHoteles_CodigoHotel()};
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

    public Estancias getElemento() {
        return Elemento;
    }

    public void setElemento(Estancias Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Estancias getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_Estancias Izq) {
        this.Izq = Izq;
    }

    public Nodo_Estancias getDer() {
        return Der;
    }

    public void setDer(Nodo_Estancias Der) {
        this.Der = Der;
    }

}
