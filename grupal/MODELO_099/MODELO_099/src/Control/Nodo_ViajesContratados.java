package Control;

import Modelo.ViajesContratados;

public class Nodo_ViajesContratados {

    private ViajesContratados Elemento;
    private Nodo_ViajesContratados Izq, Der;

    public Nodo_ViajesContratados(ViajesContratados Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }
    
    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getCodigoViaje(),
            Elemento.getTuristas_CodigoTuristas(),
            Elemento.getSucursales_CodigoSucursal(),
            Elemento.getEstancias_CodigoEstancia()};
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

    public ViajesContratados getElemento() {
        return Elemento;
    }

    public void setElemento(ViajesContratados Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_ViajesContratados getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_ViajesContratados Izq) {
        this.Izq = Izq;
    }

    public Nodo_ViajesContratados getDer() {
        return Der;
    }

    public void setDer(Nodo_ViajesContratados Der) {
        this.Der = Der;
    }

}
