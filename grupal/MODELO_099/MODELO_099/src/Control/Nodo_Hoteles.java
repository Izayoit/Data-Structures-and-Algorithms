package Control;

import Modelo.Hoteles;

public class Nodo_Hoteles {

    private Hoteles Elemento;
    private Nodo_Hoteles Izq, Der;

    public Nodo_Hoteles(Hoteles Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }

    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getCodigoHotel(),
            Elemento.getNombreHotel(),
            Elemento.getDireccionHotel(),
            Elemento.getCiudadHotel(),
            Elemento.getTelefonoHotel(),
            Elemento.getPlazasHotel()};
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

    public Hoteles getElemento() {
        return Elemento;
    }

    public void setElemento(Hoteles Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Hoteles getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_Hoteles Izq) {
        this.Izq = Izq;
    }

    public Nodo_Hoteles getDer() {
        return Der;
    }

    public void setDer(Nodo_Hoteles Der) {
        this.Der = Der;
    }

}
