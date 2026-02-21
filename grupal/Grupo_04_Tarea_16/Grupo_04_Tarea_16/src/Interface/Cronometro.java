package Interface;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cronometro extends Thread {

    private final ArrayList<RelojListener> observadores = new ArrayList<>();
    private boolean enEjecucion = true;

    public void agregarObservador(RelojListener obs) {
        observadores.add(obs);
    }

    public void detener() {
        enEjecucion = false;
    }

    @Override
    public void run() {
        while (enEjecucion) {
            String horaActual = new SimpleDateFormat("HH:mm:ss").format(new Date());

            for (RelojListener obs : observadores) {
                obs.actualizarHora(horaActual);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
