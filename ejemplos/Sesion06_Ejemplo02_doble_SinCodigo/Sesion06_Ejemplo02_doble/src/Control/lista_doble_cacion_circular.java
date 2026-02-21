package Control;

public class lista_doble_cacion_circular {

    nodo_cancion inicio, fin;

    public lista_doble_cacion_circular() {
        inicio = fin = null;
    }

    public nodo_cancion getInicio() {
        return inicio;
    }

    public void setInicio(nodo_cancion inicio) {
        this.inicio = inicio;
    }

    public nodo_cancion getFin() {
        return fin;
    }

    public void setFin(nodo_cancion fin) {
        this.fin = fin;
    }

}
