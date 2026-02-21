
package Hilo;



import java.util.Random;
import javax.swing.JTextArea;

import modelo.CuentaBancaria;



public class Cajero extends Thread{
    private CuentaBancaria cuenta;
    private String nombreCajero;
    private int limiteOperaciones;
    private JTextArea areaLog;

    public Cajero(CuentaBancaria cuenta, String nombreCajero, int limiteOperaciones, JTextArea areaLog) {
        this.cuenta = cuenta;
        this.nombreCajero = nombreCajero;
        this.limiteOperaciones = limiteOperaciones;
        this.areaLog = areaLog;
    }

    @Override
    public void run() {
        Random random = new Random();
        StringBuilder log = new StringBuilder();

        for (int i = 0; i < limiteOperaciones; i++) {
            int operacion = random.nextInt(2);
            int monto = random.nextInt(500) + 1;

            if (operacion == 0) {
                cuenta.retirar(monto, nombreCajero, log);
            } else {
                cuenta.depositar(monto, nombreCajero, log);
            }

            try {
                Thread.sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                log.append("Error en hilo: " + nombreCajero + "\n");
            }
        }

        log.append(nombreCajero + " finalizó.\n\n");
        areaLog.append(log.toString());
    }
}
