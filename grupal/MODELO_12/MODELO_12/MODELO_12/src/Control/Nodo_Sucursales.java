package Control;

import Modelo.Sucursales;

public class Nodo_Sucursales {

    private Sucursales Elemento;
    private Nodo_Sucursales Izq, Der;

    public Nodo_Sucursales(Sucursales Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }

    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getCodigoSucursal(),
            Elemento.getDireccionSucursal(),
            Elemento.getTelefonoSucursal()};
    }
    
    public String getCadena(){
    return    Elemento.getCodigoSucursal()+
            Elemento.getDireccionSucursal()+
            Elemento.getTelefonoSucursal();
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

    public Sucursales getElemento() {
        return Elemento;
    }

    public void setElemento(Sucursales Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Sucursales getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_Sucursales Izq) {
        this.Izq = Izq;
    }

    public Nodo_Sucursales getDer() {
        return Der;
    }

    public void setDer(Nodo_Sucursales Der) {
        this.Der = Der;
    }

}
