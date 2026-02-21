package arreglo;

import modelo.numeros;

public class Nodo {

    private numeros elemento;
    private Nodo izq, dere;

    public Nodo(numeros elemento) {
        this.elemento = elemento;
        izq = dere = null;
    }

    //de nodo vamos a sacar el getregistro para usar en el tbl la altura como el factor
    public Object[] getRegistro() {

        return new Object[]{
            elemento.getNumero(),
            getAltura(),
            getfactor_e()
        };
    }

    public numeros getElemento() {
        return elemento;
    }

    public void setElemento(numeros elemento) {
        this.elemento = elemento;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDere() {
        return dere;
    }

    public void setDere(Nodo dere) {
        this.dere = dere;
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

    public int getfactor_e() {

        int Hizq = 0;
        int Hdere = 0;

        if (getIzq() != null) {
            Hizq = getIzq().getAltura();
        }

        if (getDere() != null) {
            Hdere = getDere().getAltura();
        }
        return (Hdere - Hizq);
    }
}
