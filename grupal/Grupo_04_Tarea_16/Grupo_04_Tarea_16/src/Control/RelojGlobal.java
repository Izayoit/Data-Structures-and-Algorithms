package Control;

import Interface.Cronometro;
import Interface.RelojListener;

public class RelojGlobal {

    private static RelojGlobal instancia;
    private Cronometro hilo;

    private RelojGlobal() {
        hilo = new Cronometro();
    }

    public static RelojGlobal getInstancia() {
        if (instancia == null) {
            instancia = new RelojGlobal();
        }
        return instancia;
    }

    public void agregarListener(RelojListener listener) {
        hilo.agregarObservador(listener);
    }

    public void iniciar() {
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    public void detener() {
        hilo.detener();
    }
}
