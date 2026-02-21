/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Cronometro extends Thread{
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
