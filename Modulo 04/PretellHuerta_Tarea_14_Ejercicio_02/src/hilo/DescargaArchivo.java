
package hilo;

import javax.swing.JTextArea;
import modelo.Archivo;


public class DescargaArchivo extends Thread{
     private Archivo archivo;
    private JTextArea areaTexto;

    public  DescargaArchivo(Archivo archivo, JTextArea areaTexto) {
        this.archivo = archivo;
        this.areaTexto = areaTexto;
    }

    @Override
    public void run() {
       for (int progreso = 0; progreso <= 100; progreso++) {
            try {
                Thread.sleep(archivo.getVelocidad());
            } catch (InterruptedException e) {
                areaTexto.append(archivo.getNombre() + ": Descarga cancelada.\n");
                return;
            }

            StringBuilder barra = new StringBuilder();
            barra.append(archivo.getNombre() + ": [");
            int bloques = progreso / 10;
            for (int i = 0; i < 10; i++) {
                barra.append(i < bloques ? "#" : " ");
            }
            barra.append("] " + progreso + "%\n");

            areaTexto.append(barra.toString());
        }

        areaTexto.append(archivo.getNombre() + ": ¡Descarga completada!\n\n");
    }
    }
