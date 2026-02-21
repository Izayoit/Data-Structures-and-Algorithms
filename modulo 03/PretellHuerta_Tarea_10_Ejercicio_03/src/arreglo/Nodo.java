package arreglo;

import modelo.claves;

public class Nodo {

    private claves elemento;

    private Nodo izq, der;

    public Nodo(claves elemento) {
        this.elemento = elemento;
        izq = der = null;

    }

    public Object[] getRegistro() {

        return new Object[]{elemento.getClave(), Altura(), factoer_e()};
    }

    public claves getElemento() {
        return elemento;
    }

    public void setElemento(claves elemento) {
        this.elemento = elemento;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public int Altura() {

        int Hizq = 0;
        int Hdere = 0;

        if (getIzq() != null) {

            Hizq = getIzq().Altura();
            // 0
        }

        if (getDer() != null) {

            Hdere = getDer().Altura();
            //0
        }
        //seria hoja y 0+1= altura 1
        return Math.max(Hdere, Hizq) + 1;
    }

   

    public int factoer_e() {

        int Hdere = 0;
        int Hizq = 0;

        if (getIzq() != null) {

            Hizq = getIzq().Altura();

        }

        if (getDer() != null) {

            Hdere = getDer().Altura();
        }

        return (Hdere - Hizq);

    }

}
