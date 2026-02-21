package Control;

import Modelo.Vuelos;

public class Nodo_Vuelos {

    private Vuelos Elemento;
    private Nodo_Vuelos Izq, Der;

    public Nodo_Vuelos(Vuelos Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }

    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getNumeroVuelo(),
            Elemento.getFechaVuelo(),
            Elemento.getHoraVuelo(),
            Elemento.getOrigenVuelo(),
            Elemento.getDestinoVuelo(),
            Elemento.getPlazasTotales(),
            Elemento.getPlazasTurista()};
    }
    
    public String getCadena(){
    return  Elemento.getNumeroVuelo()+
            Elemento.getFechaVuelo()+
            Elemento.getHoraVuelo()+
            Elemento.getOrigenVuelo()+
            Elemento.getDestinoVuelo()+
            Elemento.getPlazasTotales()+
            Elemento.getPlazasTurista();
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

    public Vuelos getElemento() {
        return Elemento;
    }

    public void setElemento(Vuelos Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Vuelos getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_Vuelos Izq) {
        this.Izq = Izq;
    }

    public Nodo_Vuelos getDer() {
        return Der;
    }

    public void setDer(Nodo_Vuelos Der) {
        this.Der = Der;
    }

}
