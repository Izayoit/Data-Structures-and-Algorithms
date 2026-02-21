package arreglo;

import modelo.producto;

public class Nodo {

    private producto elemento;
    private Nodo Izq, Dere;

    public Nodo(producto elemento) {
        this.elemento = elemento;
        Izq = Dere = null;
    }

    public Object[] getRegistro() {
        return new Object[]{elemento.getCodigo(),
            elemento.getNombre(),
            elemento.getDescripcion(),
            getAltura(),
            getFactor_e()};

    }

    public int getAltura() {

        int Hizq = 0;
        int Hdere = 0;

        if (getIzq() != null) {
            Hizq = getIzq().getAltura();

        }
        if (getDere() != null) {
            Hdere = getDere().getAltura();
        }

        return Math.max(Hdere, Hizq) + 1;
    }

    public int getFactor_e() {

        int Hizq = 0;
        int Hder = 0;

        if (getIzq() != null) {

            Hizq = getIzq().getAltura();
        }
        if (getDere() != null) {

            Hder = getDere().getAltura();

        }
        return (Hder - Hizq);

    }

    public producto getElemento() {
        return elemento;
    }

    public void setElemento(producto elemento) {
        this.elemento = elemento;
    }

    public Nodo getIzq() {
        return Izq;
    }

    public void setIzq(Nodo Izq) {
        this.Izq = Izq;
    }

    public Nodo getDere() {
        return Dere;
    }

    public void setDere(Nodo Dere) {
        this.Dere = Dere;
    }

}
