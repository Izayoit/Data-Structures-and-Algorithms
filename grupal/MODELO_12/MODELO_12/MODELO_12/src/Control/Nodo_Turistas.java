package Control;

import Modelo.Turistas;

public class Nodo_Turistas {

    private Turistas Elemento;
    private Nodo_Turistas Izq, Der;

    public Nodo_Turistas(Turistas Elemento) {
        this.Elemento = Elemento;
        Izq = Der = null;
    }

    public Object[] getRegistro() {
        return new Object[]{
            Elemento.getCodigoTurista(),
            Elemento.getNombreTurista(),
            Elemento.getApellidosTurista(),
            Elemento.getDireccionTurista(),
            Elemento.getTelefonoTurista()};
    }
public String getCadena(){
return Elemento.getCodigoTurista()+
            Elemento.getNombreTurista()+
            Elemento.getApellidosTurista()+
            Elemento.getDireccionTurista()+
            Elemento.getTelefonoTurista();
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

    public Turistas getElemento() {
        return Elemento;
    }

    public void setElemento(Turistas Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Turistas getIzq() {
        return Izq;
    }

    public void setIzq(Nodo_Turistas Izq) {
        this.Izq = Izq;
    }

    public Nodo_Turistas getDer() {
        return Der;
    }

    public void setDer(Nodo_Turistas Der) {
        this.Der = Der;
    }

}
