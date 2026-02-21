package Hilo;

import Control.GestorControles;
import Fichero.GestorArchivos;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Detector extends Thread{
    private String nombreArchivo;
    private ArrayList<String> lista;
    private DefaultTableModel modTabla;

    public Detector(String nombreArchivo, ArrayList<String> lista, DefaultTableModel modTabla) {
        this.nombreArchivo = nombreArchivo;
        this.lista = lista;
        this.modTabla = modTabla;
    }

    @Override
    public void run() {
        while (true) {            
            GestorArchivos.Abrir(nombreArchivo, lista);
            GestorControles.Completar_Tabla(modTabla, lista);
            try {
                sleep(10000);
            } catch (Exception e) {
            }
        }
    }
    
    
}
