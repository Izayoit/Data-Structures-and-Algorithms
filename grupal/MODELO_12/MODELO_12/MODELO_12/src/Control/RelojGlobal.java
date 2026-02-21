/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Interface.Cronometro;
import Interface.RelojListener;

/**
 *
 * @author User
 */
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
